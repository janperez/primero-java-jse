package com.ipartek.formacion.migracion.exception;

/**
 * Clase con las excepciones personalizadas.
 *
 * @author Curso
 *
 */
public class PersonaException extends Exception {

	/************************* CONSTANTES **************************/
	/**
	 * Serial Version UID para la serializaci�n.
	 */
	private static final long serialVersionUID = -8848179782140137362L;

	/**
	 * Mensaje para ExceptionPersona que muestra que la cantidad de campos que
	 * hay en la l�nea es incorrecta.
	 */
	public static final String DATOS_PERSONA_LENGTH = "La cantidad de campos en la l�nea es incorrecta. "
			+ "Deber�a ser <nombre>, <apellido1>, <poblacion>, <edad>, <mail>, <categoria>";

	/**
	 * C�digo para la ExceptionPersona de que la cantidad de campos que hay en
	 * la l�nea es incorrecta.
	 */
	public static final String COD_PERSONA_LENGTH = "CANTIDAD DE CAMPOS INCORRECTA";

	/**
	 * Mensaje para ExceptionPersona que muestra que la edad no est� en el rango
	 * correcto (18-99).
	 */
	public static final String EDAD_PERSONA = "La edad de la Persona est� fuera de rango, deber�a estar entre 18 y 99.";

	/**
	 * C�digo para la ExceptionPersona de que la edad est� fuera de rango.
	 */
	public static final String COD_EDAD_PERSONA = "EDAD";

	/************************** ATRIBUTOS **************************/
	/**
	 * C�digo de la ExceptionPersona.
	 */
	private String codigo;

	/************************ CONSTRUCTORES ************************/
	/**
	 * Le manda a super el mensaje que va a salir en la ExceptionPersona.
	 *
	 * @param message
	 *            Mensaje de la ExceptionPersona
	 * @param pCodigo
	 *            C�digo de la ExceptionPersona
	 */
	public PersonaException(final String message, final String pCodigo) {
		super(message);
		this.codigo = pCodigo;
	}

	/********************** GETTERS & SETTERS **********************/
	/**
	 * Retorna el c�digo de la ExceptionPersona.
	 *
	 * @return codigo
	 */
	public final String getCodigo() {
		return codigo;
	}
}
