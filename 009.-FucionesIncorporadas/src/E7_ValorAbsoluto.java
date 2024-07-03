import java.util.Scanner;

public class E7_ValorAbsoluto {
    public static void main(String[] args) {
        //Valor absoluto de un numero
        System.out.print("Proporciona un valor numerico: ");
        var consola = new Scanner(System.in);
        var numero = Integer.parseInt(consola.nextLine());
        var numeroAbs = Math.abs(numero);
        System.out.println("Valor absoluto de " + numero + " es: " + numeroAbs);
        consola.close();
    }
}
