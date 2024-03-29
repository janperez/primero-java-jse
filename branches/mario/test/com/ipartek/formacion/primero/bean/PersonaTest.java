package com.ipartek.formacion.primero.bean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.impartek.formacion.primero.excepciones.PersonaException;
import com.ipartek.formacion.primero.bean.Persona.ComparatorNombres;

public class PersonaTest {
	ArrayList<Persona> listaPersona = null;

	Persona pZuhaitz;
	Persona pSusana;
	Persona pKepa;
	Persona pUrko;
	Persona pJon;
	Persona pSergio;
	Persona pSrNu;
	Persona pJoseba;
	Persona pMario;
	Persona pAritz;
	Persona pFran;
	Persona pMaitane;
	Persona pJose;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		listaPersona = new ArrayList<Persona>();

		pZuhaitz = new Persona("Zuhaitz", 29);
		pSusana = new Persona("Sus�na", 23);
		pKepa = new Persona("kepa", 34);
		pUrko = new Persona("�rko", 37);
		pJon = new Persona("Jon", 35);
		pSergio = new Persona("Sergio", 18);
		pSrNu = new Persona("Sr �u", 32);
		pJoseba = new Persona("Jos�ba", 26);
		pMario = new Persona("M�rio", 29);
		pAritz = new Persona("�ritz", 20);
		pFran = new Persona("fran", 33);
		pMaitane = new Persona("Maitane", 28);
		pJose = new Persona("Jose", 99);

		listaPersona.add(pZuhaitz);
		listaPersona.add(pSusana);
		listaPersona.add(pKepa);
		listaPersona.add(pUrko);
		listaPersona.add(pJon);
		listaPersona.add(pSergio);
		listaPersona.add(pSrNu);
		listaPersona.add(pJoseba);
		listaPersona.add(pMario);
		listaPersona.add(pAritz);
		listaPersona.add(pFran);
		listaPersona.add(pMaitane);
		listaPersona.add(pJose);
	}

	@After
	public void tearDown() throws Exception {
		listaPersona = null;
	}

	@Test
	public void testCollectionSortPersonas() {
		// ordenamos por edad
		Collections.sort(listaPersona);

		assertSame(pSergio, listaPersona.get(0));
		assertSame(pAritz, listaPersona.get(1));
		assertSame(pSusana, listaPersona.get(2));
		assertSame(pJoseba, listaPersona.get(3));
		assertSame(pMaitane, listaPersona.get(4));
		assertSame(pZuhaitz, listaPersona.get(5));
		assertSame(pMario, listaPersona.get(6));
		assertSame(pSrNu, listaPersona.get(7));
		assertSame(pFran, listaPersona.get(8));
		assertSame(pKepa, listaPersona.get(9));
		assertSame(pJon, listaPersona.get(10));
		assertSame(pUrko, listaPersona.get(11));
		assertSame(pJose, listaPersona.get(12));

		// ordenamos por nombre
		Collections.sort(listaPersona, new ComparatorNombres());

		assertSame(pAritz, listaPersona.get(0));
		assertSame(pFran, listaPersona.get(1));
		assertSame(pJon, listaPersona.get(2));
		assertSame(pJose, listaPersona.get(3));
		assertSame(pJoseba, listaPersona.get(4));
		assertSame(pKepa, listaPersona.get(5));
		assertSame(pMaitane, listaPersona.get(6));
		assertSame(pMario, listaPersona.get(7));
		assertSame(pSergio, listaPersona.get(8));
		assertSame(pSrNu, listaPersona.get(9));
		assertSame(pSusana, listaPersona.get(10));
		assertSame(pUrko, listaPersona.get(11));
		assertSame(pZuhaitz, listaPersona.get(12));

	}

	@Test(expected = PersonaException.class)
	public void testExceptionsEdad() throws PersonaException {
		Persona p = new Persona();
		p.setEdad(Persona.MIN_EDAD - 1);

		p.setEdad(Persona.MAX_EDAD + 1);
		// fail("no se lanza PersonaException ");

	}

	@Test
	public void testExceptionsNombreApellido() throws PersonaException {
		try {
			Persona p = new Persona();
			/*
			 * p.setNombre("b"); p.setApellido1("f"); p.setApellido2("a");
			 */
			p.setEdad(Persona.MIN_EDAD - 1);
			fail("No lanza PersonaException por edad");
		} catch (PersonaException e) {
			assertEquals(PersonaException.MSG_EDAD_NO_VALIDA, e.getMessage());
			assertEquals(PersonaException.COD_EDAD_NO_VALIDA,
					e.getCodigoError());
		}

		try {
			Persona p = new Persona();
			String n = null;
			p.setNombre(n);
			p.setApellido1("f");
			p.setApellido2("a");
			fail("No lanza PersonaException por nombre/apellido1/apellido2");
		} catch (PersonaException e) {
			assertEquals(PersonaException.MSG_STRING_NO_VALIDO, e.getMessage());
			assertEquals(PersonaException.COD_STRING_NO_VALIDO,
					e.getCodigoError());
		}

	}

}
