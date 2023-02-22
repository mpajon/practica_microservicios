package es.iesfleming.ejemplo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import es.iesfleming.ejemplo.entity.Empleado;

public interface EmpleadoRepo extends JpaRepository<Empleado, Integer> {

	public Optional<Empleado> findByNombre(String nombre);
	
}
