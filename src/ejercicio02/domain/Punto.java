package ejercicio02.domain;

public class Punto {
	
	// Atributos
	private Double x;
	private Double y;
	
	
	// Constructores
	public Punto(Double x, Double y) {
		this.x = x;
		this.y = y;
	}


	public Punto() {
		this.x = 0.0;
		this.y = 0.0;
	}

	// Getters & Setters
	public Double getX() {
		return x;
	}


	public void setX(Double x) {
		this.x = x;
	}


	public Double getY() {
		return y;
	}


	public void setY(Double y) {
		this.y = y;
	}


	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	public void desplazarPunto (Double x, Double y) {
		this.x = x;
		this.y = y;
	}
	
	public void mostrarPunto() {
		System.out.println(generarSalida());
	}


	public String generarSalida() {
		return "(" + this.x + "," + this.y + ")";
	}
	
}
