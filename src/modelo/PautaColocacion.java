package modelo;

import java.util.Vector;

import vista.PautaView;

public abstract class PautaColocacion {
	private boolean activa;
	private int codigo;
	
	public PautaColocacion(boolean activa, int codigo) {
		this.activa = activa;
		this.codigo = codigo;
	}

	public abstract int obtenerCarga(Vendedor ven, Vector<Colocacion> col);
	
	public PautaView obtenerVista() {
		return null;
	}
	
	public boolean estasActiva() {
		return this.activa;
	}
	
	public boolean sosLaPauta(int codigo){
		return this.codigo==codigo;
	}
	
	public void setActiva(boolean activa) {
		this.activa = activa;
	}
	
}
