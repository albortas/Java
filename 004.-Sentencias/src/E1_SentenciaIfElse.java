import java.util.Scanner;

public class E1_SentenciaIfElse {
    public static void main(String[] args) {
        // Sentencia If
        System.out.println("Proporciona un numero: ");
        Scanner consola = new Scanner(System.in);
        int numero = Integer.parseInt(consola.nextLine());
        // Verificando si es valor positivo
        if (numero>0){
            System.out.println("Valor Positivo: " + numero);
        }else if (numero < 0) {
            System.out.println("Valor Negativo " + numero);
        }else{
            System.out.println("Valor Cero " + numero);
        }
        consola.close();
    }
}
