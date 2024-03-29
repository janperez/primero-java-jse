package com.ipartek.formacion.primero.bean;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;

/**
 * Clase para reprensentar un Alumno, se compone de:
 * <ol>
 * <li>nombre {@code String} obligatorio</li>
 * </ol>
 * 
 * 
 * @author Ander Uraga Real
 *
 */
public class Alumno {

	static final char SEXO_VARON = 'v';
	static final char SEXO_MUJER = 'm';
	static final char SEXO_OTROS = 'o';

	static final int MAYOR_EDAD = 18;

	static final String NOMBRE_NULO = "sin determinar";

	// Atributos
	String nombre;
	String apellido1;
	String apellido2;
	int edad;
	String dni;
	String poblacion;
	boolean mayorEdad = false;
	String telefono;
	char sexo = 'o';
	ArrayList<Libro> libros;
	ArrayList<Calificacion> calificaciones;

	// Constructor
	public Alumno() {
		super();
		this.nombre = "Jhon";
		this.apellido1 = "Doe";
		this.dni = "xxxxxxxxx";
	}

	public Alumno(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public Alumno(String nombre, String apellido1, String dni) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.dni = dni;
	}

	public Alumno(String nombre, String apellido1, int edad, String dni) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.edad = edad;
		this.dni = dni;
		this.mayorEdad = (this.edad >= 18) ? true : false;
	}

	// Getters y Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
		this.mayorEdad = (this.edad >= MAYOR_EDAD) ? true : false;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public boolean isMayorEdad() {
		return mayorEdad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

	public ArrayList<Calificacion> getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(ArrayList<Calificacion> calificaciones) {
		this.calificaciones = calificaciones;
	}

	// Metodos
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido1=" + apellido1
				+ ", apellido2=" + apellido2 + ", edad=" + edad + ", dni="
				+ dni + ", poblacion=" + poblacion + ", mayorEdad=" + mayorEdad
				+ ", telefono=" + telefono + ", sexo=" + sexo + "]";
	}

	public static class ComparatorEdadAlumnos implements Comparator<Alumno> {
		@Override
		public int compare(Alumno o1, Alumno o2) {
			return Integer.compare(o1.getEdad(), o2.getEdad());
		}
	}

	public static class ComparatorNombreAlumnos implements Comparator<Alumno> {

		@Override
		public int compare(Alumno b1, Alumno b2) {
			// TODO Auto-generated method stub
			Locale locale = new Locale("es", "ES");
			Collator collator = Collator.getInstance(locale);
			collator.setStrength(Collator.PRIMARY);
			return collator.compare(b1.getNombre(), b2.getNombre());

		}

	}

}
