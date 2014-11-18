package com.ipartek.formacion.proyectoclase.util;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Urko Villanueva
 *
 */
public class ArrayUtilTest {
	/**
	 *
	 */
	private static ArrayUtil a_util;
	/**
	 *
	 */
	private static Integer[] array;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		array = new Integer[] { 10, 1, 9, 7, 6 };
		a_util = new ArrayUtil(array);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		a_util = null;
		array = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSort() {
		final Integer[] ar_solutions = new Integer[] { 1, 6, 7, 9, 10 };
		Integer[] obtained = null;
		a_util.sort();
		obtained = (Integer[]) a_util.getArray();

		assertArrayEquals(
				"La tarea de ordenaci�n no se realizado correctamente",
				ar_solutions, obtained);
	}

}
