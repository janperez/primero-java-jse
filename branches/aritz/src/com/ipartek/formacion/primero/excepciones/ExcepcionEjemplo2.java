package com.ipartek.formacion.primero.excepciones;

import com.ipartek.formacion.primero.bean.herencia.Vehiculo;
import com.ipartek.formacion.primero.bean.herencia.VehiculoElectrico;
import com.ipartek.formacion.primero.bean.herencia.VehiculoGasolina;

public class ExcepcionEjemplo2 {

	// propiedades necesarias

	static int array_corto[] = new int[5];

	// static int array_corto[] = null;

	public static void main(String args[]) {

		try {

			System.out.println();

			System.out.println(".antes de la excepcion");
			// pete por acceso incorrecto
			// array_corto[10] = 10;

			// pete por excepcion aritmetica
			// int resul = 10 / 0;

			// pete por nullpointerexception
			// String nulo = null;
			// nulo.length();

			// pete por excepcion no especificada
			Vehiculo vg = new VehiculoElectrico();
			((VehiculoGasolina) vg).isGasolina();
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

		} catch (NullPointerException e) {

			// se captura una excepci�n NullPointerException.

			System.out.println("NullPointerException " + e.getMessage());
			e.printStackTrace();

		} catch (Exception e) {

			// se captura una excepci�n general.

			System.out.println("excepci�n general ");
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();

		}

		finally {

			// despu�s del try catch...

			System.out.println(".siempre se ejecuta [finally]");

		}

	}

}