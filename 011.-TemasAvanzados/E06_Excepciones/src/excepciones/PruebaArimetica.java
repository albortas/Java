package excepciones;

public class PruebaArimetica {
    public static void main(String[] args) {
        try{
            var resultado = Arimetica.division(10, 0);
            System.out.println(resultado);
        }catch(Exception e){
            System.out.println("Ocurrio un error" + e);
        }
        finally{
            System.out.println("Se revido la division entre cero");
        }
    }
}
