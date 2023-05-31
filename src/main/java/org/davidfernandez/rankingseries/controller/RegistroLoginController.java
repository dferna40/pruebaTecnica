package org.davidfernandez.rankingseries.controller;

import java.util.List;

import javax.validation.Valid;

import org.davidfernandez.rankingseries.dto.SerieDTO;
import org.davidfernandez.rankingseries.dto.UsuarioRegistroDTO;
import org.davidfernandez.rankingseries.service.UsuarioService;
import org.davidfernandez.rankingseries.service.ValoracionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controlador REST que maneja las operaciones relacionadas con el registro del usuario.
 */
@RestController
public class RegistroLoginController {
	
	@Autowired
	private ValoracionService valoracionService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	
	/**
   * Retorna un objeto ModelAndView que muestra el formulario de registro.
   *
   * @return un objeto ModelAndView que muestra el formulario de registro
   */
	@ModelAttribute("usuario")
	public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO() {
		return new UsuarioRegistroDTO();
	}

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
	
	/**
     * Registra un usuario en la base de datos.
     *
     * @param usuarioRegistroDTO el DTO del usuario a registrar
     * @param result los resultados de la validacion del formulario
     * @return un objeto ModelAndView que redirige a la pagina correspondiente
     */
	@PostMapping("/registro")
	public ModelAndView registrarUsuario(@Valid @ModelAttribute("usuario") UsuarioRegistroDTO usuarioRegistroDTO,
			BindingResult result) {

		ModelAndView modelAndView = new ModelAndView();
		if (usuarioService.usuarioNoExiste(usuarioRegistroDTO)) {
			usuarioService.guardarUsuario(usuarioRegistroDTO);
			modelAndView.setViewName("redirect:/login?exito");
		} else {
			modelAndView.setViewName("redirect:/login?NoExito");
		}

		return modelAndView;

	}
}


