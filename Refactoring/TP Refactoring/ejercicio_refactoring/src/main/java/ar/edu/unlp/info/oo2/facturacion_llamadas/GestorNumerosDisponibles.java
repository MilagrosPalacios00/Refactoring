package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineas = new TreeSet<>();
    private GeneradorNumeroLibre generadorNumeroLibre = new GeneradorUltimo();;
    
    public GestorNumerosDisponibles() {
    	
    }
    
    public GestorNumerosDisponibles(GeneradorNumeroLibre generador) {
        this.generadorNumeroLibre = generador;
    }

	public SortedSet<String> getLineas() {
		return lineas;
	}
	
    public void setGeneradorNumeroLibre(GeneradorNumeroLibre generadorNumeroLibre) {
        this.generadorNumeroLibre = generadorNumeroLibre;
    }
    
    public String obtenerNumeroLibre() {
        return generadorNumeroLibre.obtenerNumeroLibre(lineas);
    }
    
    
	
	
}
