package modelo;

import java.util.Vector;

import vista.PautaView;

public class PautaPorZona extends PautaColocacion {
	private String zona;
	
	public PautaPorZona(boolean activa, int codigo, String zona) {
		super(activa, codigo);
		this.setZona(zona);
	}
	
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}
	
	public int obtenerCarga(Vendedor ven, Vector<Colocacion> col) {
		return 0;
	}
	
	public PautaView obtenerVista() {
		return null;
	
	}
	
}
