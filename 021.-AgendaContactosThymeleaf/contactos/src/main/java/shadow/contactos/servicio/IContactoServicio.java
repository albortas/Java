package shadow.contactos.servicio;

import shadow.contactos.modelo.Contacto;

import java.util.List;

public interface IContactoServicio {
    public List<Contacto> listarContactos();
    public Contacto buscarContactoPorId(Integer idContacto);
    public void guardaContacto(Contacto contacto);
    public void eliminarContacto(Contacto contacto);
}
