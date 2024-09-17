package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {
	private String numeroEmisor;
	private String numeroReceptor;
	private int duracion;
	
 
	public Llamada(String origen, String destino, int duracion) {
		this.numeroEmisor= origen;
		this.numeroReceptor= destino;
		this.duracion = duracion;
	} 
	
	public abstract double calcularCostoLlamada (); 
	
	
	public String getNumeroEmisor() {
		return numeroEmisor;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public String getNumeroRemitente() {
		return numeroReceptor;
	}
}
  