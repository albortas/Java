package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksLista implements IServicioSnacks{
    private static final List<Snack> snacks = new ArrayList<>();

    public ServicioSnacksLista(){

    }
    static {
        snacks.add(new Snack("Papas", 70));
        snacks.add(new Snack("Refresco", 50));
        snacks.add(new Snack("Sandwich", 120));
    }

    public void agregarSnack(Snack snack){
        ServicioSnacksLista.snacks.add(snack);
    }
    public void mostrarSnacks(){
        var mostrar = "";
        for (Snack snack : snacks){
            mostrar += snack.toString() + "\n";
        }
        System.out.println("*** Snacks en el inventario ***");
        System.out.println(mostrar);
    }
    public List<Snack> getSnacks(){
        return ServicioSnacksLista.snacks;
    }
}
