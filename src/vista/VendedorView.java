package vista;

import java.util.Vector;

import modelo.ItemColocacion;

public class VendedorView {
	private int nroVendedor;
	private String direccion;
	private String zona;
	private int tipo;
	private Vector<ItemColocacion> itemsColocaciones;
	
	public VendedorView(){
	
	}

	public int getNroVendedor() {
		return nroVendedor;
	}

	public void setNroVendedor(int nroVendedor) {
		this.nroVendedor = nroVendedor;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Vector<ItemColocacion> getItemsColocaciones() {
		return itemsColocaciones;
	}

	public void setItemsColocaciones() {
		itemsColocaciones = new Vector<ItemColocacion>();
	}

	public void agregarItem (ItemColocacion item){
		itemsColocaciones.add(item);
	}
}