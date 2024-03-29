package com.ipartek.formacion.proyectoclase.util;

public class Util {

	/**
	 * Genera un n�mero de DNI {@code String} valido: numero y letra en
	 * mayusculas
	 *
	 * @return {@code String} devuelve el numero de DNI generado
	 */
	public static String generarDNI() {
		String dni = null;
		Integer ndni = 0;
		Character letra = null;

		ndni = generarNumeroDni();
		letra = generarLetraDni(ndni);

		dni = String.format("%07d", ndni.toString()) + letra.toString();

		return dni;
	}

	private static Integer generarNumeroDni() {
		final int LIMITE_SUP = 99999999;
		Integer ndni = 0;
		ndni = (int) Math.floor(Math.random() * LIMITE_SUP + 1);

		return ndni;
	}

	private static Character generarLetraDni(Integer ndni) {
		final char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P',
				'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C',
				'K', 'E', 'T' };
		Character c = null;

		MyMath.compruebaMayor((double) ndni);
		c = letras[ndni % letras.length];

		return c;
	}

	/**
	 * Comprueba si una letra es una vocal
	 *
	 * @param c
	 *            {@code Character} la letra a validar
	 * @return {@code Boolean} nos devuelve si es cierto si es una vocal o no
	 */
	public static Boolean isVocal(Character c) {
		Boolean cierto = false;
		Character cha = Character.toLowerCase(c);
		switch (cha) {
		case '�':
		case '�':
		case '�':
		case '�':
		case '�':
		case '�':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			cierto = true;
			break;
		default:
			cierto = false;
			break;
		}
		return cierto;
	}
}
