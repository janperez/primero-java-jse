package com.ipartek.formacion.primero.bean.herencia;

import java.util.Comparator;

public class Vehiculo implements Comparable<Vehiculo> {

	// ATRIBUTOS
	protected int numPlazas;
	protected float dimensiones;
	protected float potencia;

	// constantes
	public static final int MIN_PLAZAS = 2;
	public static final float MIN_DIM = 50f;
	public static final float MIN_POTENCIA = 100f;

	// CONSTRUCTOR
	public Vehiculo() {
		super();
		setNumPlazas(MIN_PLAZAS);
		setDimensiones(MIN_DIM);
		setPotencia(MIN_POTENCIA);
	}

	public Vehiculo(float potencia, int plazas) {
		this();// llama al constructor vacio
		setPotencia(potencia);
		setNumPlazas(plazas);
	}

	public Vehiculo(int plazas) {
		this();// llama al constructor vacio
		setNumPlazas(plazas);
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
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
		return "Vehiculo [numPlazas=" + numPlazas + ", dimensiones="
				+ dimensiones + ", potencia=" + potencia + "]";
	}

	@Override
	public int compareTo(Vehiculo v) {

		return Float.compare(this.getPotencia(), v.getPotencia());

	}

	/**
	 * Comparator para numero de plazas
	 */
	public static class ComparatorNumeroPlazas implements Comparator<Vehiculo> {

		@Override
		public int compare(Vehiculo o1, Vehiculo o2) {

			return Integer.compare(o1.getNumPlazas(), o2.getNumPlazas());
		}

	}

}// end Vehiculo
