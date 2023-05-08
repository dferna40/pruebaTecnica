package org.davidfernandez.rankingseries.repository;

import org.davidfernandez.rankingseries.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interfaz encargada de definir los metodos accesores a base de datos para la entidad Usuario
 * @author David
 *
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	/**
	 * Consulta para obtener el usuario por email
	 * @param email
	 * @return Usuario
	 */
	public Usuario findByEmail(String email);
}
