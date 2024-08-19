package factura;

public class ProductoTienda {
    //Atributos
    private final int numeroPieza;
    private String descripcion;
    private double precio;
    private static int contadorPiezas;

    //constructor
    public ProductoTienda(String descripcion, double precio){
        this.numeroPieza = ++contadorPiezas;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    //Metodos get y set
    public int getNumeroPieza() {
        return this.numeroPieza;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorPiezas() {
        return contadorPiezas;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Producto{" +
                " Numero de Pieza= " + numeroPieza +
                ", Descripcion= " + descripcion + '\'' +
                ", Precio= " + precio ;
    }
}
