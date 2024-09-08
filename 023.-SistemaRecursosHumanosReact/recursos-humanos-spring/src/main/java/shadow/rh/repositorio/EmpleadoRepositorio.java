package shadow.rh.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import shadow.rh.modelo.Empleado;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {
}
