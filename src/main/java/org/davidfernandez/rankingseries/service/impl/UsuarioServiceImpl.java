package org.davidfernandez.rankingseries.service.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.davidfernandez.rankingseries.dto.UsuarioRegistroDTO;
import org.davidfernandez.rankingseries.model.Rol;
import org.davidfernandez.rankingseries.model.Usuario;
import org.davidfernandez.rankingseries.repository.UsuarioRepository;
import org.davidfernandez.rankingseries.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public Usuario guardarUsuario(UsuarioRegistroDTO registroDTO) {
		Usuario usuario = new Usuario(registroDTO.getNombre(),registroDTO.getEmail(),passwordEncoder.encode(registroDTO.getContrasena()),Arrays.asList(new Rol("ROLE_USER")));
		return usuarioRepository.save(usuario);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository.findByEmail(username);
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuario o password invalidos");
		}
		return new User(usuario.getEmail(),usuario.getContrasena(), mapearAutoridadesRoles(usuario.getRoles()));
	}
	
	private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(Collection<Rol> roles){
		
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getNombre())).collect(Collectors.toList());
	}

}
