package excepciones;

public class Arimetica {
    public static int division (int numerador, int denominador) throws Exception{
        if (denominador == 0) {
            throw new Exception("Division entre Cero");
        }return numerador / denominador;
    }
}
