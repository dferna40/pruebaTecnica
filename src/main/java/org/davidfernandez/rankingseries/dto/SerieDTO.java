package org.davidfernandez.rankingseries.dto;

import java.util.Date;

public class SerieDTO {

private Long idSerie;
	
	private String nombre;
	
	private String caratula;
	
	private String plataforma;
	
	private String sinopsis;
	
	private Date fechaCreacion;
	
	private Date fechaActualizacion;
	
	private Double valoracionMedia;

	public SerieDTO(Long idSerie, String nombre, String caratula, String plataforma, String sinopsis,
			Date fechaCreacion, Date fechaActualizacion) {
		super();
		this.idSerie = idSerie;
		this.nombre = nombre;
		this.caratula = caratula;
		this.plataforma = plataforma;
		this.sinopsis = sinopsis;
		this.fechaCreacion = fechaCreacion;
		this.fechaActualizacion = fechaActualizacion;
	}

	public SerieDTO(String nombre, String caratula, String plataforma, String sinopsis, Date fechaCreacion,
			Date fechaActualizacion) {
		super();
		this.nombre = nombre;
		this.caratula = caratula;
		this.plataforma = plataforma;
		this.sinopsis = sinopsis;
		this.fechaCreacion = fechaCreacion;
		this.fechaActualizacion = fechaActualizacion;
	}

	public SerieDTO() {
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

	public Double getValoracionMedia() {
		return valoracionMedia;
	}

	public void setValoracionMedia(Double valoracionMedia) {
		this.valoracionMedia = valoracionMedia;
	}
	
	
}
