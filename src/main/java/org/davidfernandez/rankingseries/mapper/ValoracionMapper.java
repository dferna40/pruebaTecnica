package org.davidfernandez.rankingseries.mapper;

import org.davidfernandez.rankingseries.dto.ValoracionDTO;
import org.davidfernandez.rankingseries.model.Valoracion;

public class ValoracionMapper {

	public static ValoracionDTO valoracionModelAValoracionDTO(Valoracion valoracionModel) {
		ValoracionDTO valoracionDTO = new ValoracionDTO();

		if (valoracionModel != null) {
			
			valoracionDTO.setId(valoracionModel.getId());
			valoracionDTO.setValoracion(valoracionModel.getValoracion());
			valoracionDTO.setUsuarioValoracion(valoracionModel.getUsuario().getIdUsuario());
			valoracionDTO.setSerieValoracion(valoracionModel.getSerie().getIdSerie());
			

			return valoracionDTO;
		}
		return null;
	}
	
	public static Valoracion valoracionDTOAValoracionModel(ValoracionDTO valoracionDTO) {
		Valoracion Valoracion = new Valoracion();

		if (valoracionDTO != null) {
			
			Valoracion.setId(valoracionDTO.getId());
			Valoracion.setValoracion(valoracionDTO.getValoracion());
			Valoracion.getUsuario().setIdUsuario(valoracionDTO.getUsuarioValoracion());
			Valoracion.getSerie().setIdSerie(valoracionDTO.getSerieValoracion());
			

			return Valoracion;
		}
		return null;
	}

}
