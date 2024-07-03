import java.util.Random;

public class E6_NumerosAleatorios {
    public static void main(String[] args) {
        //Generamos un valor aleatorio
        //Creamos un objeto random
        var aleatorio = new Random();
        //Generamos los valores entre 0 y 100 (no incluye el limite)
        int valorAleatorio = aleatorio.nextInt(100 + 1);
        System.out.println("Valor aleatorio (0 y 100): " + valorAleatorio);
        //Numeros aleatorios entre 100 y 200
        int min = 100, max = 200;
        valorAleatorio = aleatorio.nextInt(min, max + 1); 
        System.out.println("Valor aleatorio (100 y 200): " + valorAleatorio);
    }
}
