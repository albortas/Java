package maquina_snacks;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {
    private static int contadorSnack = 0;
    private int idSnack;
    private String nombre;
    private double precio;

    //Constructor vacio
    public Snack(){
        this.idSnack = ++Snack.contadorSnack;
    }

    //Constructor
    public Snack(String nombre, double precio){
        this(); //Para llamar al constructo vacio
        this.nombre = nombre;
        this.precio = precio;
    }

    //Metodos get/set
    public static int getContadorSnack() {
        return contadorSnack;
    }

    public int getIdSnack() {
        return idSnack;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "maquina_snacks.Snack{" +
                "idSnack=" + idSnack +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    //Metodo equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return idSnack == snack.idSnack && Double.compare(precio, snack.precio) == 0 && Objects.equals(nombre, snack.nombre);
    }

    //Metodo hashCode
    @Override
    public int hashCode() {
        return Objects.hash(idSnack, nombre, precio);
    }
}
