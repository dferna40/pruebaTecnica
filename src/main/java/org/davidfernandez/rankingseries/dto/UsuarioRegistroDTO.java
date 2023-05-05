package org.davidfernandez.rankingseries.dto;

import java.util.Date;

public class UsuarioRegistroDTO {

	private Long idUsuario;

	private String nombre;

	private String email;

	private String contrasena;

	private Date fechaCreacion;

	public UsuarioRegistroDTO(Long idUsuario, String nombre, String email, String contrasena, Date fechaCreacion) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.email = email;
		this.contrasena = contrasena;
		this.fechaCreacion = fechaCreacion;
	}

	public UsuarioRegistroDTO(String nombre, String email, String contrasena, Date fechaCreacion) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.contrasena = contrasena;
		this.fechaCreacion = fechaCreacion;
	}

	public UsuarioRegistroDTO() {
		super();
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
}
