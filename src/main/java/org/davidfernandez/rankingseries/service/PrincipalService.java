package org.davidfernandez.rankingseries.service;

import java.util.List;

import org.davidfernandez.rankingseries.model.Usuario;
import org.davidfernandez.rankingseries.model.Valoracion;

/**
 * Interfaz del servicio para la logica de negocio del login
 * 
 * @author David
 *
 */
public interface PrincipalService {

	/**
	 * Metodo que obtiene una lista de las valoraciones de los usuarios que están
	 * asociadas a un usuario cuyo identificador está presente en alguna valoración
	 * de la misma tabla
	 * 
	 * @return List<Valoracion>
	 */
	public List<Valoracion> obtenerValoracionesDeUsuarios();
	
	/**
	 * Metodo que obtiene una lista de todos los usuarios
	 * @return List<Usuario>
	 */
	public List<Usuario> obtenerTodosLosUsuarios();
	
	public List<Valoracion> obtenerValoracionesPorUsuarioYSerie();

}
