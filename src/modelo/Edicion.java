package modelo;

import java.util.Date;

public class Edicion {
	private static int codigoEdicion;
	private String tituloTapa;
	private float precio;
	private Date fechaSalida;
	private boolean borrado;
	
	public Edicion(String tituloTapa, float precio, Date fechaSalida,
			boolean borrado) {
		this.tituloTapa = tituloTapa;
		this.precio = precio;
		this.fechaSalida = fechaSalida;
		this.borrado = borrado;
		codigoEdicion = codigoEdicion++;
	}
	
	public static int getCodigoEdicion() {
		return codigoEdicion;
	}
	public static void setCodigoEdicion(int codigoEdicion) {
		Edicion.codigoEdicion = codigoEdicion;
	}
	public String getTituloTapa() {
		return tituloTapa;
	}
	public void setTituloTapa(String tituloTapa) {
		this.tituloTapa = tituloTapa;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public boolean isBorrado() {
		return borrado;
	}
	public void setBorrado(boolean borrado) {
		this.borrado = borrado;
	}
	
}