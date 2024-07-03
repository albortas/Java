package prueba;

import java.util.Scanner;

import cuenta.Cuenta;

public class PruebaCuenta {
    public static void main(String[] args) {
        //Obtener un nombre por consola
        Scanner consola = new Scanner(System.in);
        
        //Crear un objetos
        var cuenta1 = new Cuenta("Jane Green", 50.000);
        var cuenta2 = new Cuenta("John Blue", -7.530);

        //Mostramos saldos iniciales
        System.out.println("\n--- Saldos ---");
        cuenta1.saldo();
        cuenta2.saldo();
        
        //Hacer un deposito a la cuenta 1
        System.out.print("\nEscriba el monto a depositar para cuenta 1: ");
        var montoDeposito = Double.parseDouble(consola.nextLine());
        cuenta1.depositar(montoDeposito);
        
        //Mostramos los saldos
        System.out.println("\n--- Saldos ---");
        cuenta1.saldo();
        cuenta2.saldo();

        //Hacer un retiro de la cuenta 1
        System.out.println("\nEscriba el monto a retirar de la cuenta 1: ");
        var montoRetiro = Double.parseDouble(consola.nextLine());
        cuenta1.retirar(montoRetiro);
        
        //Hacer un deposito a la cuenta 2
        System.out.print("\nEscriba el monto a depositar para cuenta 2: ");
        montoDeposito = Double.parseDouble(consola.nextLine());
        cuenta2.depositar(montoDeposito);
        
        //Mostramos los saldos
        System.out.println("\n--- Saldos ---");
        cuenta1.saldo();
        cuenta2.saldo();        

        consola.close();
    }
}
