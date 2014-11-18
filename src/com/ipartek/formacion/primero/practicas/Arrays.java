package com.ipartek.formacion.primero.practicas;

import com.ipartek.formacion.primero.util.Utilidades;

/**
 * Clase para probar los Arrays en Java
 *
 * @author ur00
 *
 */
public class Arrays {

	static final int ARRAY_LENGTH = 10;

	public static void main(final String[] args) {

		// declarar un array de enteros con 10 posiciones
		final int[] myArray = new int[ARRAY_LENGTH];
		Utilidades.pintarArray(myArray);

		// cambiar valor de la posicion 4 a 25
		myArray[3] = 25;
		Utilidades.pintarArray(myArray);

		// inicialar array de tres posiciones de enteros y en cada poscion debe
		// tener el valor de la posicion
		final int[] myArray2 = new int[] { 0, 1, 2 };
		Utilidades.pintarArray(myArray2);

		// Ejercicio1: Dado el siguiente array funcion para invertir los valores
		// Ej: [0,1,2,3,4] salida: [4,3,2,1,0]
		final int[] myArrayInvertir = new int[] { 0, 1, 2, 3, 4 };
		System.out.println("Array original:");
		Utilidades.pintarArray(myArrayInvertir);

		final int[] invertido = Utilidades.invertirArray(myArrayInvertir);
		System.out.println("Array invertido:");
		Utilidades.pintarArray(invertido);

		// Ejericio2: Dado un array ordenar sus valores de menor a mayor
		// Ej: [89,54,3,2,45] salida: [2,3,45,54,89]
		final int[] myArrayOrdenar = new int[] { 89, 54, 3, 2, 45 };
		System.out.println("Array a Ordenar:");
		Utilidades.pintarArray(myArrayOrdenar);

		final int[] ordenado = Utilidades.ordenarArray(myArrayOrdenar);
		System.out.println("Array ordenado:");
		Utilidades.pintarArray(ordenado);

	}

}
