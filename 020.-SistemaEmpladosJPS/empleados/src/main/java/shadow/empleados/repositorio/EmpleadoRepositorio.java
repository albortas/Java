package shadow.empleados.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import shadow.empleados.modelo.Empleado;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {
}
