package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	public List<Llamada> llamadas = new ArrayList<Llamada>();
	private String nombre;
	private String numeroTelefono;
	
	public Cliente () {
		
	}  
	
	public Cliente(String nombre, String numeroTelefono) {
		this.nombre = nombre;
		this.numeroTelefono = numeroTelefono;
		
	}
	 
	public abstract double aplicarDescuento (double costo);
	
	
	
	public double calcularMontoTotalLlamadas () {
		 return this.llamadas.stream() 
                 .mapToDouble(llamada -> aplicarDescuento(llamada.calcularCostoLlamada()))
                 .sum();
	}		
	
	public Llamada registrarLlamadaNacional(Cliente destino,int duracion) {
		LlamadaNacional llamada = new LlamadaNacional(this.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		this.llamadas.add(llamada);
		return llamada; 
	} 
	
	public Llamada registrarLlamadaInternacional(Cliente destino,int duracion) {
		LlamadaInternacional llamada = new LlamadaInternacional(this.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		this.llamadas.add(llamada);
		return llamada; 
	} 
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	
	
}
