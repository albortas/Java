package shadow.empleados.servicio;

import shadow.empleados.modelo.Empleado;

import java.util.List;

public interface IEmpleadoServicio {

    public List<Empleado> listarEmpleados();

    public Empleado buscarEmpleadoPorId(Integer idEmpleado);

    public void guadarEmpleado(Empleado empleado);

    public void eliminarEmpleado(Empleado empleado);
}