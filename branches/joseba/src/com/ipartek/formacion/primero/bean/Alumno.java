package com.ipartek.formacion.primero.bean;

import java.util.ArrayList;

import com.ipartek.formacion.primero.util.Utilidades;

/**
 * Clase para representar un alumno. Se compone de:
 * <ol>
 * 		<li>Nombre {@code String} obligatorio</li>
 * 		
 * </ol>
 * @author Joseba Carri�n Blanco
 *
 */

public class Alumno extends Persona{
	
	private ArrayList<Calificacion> calificaciones;
	
	//Constructores
	public Alumno(){
		super();
	}

	public Alumno(ArrayList<Calificacion> calificaciones) {
		super();
		this.calificaciones = calificaciones;
	}
	
	
}