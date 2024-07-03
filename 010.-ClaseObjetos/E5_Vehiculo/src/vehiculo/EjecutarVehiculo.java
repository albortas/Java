package vehiculo;

public class EjecutarVehiculo {
    public static void main(String[] args) {
        //Automovil
        Automovil automovil1 = new Automovil("Volvo 550", 4, 5, 5);
        automovil1.mostrarDatos();
        automovil1.pruebaMotor();

        //Moto 
        Motocicleta motocicleta1 = new Motocicleta("Rimexico", 2, 2);
        motocicleta1.mostrarDatos();
        motocicleta1.pruebaMotor();

        //Autobus
        Autobus autobus1 = new Autobus("Mercedez", 6, 39, 3, 12);
        autobus1.mostrarDatos();
        autobus1.pruebaMotor();
    }
}
