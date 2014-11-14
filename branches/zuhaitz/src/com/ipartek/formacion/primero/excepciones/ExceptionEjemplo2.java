package com.ipartek.formacion.primero.excepciones;

import com.ipartek.formacion.primero.bean.herencia.Vehiculo;
import com.ipartek.formacion.primero.bean.herencia.VehiculoElectrico;
import com.ipartek.formacion.primero.bean.herencia.VehiculoGasolina;

public class ExceptionEjemplo2 {

	// propiedades necesarias

	static int array_corto[] = new int[5];

	public static void main(String args[]) {
		try {
			System.out.println();
			System.out.println("Antes de la excepci�n");
			// array_corto[10] = 10;

			Vehiculo vg = new VehiculoElectrico();
			((VehiculoGasolina) vg).isGasolina();

			System.out.println("No hay una excepci�n");
		} catch (ArrayIndexOutOfBoundsException e) {
			// se captura una excepci�n por intentar acceder a una posici�n
			// fuera de los l�mites del array.
			System.out.println("Hay una excepci�n por acceso incorrecto");
		} catch (ArithmeticException e) {
			// se captura una excepci�n aritm�tica.
			System.out.println("Hay una excepci�n por error aritmetico");
		} catch (NullPointerException e) {
			// se captura una excepci�n aritm�tica.
			System.out.println("NullPointerException => " + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			// se captura una excepci�n aritm�tica.
			System.out.println("Exception => " + e.getMessage());
			e.printStackTrace();
		} finally {
			// despu�s del try catch...
			System.out.println("Siempre se ejecuta [finally]");
		}
	}
}
