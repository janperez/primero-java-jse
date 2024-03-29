package com.ipartek.formacion.primero.util;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FechaTest {
	GregorianCalendar hoyDate = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		hoyDate = new GregorianCalendar();
		hoyDate.setTime(new Date());
	}

	@After
	public void tearDown() throws Exception {
		hoyDate = null;
	}

	@Test
	public void testFecha() throws Exception {
		String hoyStringCas = hoyDate.get(GregorianCalendar.DAY_OF_MONTH) + "/"
				+ (hoyDate.get(GregorianCalendar.MONTH) + 1) + "/"
				+ hoyDate.get(GregorianCalendar.YEAR);
		String hoyStringEus = hoyDate.get(GregorianCalendar.YEAR) + "/"
				+ (hoyDate.get(GregorianCalendar.MONTH) + 1) + "/"
				+ hoyDate.get(GregorianCalendar.DAY_OF_MONTH);

		assertEquals(hoyStringCas,
				Fecha.getString(hoyDate.getTime(), Idioma.CASTELLANO));
		assertEquals(hoyStringEus,
				Fecha.getString(hoyDate.getTime(), Idioma.EUSKARA));
	}

	@Test
	public void testFechaLong() throws Exception {
		String hoyStringCas = hoyDate.get(GregorianCalendar.DAY_OF_MONTH) + "/"
				+ (hoyDate.get(GregorianCalendar.MONTH) + 1) + "/"
				+ hoyDate.get(GregorianCalendar.YEAR);
		String hoyStringEus = hoyDate.get(GregorianCalendar.YEAR) + "/"
				+ (hoyDate.get(GregorianCalendar.MONTH) + 1) + "/"
				+ hoyDate.get(GregorianCalendar.DAY_OF_MONTH);

		assertEquals(hoyStringCas,
				Fecha.getString(hoyDate.getTimeInMillis(), Idioma.CASTELLANO));
		assertEquals(hoyStringEus,
				Fecha.getString(hoyDate.getTimeInMillis(), Idioma.EUSKARA));
	}

	@Test
	public void testFechaTodosMeses() throws Exception {
		int anno = hoyDate.get(GregorianCalendar.YEAR);

		String plantillaCas = "01/" + "MES" + "/" + anno;
		String plantillaEus = anno + "/" + "MES" + "/01";

		String hoyStringCas = "";
		String hoyStringEus = "";
		GregorianCalendar fecha = new GregorianCalendar();

		for (int i = 1; i < 13; i++) {
			hoyStringCas = plantillaCas
					.replace("MES", String.format("%02d", i));
			hoyStringEus = plantillaEus
					.replace("MES", String.format("%02d", i));

			fecha.set(anno, i - 1, 1);

			assertEquals(hoyStringCas,
					Fecha.getString(fecha.getTime(), Idioma.CASTELLANO));
			assertEquals(hoyStringEus,
					Fecha.getString(fecha.getTime(), Idioma.EUSKARA));
		}
	}

}
