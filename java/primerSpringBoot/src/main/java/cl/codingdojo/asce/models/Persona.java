package cl.codingdojo.asce.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import cl.codingdojo.asce.models.enums.TipoPersonaEnum;

@Entity
@Table(name="personas")
public class Persona extends Auditoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Size(min = 3, max = 200, message = "El largo debe estar entre {min} y {max}")
	@Column(name = "nombre", length = 200, nullable = false)
	private String nombre;
	
	@Size(min = 3, max = 200, message = "El largo debe estar entre {min} y {max}")
	@Column(name = "apellido_paterno", length = 200, nullable = false)
	private String primerApellido;
	
	@Size(min = 0, max = 200, message = "El largo debe estar entre {min} y {max}")
	@Column(name = "apellido_materno", length = 200)
	private String segundoApellido;
	
	@Range(min=0, max=115, message = "No puede ser menor a {min} ni mayor a {max}")
	private int edad;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_nacimiento")
	private Date fechaNacimiento;
	
	@Enumerated(EnumType.STRING)
	private TipoPersonaEnum tipoPersona;
	

	public Persona() {
		
	}
	
	public Persona(long id, @Size(min = 3, max = 200) String nombre, @Size(min = 3, max = 200) String primerApellido,
			@Size(min = 0, max = 200) String segundoApellido, @Min(0) @Max(115) int edad, Date fechaNacimiento,
			Date fechaCreacion, Date fechaActualizacion) {
		super(fechaCreacion, fechaActualizacion);
		this.id = id;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		super.setFechaCreacion(fechaCreacion);
		super.setFechaActualizacion(fechaActualizacion);
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	

	@Override
	public String toString() {
		return "{id:" + id + ", nombre:" + nombre + ", primerApellido:" + primerApellido + ", segundoApellido:"
				+ segundoApellido + ", edad:" + edad + ", fechaNacimiento:" + fechaNacimiento + ", fechaCreacion:"
				+ getFechaCreacion() + ", fechaActualizacion:" + getFechaActualizacion() + "}";
	}
	
	
}
