package org.davidfernandez.rankingseries.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "series",uniqueConstraints = @UniqueConstraint(columnNames = "nombre"))
public class Serie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", unique = true, nullable = false)
	private Long idSerie;
	
	@Column(name = "nombre",unique = true)
	private String nombre;
	
	@Column(name = "caratula")
	private String caratula;
	
	@Column(name = "plataforma_streaming")
	private String plataforma;
	
	@Column(name = "sinopsis")
	private String sinopsis;
	
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;
	
	@Column(name = "fecha_actualizacion")
	private Date fechaActualizacion;
	
	@OneToMany(mappedBy = "valoracion",cascade = CascadeType.ALL)
    private List<Valoracion> valoraciones;

	public Serie(Long idSerie, String nombre, String caratula, String plataforma, String sinopsis, Date fechaCreacion,
			Date fechaActualizacion, List<Valoracion> valoraciones) {
		super();
		this.idSerie = idSerie;
		this.nombre = nombre;
		this.caratula = caratula;
		this.plataforma = plataforma;
		this.sinopsis = sinopsis;
		this.fechaCreacion = fechaCreacion;
		this.fechaActualizacion = fechaActualizacion;
		this.valoraciones = valoraciones;
	}
	
	

	public Serie(String nombre, String caratula, String plataforma, String sinopsis, Date fechaCreacion,
			Date fechaActualizacion, List<Valoracion> valoraciones) {
		super();
		this.nombre = nombre;
		this.caratula = caratula;
		this.plataforma = plataforma;
		this.sinopsis = sinopsis;
		this.fechaCreacion = fechaCreacion;
		this.fechaActualizacion = fechaActualizacion;
		this.valoraciones = valoraciones;
	}



	public Serie(Long idSerie, String nombre, String caratula, String plataforma, String sinopsis, Date fechaCreacion,
			Date fechaActualizacion) {
		super();
		this.idSerie = idSerie;
		this.nombre = nombre;
		this.caratula = caratula;
		this.plataforma = plataforma;
		this.sinopsis = sinopsis;
		this.fechaCreacion = fechaCreacion;
		this.fechaActualizacion = fechaActualizacion;
	}

	public Serie(String nombre, String caratula, String plataforma, String sinopsis, Date fechaCreacion,
			Date fechaActualizacion) {
		super();
		this.nombre = nombre;
		this.caratula = caratula;
		this.plataforma = plataforma;
		this.sinopsis = sinopsis;
		this.fechaCreacion = fechaCreacion;
		this.fechaActualizacion = fechaActualizacion;
	}
	
	public Serie(String nombre, String caratula, String plataforma, String sinopsis) {
		super();
		this.nombre = nombre;
		this.caratula = caratula;
		this.plataforma = plataforma;
		this.sinopsis = sinopsis;
	}

	public Serie() {
		super();
	}

	public Long getIdSerie() {
		return idSerie;
	}

	public void setIdSerie(Long idSerie) {
		this.idSerie = idSerie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCaratula() {
		return caratula;
	}

	public void setCaratula(String caratula) {
		this.caratula = caratula;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
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

	public List<Valoracion> getValoraciones() {
		return valoraciones;
	}

	public void setValoraciones(List<Valoracion> valoraciones) {
		this.valoraciones = valoraciones;
	}

	
}
