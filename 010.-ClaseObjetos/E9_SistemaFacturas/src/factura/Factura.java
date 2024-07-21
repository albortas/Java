package factura;
public class Factura {
    //Atributos
    private int numeroPieza;
    private String descripcionPieza;
    private int cantidadComprar;
    private double precioArticulo;

    //Constructor
    public Factura(int numeroPieza, String descripcionPieza, int cantidadComprar, double precioArticulo){
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        if(cantidadComprar > 0)
            this.cantidadComprar = cantidadComprar;
        if(precioArticulo > 0.0)
            this.precioArticulo = precioArticulo;
    }

    //Metodo get (Mostrar atributos)
    public int getNumeroPieza(){
        return this.numeroPieza;
    }

    public String getDescripcionPieza(){
        return this.descripcionPieza;
    }

    public int getCantidadComprar(){
        return this.cantidadComprar;
    }

    public double getPrecioArticulo(){
        return this.precioArticulo;
    }

    //Metodos set (Modificar atributos)
    public void setNumeroPieza(int numeroPieza){
        this.numeroPieza = numeroPieza;
    }

    public void setDescripcionPieza(String descripcionPieza){
        this.descripcionPieza = descripcionPieza;
    }

    public void setCantidadComprar(int cantidadComprar){
        this.cantidadComprar = cantidadComprar;
    }

    public void setPrecioArticulo(double precioArticulo){
        this.precioArticulo = precioArticulo;
    }

    //Metodos
    public double montoFactura(){

        double montoFactura = this.cantidadComprar * this.precioArticulo;
        return montoFactura;
    }

    public void mostrarDatos(){
        System.out.println();
    }
}