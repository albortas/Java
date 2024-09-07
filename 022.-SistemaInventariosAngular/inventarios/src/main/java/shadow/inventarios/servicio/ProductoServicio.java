package shadow.inventarios.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shadow.inventarios.modelo.Producto;
import shadow.inventarios.repositorio.ProductoRepositorio;

import java.util.List;

@Service
public class ProductoServicio implements IProductoServicio{

    @Autowired
    private ProductoRepositorio productoRepositorio;

    @Override
    public List<Producto> listarProductos() {
        return productoRepositorio.findAll();
    }

    @Override
    public Producto buscarProductoPorId(Integer idProducto) {
        Producto producto = productoRepositorio.findById(idProducto).orElse(null);
        return producto;
    }

    @Override
    public Producto guardarProducto(Producto producto) {
        productoRepositorio.save(producto);
        return producto;
    }

    @Override
    public void eliminarProducto(Integer idProducto) {
        productoRepositorio.deleteById(idProducto);
    }
}
