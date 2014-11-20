package com.ipartek.ejercicio.migracion.utils;
/**
 * Clase de recopilaci�n de constantes �tiles para proyectos.
 * 
 * @author baskito
 * @version 20.11.2014
 */
public final class ClsUtilsConstantes {
    
    /**
     * Empty constructor.
     */
    private ClsUtilsConstantes() {
	
    }
    
    /**
     * Salto de línea genérico independiente del S.O. 
     * (uso de System.getProperty).
     */
    public static final String SALTO_DE_LINEA = 
	    System.getProperty("line.separator");
    
    /**
     * El path del proyecto.
     */
    public static final String PATH_PROJECT = 
	    System.getProperty("user.dir");
}
