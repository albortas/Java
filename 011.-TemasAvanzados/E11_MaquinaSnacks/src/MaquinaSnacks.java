import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }
    public static void maquinaSnacks(){
        var salir = false;
        var consola = new Scanner(System.in);
        //Crear la lista de productos del snack
        List<Snack> productos = new ArrayList<>();
        System.out.println("*** Maquina de Snack ***");
        while (!salir){
            try{
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(opcion, consola, productos);
            }catch (Exception e){
                System.out.println("Ha ocurrido un error: " + e);
            }finally {
                System.out.println();
            }
        }
    }
    public static int mostrarMenu(Scanner consola){
        Snacks.mostrarSnacks();
        System.out.print("""
                Menu:
                1. Comprar snack
                2. Mostrar ticket
                3. Agregar nuevo snack
                4. Salir
                Elige una opcion:\s""");
        return Integer.parseInt(consola.nextLine());
    }

    public static boolean ejecutarOpciones(int opcion, Scanner consola, List<Snack> productos){
        var salir = false;
        switch (opcion){
            case 1 -> comprarSnack(consola, productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(consola);
            case 4 -> {
                System.out.println("Vuelva Pronto!");
                salir = true;
            }
            default -> System.out.println("Opcion invalida: " + opcion);
        }
        return salir;
    }

    public static void comprarSnack(Scanner consola, List<Snack> productos){
        System.out.print("Que snack quieres comprar (Id) ?: ");
        var idSnack = Integer.parseInt(consola.nextLine());
        //Validar si existe es id se Snack
        var snackEncontrado = false;
        for (Snack snack : Snacks.getSnacks()){
            if (idSnack == snack.getIdSnack()){
                productos.add(snack);
                System.out.println("Ok. Snack agregado: " + snack);
                snackEncontrado = true;
                break;
            }
        }
        if (!snackEncontrado){
            System.out.println("Id de snack no encontrado: " + idSnack);
        }
    }

    public static void mostrarTicket(List<Snack> productos){
        var ticket = "### Ticket de venta ###";
        var total = 0.0;
        for (var producto : productos){
            ticket += "\n\t- " + producto.getNombre() + " - $ " + producto.getPrecio() ;
            total += producto.getPrecio();
        }
        ticket += "\n\t Total -> $ " + total;
        System.out.println(ticket);
    }

    public static void agregarSnack(Scanner consola){
        System.out.print("Nombre del snack: ");
        var nombre = consola.nextLine();
        System.out.print("Precio del snack: ");
        var precio = Double.parseDouble(consola.nextLine());
        Snacks.agregarSnack(new Snack(nombre, precio));
        System.out.println("Tu snack se agregado correctamente!");
    }
}