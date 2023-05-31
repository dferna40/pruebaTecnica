//package org.davidfernandez.rankingseries.controller;
//
//import javax.validation.Valid;
//
//import org.davidfernandez.rankingseries.dto.UsuarioRegistroDTO;
//import org.davidfernandez.rankingseries.service.UsuarioService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
///**
// * Controlador REST que maneja las operaciones relacionadas con el registro de usuarios.
// */
//@RestController
//@RequestMapping("/registro")
//public class RegistroUsuarioController {
//
//	@Autowired
//	private UsuarioService usuarioService;
//
//	/**
//     * Retorna un objeto ModelAndView que muestra el formulario de registro.
//     *
//     * @return un objeto ModelAndView que muestra el formulario de registro
//     */
//	@ModelAttribute("usuario")
//	public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO() {
//		return new UsuarioRegistroDTO();
//	}
//
//	/**
//     * Retorna un objeto ModelAndView que muestra el formulario de registro.
//     *
//     * @return un objeto ModelAndView que muestra el formulario de registro
//     */
//	@GetMapping
//	public ModelAndView mostrarFormularioRegistro() {
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("login");
//		return modelAndView;
//	}
//
//	/**
//     * Registra un usuario en la base de datos.
//     *
//     * @param usuarioRegistroDTO el DTO del usuario a registrar
//     * @param result los resultados de la validacion del formulario
//     * @return un objeto ModelAndView que redirige a la pagina correspondiente
//     */
//	@PostMapping
//	public ModelAndView registrarUsuario(@Valid @ModelAttribute("usuario") UsuarioRegistroDTO usuarioRegistroDTO,
//			BindingResult result) {
//
//		ModelAndView modelAndView = new ModelAndView();
//		if (usuarioService.usuarioNoExiste(usuarioRegistroDTO)) {
//			usuarioService.guardarUsuario(usuarioRegistroDTO);
//			modelAndView.setViewName("redirect:/registro?exito");
//		} else {
//			modelAndView.setViewName("redirect:/registro?NoExito");
//		}
//
//		return modelAndView;
//
//	}
//
//}