package org.davidfernandez.rankingseries.model;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Clase que mapea la entidad usuarios
 * @author David
 *
 */
@Entity
@Table(name = "usuarios", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", unique = true, nullable = false)
	private Long idUsuario;

	@Column(name = "nombre_usuario")
	private String nombre;

	@Column(name = "email")
	private String email;

	@Column(name = "contrasena")
	private String contrasena;

	@Column(name = "fecha_creacion")
	private Date fechaCreacion;
	


	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "usuario_roles", joinColumns = @JoinColumn(name = "id_usuario", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "rol_id", referencedColumnName = "id"))
	private Collection<Rol> roles;

	public Usuario(Long idUsuario, String nombre, String email, String contrasena, Date fechaCreacion,
			Collection<Rol> roles) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.email = email;
		this.contrasena = contrasena;
		this.fechaCreacion = fechaCreacion;
		this.roles = roles;
//		this.valoraciones = valoraciones;
	}

	public Usuario(String nombre, String email, String contrasena, Date fechaCreacion, Collection<Rol> roles, List<Valoracion> valoraciones) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.contrasena = contrasena;
		this.fechaCreacion = fechaCreacion;
		this.roles = roles;
//		this.valoraciones = valoraciones;
	}
	
	

	public Usuario(String nombre, String email, String contrasena, Collection<Rol> roles) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.contrasena = contrasena;
		this.roles = roles;
	}

	public Usuario() {
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

	public Collection<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Rol> roles) {
		this.roles = roles;
	}

//	public List<Valoracion> getValoraciones() {
//		return valoraciones;
//	}
//
//	public void setValoraciones(List<Valoracion> valoraciones) {
//		this.valoraciones = valoraciones;
//	}

}
