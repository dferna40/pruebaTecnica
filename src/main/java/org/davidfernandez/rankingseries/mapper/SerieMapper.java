package org.davidfernandez.rankingseries.mapper;

import java.util.ArrayList;
import java.util.List;

import org.davidfernandez.rankingseries.dto.SerieDTO;
import org.davidfernandez.rankingseries.model.Serie;

/**
 * Clase para mapear los objetos de tipo Serie
 * @author David
 * 
 */
public class SerieMapper {

	/**
	 * Metodo que mapea los objeto de tipo model a DTO
	 * @param serieModel
	 * @return serieDTO
	 */
	public static SerieDTO serieModelASerieDTO(Serie serieModel) {
		SerieDTO serieDTO = new SerieDTO();

		if (serieModel != null) {
			serieDTO.setIdSerie(serieModel.getIdSerie());
			serieDTO.setNombre(serieModel.getNombre());
			serieDTO.setCaratula((serieModel.getCaratula() != null) ? serieModel.getCaratula() : null);
			serieDTO.setPlataforma((serieModel.getPlataforma() != null) ? serieModel.getPlataforma() : null);
			serieDTO.setSinopsis((serieModel.getSinopsis() != null) ? serieModel.getSinopsis() : null);

			return serieDTO;
		}
		return null;
	}

	/**
	 * Metodo que mapea las listas de serie model a listas serie DTO
	 * @param listaSeries
	 * @return seriesDTOs
	 */
	public static List<SerieDTO> listSerieModelASerieDTO (List<Serie> listaSeries) {
		
		List<SerieDTO> seriesDTOs = new ArrayList<SerieDTO>();
		
		for (Serie serie :listaSeries) {
			SerieDTO serieDTO = serieModelASerieDTO(serie);
			
			seriesDTOs.add(serieDTO);
		}
		
		return seriesDTOs;
	}
}
