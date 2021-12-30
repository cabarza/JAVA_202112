package cl.codingdojo.asce.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class Auditoria {

	Auditoria() {
		
	}
	
	public Auditoria(Date fechaCreacion, Date fechaActualizacion) {
		super();
		this.fechaCreacion = fechaCreacion;
		this.fechaActualizacion = fechaActualizacion;
	}



	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_creacion", nullable = false, updatable = false)
	private Date fechaCreacion;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_actualizacion")
	private Date fechaActualizacion;
	
	
	@PrePersist
	public void preCrear() {
		this.fechaCreacion = new Date();
	}
	
	@PreUpdate
	public void preActualizar() {
		this.fechaActualizacion = new Date();
	}
	
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}
	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
}
