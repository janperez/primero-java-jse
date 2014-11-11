package com.ipartek.formacion.primero.bean.herencia;

/**
 * Objeto para poder comprar un Veh�culo
 * 
 * @author Curso
 *
 */

public class Concesionario {

	/**
	 * Compramos un veh�culo que puede ser <code>VehiculoElectrico</code> o
	 * <code>VehiculoGasolina</code>
	 * 
	 * @param electrico
	 *            true <code>VehiculoElectrico</code>, false
	 *            <code>VehiculoGasolina</code>
	 * @return <code>Vehiculo</code> comprado
	 */
	public static Vehiculo comprarVehiculo(boolean electrico) {
		Vehiculo res;
		if (electrico) {
			res = new VehiculoElectrico();
		} else {
			res = new VehiculoGasolina();
		}
		return res;
	}

}
