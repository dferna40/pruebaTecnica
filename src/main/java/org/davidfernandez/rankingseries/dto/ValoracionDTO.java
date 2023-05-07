package org.davidfernandez.rankingseries.dto;

import java.util.Date;

public class ValoracionDTO {

	private Long id;
	
	private Double valoracion;
	
	private Long usuarioValoracion;
	
	private Long serieValoracion;
	
	private Date fechaCreacion;
	
	private Date fechaActualizacion;

	public ValoracionDTO(Long id, Double valoracion, Long usuarioValoracion, Long serieValoracion,
			Date fechaCreacion, Date fechaActualizacion) {
		super();
		this.id = id;
		this.valoracion = valoracion;
		this.usuarioValoracion = usuarioValoracion;
		this.serieValoracion = serieValoracion;
		this.fechaCreacion = fechaCreacion;
		this.fechaActualizacion = fechaActualizacion;
	}
	
	

	public ValoracionDTO(Double valoracion, Long usuarioValoracion, Long serieValoracion, Date fechaCreacion,
			Date fechaActualizacion) {
		super();
		this.valoracion = valoracion;
		this.usuarioValoracion = usuarioValoracion;
		this.serieValoracion = serieValoracion;
		this.fechaCreacion = fechaCreacion;
		this.fechaActualizacion = fechaActualizacion;
	}



	public ValoracionDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long idValoracion) {
		this.id = idValoracion;
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

	public Long getUsuarioValoracion() {
		return usuarioValoracion;
	}

	public void setUsuarioValoracion(Long usuarioValoracion) {
		this.usuarioValoracion = usuarioValoracion;
	}

	public Long getSerieValoracion() {
		return serieValoracion;
	}

	public void setSerieValoracion(Long serieValoracion) {
		this.serieValoracion = serieValoracion;
	}
	
	
}
