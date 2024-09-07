package shadow.contactos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import shadow.contactos.modelo.Contacto;

public interface ContactoRepositorio extends JpaRepository<Contacto, Integer> {
}
