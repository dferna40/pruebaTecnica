package org.davidfernandez.rankingseries.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.davidfernandez.rankingseries.model.Serie;
import org.davidfernandez.rankingseries.model.Usuario;
import org.davidfernandez.rankingseries.model.Valoracion;
import org.davidfernandez.rankingseries.repository.SerieRepository;
import org.davidfernandez.rankingseries.repository.UsuarioRepository;
import org.davidfernandez.rankingseries.repository.ValoracionRepository;
import org.davidfernandez.rankingseries.service.ValoracionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class ValoracionServiceImpl implements ValoracionService {

	@Autowired
	private EntityManager entityManager;

	@Autowired
	private ValoracionRepository valoracionRepository;

	@Autowired
	private SerieRepository serieRepository;

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Valoracion guardarValoracion(Valoracion valoracion) {
		return valoracionRepository.saveAndFlush(valoracion);
	}

	@Override
	public List<Serie> obtenerTodasSeries() {
		return serieRepository.findAll();
	}

	@Override
	public Long obtenerIdUsuario(Authentication authentication) {
		Usuario usuarioSesion = usuarioRepository.findByEmail(authentication.getName());
		return usuarioSesion.getIdUsuario();
	}

	@Override
	public String obtenerNombreUsuario(Authentication authentication) {
		Usuario usuarioSesion = usuarioRepository.findByEmail(authentication.getName());

		return usuarioSesion.getNombre();
	}

	@Override
	public Valoracion obtenerSerieValoracion(Long idSerie) {
		try {
			String queryString = "SELECT v FROM Valoracion v WHERE v.serie.idSerie = :idSerie";
			TypedQuery<Valoracion> query = entityManager.createQuery(queryString, Valoracion.class);
			query.setParameter("idSerie", idSerie);

			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}

	}

	@Override
	public List<Valoracion> obtenerTodasValoraciones() {
		return valoracionRepository.findAll();
	}
	
	public boolean usuarioHaValoradoSerie(Long idUsuario, Long idSerie) {
	    TypedQuery<Long> query = entityManager.createQuery(
	        "SELECT COUNT(v) FROM Valoracion v WHERE v.usuario.idUsuario = :idUsuario AND v.serie.idSerie = :idSerie", Long.class);
	    query.setParameter("idUsuario", idUsuario);
	    query.setParameter("idSerie", idSerie);
	    Long count = query.getSingleResult();
	    return count > 0;
	}

//	@Override
//	public Long obtenerIdSeriePorNombre(String nombreSerie) {
//		String queryString = "select s.idSerie from Serie s where s.nombre = :nombreSerie";
//
//		TypedQuery<Long> query = entityManager.createQuery(queryString, Long.class);
//		query.setParameter("nombreSerie", nombreSerie);
//
//		return query.getSingleResult();
//	}
//
//	@Override
//	public List<Valoracion> obtenerListaValoracionesPorIdSerieYIdUsuario(Long idSerie, Long idUsuario) {
//		String queryString = "SELECT v FROM Valoracion v WHERE v.serie.idSerie = :idSerie AND v.usuario.idUsuario = :idUsuario";
//		TypedQuery<Valoracion> query = entityManager.createQuery(queryString, Valoracion.class);
//		query.setParameter("idSerie", idSerie);
//		query.setParameter("idUsuario", idUsuario);
//		List<Valoracion> valoraciones = query.getResultList();
//		
//		return valoraciones;
//	}

}
