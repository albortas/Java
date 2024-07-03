import java.util.Scanner;

public class E10_Calculadora {
    public static void suma(double a, double b){
        double resultado = a + b;
        System.out.println("Suma: " + resultado); 
    }
    public static void resta(double a, double b){
        double resultado = a - b;
        System.out.println("Suma: " + resultado); 
    }
    public static void multiplicacion(double a, double b){
        double resultado = a * b;
        System.out.println("Suma: " + resultado); 
    }
    public static void division(double a, double b){
        if (b > 0){
            double resultado = a / b;
            System.out.println("Suma: " + resultado); 
        }else{
            System.out.println("No existe la division entre 0");
        }
    }
       public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        var salir = false;
        while (!salir){
            System.out.print("""
                    ----Calculadora----
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    Selcciona una opcion:\s""");
            var opcion = Integer.parseInt(consola.nextLine());
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Propocione el primer numero: ");
                double numero1 = Double.parseDouble(consola.nextLine());
                System.out.print("Propocione el segundo numero: ");
                double numero2 = Double.parseDouble(consola.nextLine());
                
                switch(opcion){
                    case 1 -> suma(numero1, numero2);
                    case 2 -> resta(numero1, numero2);
                    case 3 -> multiplicacion(numero1, numero2);
                    case 4 -> division(numero1, numero2);
                }
            }else if(opcion == 5){
                salir = true;
                System.out.println("Saliendo de calculadora...");
            }else{
                System.out.println("Opcion invalida: " + opcion);
            }
            System.out.println();
        }
        consola.close();
    }
}
