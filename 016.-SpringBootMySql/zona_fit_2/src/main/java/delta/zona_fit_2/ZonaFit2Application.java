package delta.zona_fit_2;

import delta.zona_fit_2.modelo.Cliente;
import delta.zona_fit_2.servicio.IClienteServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

//@SpringBootApplication
public class ZonaFit2Application implements CommandLineRunner {

	@Autowired
	private IClienteServicio clienteServicio;

	private static final Logger logger = LoggerFactory.getLogger(ZonaFit2Application.class);

	String nl = System.lineSeparator();

	public static void main(String[] args) {
		logger.info("Inciando la aplicacion");
		//Levantar la fabrica de Spring
		SpringApplication.run(ZonaFit2Application.class, args);
		logger.info("Aplicacion finalizada");
	}

	@Override
	public void run(String... args) throws Exception {
		zonaFitApp();
	}

	private void zonaFitApp(){
		var salir = false;
		var consola = new Scanner(System.in);
		try{
			while (!salir){
				logger.info(nl);
				var opcion = menuZonaFit(consola);
				salir = ejecutarOpciones(opcion,consola);
			}
		}catch (Exception e){
			logger.info("Error en el menu: {}", e.getMessage());
		}finally {
			logger.info("\n");
		}
	}

	private int menuZonaFit(Scanner consola){
		logger.info(nl);
		logger.info("""				
				*** Aplicacion Zona Fit (GYM) ***
				1. Lista de clientes
				2. Buscar clientes
				3. Agregar cliente
				4. Modificar cliente
				5. Eliminar cliente
				6. Salir
				Elejir una opcion:\s""");
		return Integer.parseInt(consola.nextLine());
	}

	private boolean ejecutarOpciones(int opcion, Scanner consola){
		var salir = false;
		switch (opcion){
			case 1 ->{
				logger.info("\n*** Lista de clientes ***\n");
				var clientes = clienteServicio.listarClientes();
				clientes.forEach(cliente -> logger.info(cliente.toString() + nl));
			}
			case 2 ->{
				logger.info("\n--- Buscar cliente por Id ---");
				logger.info("\nId Cliente: ");
				var id = Integer.parseInt(consola.nextLine());
				var cliente = clienteServicio.buscarClientePorId(id);
				if (cliente != null){
					logger.info("Cliente encontrado: {}", cliente);
				}else
					logger.info("No se encontro el cliente: {}", cliente);
			}
			case 3 ->{
				logger.info("\n--- Agregar un cliente ---\n");
				logger.info("Nombre: ");
				var nombre = consola.nextLine();
				logger.info("Apellido: ");
				var apellido = consola.nextLine();
				logger.info("Membresia: ");
				var membresia = Integer.parseInt(consola.nextLine());
				var cliente = new Cliente(null, nombre, apellido, membresia);
				clienteServicio.guardarCliente(cliente);
				logger.info("\nSe ha agredo el cliente: {}", cliente);
			}
			case 4 ->{
				logger.info("\nId de cliente a modificar: ");
				var id = Integer.parseInt(consola.nextLine());
				var cliente = clienteServicio.buscarClientePorId(id);
				if (cliente == null){
					logger.info("\nNo existe el cliente a modificar: {}", cliente);
				}else{
					logger.info("\nCliente : {}\n", cliente);
					logger.info("Nuevo nombre: ");
					var nombre = (consola.nextLine());
					logger.info("Nuevo Apellido: ");
					var apellido = consola.nextLine();
					logger.info("Nueva Membresia: ");
					var membresia = Integer.parseInt(consola.nextLine());
					cliente = new Cliente(id,nombre,apellido,membresia);
					clienteServicio.guardarCliente(cliente);
					logger.info("\nNuevo Cliente : {}", cliente);
				}
			}
			case 5 ->{
				logger.info("\nId de Cliente a eliminar: ");
				var id = Integer.parseInt(consola.nextLine());
				var cliente = clienteServicio.buscarClientePorId(id);
				if (cliente == null){
					logger.info("\nNo existe el cliente a eliminar: {}", cliente);
				}else{
					clienteServicio.eliminarCliente(cliente);
					logger.info("\nCliente eliminado: {}", cliente);
				}
			}
			case 6 ->{
				logger.info("\nHasta Pronto!!!");
				salir = true;
			}
			default -> logger.info("\nError al escojer una opcion: " + opcion );
		}
		return salir;
	}
}
