package ejercicio01.test;

import ejercicio01.domain.Punto;

public class TestPunto {

	public static void main(String[] args) {

		Punto p = new Punto();
		Punto q = new Punto(2.0, 3.0);
		p.mostrarPunto();
		q.mostrarPunto();
		p.desplazarPunto(3.0, 4.0);
		p.mostrarPunto();

	}

}
