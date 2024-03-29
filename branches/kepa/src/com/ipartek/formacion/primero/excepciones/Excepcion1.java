package com.ipartek.formacion.primero.excepciones;

import com.ipartek.formacion.primero.bean.herencia.Vehiculo;
import com.ipartek.formacion.primero.bean.herencia.VehiculoElectrico;
import com.ipartek.formacion.primero.bean.herencia.VehiculoGasolina;

public class Excepcion1 {

	// propiedades necesarias

	static int array_corto[] = new int[5];

	public static void main(String args[]) {

		try {

			System.out.println();

			System.out.println(".antes de la excepcion");

			array_corto[4] = 10;

			// Pete para ArithmeticException
			// int resul = 10 / 0;

			// Pete por NullPointerException
			String nulo = null;
			nulo.length();

			// Pete por una excepcion que no haya sido especificada
			Vehiculo vg = new VehiculoElectrico();
			((VehiculoGasolina) vg).isGasolina();

			System.out.println(".no hay una excepcion");

		}

		catch (ArrayIndexOutOfBoundsException e) {

			// se captura una excepci�n por intentar acceder a una posici�n

			// fuera de los l�mites del array.

			System.out.println(".hay una excepcion por acceso incorrecto");

		} catch (ArithmeticException e) {
			// se captura una excepci�n aritm�tica.
			System.out.println(".hay una excepcion por error aritmetico");

		} catch (NullPointerException e) {
			System.out.println("NullPointerException " + e.getMessage());

		} catch (Exception e) {
			System.out.println("Exception General " + e.getMessage());

		} finally {

			// despu�s del try catch...

			System.out.println(".siempre se ejecuta [finally]");

		}

	}
}
