public class ArgumentosVariables {

    static void imprimirNumeros(int... numeros){
        for(var i= 0; i < numeros.length; i++)
            System.out.print(numeros[i] + " ");
    }

    static void variosParametros(String nombre, int... numeros){
        System.out.println("Nombre: " + nombre);
        imprimirNumeros(numeros);
    }


    public static void main(String[] args) {
        //imprimirNumeros(1,2,3,4,5);
        variosParametros("Karla", 10, 20, 30);
    }
}
