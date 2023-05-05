package org.davidfernandez.rankingseries.error;

public class ErrorRankigSerie {

	private int codigo;
	private String mensaje;
	private String detalle;
	
	
	
	public ErrorRankigSerie() {
		super();
	}
	public ErrorRankigSerie(int codigo, String mensaje, String detalle) {
		super();
		this.codigo = codigo;
		this.mensaje = mensaje;
		this.detalle = detalle;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
}
