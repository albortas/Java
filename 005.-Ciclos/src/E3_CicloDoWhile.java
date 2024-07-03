import java.util.Scanner;

public class E3_CicloDoWhile {
    public static void main(String[] args) {
        int numero;
        var consola = new Scanner(System.in);
        do {
            System.out.println("Proporcione un valor positivo");
            numero = Integer.parseInt(consola.nextLine());
        } while (numero <= 0);
        System.out.println("Valor positivo: " + numero);
        consola.close();

    }
}
