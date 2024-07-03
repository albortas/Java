package instrumentos;

public class Instrumentos {
    //Atributos
    private String nombreInstrumento;

    //Constructor
    public Instrumentos(String nombreInstrumento){
        this.nombreInstrumento = nombreInstrumento;
    }

    //Metodos
    public void tocar(){
        System.out.println("Tocando instrumento " + this.nombreInstrumento);
    }
}
