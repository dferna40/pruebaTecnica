package org.davidfernandez.rankingseries.service;

import org.davidfernandez.rankingseries.dto.UsuarioRegistroDTO;
import org.davidfernandez.rankingseries.model.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsuarioService extends UserDetailsService{

	public Usuario guardarUsuario(UsuarioRegistroDTO registroDTO);
	
	public boolean usuarioNoExiste(UsuarioRegistroDTO registroDTO);
}
