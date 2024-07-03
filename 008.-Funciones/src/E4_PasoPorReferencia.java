public class E4_PasoPorReferencia {

    static void cambiarValor(int[] parametro){
        parametro[0] = 20;
    }
    public static void main(String[] args) {
        int[] argumento = {10};
        System.out.println("Antes llamar funcion: " + argumento[0]);
        cambiarValor(argumento);
        System.out.println("Despues llamar funcion: " + argumento[0]);
    }
}
