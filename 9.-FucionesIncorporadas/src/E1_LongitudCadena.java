public class E1_LongitudCadena {
    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        System.out.println("Largo cadena: "+cadena.length());

        //Recorrer la cadena
        for(int i = 0; i< cadena.length(); i++){
            System.out.println(i + " - " + cadena.charAt(i));
        }
    }
}
