package org.davidfernandez.rankingseries.controller;

import org.davidfernandez.rankingseries.dto.SerieDTO;
import org.davidfernandez.rankingseries.model.Serie;
import org.davidfernandez.rankingseries.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/serie")
public class RegistroSerieController {
	
	@Autowired
	private SerieService serieService; 
	
	
	@GetMapping("/volverInicio")
	public ModelAndView volverInicio() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
        return modelAndView;
	}

	
	@GetMapping("/cargarFormulario")
    public ModelAndView formularioSerie() {
        ModelAndView modelAndView = new ModelAndView();
        Serie serie = new Serie();
        modelAndView.addObject("serie", serie);
        modelAndView.setViewName("serie");
        return modelAndView;
    }
	
	@PostMapping("/registrarSerie")
    public ModelAndView guardarSerie(@ModelAttribute("serie") SerieDTO serieDTO) {
        ModelAndView modelAndView = new ModelAndView();
        serieService.guardarSerie(serieDTO);
        modelAndView.setViewName("redirect:/serie/cargarFormulario?exito");
        return modelAndView;
    }
}
