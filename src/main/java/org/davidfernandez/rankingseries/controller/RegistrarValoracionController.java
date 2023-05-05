package org.davidfernandez.rankingseries.controller;

import java.util.List;

import org.davidfernandez.rankingseries.dto.SerieDTO;
import org.davidfernandez.rankingseries.dto.ValoracionDTO;
import org.davidfernandez.rankingseries.mapper.SerieMapper;
import org.davidfernandez.rankingseries.model.Serie;
import org.davidfernandez.rankingseries.model.Usuario;
import org.davidfernandez.rankingseries.model.Valoracion;
import org.davidfernandez.rankingseries.service.ValoracionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/valoracion")
public class RegistrarValoracionController {

	@Autowired
	private ValoracionService valoracionService; 
	
	@PostMapping("/registrarValoracion")
	public ModelAndView guardarValoracion(@ModelAttribute("valoracion") Valoracion valoracion, Authentication authentication) {
		ModelAndView modelAndView = new ModelAndView();
		Long idUsuario = valoracionService.obtenerIdUsuario(authentication);
		if(valoracion.getUsuario() == null) {
			Usuario usuario = new Usuario();
			valoracion.setUsuario(usuario);
		}
		valoracion.getUsuario().setIdUsuario(idUsuario);
		valoracionService.guardarValoracion(valoracion);
		modelAndView.setViewName("redirect:/valoracion/cargarFormulario?exito");
		
		return modelAndView;
		
	}
	
	@GetMapping("/volverInicio")
	public ModelAndView volverInicio() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
        return modelAndView;
	}
	
	
	
	@GetMapping("/cargarFormulario")
    public ModelAndView formularioSerie(@ModelAttribute("valoracion") ValoracionDTO valoracionDTO , Authentication authentication) {
        ModelAndView modelAndView = new ModelAndView();
        List<Serie> series = valoracionService.obtenerTodasSeries();
        List<SerieDTO> seriesDTO = SerieMapper.listSerieModelASerieDTO(series);
        modelAndView.addObject("series", seriesDTO);
        modelAndView.addObject("usuario",valoracionService.obtenerNombreUsuario(authentication));
        modelAndView.setViewName("valoracion");
        return modelAndView;
    }
	
//	@GetMapping("/nuevaValoracion")
//	public ModelAndView nuevaValoracion() {
//		 ModelAndView modelAndView = new ModelAndView();
//		 ValoracionDTO valoracionDTO = new ValoracionDTO();
//		 modelAndView.addObject("valoracion", valoracionDTO);
//		 modelAndView.setViewName("redirect:/valoracion/cargarFormulario");
//		 return modelAndView;
//	}
}
