package org.davidfernandez.rankingseries.service;

import java.util.List;

import org.davidfernandez.rankingseries.dto.SerieDTO;
import org.davidfernandez.rankingseries.model.Serie;

/**
 * Interfaz del servicio para la logica de negocio de la pagina de registro de series
 * @author David
 *
 */
public interface SerieService {
	
	/**
	 * Metodo encargado de guardar una serie
	 * @param serieDTO
	 * @return Serie
	 */
	public Serie guardarSerie(SerieDTO serieDTO);
	
	/**
	 * Metodo que obtiene una lista de todos las series
	 * @return List<Serie>
	 */
	public List<Serie> obtenerTodasSeries();
	
	

}
