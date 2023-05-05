package org.davidfernandez.rankingseries.repository;

import org.davidfernandez.rankingseries.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public Usuario save(Usuario usuario);

	public Usuario findByEmail(String email);
}
