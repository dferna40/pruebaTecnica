package org.davidfernandez.rankingseries.service;

import java.util.List;

import org.davidfernandez.rankingseries.dto.SerieDTO;
import org.davidfernandez.rankingseries.model.Serie;
import org.davidfernandez.rankingseries.model.Valoracion;
import org.springframework.security.core.Authentication;

/**
 * Interfaz del servicio para la logica de negocio de la pagina de valoracion
 * 
 * @author David
 *
 */
public interface ValoracionService {

	/**
	 * Metodo encargado de guardar la valoracion
	 * 
	 * @param valoracion
	 * @return Valoracion
	 */
	public Valoracion guardarValoracion(Valoracion valoracion);

	/**
	 * Metodo encargado de obtener todas las series
	 * 
	 * @return List<Serie>
	 */
	public List<Serie> obtenerTodasSeries();

	/**
	 * Metodo encargado de obtener el id del usuario
	 * 
	 * @param authentication
	 * @return id del usuario
	 */
	public Long obtenerIdUsuario(Authentication authentication);

	/**
	 * Metodo encargado de obtener el nombre del usuario
	 * 
	 * @param authentication
	 * @return nombre del usuario
	 */
	public String obtenerNombreUsuario(Authentication authentication);

	/**
	 * Metodo encargado de obtener la serie de la valoracion
	 * 
	 * @param idSerie
	 * @return Valoracion
	 */
	public Valoracion obtenerSerieValoracion(Long idSerie);

	/**
	 * Metodo encargado de obtener todas las valoraciones
	 * 
	 * @return Valoraciones
	 */
	public List<Valoracion> obtenerTodasValoraciones();

	/**
	 * Metodo encargado de comprobar si el usuario ha valorado la serie
	 * 
	 * @param idUsuario
	 * @param idSerie
	 * @return true si no ha valorado la serie
	 * @return false si la serie ya ha sido valorada
	 */
	public boolean usuarioHaValoradoSerie(Long idUsuario, Long idSerie);

	/**
	 * Metodo encargado de obtener la media de base de datos
	 * 
	 * @param idSerie
	 * @return la media de las valoraciones para la serie especificada, o 0.0 si no
	 *         hay valoraciones para la serie
	 */
	public Double obtenerMediaValoraciones(Long idSerie);

	/**
	 * Metodo encargado de guardar en SerieDTO en la propiedad valoracion media por cada serie previamente obtenida en el metodo obtenerMediaValoraciones 
	 * @return SerieDTO con la propiedad valoracionMedia
	 */
	public List<SerieDTO> obtenerSeriesConValoracionAVG();
	
	public List<SerieDTO> obtenerSeriesConValoraciones();
	
	/**
	 * Metodo encargado de obtener la lista de las valoraciones de las series
	 * @param idSerie
	 * @return List<Valoracion>
	 */
	public List<Valoracion> obtenerValoracionesDeSeries(Long idSerie);

}
