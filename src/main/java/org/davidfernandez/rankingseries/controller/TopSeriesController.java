package org.davidfernandez.rankingseries.controller;

import java.util.List;

import org.davidfernandez.rankingseries.dto.SerieDTO;
import org.davidfernandez.rankingseries.service.ValoracionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controlador REST que maneja las operaciones relacionadas con el top de series.
 */
@RestController
@RequestMapping("/topSeries")
public class TopSeriesController {

	@Autowired
	private ValoracionService valoracionService;
	
	/**
     * Retorna un objeto ModelAndView que carga el formulario de serie.
     *
     * @return un objeto ModelAndView que carga el formulario de serie
     */
	@GetMapping("/cargarTopSeries")
	public ModelAndView formularioSerie() {
		ModelAndView modelAndView = new ModelAndView();
		//Cargar valoracion media de cada serie
		List<SerieDTO> seriesDTO = valoracionService.obtenerSeriesConValoracionAVG();
		modelAndView.addObject("series", seriesDTO);
		modelAndView.setViewName("topSeries");
		return modelAndView;
	}
	
	/**
     * Retorna un objeto ModelAndView que redirige a la pagina de inicio.
     *
     * @return un objeto ModelAndView que redirige a la pagina de inicio
     */
	@GetMapping("/volverInicio")
	public ModelAndView volverInicio() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
        return modelAndView;
	}

}
