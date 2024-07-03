package vehiculo;

public class Vehiculo {
    
    //atributos
    private String marcaModelo;
    private int numeroLlantas;  
    
    //Constructor
    public Vehiculo(String marcaModelo, int numeroLlantas){
        this.marcaModelo = marcaModelo;
        this.numeroLlantas = numeroLlantas;
    }
    
    //Metodos
    public void mostrarCaracteristicas(){
        System.out.println("Marca: " + marcaModelo);
        System.out.println("Numero de llantas: " + numeroLlantas);
    }

    public void encederMotor(){
        System.out.println("Motor encendido");
    }

    public void apagarMotor(){
        System.out.println("Motor Apagado");
    }
}

class Automovil extends Vehiculo{
    //Atributos
    private int numAsientos = 5;
    private int numPuertas;

    //Constructor
    public Automovil(String marcaModelo, int numeroLlantas, int numAsientos, int numPuertas){
        super(marcaModelo, numeroLlantas);
        this.numAsientos = numAsientos;
        this.numPuertas = numPuertas;
        System.out.println("\n---- Ha creado un automóvil ----");
    }

    public void mostrarDatos(){
        super.mostrarCaracteristicas();
        System.out.println("Asientos: " + numAsientos);
        System.out.println("Puertas: " + numPuertas);
    }

    public void pruebaMotor(){
        super.encederMotor();
        super.apagarMotor();
    }
}

class Motocicleta extends Vehiculo{
    //Atributos
    private int numAsientos = 1;

    //Constructor
    public Motocicleta(String marcaModelo, int numeroLlantas, int numAsientos){
        super(marcaModelo, numeroLlantas);
        this.numAsientos = numAsientos;
        System.out.println("\n---- Ha creado un motocileta ----");        
    }

    //Metodos
    public void mostrarDatos(){
        super.mostrarCaracteristicas();
        System.out.println("Asientos: " + numAsientos);
    }
    
    public void pruebaMotor(){
        super.encederMotor();
        super.apagarMotor();
    }
}

class Autobus extends Vehiculo{
    //Atributos
    private int numAsientos = 41;
    private int numPuertas;
    private int numVentanillas;

    //Constructor
    public Autobus(String marcaModelo, int numeroLlantas, int numAsientos, int numPuertas, int numVentanillas){
        super(marcaModelo, numeroLlantas);
        this.numAsientos = numAsientos;
        this.numPuertas = numPuertas;
        this.numVentanillas = numVentanillas;
        System.out.println("\n---- Ha creado un autobús ----");
    }

    //Metodos 
    public void mostrarDatos(){
        super.mostrarCaracteristicas();
        System.out.println("Asientos: " + numAsientos);
        System.out.println("Puertas: " + numPuertas);
        System.out.println("Ventanillas: " + numVentanillas);
    }

    public void pruebaMotor(){
        super.encederMotor();
        super.apagarMotor();
    }
}