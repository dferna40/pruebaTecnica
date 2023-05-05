package org.davidfernandez.rankingseries.repository;

import org.davidfernandez.rankingseries.model.Valoracion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValoracionRepository extends JpaRepository<Valoracion, Long>{

	
}
