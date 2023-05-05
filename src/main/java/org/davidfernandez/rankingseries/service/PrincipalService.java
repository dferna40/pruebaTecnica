package org.davidfernandez.rankingseries.service;

import java.util.List;

import org.davidfernandez.rankingseries.model.Usuario;
import org.davidfernandez.rankingseries.model.Valoracion;

public interface PrincipalService {

//	public List<Valoracion> obtenerListaValoracionesPorIdSerieYIdUsuario();
//	
//	public List<Valoracion> obtenerListaValoracionesPorIdUsuario();
//
//	public List<Valoracion> obtenerValoracionesPorIdUsuario(Long idUsuario);
	
	public List<Valoracion> obtenerValoracionesDeUsuarios();
	
	public List<Usuario> obtenerTodosLosUsuarios();
	
	//public List<Valoracion> findAllWithSerieAndUsuario(Long idSerie);
	
	//public List<Valoracion> valoracionesPorSerie();
	
	
}
