package com.inpartek.formacion.proyectojava.pojo;

import com.inpartek.formacion.proyectojava.exception.PersonaException;
import com.inpartek.formacion.proyectojava.util.UtilValidacion;

public class Persona {

	private String nombre;
	private String apellido;
	private String poblacion;
	private int edad;
	private String email;
	private String dni;
	private String categoria;
	private boolean todo;

	public final static int EDAD_MAX = 99;
	public final static int EDAD_MIN = 0;
	public final static int TEXTO_LONG_MIN = 2;

	public Persona(final String pdni) {
		super();
		this.dni = pdni;
		this.todo = false;
	}

	public Persona(final String pnombre, final String papellido,
			final String ppoblacion, final int pedad, final String pemail,
			final String pdni, final String pcategoria) throws PersonaException {
		super();
		this.nombre = pnombre;
		this.apellido = papellido;
		this.poblacion = ppoblacion;
		setEdad(pedad);
		this.email = pemail;
		this.dni = pdni;
		this.categoria = pcategoria;
		this.todo = true;
	}

	public String getApellido() {
		return apellido;
	}

	public String getCategoria() {
		return categoria;
	}

	public String getDni() {
		return dni;
	}

	public int getEdad() {
		return edad;
	}

	public String getEmail() {
		return email;
	}

	public String getNombre() {
		return nombre;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public boolean isTodo() {
		return todo;
	}

	public void setApellido(final String papellido) throws PersonaException {
		if (papellido != null && papellido.length() >= Persona.TEXTO_LONG_MIN) {
			this.apellido = papellido;
		} else {
			this.todo = false;
			throw new PersonaException(PersonaException.MSG_TEXTO_NO_VALIDO,
					PersonaException.COD_LONG_TEXTO_NO_VALIDA);
		}
	}

	public void setCategoria(final String pcategoria) throws PersonaException {
		if (pcategoria != null && pcategoria.length() >= Persona.TEXTO_LONG_MIN) {
			this.categoria = pcategoria;
		} else {
			this.todo = false;
			throw new PersonaException(PersonaException.MSG_TEXTO_NO_VALIDO,
					PersonaException.COD_LONG_TEXTO_NO_VALIDA);
		}

	}

	public void setDni(final String pdni) throws PersonaException {
		if (UtilValidacion.validarDNI(pdni)) {
			this.dni = pdni;
		} else {
			this.todo = false;
			throw new PersonaException(PersonaException.MSG_DNI_NO_VALIDO,
					PersonaException.COD_DNI_NO_VALIDO);
		}
	}

	public void setEdad(final int pedad) throws PersonaException {
		if (pedad > EDAD_MIN && pedad <= EDAD_MAX) {
			this.edad = pedad;
		} else {
			this.todo = false;
			throw new PersonaException(PersonaException.MSG_EDAD_NO_VALIDA,
					PersonaException.COD_EDAD_NO_VALIDA);
		}
	}

	public void setEmail(final String pemail) {
		this.email = pemail;
	}

	public void setNombre(final String pnombre) throws PersonaException {
		if (pnombre != null && pnombre.length() >= Persona.TEXTO_LONG_MIN) {
			this.nombre = pnombre;
		} else {
			this.todo = false;
			throw new PersonaException(PersonaException.MSG_TEXTO_NO_VALIDO,
					PersonaException.COD_LONG_TEXTO_NO_VALIDA);
		}
	}

	public void setPoblacion(final String ppoblacion) throws PersonaException {
		if (ppoblacion != null && ppoblacion.length() >= Persona.TEXTO_LONG_MIN) {
			this.poblacion = ppoblacion;
		} else {
			this.todo = false;
			throw new PersonaException(PersonaException.MSG_TEXTO_NO_VALIDO,
					PersonaException.COD_LONG_TEXTO_NO_VALIDA);
		}
	}

	public void setTodo(final boolean ptodo) {
		this.todo = ptodo;
	}

	public String toFileString() {

		return this.dni + " " + this.nombre + " " + this.apellido + " "
				+ this.edad + " " + this.email + " " + this.poblacion + " "
				+ this.categoria;
	}
}
