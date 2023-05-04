package ejercicio02.test;

import ejercicio02.domain.Punto;
import ejercicio02.domain.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		
		Punto vII = new Punto(0.0, 0.0);
		Punto vID = new Punto(4.0, 0.0);
		Punto vSI = new Punto(0.0, 2.0);
		Punto vSD = new Punto(4.0, 2.0);
		Rectangulo rectangulo1 = new Rectangulo(vII, vID, vSI, vSD);
		System.out.println(rectangulo1.mostrar());
		
		Punto nuevoPunto = new Punto(2.0, 1.0);		
		nuevoPunto.mostrarPunto();
		
		
		rectangulo1.desplazar(nuevoPunto);
		System.out.println(rectangulo1.mostrar());

	}

}
