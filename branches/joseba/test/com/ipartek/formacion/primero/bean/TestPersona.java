package com.ipartek.formacion.primero.bean;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ipartek.formacion.primero.bean.Persona.comparatorEdad;

public class TestPersona {

	ArrayList<Persona> listaPersonas = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		// Creamos el juego de datos en el setup del test
		listaPersonas = new ArrayList<Persona>();

		listaPersonas.add(new Persona("Zuhaitz", 29));
		listaPersonas.add(new Persona("Sus�na", 23));
		listaPersonas.add(new Persona("kepa", 34));
		listaPersonas.add(new Persona("�rko", 37));
		listaPersonas.add(new Persona("Jon", 35));
		listaPersonas.add(new Persona("Sergio", 18));
		listaPersonas.add(new Persona("�u", 32));
		listaPersonas.add(new Persona("Jos�ba", 26));
		listaPersonas.add(new Persona("M�rio", 29));
		listaPersonas.add(new Persona("�ritz", 20));
		listaPersonas.add(new Persona("fran", 33));
		listaPersonas.add(new Persona("Maitane", 28));
		listaPersonas.add(new Persona("Jose", 99));

	}

	@After
	public void tearDown() throws Exception {
		listaPersonas = null;
	}

	@Test
	public void test() {
		// Ordenamos alfabeticamente
		Collections.sort(listaPersonas);

		assertEquals("�ritz", listaPersonas.get(0).getNombre());
		assertEquals("fran", listaPersonas.get(1).getNombre());
		assertEquals("Jon", listaPersonas.get(2).getNombre());
		assertEquals("Jose", listaPersonas.get(3).getNombre());
		assertEquals("Jos�ba", listaPersonas.get(4).getNombre());
		assertEquals("kepa", listaPersonas.get(5).getNombre());
		assertEquals("Maitane", listaPersonas.get(6).getNombre());
		assertEquals("M�rio", listaPersonas.get(7).getNombre());
		assertEquals("�u", listaPersonas.get(8).getNombre());
		assertEquals("Sergio", listaPersonas.get(9).getNombre());
		assertEquals("Sus�na", listaPersonas.get(10).getNombre());
		assertEquals("�rko", listaPersonas.get(11).getNombre());
		assertEquals("Zuhaitz", listaPersonas.get(12).getNombre());

		// Ordenamos por edad
		Collections.sort(listaPersonas, new comparatorEdad());

		assertEquals("Sergio", listaPersonas.get(0).getNombre());
		assertEquals("�ritz", listaPersonas.get(1).getNombre());
		assertEquals("Sus�na", listaPersonas.get(2).getNombre());
		assertEquals("Jos�ba", listaPersonas.get(3).getNombre());
		assertEquals("Maitane", listaPersonas.get(4).getNombre());
		assertEquals("M�rio", listaPersonas.get(5).getNombre());
		assertEquals("Zuhaitz", listaPersonas.get(6).getNombre());
		assertEquals("�u", listaPersonas.get(7).getNombre());
		assertEquals("fran", listaPersonas.get(8).getNombre());
		assertEquals("kepa", listaPersonas.get(9).getNombre());
		assertEquals("Jon", listaPersonas.get(10).getNombre());
		assertEquals("�rko", listaPersonas.get(11).getNombre());
		assertEquals("Jose", listaPersonas.get(12).getNombre());
	}
}
