package org.davidfernandez.rankingseries.service;

import org.davidfernandez.rankingseries.dto.UsuarioRegistroDTO;
import org.davidfernandez.rankingseries.model.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Interfaz del servicio para la logica de negocio de la pagina de registro del usuario
 * @author David
 *
 */
public interface UsuarioService extends UserDetailsService{

	/**
	 * Metodo encargado de guardar un usurio
	 * @param registroDTO
	 * @return Usuario
	 */
	public Usuario guardarUsuario(UsuarioRegistroDTO registroDTO);
	
	/**
	 * Metodo encargado de comprobar si el usuario existe en base de datos
	 * @param registroDTO
	 * @return si existe el usuario en base de datos devuelve null si existe devuelve true
	 */
	public boolean usuarioNoExiste(UsuarioRegistroDTO registroDTO);
}
