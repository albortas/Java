public class ClaseAbstracta {
    public static void main(String[] args) {
        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();
        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();        
    }
}

//Clase Abstracta
abstract class FiguraGeometrica { //No se instanciar
    public abstract void dibujar();    
}

class Rectangulo extends FiguraGeometrica{
    public void dibujar(){
        System.out.println("Se dibuja un Rectangulo");
    }
}

class Circulo extends FiguraGeometrica{
    public void dibujar(){
        System.out.println("Se dibuja un Circulo");
    }
}
