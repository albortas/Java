package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.dominio.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppZonaFit {
    public static void main(String[] args) {
        appZonaFit();
    }

    public static void appZonaFit(){
        var salir = false;
        Scanner consola = new Scanner(System.in);
        IClienteDAO clienteDAO = new ClienteDAO();
        System.out.println("*** Clientes de Zona Fit");
        while (!salir){
            try{
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(opcion, consola, clienteDAO);
            }catch (Exception e){
                System.out.println("Error en el menu: " + e.getMessage());
            }finally {
                System.out.println();
            }
        }
    }

    public static int mostrarMenu(Scanner consola){
        System.out.print("""
                Menu:
                1. Lista de clientes
                2. Agregar cliente
                3. Modificar cliente
                4. Eliminar cliente
                5. Salir
                Elegir opcion:\s""");
        return Integer.parseInt(consola.nextLine());
    }

    public static boolean ejecutarOpciones(int opcion, Scanner consola, IClienteDAO clienteDAO){
        var salir = false;
        switch (opcion){
            case 1 -> listarClientes(clienteDAO);
            case 2 -> agregarCliente(consola, clienteDAO);
            case 3 -> modificarCliente(consola, clienteDAO);
            case 4 -> eliminarCliente(consola,clienteDAO);
            case 5 -> {
                System.out.println("Hasta Pronto!!!");
                salir = true;
            }
            default -> System.out.println("Opcion Incorrecta: " + opcion);
        }
        return salir;
    }

    public static void listarClientes(IClienteDAO clienteDAO){
        System.out.println("\n--- Lista de Clientes ---");
        var clientes = clienteDAO.listarClientes();
        clientes.forEach(System.out::println);
    }
    public static void agregarCliente(Scanner consola, IClienteDAO clienteDAO){
        System.out.print("Nombre del cliente: ");
        var nombre = consola.nextLine();
        System.out.print("Apellido del cliente: ");
        var apellido = consola.nextLine();
        System.out.print("Membresia del cliente: ");
        var membresia = Integer.parseInt(consola.nextLine());
        var cliente = new Cliente(nombre, apellido, membresia);
        var agregado = clienteDAO.agregarCliente(cliente);
        if (agregado){
            System.out.println("Cliente agregado: " + cliente);
        }else {
            System.out.println("No se agrego el cliente: " + cliente);
        }
    }

    public static void modificarCliente(Scanner consola, IClienteDAO clienteDAO){
        System.out.print("Id de cliente a modificar: ");
        var id = Integer.parseInt(consola.nextLine());
        var cliente = new Cliente(id);
        var encontrado = clienteDAO.buscarClientePorId(cliente);
        if (encontrado){
            System.out.println("Cliente encontrado: " + cliente);
            menuModificarCliente(consola,cliente);
            clienteDAO.modificarCliente(cliente);
            System.out.println("Cliente modificado : " + cliente);
        }else {
            System.out.println("No se encontro el cliente: " + cliente);
        }
    }

    public static void menuModificarCliente(Scanner consola,Cliente cliente){
        try{
            var aplicar = false;
            while (!aplicar){
                var opcion = menuModificar(consola);
                aplicar = modificar(opcion,consola,cliente);
            }
        }catch (Exception e){
            System.out.println("Error al modifica el cliente" + e.getMessage());
        }finally {
            System.out.println();
        }
    }

    public static int menuModificar(Scanner consola){
        System.out.print("""
                Modificar Cliente:
                1. Nombre
                2. Apellido
                3. Membresia
                4. Mostrar cambios
                5. Aplicar cambios
                Elija una opcion:\s""");
        return Integer.parseInt(consola.nextLine());
    }

    public static boolean modificar(int opcion, Scanner consola, Cliente cliente){
        var aplicar = false;
        switch (opcion){
            case 1 -> {
                System.out.print("Nuevo Nombre: ");
                cliente.setNombre(consola.nextLine());
            }
            case 2 ->{
                System.out.print("Nuevo Apellido: ");
                cliente.setApellido(consola.nextLine());
            }
            case 3 ->{
                System.out.print("Nueva Membresia: ");
                cliente.setMembresia(Integer.parseInt(consola.nextLine()));
            }
            case 4 ->{
                System.out.println(cliente);
            }
            case 5 ->{
                aplicar = true;
            }
            default -> System.out.println("Error en la opcion de menu: " + opcion);
        }
        return aplicar;
    }

    public static void eliminarCliente(Scanner consola, IClienteDAO clienteDAO){
        System.out.print("Id del cliente a eliminar: ");
        var id = Integer.parseInt(consola.nextLine());
        var cliente = new Cliente(id);
        var encontrado = clienteDAO.buscarClientePorId(cliente);
        if (encontrado){
            System.out.println("Id de cliente encontrado: " + cliente);
            var eliminado = clienteDAO.eliminarCliente(cliente);
            if (eliminado){
                System.out.println("Cliente eliminado: " + cliente);
            }else{
                System.out.println("No se pudo eliminar cliente: " + cliente);
            }
        }else
            System.out.println("Cliente no encontrado: " + cliente);
    }

}
