public class E5_PasoCadenaFuncion {

    static void cambiarValor(String parametro){
        parametro = "Adios";
    }
    public static void main(String[] args) {
        String argumento = "Hola";
        System.out.println("Antes llamar funcion: " + argumento);
        cambiarValor(argumento);
        System.out.println("Despues llamar funcion: "+ argumento);
    }
}
