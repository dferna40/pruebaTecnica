package org.davidfernandez.rankingseries.repository;

import org.davidfernandez.rankingseries.model.Valoracion;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interfaz encargada de definir los metodos accesores a base de datos para la entidad Valoracion
 * @author David
 *
 */
public interface ValoracionRepository extends JpaRepository<Valoracion, Long>{

	
}
