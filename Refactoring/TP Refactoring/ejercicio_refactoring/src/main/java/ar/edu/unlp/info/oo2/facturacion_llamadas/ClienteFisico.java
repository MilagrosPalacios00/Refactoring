package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteFisico extends Cliente {
	
	private String dni;
	static double descuentoFisico = 0;
	
	public ClienteFisico(String nombre, String numeroTelefono, String dni) {
		super(nombre, numeroTelefono);
		this.dni = dni;
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public static double getDescuentoFisico() {
		return descuentoFisico;
	}

	public static void setDescuentoFisico(double descuentoFisico) {
		ClienteFisico.descuentoFisico = descuentoFisico;
	}

	public double aplicarDescuento(double costo) {
       return costo - (costo * ClienteFisico.descuentoFisico);
	}
        
	

}
