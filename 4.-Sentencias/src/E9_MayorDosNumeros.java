import java.util.Scanner;

public class E9_MayorDosNumeros {

    public static void main(String[] args) {
        //El mayor de dos numeros
        Scanner consola = new Scanner(System.in);
        System.out.print("Proporcione el primer numero: ");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.print("Proporcione el segundo numero: ");
        var numero2 = Integer.parseInt(consola.nextLine());

        //Cual es el mayor
        if (numero1 > numero2) {
            System.out.println("El numero " + numero1 + " es mayor " + numero2);
        }else if (numero2 > numero1) {
            System.out.println("El numero " + numero2 + " es mayor " + numero1);            
        }else if (numero1 == numero2){
            System.out.println("El numero " + numero1 + " es igual " + numero2);
        }
        consola.close();
    }
}