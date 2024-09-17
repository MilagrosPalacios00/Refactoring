package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes = new ArrayList<Cliente>();
    private GestorNumerosDisponibles guiaTelefonica = new GestorNumerosDisponibles();; 
    
      
	public boolean agregarNumeroTelefono(String telefono) {
		if (!guiaTelefonica.getLineas().contains(telefono)) {
			guiaTelefonica.getLineas().add(telefono);
			return true;	
		}
		return false; 	
	} 
	 
		
	public double calcularMontoTotalLlamadas(Cliente cliente) {
		return 	cliente.calcularMontoTotalLlamadas();
	}

	public String obtenerNumeroLibre() {
		return guiaTelefonica.obtenerNumeroLibre();
	} 
   
	public Cliente registrarUsuarioFisico(String nombre, String dni) {
		String tel = this.obtenerNumeroLibre();
		ClienteFisico cliente = new ClienteFisico (nombre,tel,dni);
		this.clientes.add(cliente);
		return cliente;
	}
		
	public Cliente registrarUsuarioJuridico (String nombre,String cuit) {
			String tel = this.obtenerNumeroLibre();
			ClienteJuridico cliente = new ClienteJuridico (nombre, tel,cuit);
			this.clientes.add(cliente);
			return cliente;
	} 
	

	public Llamada registrarLlamadaNacional(Cliente origen, Cliente destino,int duracion) {
		return origen.registrarLlamadaNacional(destino, duracion);
	} 
	
	public Llamada registrarLlamadaInternacional(Cliente origen, Cliente destino,int duracion) {
		return origen.registrarLlamadaInternacional(destino, duracion);
	} 
	
	public int cantidadDeUsuarios() {
		return clientes.size();
	}

	public boolean existeUsuario(Cliente persona) {
		return clientes.contains(persona);
	} 

	public GestorNumerosDisponibles getGestorNumeros() {
		return this.guiaTelefonica;
	}
	
	
}
