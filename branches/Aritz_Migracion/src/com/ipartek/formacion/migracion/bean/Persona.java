package com.ipartek.formacion.migracion.bean;

import com.ipartek.formacion.migracion.excepciones.PersonaException;

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
public class Persona {

	static final char SEXO_VARON = 'v';
	static final char SEXO_MUJER = 'm';
	static final char SEXO_OTROS = 'o';

	public static final int MIN_STRING = 2;
	public static final int MIN_EDAD = 18;
	public static final int MAX_EDAD = 99;

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

	// Constructor
	public Persona() {
		super();
		this.nombre = "Jhon";
		this.apellido1 = "Doe";
		this.dni = "xxxxxxxxx";
	}

	public Persona(String nombre, String apellido1, String dni) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.dni = dni;
	}

	public Persona(String nombre, String apellido1, int edad, String dni)
			throws PersonaException {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		setEdad(edad);
		this.dni = dni;
		this.mayorEdad = (this.edad >= 18) ? true : false;
	}

	// Getters y Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws PersonaException {
		if (nombre == null || nombre.length() <= MIN_STRING)
			throw new PersonaException(PersonaException.MSG_STRING_CORTO,
					PersonaException.COD_STRING_CORTO);

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

	public void setEdad(int edad) throws PersonaException {
		if (edad >= MIN_EDAD && edad <= MAX_EDAD) {
			this.edad = edad;
			this.mayorEdad = (this.edad >= MIN_EDAD) ? true : false;
		} else {
			// lanzar PersonaException
			throw new PersonaException(PersonaException.MSG_EDAD_NO_VALIDA,
					PersonaException.COD_EDAD_NO_VALIDA);
		}
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

	// Metodos
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido1=" + apellido1
				+ ", apellido2=" + apellido2 + ", edad=" + edad + ", dni="
				+ dni + ", poblacion=" + poblacion + ", mayorEdad=" + mayorEdad
				+ ", telefono=" + telefono + ", sexo=" + sexo + "]";
	}

}
