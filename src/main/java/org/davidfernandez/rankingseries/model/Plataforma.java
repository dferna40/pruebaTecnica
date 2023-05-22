package org.davidfernandez.rankingseries.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "plataformas", uniqueConstraints = @UniqueConstraint(columnNames = "nombre_plataforma"))
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Plataforma {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", unique = true, nullable = false)
	private Long idPlataforma;

	@Column(name = "nombre_plataforma")
	private String nombre;

	@OneToMany(mappedBy = "plataforma", cascade = CascadeType.ALL)
	private List<Serie> series;
}
