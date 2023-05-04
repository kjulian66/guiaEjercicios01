package ejercicio02.domain;

public class Rectangulo {
	
	// Atributos
	private Punto vII;
	private Punto vID;
	private Punto vSI;
	private Punto vSD;
	
	// Constructores
	public Rectangulo() {
		this.vII = new Punto();
		this.vID = new Punto();
		this.vSI = new Punto();
		this.vSD = new Punto();
	}

	public Rectangulo(Punto vII, Punto vID, Punto vSI, Punto vSD) {
		this.vII = vII;
		this.vID = vID;
		this.vSI = vSI;
		this.vSD = vSD;
	}
	
	// Getters & Setters
	
	public Punto getvII() {
		return vII;
	}

	public void setvII(Punto vII) {
		this.vII = vII;
	}

	public Punto getvID() {
		return vID;
	}

	public void setvID(Punto vID) {
		this.vID = vID;
	}

	public Punto getvSI() {
		return vSI;
	}

	public void setvSI(Punto vSI) {
		this.vSI = vSI;
	}

	public Punto getvSD() {
		return vSD;
	}

	public void setvSD(Punto vSD) {
		this.vSD = vSD;
	}
	
	//toString
	@Override
	public String toString() {
		return "Rectangulo [vII=" + vII + ", vID=" + vID + ", vSI=" + vSI + ", vSD=" + vSD + "]";
	}
	
	// Metodos

	public Double calcularDiferenciaY(Double y2, Double y1) {
		return y2 - y1;
	}

	public double calcularDiferenciaX(Double x2, Double x1) {
		return x2 - x1;
	}
	
	public Double base() {
		return calcularDiferenciaX(vID.getX(), vII.getX());
	}

	public Double altura() {
		return calcularDiferenciaY(vSD.getY(), vID.getY());
	}

	public Double calcularSuperficie() {
		return altura() * base();
	}
	
	public Double calcularPerimetro() {
		return (altura() * 2) + (base() * 2);
	}
	
	public String mostrar() {
		return "[" + vII.generarSalida() + "," 
				+ vSI.generarSalida() + "," 
				+ vID.generarSalida() + "," 
				+ vSD.generarSalida() + "]";
	}
	
	public void desplazar(Punto nuevoPunto) {
		Double nuevoX = calcularDiferenciaX(nuevoPunto.getX(), vII.getX());
		Double nuevoY = calcularDiferenciaY(nuevoPunto.getY(), vII.getY());
		
		this.vII.setX(this.vII.getX() + nuevoX);
		this.vII.setY(this.vII.getY() + nuevoY);
		
		this.vID.setX(this.vID.getX() + nuevoX);
		this.vID.setY(this.vID.getY() + nuevoY);
		
		this.vSI.setX(this.vSI.getX() + nuevoX);
		this.vSI.setY(this.vSI.getY() + nuevoY);
		
		this.vSD.setX(this.vSD.getX() + nuevoX);
		this.vSD.setY(this.vSD.getY() + nuevoY);
	}
	
}
