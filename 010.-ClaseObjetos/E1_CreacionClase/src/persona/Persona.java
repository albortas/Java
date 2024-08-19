package persona;
public class Persona extends Object{
    //Atributos
    private static int contadorPersona = 0;
    private int idPersona;
    private String nombre, apellido;

    //Constructor 
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        //Incrementar el atributo estatico
        this.idPersona = ++Persona.contadorPersona;
    }

    @Override
    public String toString(){
        return  "Id: " + this.idPersona 
                + ", Nombre: " + this.nombre 
                + ", Apellido: " + this.apellido;
                //+ ", Dir. Memoria: " + super.toString();
    }

    //Metodos
    public void mostrarPersona(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }

    //Metodos get (Mostradoes de atributos)
    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    //Metodos set (Modificadores de atributos)
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    //Metodos Estaticos
    public static int getContadorPersona(){
        return Persona.contadorPersona;
    }



}
