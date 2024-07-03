package cuenta;

import java.text.DecimalFormat;

public class Cuenta {
    //Creacion de patron
    private String patron = "#.##";
    private DecimalFormat decimalFormat = new DecimalFormat(patron);
    //Atributos
    private String nombre;
    private double saldo;

    //Constructor
    public Cuenta(String nombre, double saldo){
        this.nombre = nombre;

        //Saldo tiene que ser mayor a cero o matener valor inicial 0.0
        if (saldo > 0.0) {
            this.saldo = saldo;
        }
    }
    
    //Metodos
    public String formatSaldo(){
        String formatSaldo = decimalFormat.format(this.saldo);
        return formatSaldo;
    }

    public void depositar(double montoDeposito){
        if(montoDeposito > 0.0){
            this.saldo += montoDeposito;
            System.out.println("sumando " + formatSaldo() + " al saldo de " + this.nombre);
        }
    }

    public void retirar(double montoRetiro){
        if(montoRetiro <= this.saldo){
            this.saldo -= montoRetiro;
        }else{
            System.out.println("El monto a retirar excede el saldo de la cuenta");
        }
    }

    public void saldo(){
        System.out.println("Saldo de " + this.nombre + ": " + formatSaldo());
    }
    

    //Metodo get (Obterner)
    public String getNombre(){
        return this.nombre;
    }

    public double getSaldo(){
        return this.saldo;
    }

    //Metodo set (Establecer)
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

}