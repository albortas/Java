public class E3_PasoPorValor {

    static void cambiarValor(int parametro){
        parametro = 20;
    }
    public static void main(String[] args) {
        //Creamos las variables
        var argumento = 10;
        System.out.println("Antes de llamar la funcion: "+ argumento);
        //LLamamos la funcion
        cambiarValor(argumento);
        System.out.println("Despues de llamar la funcion: "+argumento);
    }
}
