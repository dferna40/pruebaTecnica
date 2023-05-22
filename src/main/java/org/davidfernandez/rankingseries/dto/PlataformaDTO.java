package org.davidfernandez.rankingseries.dto;

public class PlataformaDTO {

	Long idPlataforma;
	
	String nombrePlataforma;
	
	public PlataformaDTO(String nombrePlataforma) {
		super();
		this.nombrePlataforma = nombrePlataforma;
	}

	public PlataformaDTO(Long idPlataforma, String nombrePlataforma) {
		super();
		this.idPlataforma = idPlataforma;
		this.nombrePlataforma = nombrePlataforma;
	}

	public Long getIdPlataforma() {
		return idPlataforma;
	}

	public void setIdPlataforma(Long idPlataforma) {
		this.idPlataforma = idPlataforma;
	}

	public String getNombrePlataforma() {
		return nombrePlataforma;
	}

	public void setNombrePlataforma(String nombrePlataforma) {
		this.nombrePlataforma = nombrePlataforma;
	}
}
