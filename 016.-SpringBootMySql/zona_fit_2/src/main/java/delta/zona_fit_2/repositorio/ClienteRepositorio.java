package delta.zona_fit_2.repositorio;

import delta.zona_fit_2.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorio extends JpaRepository<Cliente,Integer> {
}
