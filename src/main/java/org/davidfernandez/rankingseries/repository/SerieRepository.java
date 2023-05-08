package org.davidfernandez.rankingseries.repository;

import java.util.List;

import org.davidfernandez.rankingseries.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interfaz encargada de definir los metodos accesores a base de datos para la entidad Serie
 * @author David
 *
 */
public interface SerieRepository extends JpaRepository<Serie, Long>{
	
	/**
	 * Consulta para obtener las series por nombre
	 * @param nombreSerie
	 * @return Serie
	 */
	public Serie findByNombre(String nombreSerie);
	
	/**
	 * Consulta para obtener todas las series
	 */
	public List<Serie> findAll();
}
