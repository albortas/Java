package maquina_snacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    private static final List<Snack> snacks = new ArrayList<>();

    public Snacks(){

    }
    static {
        snacks.add(new Snack("Papas", 70));
        snacks.add(new Snack("Refresco", 50));
        snacks.add(new Snack("Sandwich", 120));
    }

    public static void agregarSnack(Snack snack){
        Snacks.snacks.add(snack);
    }
    public static void mostrarSnacks(){
        var mostrar = "";
        for (Snack snack : snacks){
            mostrar += snack.toString() + "\n";
        }
        System.out.println("*** maquina_snacks.Snack en inventario ***");
        System.out.println(mostrar);
    }
    public static List<Snack> getSnacks(){
        return Snacks.snacks;
    }
}
