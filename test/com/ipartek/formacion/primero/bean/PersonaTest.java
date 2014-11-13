package com.ipartek.formacion.primero.bean;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonaTest {
	
	ArrayList<Persona> listaPersona;
	Persona pZuahitz;
	Persona pSus�na;
	Persona pkepa;
	Persona p�rko;
	Persona pJon;
	Persona pSerg�o;
	Persona pJos�ba;
	Persona pMar�o;
	Persona p�ritz;
	Persona pfran;
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
		pZuahitz = new Persona("Zuhaitz",29);
		pSus�na = new Persona("Sus�na",23);
		pkepa = new Persona("kepa",34);
		p�rko = new Persona("�rko",37);
		pJon = new Persona("Jon",35);
		pSerg�o = new Persona("Serg�o",18);
		pJos�ba = new Persona("Jos�ba",26);
		pMar�o = new Persona("Mar�o",29);
		p�ritz = new Persona("�ritz",20);
		pfran = new Persona("fran",33);
		pMaitane = new Persona("Maitane",29);
		pJose = new Persona("Jose",44);
		
		listaPersona.add (pZuahitz);
		listaPersona.add (pSus�na);
		listaPersona.add (pkepa);
		listaPersona.add (p�rko);
		listaPersona.add (pJon);
		listaPersona.add (pSerg�o);
		listaPersona.add (pJos�ba);
		listaPersona.add (pMar�o);
		listaPersona.add (p�ritz);
		listaPersona.add (pfran);
		listaPersona.add (pMaitane);
		listaPersona.add (pJose);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		assertEquals(pZuahitz, listaPersona.get(0));
		assertEquals(pSus�na, listaPersona.get(1));
		assertEquals(pkepa, listaPersona.get(2));
		assertEquals(p�rko, listaPersona.get(3));
		assertEquals(pJon, listaPersona.get(4));
		assertEquals(pSerg�o, listaPersona.get(5));
		assertEquals(pJos�ba, listaPersona.get(6));
		assertEquals(pMar�o, listaPersona.get(7));
		assertEquals(p�ritz, listaPersona.get(8));
		assertEquals(pfran, listaPersona.get(9));
		assertEquals(pMaitane, listaPersona.get(10));
		assertEquals(pJose, listaPersona.get(11));
		
		
		/**
		 * Ordeno por edad y con assertEquals compruebo que me lo ha ordenado
		 * Primeramente indicar en la clase <code>implements Comparable<Persona></code> 
		 * y a�adir
		 * <code>public int compareTo(Persona p) {</code>
		 *	<code>return Integer.compare(this.getEdad(), p.getEdad());</code>
		 * <code>}</code>
		 */
		Collections.sort(listaPersona);
		assertEquals(18, listaPersona.get(0).getEdad());
		assertEquals(20, listaPersona.get(1).getEdad());
		assertEquals(23, listaPersona.get(2).getEdad());
		assertEquals(26, listaPersona.get(3).getEdad());
		assertEquals(29, listaPersona.get(5).getEdad());
		assertEquals(29, listaPersona.get(6).getEdad());
		assertEquals(33, listaPersona.get(7).getEdad());
		assertEquals(34, listaPersona.get(8).getEdad());
		assertEquals(35, listaPersona.get(9).getEdad());
		assertEquals(37, listaPersona.get(10).getEdad());
		assertEquals(44, listaPersona.get(11).getEdad());
		
		
		//Ordeno por nombre
		
				
		
		
	
		
		
		
		
	}

}
