import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String,String> persona = new HashMap<>();
        persona.put("nombre", "Diego");
        persona.put("apellido", "Flores");
        persona.put("edad", "31");
        
        System.out.println("Valores del mapa: ");
        persona.entrySet().forEach(System.out::println);
        persona.put("edad", "35"); //Modificar el valor
        persona.remove("apellido");
        System.out.println("\nNuevos valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

        //Iterar sobre los elementos del mapa por separado
        System.out.println("\nIterando los elmentos (llave, valor)");
        persona.forEach((llave, valor) -> {
            System.out.println("LLave: " + llave + " , Valor " + valor);
        });
    }
}
