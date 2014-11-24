package com.ipartek.formacion.primero.excepciones;

import com.ipartek.formacion.primero.bean.herencia.Vehiculo;
import com.ipartek.formacion.primero.bean.herencia.VehiculoElectrico;
import com.ipartek.formacion.primero.bean.herencia.VehiculoGasolina;

/**
 * Diferentes tipos de Exception.
 *
 * @author Curso
 *
 */
public final class ExceptionEjemplo2 {

	/**
	 * Constructor privado para que no se pueda instanciar la clase
	 */
	private ExceptionEjemplo2() {
	}

	public static void main(final String[] args) {
		final int[] arrayCorto = new int[5];

		try {
			System.out.println();
			System.out.println("Antes de la excepci�n");
			arrayCorto[10] = 10;

			final Vehiculo vehiculoElectrico = new VehiculoElectrico();
			((VehiculoGasolina) vehiculoElectrico).isGasolina();

			System.out.println("No hay una excepci�n");
		} catch (final ArrayIndexOutOfBoundsException e) {
			// se captura una excepci�n por intentar acceder a una posici�n
			// fuera de los l�mites del array.
			System.out.println("Hay una excepci�n por acceso incorrecto");
		} catch (final ArithmeticException e) {
			// se captura una excepci�n aritm�tica.
			System.out.println("Hay una excepci�n por error aritmetico");
		} catch (final NullPointerException e) {
			// se captura una excepci�n aritm�tica.
			System.out.println("NullPointerException => " + e.getMessage());
			e.printStackTrace();
		} catch (final Exception e) {
			// se captura una excepci�n aritm�tica.
			System.out.println("Exception => " + e.getMessage());
			e.printStackTrace();
		} finally {
			// despu�s del try catch...
			System.out.println("Siempre se ejecuta [finally]");
		}
	}
}
