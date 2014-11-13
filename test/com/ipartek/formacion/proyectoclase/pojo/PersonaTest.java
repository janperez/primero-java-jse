package com.ipartek.formacion.proyectoclase.pojo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonaTest {
	ArrayList<Persona> alumnos = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 1985);
		alumnos = new ArrayList<Persona>();
		alumnos.add(new Persona("Zuhaitz", c));
		c.set(Calendar.YEAR, 1991);
		alumnos.add(new Persona("Sus�na", c));
		c.set(Calendar.YEAR, 1980);
		alumnos.add(new Persona("kepa", c));
		c.set(Calendar.YEAR, 1977);
		alumnos.add(new Persona("�rko", c));
		c.set(Calendar.YEAR, 1979);
		alumnos.add(new Persona("Jon", c));
		c.set(Calendar.YEAR, 1996);
		alumnos.add(new Persona("Sergio", c));
		c.set(Calendar.YEAR, 1988);
		alumnos.add(new Persona("Jos�ba", c));
		c.set(Calendar.YEAR, 1991);
		alumnos.add(new Persona("M�rio", c));
		c.set(Calendar.YEAR, 1994);
		alumnos.add(new Persona("�ritz", c));
		c.set(Calendar.YEAR, 1981);
		alumnos.add(new Persona("fran", c));
		c.set(Calendar.YEAR, 1986);
		alumnos.add(new Persona("Maitane", c));
		c.set(Calendar.YEAR, 1965);
		alumnos.add(new Persona("Jose", c));
		c.set(Calendar.YEAR, 1982);
		alumnos.add(new Persona("�u", c));

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPersona() {
		// fail("Not yet implemented");
		Collections.sort(alumnos);

		for (Persona p : alumnos) {
			System.out.println(p.getNombre());
		}

	}

}
