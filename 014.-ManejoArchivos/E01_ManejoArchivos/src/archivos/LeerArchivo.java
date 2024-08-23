package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try{
            System.out.println("Contenido del archivo: ");
            //Abrir el archivo para lectura
            var entrada = new BufferedReader(new FileReader(archivo));
            //Leer el archivo linea a linea
            //Codigo para leer la primera linea
            var linea = entrada.readLine();
            //Para leer todas las lineas
            while (linea != null){
                System.out.println(linea);
                //antes de terminar el ciclo, nos movemos a la siguiente linea
                linea = entrada.readLine();
            }
            // Cerramos archivo
            entrada.close();

        }catch (Exception e){
            System.out.println("Error al leer archivo");
        }
    }
}
