package org.davidfernandez.rankingseries.repository;

import org.davidfernandez.rankingseries.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

//	@SuppressWarnings("unchecked")
//	public Usuario save(Usuario usuario);

	public Usuario findByEmail(String email);
}
