public class E1_Variables {
    public static void main(String[] args) {
        /* Reglas para definir el nombre de una variable
         * 1. Puede contener letras, digitos, _ y $
         * 2. Debe comenzar con una letra
         * 3. Inicia con letra minuscula y sin espacios
         * 4. Es sencible a mayusculas/minusculas
         * 5. No se puede usar palabras reservadas (int, boolean, etc)
        */
        // 1. Declarar e inicializar variables
        int miNumero = 10;
        // 2. Imprimir
        System.out.println("Mi numero es: " + miNumero);

        int _miVariable = 20;
        System.out.println(_miVariable);

        int $miVariable = 30;
        System.out.println($miVariable);

        
    }
}
