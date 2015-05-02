package modelo;

public class ItemColocacion {
	private int colocados;
	private int devueltos;
	private Edicion edicion;
	private Publicacion publicacion;
	private Vendedor vendedor;
	
	public ItemColocacion(int colocados, int devueltos, Edicion edicion,
			Publicacion publicacion, Vendedor vendedor) {
		this.colocados = colocados;
		this.devueltos = devueltos;
		this.edicion = edicion;
		this.publicacion = publicacion;
		this.vendedor = vendedor;
	}
	
	public int getColocados() {
		return colocados;
	}
	public void setColocados(int colocados) {
		this.colocados = colocados;
	}
	public int getDevueltos() {
		return devueltos;
	}
	public void setDevueltos(int devueltos) {
		this.devueltos = devueltos;
	}
	public Edicion getEdicion() {
		return edicion;
	}
	public void setEdicion(Edicion edicion) {
		this.edicion = edicion;
	}
	public Publicacion getPublicacion() {
		return publicacion;
	}
	public void setPublicacion(Publicacion publicacion) {
		this.publicacion = publicacion;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	
}
