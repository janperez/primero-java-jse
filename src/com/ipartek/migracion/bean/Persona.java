package com.ipartek.migracion.bean;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.aeat.valida.Validador;

/**
 * Persona.
 * <ol>
 * <li>nombre {@code String}</li>
 * <li>apellido {@code String}</li>
 * <li>poblacion {@code String}</li>
 * <li>edad {@code int}</li>
 * <li>email {@code String}</li>
 * <li>dni {@code String}</li>
 * <li>categoria {@code String}</li>
 * </ol>
 * 
 * 
 * @author Fran
 *
 */
public class Persona {
	/**
	 * Constante con el valor m�nimo aceptado para el atributo {@code edad}.
	 */
	private static final int EDAD_MIN = 18;
	/**
	 * Constante con el valor m�ximo aceptado para el atributo {@code edad}.
	 */
	private static final int EDAD_MAX = 99;
	/**
	 * Expresi�n regular que debe cumplir el email para ser v�lido.
	 */
	private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	// Atributos
	private String nombre;
	private String apellido;
	private String poblacion;
	private int edad;
	private String email;
	private String dni;
	private String categoria;

	/*
	 * Constructor con todos los atributos.
	 */
	public Persona(final String pNombre, final String pApellido,
			final String pPoblacion, final int pEdad, final String pEmail,
			final String pDni, final String pCategoria) {
		super();
		setNombre(pNombre);
		setApellido(pApellido);
		setPoblacion(pPoblacion);
		setEdad(pEdad);
		setEmail(pEmail);
		setDni(pDni);
		setCategoria(pCategoria);
	}

	/**
	 * Get del atributo nombre.
	 * 
	 * @return {@code String} nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Set del atributo nombre.
	 * 
	 * @param pNombre
	 *            {@code String} nombre.
	 */
	public void setNombre(final String pNombre) {
		this.nombre = pNombre;
	}

	/**
	 * Get del atributo apellido.
	 * 
	 * @return {@code String} apellido.
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Set del atributo apellido.
	 * 
	 * @param pNombre
	 *            {@code String} apellido.
	 */
	public void setApellido(final String pApellido) {
		this.apellido = pApellido;
	}

	/**
	 * Get del atributo poblacion.
	 * 
	 * @return {@code String} poblacion.
	 */
	public String getPoblacion() {
		return poblacion;
	}

	/**
	 * Set del atributo poblacion.
	 * 
	 * @param pNombre
	 *            {@code String} poblacion.
	 */
	public void setPoblacion(final String pPoblacion) {
		this.poblacion = pPoblacion;
	}

	/**
	 * Get del atributo edad.
	 * 
	 * @return {@code int} edad.
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Set del atributo edad.
	 * 
	 * @param pEdad
	 *            {@code int} edad.
	 */
	public void setEdad(final int pEdad) {
		this.edad = pEdad;
	}

	/**
	 * Get del atributo email.
	 * 
	 * @return {@code String} email.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Set del atributo email.
	 * 
	 * @param pEdad
	 *            {@code String} email.
	 */
	public void setEmail(final String pEmail) {
		this.email = pEmail;
	}

	/**
	 * Get del atributo dni.
	 * 
	 * @return {@code String} dni.
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Set del atributo dni.
	 * 
	 * @param pEdad
	 *            {@code String} dni.
	 */
	public void setDni(final String pDni) {
		this.dni = pDni;
	}

	/**
	 * Get del atributo categoria.
	 * 
	 * @return {@code String} categoria.
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * Set del atributo categoria.
	 * 
	 * @param pEdad
	 *            {@code String} categoria.
	 */
	public void setCategoria(final String pCategoria) {
		this.categoria = pCategoria;
	}

	/**
	 * Comprobar si la edad esta dentro del rango estipulado. Entre 18 y 99.
	 * 
	 * @return True si la edad esta entre 18 y 99. False en cc.
	 */
	public boolean edadCorrecta() {
		boolean resul;
		resul = true;
		if (getEdad() < EDAD_MIN || getEdad() > EDAD_MAX) {
			resul = false;
		}
		return resul;
	}

	/**
	 * Comprobar si el email esta correctamente formado
	 * 
	 * @return True si es v�lido. False si no es v�lido
	 */
	public boolean emailCorrecto() {
		boolean resul;
		resul = true;
		Pattern pattern = Pattern.compile(PATTERN_EMAIL);
		Matcher matcher = pattern.matcher(getEmail());
		resul = matcher.matches();
		return resul;
	}

	public boolean dniCorrecto() {
		boolean resul;
		resul = true;
		// Utiliza la libreria valnif.jar
		/*
		 * Informaci�n de la librer�a: NIF a validar con las siguientes
		 * caracter�sticas: Longitud de 9 caracteres. May�sculas. Relleno de
		 * ceros por la izquierda. No realiza ning�n ajuste de la cadena
		 * recibida como par�metro, valida dicha cadena y devuelve: Un valor
		 * cero (0) si nif_a_validar es un NIF CORRECTO Un valor uno (1) si
		 * nif_a_validar es INCORRECTO
		 */

		String dni = getDni().toUpperCase();
		Validador validador = new Validador();
		while (dni.length() < 9) {
			dni = "0" + dni;
		}
		int e = validador.checkNif(dni);

		resul = e > 0;
		return resul;
	}
}
