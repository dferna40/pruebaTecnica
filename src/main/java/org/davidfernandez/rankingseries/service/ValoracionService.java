package org.davidfernandez.rankingseries.service;

import java.util.List;

import org.davidfernandez.rankingseries.model.Serie;
import org.davidfernandez.rankingseries.model.Valoracion;
import org.springframework.security.core.Authentication;

public interface ValoracionService {

	public Valoracion guardarValoracion(Valoracion valoracion);
	
	public List<Serie> obtenerTodasSeries();
	
	public Long obtenerIdUsuario(Authentication authentication);
	
	public String obtenerNombreUsuario(Authentication authentication);
	
	public Valoracion obtenerSerieValoracion(Long idSerie);
	
	public List<Valoracion> obtenerTodasValoraciones();
	
	public boolean usuarioHaValoradoSerie(Long idUsuario, Long idSerie);
	
}
