package org.davidfernandez.rankingseries.service.impl;

import java.util.List;

import org.davidfernandez.rankingseries.dto.SerieDTO;
import org.davidfernandez.rankingseries.model.Serie;
import org.davidfernandez.rankingseries.repository.SerieRepository;
import org.davidfernandez.rankingseries.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Clase de servicio que implementa la interfaz SerieService con la logica de negocio
 * @author David
 *
 */
@Service
public class SerieServiceImpl implements SerieService{

	@Autowired
	private SerieRepository serieRepository;
	
	@Override
	public List<Serie> obtenerTodasSeries() {
		return serieRepository.findAll();
	}

	@Override
	public Serie guardarSerie(SerieDTO serieDTO) {
		Serie serie = new Serie(serieDTO.getNombre(), serieDTO.getCaratula(), serieDTO.getPlataforma(), serieDTO.getSinopsis());
		return serieRepository.save(serie);
	}
	
	public List<Serie> mostrarTodasLasSerie(){
		return serieRepository.findAll();
	}
}
