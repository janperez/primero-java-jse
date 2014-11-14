package com.ipartek.formacion.primero.excepciones;

import com.ipartek.formacion.primero.bean.herencia.Vehiculo;
import com.ipartek.formacion.primero.bean.herencia.VehiculoElectrico;
import com.ipartek.formacion.primero.bean.herencia.VehiculoGasolina;

public class ExcepcionEjemplo2 {

	// propiedades necesarias

	static int array_corto[] = new int[5];

	public static void main(String args[]) {

		try {

			System.out.println();

			System.out.println(".antes de la excepcion");

			// para que pete ArrayIndexOutOfBoundsException

			/* array_corto[10] = 10; */

			// para que pete ArithmeticException
			/* int rdo = 10 / 0; */

			// para que pete NullPointerException

			/*
			 * String nulo = null; nulo.length();
			 */

			// para que pete con una excepcion k no haya sido especificada

			Vehiculo veGasolina = new VehiculoElectrico();
			((VehiculoGasolina) veGasolina).isGasolina();
			System.out.println(".no hay una excepcion");

		}

		catch (ArrayIndexOutOfBoundsException e) {

			// se captura una excepci�n por intentar acceder a una posici�n

			// fuera de los l�mites del array.

			System.out.println(".hay una excepcion por acceso incorrecto");

		}

		catch (ArithmeticException e) {

			// se captura una excepci�n aritm�tica.

			System.out.println(".hay una excepcion por error aritmetico");

		}

		catch (NullPointerException e) {
			System.out.println("NullPointerException " + e.getMessage());
			// pinta la traza por consola
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("Excepcion general ");
			System.out.println("Message: " + e.getMessage());
			e.printStackTrace();
		}

		finally {

			// despu�s del try catch...

			System.out.println(".siempre se ejecuta [finally]");

		}

	}

}
