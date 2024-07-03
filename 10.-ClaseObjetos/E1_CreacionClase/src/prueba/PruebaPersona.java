package prueba;

import persona.Persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("Creacion de Objetos de la Clase Persona");
        //System.out.println("Variable estatica: " + Persona.contadorPersona);
        Persona objeto1 = new Persona("Daniel", "Alborta");
        //objeto1.mostrarPersona();
        //objeto1.setNombre("Alejandro");
        //objeto1.setApellido("Garcia");
        System.out.println(objeto1); //De manera automatica se llama toString
        //System.out.println("Variable estatica: " + Persona.contadorPersona);
        //var objeto2 = new Persona("Alejandro","Garcia");
        //System.out.println(objeto2);
        System.out.println("Variable estatica: " 
                + Persona.getContadorPersona());
    }
    
}
