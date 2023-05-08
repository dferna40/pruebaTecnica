package org.davidfernandez.rankingseries.controller;

import java.util.List;

import org.davidfernandez.rankingseries.dto.SerieDTO;
import org.davidfernandez.rankingseries.service.ValoracionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controlador REST que maneja las operaciones relacionadas con el registro del usuario.
 */
@RestController
public class RegistroController {
	
	@Autowired
	private ValoracionService valoracionService;

	/**
     * Retorna un objeto ModelAndView que carga la pagina de inicio de sesion.
     *
     * @return un objeto ModelAndView que carga la pagina de inicio de sesion
     */
	@GetMapping("/login")
    public ModelAndView iniciarSesion() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }
	
	/**
     * Retorna un objeto ModelAndView que carga la pagina de inicio.
     *
     * @return un objeto ModelAndView que carga la pagina de inicio
     */
	@GetMapping("/")
	public ModelAndView verPaginaDeInicio() {
		ModelAndView modelAndView = new ModelAndView();
		List<SerieDTO> series = valoracionService.obtenerSeriesConValoraciones();
		//Anadir los atributos necesarios para la vista
		modelAndView.addObject("series",series);
		//Vista
		modelAndView.setViewName("index");
		return modelAndView;
	}
}


