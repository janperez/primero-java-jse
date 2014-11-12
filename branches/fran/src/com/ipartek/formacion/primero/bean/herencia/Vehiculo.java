package com.ipartek.formacion.primero.bean.herencia;

/**
 * Clase que representa un vehiculo
 * @author Fran
 *
 */
public class Vehiculo {
	protected int numPlazas;
	protected float dimensiones;
	protected float potencia;
	/**
	 * N�mero de plazas m�nimas que puede tener un veh�culo
	 */
	public static final int MIN_PLAZAS = 2;
	/**
	 * Dimensi�n m�nima que puede tener un veh�culo
	 */
	public static final float MIN_DIM = 50f;
	/**
	 * Potencia m�nima que debe tener un veh�culo
	 */
	public static final float MIN_POTENCIA = 100f;


	public Vehiculo() {
		super();
		setNumPlazas(MIN_PLAZAS);
		setDimensiones(MIN_DIM);
		setPotencia(MIN_POTENCIA);
	}


	public int getNumPlazas() {
		return numPlazas;
	}


	public void setNumPlazas(int numPazas) {
		this.numPlazas = numPazas;
	}


	public float getDimensiones() {
		return dimensiones;
	}


	public void setDimensiones(float dimensiones) {
		this.dimensiones = dimensiones;
	}


	public float getPotencia() {
		return potencia;
	}


	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Vehiculo [numPazas=" + numPlazas + ", dimensiones="
				+ dimensiones + ", potencia=" + potencia + "]";
	}
}
