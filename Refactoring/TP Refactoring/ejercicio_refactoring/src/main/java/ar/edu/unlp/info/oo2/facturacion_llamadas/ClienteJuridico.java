package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteJuridico extends Cliente { 
	
	private String cuit; 
	static double descuentoJuridico = 0.15;
	
	
	public ClienteJuridico(String nombre, String numeroTelefono, String cuit) {
		super(nombre, numeroTelefono);
		this.cuit = cuit;
	}
	
	public double aplicarDescuento(double costo) {
         return costo - (costo * descuentoJuridico);       
    }

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public static double getDescuentoJur() {
		return descuentoJuridico;
	}

	public static void setDescuentoJur(double descuentoJur) {
		ClienteJuridico.descuentoJuridico = descuentoJur;
	}

	
	
	


}
