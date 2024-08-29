package shadow.zona_fit.gui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import shadow.zona_fit.modelo.Cliente;
import shadow.zona_fit.servicio.ClienteServicio;
import shadow.zona_fit.servicio.IClienteServicio;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@Component
public class ZonaFitForma extends JFrame{
    private JPanel panelPrincipal;
    private JTable clientesTabla;
    private JTextField nombreTexto;
    private JTextField apellidoTexto;
    private JTextField membresiaTexto;
    private JButton guardarButton;
    private JButton eliminarButton;
    private JButton limpiarButton;
    IClienteServicio clienteServicio;
    private DefaultTableModel tablaModeloClientes;
    private Integer idCliente;

    @Autowired
    public ZonaFitForma (ClienteServicio clienteServicio){
        this.clienteServicio = clienteServicio;
        iniciarForma();
        guardarButton.addActionListener(e -> guardarCliente());
        clientesTabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                cargarClienteSeleccionado();
            }
        });
        eliminarButton.addActionListener(e -> eliminarCliente());
        limpiarButton.addActionListener(e -> limpiarFormulario());
    }

    private void iniciarForma(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,700);
        setLocationRelativeTo(null);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        //this.tablaModeloClientes = new DefaultTableModel(0, 4);
        //Evitamos la edicion de los valores de las celdas de la tabla
        this.tablaModeloClientes = new DefaultTableModel(0, 4){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        String[] cabeceros = {"Id", "Nombre", "Apellido", "Membresia"};
        this.tablaModeloClientes.setColumnIdentifiers(cabeceros);
        this.clientesTabla = new JTable(tablaModeloClientes);

        //Restringimos la seleccion de la tabla a un solo registro
        this.clientesTabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //Cargar listado de clientes
        listarClientes();
    }

    private void listarClientes(){
        this.tablaModeloClientes.setRowCount(0);
        var clientes = this.clienteServicio.listarClientes();
        clientes.forEach(cliente -> {
            Object[] renglonCliente = {
                    cliente.getId(),
                    cliente.getNombre(),
                    cliente.getApellido(),
                    cliente.getMembresia()
            };
            this.tablaModeloClientes.addRow(renglonCliente);
        });
    }

    private void guardarCliente(){
        if(nombreTexto.getText().equals("")){
            mostrarMensaje("Proporcione un nombre");
            nombreTexto.requestFocusInWindow();
            return;
        }if(membresiaTexto.getText().equals("")){
            mostrarMensaje("Proporciona un membresia");
            membresiaTexto.requestFocusInWindow();
            return;
        }
        // Recuperamos los valores del formulario
        var nombre = nombreTexto.getText();
        var apellido = apellidoTexto.getText();
        var membresia = Integer.parseInt(membresiaTexto.getText());
        var cliente = new Cliente(this.idCliente,nombre,apellido,membresia);
        if (this.idCliente == null){
            mostrarMensaje("Se agrego el nuevo cliente");
        }else{
            mostrarMensaje("Se actuallizo el Cliente");
        }
        this.clienteServicio.guardarCliente(cliente); //insertar
        limpiarFormulario();
        listarClientes();
    }

    private void eliminarCliente(){
        var cliente = new Cliente();
        cliente.setId(this.idCliente);
        if (this.idCliente != null){
            this.clienteServicio.eliminarCliente(cliente);
            mostrarMensaje("El Cliente con Id " + this.idCliente +" esta Eliminado");
            limpiarFormulario();
            listarClientes();
        }else
            mostrarMensaje("No ha selecionado un Cliente");
    }

    private void cargarClienteSeleccionado(){
        var reglon = clientesTabla.getSelectedRow();
        if(reglon != -1){ //significa que no selecciono ningun registro
             var id = clientesTabla.getModel().getValueAt(reglon,0).toString();
             this.idCliente = Integer.parseInt(id);
             var nombre = clientesTabla.getModel().getValueAt(reglon, 1).toString();
             this.nombreTexto.setText(nombre);
             var apellido = clientesTabla.getModel().getValueAt(reglon, 2).toString();
             this.apellidoTexto.setText(apellido);
             var membresia = clientesTabla.getModel().getValueAt(reglon, 3).toString();
             this.membresiaTexto.setText(membresia);
        }
    }

    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);
    }

    private void limpiarFormulario(){
        nombreTexto.setText("");
        apellidoTexto.setText("");
        membresiaTexto.setText("");
        // Limpiamos el id cliente seleccionado
        this.idCliente = null;
        // Deselecionamos el registro seleccionado de la tabla
        this.clientesTabla.getSelectionModel().clearSelection();
    }

}
