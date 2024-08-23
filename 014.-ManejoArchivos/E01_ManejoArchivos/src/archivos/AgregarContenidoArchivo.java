package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AgregarContenidoArchivo {
    public static void main(String[] args) {
        boolean anexar = false;
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try{
            //Revisar si el archivo existe
            anexar = archivo.exists();
            var salir = new PrintWriter(new FileWriter(archivo, anexar));
            var nuevoContenido = "Nuevo\nContenido";
            salir.println(nuevoContenido);
            //Guardamos la informacion en el archivo
            salir.close();
            System.out.println("Se ha escrito correctamente");
        }catch (Exception e){
            System.out.println("Error al escribir el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
