package es.iesfleming.ejemplo.service;

import java.util.List;

import es.iesfleming.ejemplo.entity.Empleado;

public interface EmpleadoService {
	public Empleado insertarEmpleado(String nombre, int salario);
	public List<Empleado> listadoEmpleados();
	public Empleado obtenerEmpleadoPorId(int id);
	public Empleado obtenerEmpleadoPorNombre(String nombre);
	public void borrarEmpleado(int id);
	public void actualizarSalarioEmpleado(int id, int salario);

}
