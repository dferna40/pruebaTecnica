package org.davidfernandez.rankingseries.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.davidfernandez.rankingseries.model.Usuario;
import org.davidfernandez.rankingseries.model.Valoracion;
import org.davidfernandez.rankingseries.repository.UsuarioRepository;
import org.davidfernandez.rankingseries.service.PrincipalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Clase de servicio que implementa la interfaz PrincipalService con la logica de negocio
 * @author David
 *
 */
@Service
public class PrincipalServiceImpl implements PrincipalService {

	@Autowired
	private EntityManager entityManager;

	@Autowired
	private UsuarioRepository usuarioRepository;


	public List<Valoracion> obtenerValoracionesDeUsuarios() {
		String queryString = "SELECT v FROM Valoracion v WHERE v.usuario.idUsuario IN "
				+ "(SELECT DISTINCT v.usuario.idUsuario FROM Valoracion v)";
		TypedQuery<Valoracion> query = entityManager.createQuery(queryString, Valoracion.class);
		return query.getResultList();
	}
	
	public List<Valoracion> obtenerValoracionesPorUsuarioYSerie(){
		String queryString = "SELECT v FROM Valoracion v WHERE v.usuario.idUsuario IN "
				+ "(SELECT DISTINCT v2.usuario.idUsuario FROM Valoracion v2 INNER JOIN v2.serie s WHERE s.idSerie = v.serie.idSerie)";
		TypedQuery<Valoracion> query = entityManager.createQuery(queryString, Valoracion.class);
		return query.getResultList();
	}

	@Override
	public List<Usuario> obtenerTodosLosUsuarios() {
		return usuarioRepository.findAll();
	}

}
