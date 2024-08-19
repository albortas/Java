package prueba;

import factura.Factura;
import factura.ProductoTienda;

public class Prueba {
    public static void main(String[] args) {
        System.out.println("### Sistema de Facturacion ###");
        var producto1 = new ProductoTienda("Yogurt Pil",1.50);
        var producto2 = new ProductoTienda("Pan",0.50);
        var producto3 = new ProductoTienda("Papas Fritas",10.80);
        var producto4 = new ProductoTienda("Coca Cola", 5.50);

        var factura1 = new Factura();
        factura1.agregarProductosTienda(producto1, 10);
        factura1.agregarProductosTienda(producto2, 12);
        factura1.agregarProductosTienda(producto3, 2);
        factura1.agregarProductosTienda(producto4, 2);
        System.out.println(factura1);

        var factura2 = new Factura();
        factura2.agregarProductosTienda(producto4, 3);
        factura2.agregarProductosTienda(producto1, 14);
        System.out.println(factura2);

    }
}
