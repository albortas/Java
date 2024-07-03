public class E3_Concatenacion {

    public static void main(String[] args) {
        //Concatenacion de Cadenas
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println(cadena3);

        //Si son numeros, entonces suma
        int a = 5, b = 3;
        System.out.println(a + b);

        //Si son cadenas, concatenan
        String c = "10", d = "20";
        System.out.println(c + d);
    }
}