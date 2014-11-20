package com.ipartek.formacion.migracion.bean;

import com.ipartek.formacion.migracion.exception.PersonaException;

/**
 * Clase Persona para gestionar las personas del archivo.
 *
 * @author Curso
 *
 */
public class Persona {

	/************************ CONSTANTES ************************/
	/**
	 * Categor�a de JEFE.
	 */
	public static final String CAT_JEFE = "JEFE";
	/**
	 * Categor�a de TRABAJADOR.
	 */
	public static final String CAT_TRABAJADOR = "TRABAJADOR";
	/**
	 * Categor�a de CLIENTE.
	 */
	public static final String CAT_CLIENTE = "CLIENTE";
	/**
	 * Cantidad de atributos que tiene una Persona.
	 */
	public static final int DATOS_PERSONA_LENGTH = 7;
	/**
	 * Edad m�nima.
	 */
	public static final int MIN_EDAD = 18;
	/**
	 * Edad m�xima.
	 */
	public static final int MAX_EDAD = 99;
	/**
	 * Posici�n del nombre.
	 */
	public static final int POS_NOMBRE = 0;
	/**
	 * Posici�n del apellido1.
	 */
	public static final int POS_APELLIDO1 = 1;
	/**
	 * Posici�n de la poblaci�n.
	 */
	public static final int POS_POBLACION = 2;
	/**
	 * Posici�n de la edad.
	 */
	public static final int POS_EDAD = 3;
	/**
	 * Posici�n del mail.
	 */
	public static final int POS_MAIL = 4;
	/**
	 * Posici�n del dni.
	 */
	public static final int POS_DNI = 5;
	/**
	 * Posici�n de la categor�a.
	 */
	public static final int POS_CATEGORIA = 6;

	/************************ ATRIBUTOS ************************/
	/**
	 * Nombre de la Persona.
	 */
	private String nombre;
	/**
	 * Primer apellido de la Persona.
	 */
	private String apellido1;
	/**
	 * Poblaci�n residente de la Persona.
	 */
	private String poblacion;
	/**
	 * Edad de la Persona.
	 */
	private int edad;
	/**
	 * Mail de la Persona.
	 */
	private String mail;
	/**
	 * Dni de la Persona.
	 */
	private String dni;
	/**
	 * Categor�a de la Persona.
	 */
	private String categoria;

	/************************ CONSTRUCTORES ************************/
	/**
	 * Constructor de Persona.
	 *
	 * @param pNombre
	 *            Nombre de la Persona.
	 * @param pApellido1
	 *            Primer apellido de la Persona.
	 * @param pPoblacion
	 *            Poblaci�n de la Persona.
	 * @param pEdad
	 *            Edad de la Persona
	 * @param pMail
	 *            Mail de la Persona
	 * @param pDni
	 *            Dni de la Persona
	 * @param pCategoria
	 *            Categor�a de la Persona
	 */
	public Persona(final String pNombre, final String pApellido1,
			final String pPoblacion, final int pEdad, final String pMail,
			final String pDni, final String pCategoria) {
		super();
		setNombre(pNombre);
		setApellido1(pApellido1);
		setPoblacion(pPoblacion);
		setEdad(pEdad);
		setMail(pMail);
		setDni(pDni);
		setCategoria(pCategoria);
	}

	/************************ GETTERS & SETTERS ************************/
	/**
	 * Retorna el nombre.
	 *
	 * @return the nombre
	 */
	public final String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre.
	 *
	 * @param pNombre
	 *            the nombre to set
	 */
	public final void setNombre(final String pNombre) {
		this.nombre = pNombre;
	}

	/**
	 * Retorna el apellido1.
	 *
	 * @return the apellido1
	 */
	public final String getApellido1() {
		return apellido1;
	}

	/**
	 * Establece apellido1.
	 *
	 * @param pApellido1
	 *            the apellido1 to set
	 */
	public final void setApellido1(final String pApellido1) {
		this.apellido1 = pApellido1;
	}

	/**
	 * Retorna la poblaci�n.
	 *
	 * @return the poblacion
	 */
	public final String getPoblacion() {
		return poblacion;
	}

	/**
	 * Establece la poblaci�n.
	 *
	 * @param pPoblacion
	 *            the poblacion to set
	 */
	public final void setPoblacion(final String pPoblacion) {
		this.poblacion = pPoblacion;
	}

	/**
	 * Retorna la edad.
	 *
	 * @return the edad
	 */
	public final int getEdad() {
		return edad;
	}

	/**
	 * Establece la edad.
	 *
	 * @param pEdad
	 *            the edad to set
	 */
	public final void setEdad(final int pEdad) {
		this.edad = pEdad;
	}

	/**
	 * Retorna el mail.
	 *
	 * @return the mail
	 */
	public final String getMail() {
		return mail;
	}

	/**
	 * Establece el pDni.
	 *
	 * @param pDni
	 *            the dni to set
	 */
	public final void setDni(final String pDni) {
		this.dni = pDni;
	}

	/**
	 * Retorna el dni.
	 *
	 * @return the dni
	 */
	public final String getDni() {
		return dni;
	}

	/**
	 * Establece el pMail.
	 *
	 * @param pMail
	 *            the mail to set
	 */
	public final void setMail(final String pMail) {
		this.mail = pMail;
	}

	/**
	 * Retorna la categor�a.
	 *
	 * @return the categoria
	 */
	public final String getCategoria() {
		return categoria;
	}

	/**
	 * Establece la categor�a.
	 *
	 * @param pCategoria
	 *            the categoria to set
	 */
	public final void setCategoria(final String pCategoria) {
		this.categoria = pCategoria;
	}

	/************************ M�TODOS ************************/
	/**
	 *
	 * Comprueba que los datos de las Personas est�n correctos.
	 *
	 * @param datosPersona
	 *            Datos de la Persona
	 * @throws PersonaException
	 *             Lanza la ExceptionPersona si la cantidad de campos es
	 *             incorrecta
	 */
	public static void comprobarDatosPersona(final String datosPersona)
			throws PersonaException {
		final String[] aPersona = datosPersona.split(",");

		if (aPersona.length < DATOS_PERSONA_LENGTH) {
			throw new PersonaException(PersonaException.DATOS_PERSONA_LENGTH
					+ " y es " + datosPersona,
					PersonaException.COD_PERSONA_LENGTH);
		}
	}

	/**
	 *
	 * Comprueba que la edad de la Persona est� entre 18 y 99.
	 *
	 * @param datosPersona
	 *            Datos de la Persona
	 * @throws PersonaException
	 *             Lanza la ExceptionPersona si la cantidad de campos es
	 *             incorrecta
	 */
	public static void comprobarEdadPersona(final String datosPersona)
			throws PersonaException {
		final String[] aPersona = datosPersona.split(",");
		final Persona persona = new Persona(aPersona[POS_NOMBRE],
				aPersona[POS_APELLIDO1], aPersona[POS_POBLACION],
				Integer.parseInt(aPersona[POS_EDAD]), aPersona[POS_MAIL],
				aPersona[POS_DNI], aPersona[POS_CATEGORIA]);

		if (persona.getEdad() <= MIN_EDAD & persona.getEdad() >= MAX_EDAD) {
			throw new PersonaException(PersonaException.EDAD_PERSONA,
					PersonaException.COD_EDAD_PERSONA);
		}
	}
}
