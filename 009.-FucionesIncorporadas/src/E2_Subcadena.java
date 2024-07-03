public class E2_Subcadena {

    public static void main(String[] args) {
        //Subcadena
        String cadena = "Hola Mundo";
        //substring(indice_ini, indice_fin - 1)
        String subcadena1 = cadena.substring(0, 4);
        System.out.println("Subcadena1 = " + subcadena1);
        String subcadena2 = cadena.substring(5);
        System.out.println("Subcadena2 = " + subcadena2);
    }
}