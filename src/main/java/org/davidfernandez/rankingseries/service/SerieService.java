package org.davidfernandez.rankingseries.service;

import java.util.List;

import org.davidfernandez.rankingseries.dto.SerieDTO;
import org.davidfernandez.rankingseries.model.Serie;

public interface SerieService {
	
	public Serie guardarSerie(SerieDTO serieDTO);
	
	public List<Serie> obtenerTodasSeries();
	
	//public Serie guardarSerie(SerieDTO serieDTO);
	

}
