package es.iesfleming.ejemplo.service.impl;

import java.util.List;

import es.iesfleming.ejemplo.entity.Empleado;
import es.iesfleming.ejemplo.repository.EmpleadoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService implements es.iesfleming.ejemplo.service.EmpleadoService {

	@Autowired
	private EmpleadoRepo empleadoRepo;
	
	@Override
	public Empleado insertarEmpleado(String nombre, int salario) {

		Empleado emp = new Empleado();
		emp.setNombre(nombre);
		emp.setSalario(salario);
					
		return empleadoRepo.save(emp);
	}

	@Override
	public List<Empleado> listadoEmpleados() {
		return empleadoRepo.findAll();
	}

	@Override
	public Empleado obtenerEmpleadoPorId(int id) {
		return empleadoRepo.findById(id).orElse((null));
	}

	@Override
	public Empleado obtenerEmpleadoPorNombre(String nombre) {
		return empleadoRepo.findByNombre(nombre).orElse((null));
	}

	@Override
	public void borrarEmpleado(int id) {
		empleadoRepo.deleteById(id);
	}

	@Override
	public void actualizarSalarioEmpleado(int id, int salario) {
		Empleado empleado = empleadoRepo.findById(id).orElse((null));
		empleado.setSalario(salario);
		empleadoRepo.save(empleado);
	}


}
