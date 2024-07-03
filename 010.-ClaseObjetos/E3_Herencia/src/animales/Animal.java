package animales;

public class Animal {
    //Metodos
    public void comer(){
        System.out.println("Como muchas vez al dia");
    }

    public void dormir(){
        System.out.println("Duermo muchas horas");
    }

    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
} // fin clase Animal

class Perro extends Animal{
    public void hacerSonido(){
        System.out.println("Puedo ladrar");
    }
    @Override
    public void dormir(){
        System.out.println("Duermo 15 horas al dia");
        System.out.println("Metodo clase padre: " );
        super.dormir();
    }

}

class Gato extends Animal{
    @Override
    public void hacerSonido(){
        System.out.println("Puedo maullar");
    }
}

class PruebaAnimal{
    public static void main(String[] args) {
        System.out.println("*** Ejemplo Herencia ***");
        System.out.println("Clase Padre, soy un Animal");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();
        //animal1.hacerSonido(); // este metodo no existe en la clase perro
        System.out.println("\nClase Hija, soy un Perro");
        Animal perro1 = new Perro(); //Polimorfino
        perro1.comer();
        perro1.dormir();
        perro1.hacerSonido();

        //Objeto de subclase gato
        System.out.println("\nClase Hija, soy Gato");
        var gato1 = new Gato();
        gato1.hacerSonido();
    }
}

