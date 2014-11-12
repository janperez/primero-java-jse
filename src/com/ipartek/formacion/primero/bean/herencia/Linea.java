package com.ipartek.formacion.primero.bean.herencia;

/**
 * Clase que representa una l�nea, extiende de la clase figura
 * @author Fran
 *
 */
public class Linea extends Figura implements Redimensionable {
	private int longitud;
	
	
	public Linea() {
		super();
		setLongitud(LONG_MAX);
	}

	public Linea(Punto punto) {
		super(punto);
		setLongitud(LONG_MAX);
	}

	/**
	 * M�todo que dibuja una l�nea
	 */
	@Override
	public void dibujar() {
		for (int i = 0; i < longitud; i++) {
			System.out.print('=');
		}
		System.out.println();
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
}
