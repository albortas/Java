import java.util.Scanner;

public class E6_EjValorEntreRango {
    public static void main(String[] args) {
        int minimo = 0, maximo = 5;
        Scanner consola = new Scanner(System.in);
        System.out.print("Proporciona un dato entre 0 y 5: ");
        int dato = Integer.parseInt(consola.nextLine());
        // Verificamos si el dato esta dentro de rango
        boolean dentroRango = dato >= minimo && dato <= maximo;
        System.out.println("Valor dentro de rango? " +dentroRango);
        consola.close();
    }
}
