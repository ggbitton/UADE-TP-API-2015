package controlador;


import java.util.Date;
import java.util.Vector;

import modelo.Colocacion;
import modelo.PautaColocacion;
import modelo.Publicacion;
import modelo.Vendedor;
import vista.VendedorView;
import vista.PautaView;

public class Sistema {
	private Vector<Vendedor> vendedores;
	private Vector<Publicacion> publicaciones;
	private Vector<PautaColocacion> pautasColocacion;
	private Vector<Colocacion> colocaciones;

	public void realizarColocacion(int codigoEdicion, Date fechaSalida) {
		//Al finalizar la colocaci�n hay que llamar al m�todo "emitirResumen" para que genere la lista.
		//Devuelve una colecci�n de "VendedoresView" que solo tiene el "NroVendedor" y una colecci�n de "ItemColocacion".
	}

	public void agregarEdicion(int codigoPublicacion, String tituloEdicion, float precio, Date fechaSalida) {
		try {
			publicaciones.elementAt(codigoPublicacion).agregarEdicion(tituloEdicion, precio, fechaSalida);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void borrarEdicion(int codigoEdicion) {

	}

	public Vector<PautaView> obtenerPautas() {
		Vector<PautaView> vistaPautas = new Vector<PautaView>();
		for (int i = 0; i < pautasColocacion.size(); i++) {
			vistaPautas.add(pautasColocacion.elementAt(i).obtenerVista());
		}
		return vistaPautas;
	}

	public void activarPauta(int codigo) {
		PautaColocacion p = buscarPauta(codigo);
		if (p != null) {
			p.setActiva(true);
		}
	}

	private PautaColocacion buscarPauta(int codigo) {
		for (int i = 0; i < pautasColocacion.size(); i++) {
			if (pautasColocacion.elementAt(i).sosLaPauta(codigo)) {
				return pautasColocacion.elementAt(i);
			}
		}
		return null;
	}
	
	private Vector <VendedorView> emitirResumen (Date fechaSalida){
		Vector<VendedorView> resumen = new Vector<VendedorView>();
		VendedorView resumenIndividual;
		for (Vendedor v: vendedores){
			resumenIndividual = v.dameResumen(fechaSalida);
			resumen.add(resumenIndividual);
		}
		return resumen;
	}
}