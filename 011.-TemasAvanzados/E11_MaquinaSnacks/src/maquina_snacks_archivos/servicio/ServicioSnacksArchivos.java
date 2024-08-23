package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksArchivos implements IServicioSnacks{

    private final String NOMBRE_ARCHIVO = "snacks.txt";
    //Crear la lista de Snacks
    private List<Snack> snacks = new ArrayList<>();

    //Constructor vacio
    public ServicioSnacksArchivos(){
        var archivo = new File(NOMBRE_ARCHIVO);
        var existe = false;
        try {
            existe = archivo.exists();
            if(existe){
                this.snacks = obtenerSnacks();
            }else{
                var salida = new PrintWriter(new FileWriter(NOMBRE_ARCHIVO));
                salida.close();//Guarda el archivo en disco
                System.out.println("Se ha creado el archivo");
            }
        }catch (Exception e){
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
        //Si no existe, cargamos algunos snacks iniciales
        if (!existe){
            cargarSnacksIniciales();
        }
    }

    private void cargarSnacksIniciales(){
        this.agregarSnack(new Snack("Papas",70));
        this.agregarSnack(new Snack("Refresco",50));
        this.agregarSnack(new Snack("Sandwich",120));
    }

    @Override
    public void agregarSnack(Snack snack) {
        //1. Se guarda en la lista en memoria
        this.snacks.add(snack);
        //2. Guardamos el snack en el archivo
        this.agregarSnackArchivo(snack);
    }

    private List<Snack> obtenerSnacks(){
        var snacks = new ArrayList<Snack>();
        try {
            List<String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));
            for (String linea : lineas){
                String[] lineaSnack = linea.split(",");//Parseo separado por una coma
                var idSnack = lineaSnack[0];
                var nombre = lineaSnack[1];
                var precio = Double.parseDouble(lineaSnack[2]);
                var snack = new Snack(nombre,precio);
                snacks.add(snack);
            }
        }catch (Exception e){
            System.out.println("Error a leer archivo de snacks: " +e.getMessage());
        }
        return snacks;
    }

    private void agregarSnackArchivo(Snack snack){
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);
        try{
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(NOMBRE_ARCHIVO, anexar));
            salida.println(snack.escribirSnack());
            salida.close();
        }catch (Exception e){
            System.out.println("Error al agregar un snack al archivo: " + e.getMessage());
        }
    }

    @Override
    public void mostrarSnacks() {
        System.out.println("---Snack en el Inventario ---");
        //Mostramos la lista de snacks en el archivo
        var inventarioSnacks = "";
        for (var snack: this.snacks){
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println(inventarioSnacks);
    }

    @Override
    public List<Snack> getSnacks() {
        return this.snacks;
    }
}
