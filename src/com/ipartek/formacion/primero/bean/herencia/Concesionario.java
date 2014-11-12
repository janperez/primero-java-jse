package com.ipartek.formacion.primero.bean.herencia;

/**
 * Objeto para poder comprar un Veh�culo
 *
 * @author Curso
 *
 */

public class Concesionario {

	/** Atributo static para llevar el contador de Vehiculos vendidos */
	public static int ventasGlobales;
	/**
	 * Atributo no static para llevar el contador de Vehiculos vendidos de cada
	 * Concesionario
	 */
	private int ventas;

	/** Constructor vac�o, inicializa las ventas a 0 */
	public Concesionario() {
		super();
		this.ventas = 0;
	}

	// Getters & Setters
	public int getVentas() {
		return ventas;
	}

	public static void setVentasGlobales(int ventas) {
		ventasGlobales = ventas;
	}

	/**
	 * Compramos un veh�culo que puede ser <code>VehiculoElectrico</code> o
	 * <code>VehiculoGasolina</code>
	 *
	 * @param electrico
	 *            true <code>VehiculoElectrico</code>, false
	 *            <code>VehiculoGasolina</code>
	 * @return <code>Vehiculo</code> comprado
	 */
	public Vehiculo comprarVehiculo(boolean electrico) {
		Vehiculo res;
		if (electrico) {
			res = new VehiculoElectrico();
		} else {
			res = new VehiculoGasolina();
		}

		this.ventas++;
		ventasGlobales++;
		return res;
	}

}
