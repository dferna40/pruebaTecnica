package org.davidfernandez.rankingseries.controller;

import javax.validation.Valid;

import org.davidfernandez.rankingseries.dto.UsuarioRegistroDTO;
import org.davidfernandez.rankingseries.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/registro")
public class RegistroUsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@ModelAttribute("usuario")
	public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO() {
		return new UsuarioRegistroDTO();
	}

	@GetMapping
	public ModelAndView mostrarFormularioRegistro() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("registro");
		return modelAndView;
	}

	@PostMapping
	public ModelAndView registrarUsuario(@Valid @ModelAttribute("usuario") UsuarioRegistroDTO usuarioRegistroDTO,
			BindingResult result) {

		ModelAndView modelAndView = new ModelAndView();
		//if (result.hasErrors()) {
			usuarioService.guardarUsuario(usuarioRegistroDTO);
			modelAndView.setViewName("redirect:/registro?exito");
			
//		} else {
//			modelAndView.setViewName("redirect:/registro?noexito");
//		}
		return modelAndView;

	}

}