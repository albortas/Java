package ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Ventas ***");
        var camisa1 = new Producto("Camisa", 50.00);
        System.out.println(camisa1);
        var pantalon1 = new Producto("Pantalon", 100.00);
        System.out.println(pantalon1);

        //Primer objeto de orden
        var orden1 = new Orden();
        orden1.agregarProductos(camisa1);
        orden1.agregarProductos(pantalon1);
        orden1.mostrarOrden();

        //Segunda ojeto de orden
        var orden2 = new Orden();
        orden2.agregarProductos(new Producto("Calcetines", 20.00));
        orden2.agregarProductos(camisa1);
        orden2.mostrarOrden();
        

    }
}
