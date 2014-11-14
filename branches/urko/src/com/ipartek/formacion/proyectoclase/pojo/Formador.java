package com.ipartek.formacion.proyectoclase.pojo;

import java.util.Calendar;

import com.ipartek.formacion.proyectoclase.excepciones.PersonaException;

/**
 *
 * @author Urko Villanueva
 *
 */
public class Formador extends Persona {
	/**
	 *
	 */
	private Double sueldo;
	/**
	 *
	 */
	public static final Double SUELDO_MINIMO = 756.00;

	/**
	 * @throws PersonaException
	 *
	 */
	public Formador() throws PersonaException {
		// TODO Auto-generated constructor stub
		super();
		setSueldo(SUELDO_MINIMO);

	}

	public Formador(String nombre, String p_apellido, String s_apellido,
			String dni, String telefono, Double sueldo) {
		super(nombre, p_apellido, s_apellido, dni, telefono);
		// TODO Auto-generated constructor stub
		setSueldo(sueldo);
	}

	public Formador(String nombre, String p_apellido, String s_apellido,
			String dni, String poblacion, Calendar f_nacimiento,
			String telefono, char sexo, Boolean trabajando, Integer n_hermanos,
			Libro libro, Double sueldo) throws PersonaException {
		super(nombre, p_apellido, s_apellido, dni, poblacion, f_nacimiento,
				telefono, sexo, trabajando, n_hermanos, libro);
		setSueldo(sueldo);

	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		if (sueldo >= Formador.SUELDO_MINIMO)
			this.sueldo = sueldo;
	}

}
