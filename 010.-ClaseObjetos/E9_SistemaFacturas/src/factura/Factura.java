package factura;

public class Factura {
    //Atributos 
    private final int numeroFactura;
    private ProductoTienda[] productos;
    private int contadorProductos;
    private int[] cantidad;
    private double[] totalParcial;
    private static final int MAX_PRODUCTOS = 10;
    private static final int MAX_CANTIDAD = 15;
    private static int contadorFacturas;

    //Constructor
    public Factura(){
        this.numeroFactura = ++contadorFacturas;
        this.productos = new ProductoTienda[Factura.MAX_PRODUCTOS];
        this.totalParcial = new double[Factura.MAX_PRODUCTOS];
        this.cantidad = new int[Factura.MAX_PRODUCTOS];
    }

    //Metodos
    public void agregarProductosTienda(ProductoTienda productos, int cantidad){
        if(cantidad > 0 && cantidad < MAX_CANTIDAD){
            if(this.contadorProductos < Factura.MAX_PRODUCTOS){
                this.productos[this.contadorProductos] = productos;
                this.cantidad[this.contadorProductos] = cantidad;
                this.totalParcial[this.contadorProductos] = this.cantidad[this.contadorProductos]
                *this.productos[this.contadorProductos++].getPrecio();
            }
            else
                System.out.println("Sobre pasa el Maximo de porductos " + Factura.MAX_PRODUCTOS);
        }else
            System.out.println("Cantida en productos supera " + Factura.MAX_CANTIDAD);
    }
    
    //Metodo
    public double totalFactura(){
        double total = 0;
        for(var i = 0; i < this.contadorProductos; i++){
            var totalPar = totalParcial[i];
            total += totalPar;
        }
        return total;
    }

    //Metodo toString
    @Override
    public String toString(){
        var resutado = "Factura = " + this.numeroFactura + "\n";
        resutado += "\tTotal de la Factura = Bs. " + totalFactura() + "\n";
        resutado += "\tProductos: \n";
        for(var i = 0; i < this.contadorProductos; i++){
            resutado += "\t\t" + this.productos[i] 
            + ", Cantidad= " + this.cantidad[i] 
            + ", Total= " 
            + this.totalParcial[i] + "}\n";
        }
        return resutado;
    }

}
