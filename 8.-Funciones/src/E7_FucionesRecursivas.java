public class E7_FucionesRecursivas {

    //Fucion recursiva
    static void funcionRecursiva(int numero){
        //Caso Base
        if (numero == 1) {
            System.out.println(numero);
        }else{
            //Caso recursivo
            funcionRecursiva(numero - 1);
            System.out.println(numero);
        }
    }
    public static void main(String[] args) {
        int valor = 5;
        funcionRecursiva(valor);
    }
}
