package es.iesfleming.ejemplo.entity;
import javax.persistence.*;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="empleados")
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Empleado {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	@Getter @Setter
	private int id;
	
	@Column(name="nombre")
	@Getter 
	@Setter
	private String nombre;
	
	@Column(name="salario")	
	@Getter 
	@Setter
	private int salario;

}
