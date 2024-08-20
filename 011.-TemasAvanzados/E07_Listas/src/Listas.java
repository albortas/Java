import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

        /* for (String elmentos : miLista) {
            System.out.println("Dia de la semana: " + elmentos);
        } */

        //Funciones lambda (funcion anonima de un codigo muy compacto)
        /* miLista.forEach(elementos -> {
            System.out.println("Elemento: " + elementos);
        }); */

        miLista.forEach(System.out::println);

        List<String> nombres = Arrays.asList("Pedro","Ivonne","Nohemi");
        System.out.println("\nLista de Nombres: ");
        nombres.forEach(System.out::println);
    }
}
