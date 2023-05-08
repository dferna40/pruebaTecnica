package org.davidfernandez.rankingseries.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Clase que mapea la entidad valoraciones
 * @author David
 *
 */
@Entity
@Table(name = "valoraciones")
public class Valoracion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "valoracion")
	private Double valoracion;
	
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;
	
	@Column(name = "fecha_actualizacion")
	private Date fechaActualizacion;
	
	@ManyToOne( cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name = "usuario_id")
	private Usuario usuario; 
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "serie_id")
	private Serie serie;

    
    

	public Valoracion(Long id, Double valoracion, Date fechaCreacion, Date fechaActualizacion) {
		super();
		this.id = id;
		this.valoracion = valoracion;
		this.fechaCreacion = fechaCreacion;
		this.fechaActualizacion = fechaActualizacion;
	}
	
	

	public Valoracion(Double valoracion, Date fechaCreacion, Date fechaActualizacion) {
		super();
		this.valoracion = valoracion;
		this.fechaCreacion = fechaCreacion;
		this.fechaActualizacion = fechaActualizacion;
	}



	public Valoracion(Long id, Double valoracion, Date fechaCreacion, Date fechaActualizacion, Usuario usuario,
			Serie serie) {
		super();
		this.id = id;
		this.valoracion = valoracion;
		this.fechaCreacion = fechaCreacion;
		this.fechaActualizacion = fechaActualizacion;
		this.usuario = usuario;
		this.serie = serie;
	}



	public Valoracion(Double valoracion, Date fechaCreacion, Date fechaActualizacion, Usuario usuario, Serie serie) {
		super();
		this.valoracion = valoracion;
		this.fechaCreacion = fechaCreacion;
		this.fechaActualizacion = fechaActualizacion;
		this.usuario = usuario;
		this.serie = serie;
	}



	public Valoracion(Double valoracion) {
		super();
		this.valoracion = valoracion;
	}



	public Valoracion() {
		super();
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getValoracion() {
		return valoracion;
	}

	public void setValoracion(Double valoracion) {
		this.valoracion = valoracion;
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



	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}



	public Serie getSerie() {
		return serie;
	}



	public void setSerie(Serie serie) {
		this.serie = serie;
	}
}
