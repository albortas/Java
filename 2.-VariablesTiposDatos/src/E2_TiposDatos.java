public class E2_TiposDatos {
    public static void main(String[] args) {
        // Tipo entero (Tipos primitivos o simples)
        int miEntero = 10;
        System.out.println("Mi entero: " + miEntero);
        System.out.println("Entero tamanio bits: " + Integer.SIZE);
        System.out.println("Entero valor ninimo: " + Integer.MIN_VALUE);
        System.out.println("Entero valor maximo: " + Integer.MAX_VALUE);

        // Tipo long (l o L indica literal tipo float)
        long miLong = 100L;
        System.out.println("Mi long: " + miLong);
        System.out.println("Long tamanio bits: " + Long.SIZE);
        
        // Tipo Flotante (f o F indica literal tipo float)
        float miFlotante = 8.9F;
        System.out.println("Mi flotante: " + miFlotante);
        System.out.println("Float tamanio bits: " + Float.SIZE);
        //Tipo double (d o D indica literal tipo double)
        double miDoble = 10.7;
        System.out.println("Mi doble: " + miDoble);
        System.out.println("Doble tamanio bits: " + Double.SIZE);
        // Tipo char
        //char miCaracter = 65;
        char miCaracter = 'A';
        System.out.println("Mi caracter: " + miCaracter);
        System.out.println("Char tamanio bits: " + Character.SIZE);

        // Tipo boolean (true o false)
        boolean miBoleano = true;
        System.out.println("Mi boleano: " + miBoleano);
        // Su tamanio depende de cada JVM (Java Virtual Machine)
        //System.out.println("Boolean tamanio bits: " + Boolean.SIZE);

        //Tipo String (Clase)
        String miCadena = "Hola Mundo";
        System.out.println("Mi cadena: " + miCadena);
        System.out.println("Largo cadena " + miCadena.length());

    }
}
