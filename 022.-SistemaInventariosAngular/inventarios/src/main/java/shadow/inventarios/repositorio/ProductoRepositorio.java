package shadow.inventarios.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import shadow.inventarios.modelo.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto,Integer> {
}
