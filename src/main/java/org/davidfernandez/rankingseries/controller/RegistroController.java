package org.davidfernandez.rankingseries.controller;

import java.util.List;

import org.davidfernandez.rankingseries.model.Serie;
import org.davidfernandez.rankingseries.model.Usuario;
import org.davidfernandez.rankingseries.model.Valoracion;
import org.davidfernandez.rankingseries.repository.SerieRepository;
import org.davidfernandez.rankingseries.repository.UsuarioRepository;
import org.davidfernandez.rankingseries.repository.ValoracionRepository;
import org.davidfernandez.rankingseries.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RegistroController {
	
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private SerieRepository serieRepository;
	
	@Autowired
	private ValoracionRepository valoracionRepository;
	
	@Autowired
	private SerieService serieService;

	@GetMapping("/login")
    public ModelAndView iniciarSesion() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }
	
	@GetMapping("/")
	public ModelAndView verPaginaDeInicio() {
		ModelAndView modelAndView = new ModelAndView();
		List<Serie> series = serieService.obtenerTodasSeries();
		//Anadir los atributos necesarios para la vista
//		List<Usuario> usuarios = usuarioRepository.findAll();
//		List<Serie> series = serieRepository.findAll();
//		List<Valoracion> valoraciones = valoracionRepository.findAll();
//		modelAndView.addObject("usuarios", usuarios);
//		modelAndView.addObject("series", series);
//		modelAndView.addObject("valoraciones", valoraciones);
		//Vista
		modelAndView.setViewName("index");
		return modelAndView;
	}
}


