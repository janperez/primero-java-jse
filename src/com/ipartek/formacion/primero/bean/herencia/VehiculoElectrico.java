package com.ipartek.formacion.primero.bean.herencia;

/**
 * Clase que representa un vehiculo electrico, extiende de la clase vehiculo
 * @author Fran
 *
 */
public class VehiculoElectrico extends Vehiculo implements Arrancable {
	private float capacidadBaterias;
	/**
	 * Capacidad de bater�a m�nima que debe tener un veh�culo el�ctrico
	 */
	public static final float MIN_BATERIAS = 0f;
	/**
	 * Potencia m�nima que debe tener un veh�culo el�ctrico
	 */
	public static final float MIN_POTENCIA = 150f;

	public VehiculoElectrico() {
		super();
		setCapacidadBaterias(MIN_BATERIAS);
		setPotencia(MIN_POTENCIA);
	}

	@Override
	public void setPotencia(float potencia) {
		super.setPotencia(potencia);
	}
	
	public float getCapacidadBaterias() {
		return capacidadBaterias;
	}

	public void setCapacidadBaterias(float capacidadBaterias) {
		this.capacidadBaterias = capacidadBaterias;
	}

	@Override
	public String toString() {
		return "VehiculoElectrico [capacidadBaterias=" + capacidadBaterias
				+ ", numPlazas=" + numPlazas + ", dimensiones=" + dimensiones
				+ ", potencia=" + potencia + "]";
	}

	@Override
	public boolean arrancar() {
		return true;		
	} 
}
