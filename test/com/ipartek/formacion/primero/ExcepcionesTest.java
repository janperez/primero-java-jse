package com.ipartek.formacion.primero;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ipartek.formacion.primero.bean.Persona;

public class ExcepcionesTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Persona p = null;
		try {
			p.getApellido1();
			assertTrue("No deberia ejecutar esta linea", false);

		} catch (NullPointerException e) {
			assertTrue("El obejto es null", true);

		} finally {
			assertTrue("Siempre deberia ejecutarse", true);
		}

		p = new Persona();
		try {
			p.getApellido1();
			assertTrue("No deberia ejecutar esta linea", true);

		} catch (NullPointerException e) {
			assertTrue("El obejto es null", false);

		} finally {
			assertTrue("Siempre deberia ejecutarse", true);
		}

	}

}
