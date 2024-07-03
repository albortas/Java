import java.util.Scanner;

public class E2_FunicionSumar {

    static int sumar(int a, int b){
        int resultadoSuma = a + b;
        return resultadoSuma;
    }
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Proporciona valor a: ");
        var argA = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona valor b: ");
        var argB = Integer.parseInt(consola.nextLine());
        var resultado = sumar(argA, argB);
        System.out.println("Resultado de la suma: " + resultado);
        consola.close();
    }
}
