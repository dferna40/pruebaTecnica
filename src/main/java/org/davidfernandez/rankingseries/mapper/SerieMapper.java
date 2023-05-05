package org.davidfernandez.rankingseries.mapper;

import java.util.ArrayList;
import java.util.List;

import org.davidfernandez.rankingseries.dto.SerieDTO;
import org.davidfernandez.rankingseries.model.Serie;

public class SerieMapper {

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

	public static List<SerieDTO> listSerieModelASerieDTO (List<Serie> listaSeries) {
		
		List<SerieDTO> seriesDTOs = new ArrayList<SerieDTO>();
		
		for (Serie serie :listaSeries) {
			SerieDTO serieDTO = serieModelASerieDTO(serie);
			
			seriesDTOs.add(serieDTO);
		}
		
		return seriesDTOs;
	}
}
