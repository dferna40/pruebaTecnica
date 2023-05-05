package org.davidfernandez.rankingseries.controller;

import java.util.List;

import org.davidfernandez.rankingseries.model.Valoracion;
import org.davidfernandez.rankingseries.service.PrincipalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RegistroController {
	
	@Autowired
	private PrincipalService principalService;

	@GetMapping("/login")
    public ModelAndView iniciarSesion() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }
	
	@GetMapping("/")
	public ModelAndView verPaginaDeInicio() {
		ModelAndView modelAndView = new ModelAndView();
		List<Valoracion> valoraciones = principalService.obtenerValoracionesDeUsuarios();
		//Anadir los atributos necesarios para la vista
		modelAndView.addObject("valoraciones",valoraciones);
		//Vista
		modelAndView.setViewName("index");
		return modelAndView;
	}
}


