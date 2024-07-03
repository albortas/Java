package ventas;

public class Producto {
    //atributos
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    //Constructor
    public Producto(String nombre, double precio){
        this.idProducto = ++Producto.contadorProductos;
        this.nombre = nombre;
        this.precio = precio;
    }

    //Metodos get (Solo lectura)
    public int getIdProducto(){
        return this.idProducto;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getPrecio(){
        return this.precio;
    }
    
    //Metodos set (Modificadores)
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setNombre(double precio){
        this.precio = precio;
    }

    //Sobrescribir el metodo toString
    @Override
    public String toString(){
        return "Producto{idProducto = " + this.idProducto
                + ", nombre = " + this.nombre
                + ", precio = " + this.precio + "}";
    }

}
