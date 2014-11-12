package com.ipartek.formacion.primero;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayListTest {

	// No hace falta inicializar ya que lo hacemos en el setup - (es lo mismo)
	// ArrayList<String> listaPaises = null;
	ArrayList<String> listaPaises;

	// declaro la variabler
	ArrayList<Integer> listaNum;

	// Declaro con constantes

	static final String ESPANA = "Espa�a";
	static final String FRANCIA = "Francia";
	static final String PORTUGAL = "Portugal";
	static final String EUSKADI = "Euskadi";
	static final String BARAKALDO = "Barakaldo";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

		listaPaises = new ArrayList<String>();
		listaPaises.add(ESPANA); // Ocupa la posici�n 0
		listaPaises.add(FRANCIA); // Ocupa la posici�n 1
		listaPaises.add(PORTUGAL); // Ocupa la posici�n 2

		// Creo una array de numeros
		listaNum = new ArrayList<Integer>();
		listaNum.add(1);
		listaNum.add(2);
		listaNum.add(3);
		listaNum.add(4);
		listaNum.add(1);

	}

	@After
	public void tearDown() throws Exception {

		listaPaises = null;
		listaNum = null;

	}

	@Test
	public void testPosicion() {

		// Hacemo una comparacion que te da mas informacion que con assertTrue
		// assertTrue(PORTUGAL.equals(listaPaises.get(0)));
		assertSame(ESPANA, listaPaises.get(0));
		assertSame(FRANCIA, listaPaises.get(1));
		assertSame(PORTUGAL, listaPaises.get(2));
		assertSame(3, listaPaises.size());

	}

	// Test insertar posicion
	@Test
	public void testInsertarEnPosicion() {

		// insertar barakaldo en posicion 1
		listaPaises.add(1, BARAKALDO);

		assertSame(ESPANA, listaPaises.get(0));
		assertSame(BARAKALDO, listaPaises.get(1));
		assertSame(FRANCIA, listaPaises.get(2));
		assertSame(PORTUGAL, listaPaises.get(3));
		assertSame(4, listaPaises.size());

	}

	// Test eliminar posicion
	@Test
	public void testEliminarEnPosicion() {

		// eliminar por key o valor
		listaPaises.remove(FRANCIA);
		assertSame(ESPANA, listaPaises.get(0));
		assertSame(PORTUGAL, listaPaises.get(1));
		assertSame(2, listaPaises.size());

		// eliminar por index o posicion
		listaPaises.remove(1);
		assertSame(ESPANA, listaPaises.get(0));
		assertSame(1, listaPaises.size());

	}

	//
	@Test(expected = IndexOutOfBoundsException.class)
	public void testIndexException() {

		listaPaises.get(3);

	}

	@Test
	public void testEliminarIntegers() {

		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		listaNumeros.add(1);
		listaNumeros.add(2);
		listaNumeros.add(3);
		listaNumeros.add(1);

		// te remove el de la posicion 1 en el array. remover por indice
		int index = 1;
		listaNumeros.remove(index);
		assertSame(3, listaNumeros.size());
		assertSame(1, listaNumeros.get(0));
		assertSame(3, listaNumeros.get(1));
		assertSame(1, listaNumeros.get(2));

		// te remove los "1" del array porque le hemos pasado un objeto.
		// remover por objeto
		// pero solo te elimina el primero de la lista
		// importante!!! sobre-carga
		Integer object = new Integer(1);
		listaNumeros.remove(object);
		assertSame(2, listaNumeros.size());
		assertSame(3, listaNumeros.get(0));
		assertSame(1, listaNumeros.get(1));

	}

	@Test
	public void testAgurEspana() {
		listaPaises.set(0, EUSKADI);
		assertSame(EUSKADI, listaPaises.get(0));
		assertSame(FRANCIA, listaPaises.get(1));
		assertSame(PORTUGAL, listaPaises.get(2));
		assertSame(3, listaPaises.size());
		assertFalse(listaPaises.contains(ESPANA));
	}

	@Test
	public void testMenosUno() {

		int borrar = listaNum.lastIndexOf(1);
		listaNum.remove(borrar);

		assertSame(4, listaNum.size());
		assertSame(1, listaNum.get(0));
		assertSame(2, listaNum.get(1));
		assertSame(3, listaNum.get(2));
		assertSame(4, listaNum.get(3));

		assertFalse(listaNum.contains(5));

	}

}
