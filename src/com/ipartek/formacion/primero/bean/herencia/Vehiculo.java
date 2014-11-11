package com.ipartek.formacion.primero.bean.herencia;

public class Vehiculo {
	protected int numPlazas;
	protected float dimensiones;
	protected float potencia;

	public static final int MIN_PLAZAS = 2;
	public static final float MIN_DIM = 50;
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
}
