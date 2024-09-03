package delta.tareas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import delta.tareas.modelo.Tarea;

public interface TareaRepositorio extends JpaRepository<Tarea,Integer>{

}
