public class E3_OperadoresAsignacion {
    public static void main(String[] args) {
        int miNumero = 10;
        System.out.println("Valor miNumero: " + miNumero);
        miNumero = 20;
        System.out.println("Valor miNumero: " + miNumero);
        //Operador += 
        miNumero += 5;
        System.out.println("Valor miNumero (+=5): " + miNumero);
        //Operador -=
        miNumero -= 3;
        System.out.println("Valor miNumero (-=3): " + miNumero);
        //Operador *=
        miNumero *= 2;
        System.out.println("Valor miNumero (*=2): " + miNumero);
        //Operador /=
        float division = miNumero;
        division /= 7;
        System.out.println("Valor miNumero (/=7): " + division);
        //Operador % =
        miNumero = 9;
        miNumero %= 2;
        System.out.println("Valor miNumero (%=2): " + miNumero);
    }
}
