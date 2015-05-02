package modelo;

import java.util.Vector;

import vista.PautaView;

public class PautaExcesoDevolucion extends PautaColocacion {
	private int cantUltimasEdiciones;
	
	public PautaExcesoDevolucion(boolean activa, int codigo, int cantUltimasEdiciones) {
		super(activa, codigo);
		this.cantUltimasEdiciones = cantUltimasEdiciones;
	}

	public int getCantUltimasEdiciones() {
		return cantUltimasEdiciones;
	}

	public void setCantUltimasEdiciones(int cantUltimasEdiciones) {
		this.cantUltimasEdiciones = cantUltimasEdiciones;
	}

	public int obtenerCarga(Vendedor ven, Vector<Colocacion> col) {
		return 0;
	}
	
	public PautaView obtenerVista() {
		return null;
	}
	
}