package com.ipartek.formacion.primero.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Fichero {

	/**
	 * Crea un fichero de texto con codificacion "utf-8"
	 * 
	 * @param nombreFichero
	 *            path + nombre + extension, ej: filename.txt
	 * 
	 * @param contenido
	 *            contenido a escribir en el fichero
	 * 
	 * @return true si se crea en el fichero, false en caso contrario
	 */

	static void create(String nombreFichero, String contenido) {
		boolean resul = false;

		Writer writer = null;
		FileOutputStream ficheroTexto = null;
		OutputStreamWriter outputStream = null;

		try {
			// Creamos el nombre y extension del fichero
			ficheroTexto = new FileOutputStream(nombreFichero);

			// declaramos un Stream para escribir
			// pasamos como parametros el fichero a escribir y su Charset
			outputStream = new OutputStreamWriter(ficheroTexto, "utf-8");

			// objeto Writer para escribir
			// mejoramos el rendimiento con un buffer
			writer = new BufferedWriter(outputStream);

			// escribir en el fichero a traves del writer
			writer.write("Hello World");
			resul = true;

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

	}

	public static boolean remove(String ficheroName) {
		boolean resul = false;
		try {
			File file = new File(ficheroName);
			resul = file.delete();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resul;
	}
}
