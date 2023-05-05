package org.davidfernandez.rankingseries.repository;

import java.util.List;

import org.davidfernandez.rankingseries.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SerieRepository extends JpaRepository<Serie, Long>{

	@SuppressWarnings("unchecked")
	public Serie save (Serie serie);
	
	public Serie findByNombre(String nombreSerie);
	
	public List<Serie> findAll();
	
	public void deleteById(Long id);
	
	public void deleteByNombre(String nombre);
}
