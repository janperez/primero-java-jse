package com.ipartek.formacion.sergio.utils;


import java.util.ArrayList;
import java.util.List;

/**
 * Clase de recopilaci�n de funciones �tiles para elementos num�ricos.
 * 
 * @author baskito
 * @version 20.11.2014
 */
public final class ClsUtilsNumeros {
    
    /**
     * Empty constructor.
     */
    private ClsUtilsNumeros() {
	
    }
    
    
    
    
    /**
     * Comprueba si un número es par o impar.
     * @param num Numero a comprobar
     * @return true if yes, false if not
     */
    public static boolean isPar(final double num) {
        return num % 2 == 0;
    }
    
    /**
     * Comprueba si un número es par o impar.
     * @param num Numero a comprobar
     * @return true if yes, false if not
     */
    public static boolean isPar(final int num) {
        return isPar((double) num);
    }
    
    /**
     * Comprueba si un número es par o impar.
     * @param num Numero a comprobar
     * @return true if yes, false if not
     */
    public static boolean isPar(final long num) {
        return isPar((double) num);
    }
    
    /**
     * Comprueba si un texto es numérico.
     * @param cadena cadena a comprobar
     * @return true if yes, false if not
     */
    public static boolean isNumeric(final String cadena) {
         return cadena.matches("[0-9]*");
    }
    
    /**
     * Comprueba si un texto es numérico.
     * @param cadena cadena a comprobar
     * @return true if yes, false if not
     */
    public static boolean isNumeric(final char cadena) {
         return isNumeric(Character.toString(cadena));        
    }
    
    /**
     * Comprueba si un texto es num�rico.
     * @param cadena String cadena a comprobar
     * @return true if yes, false if not
     */
    public static boolean isNumeric2(final String cadena) {
        try {            
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }  
    
    /**
     * Obtiene un valor aleatorio entero entre los dos números 
     * indicados, ambos inclusive.
     * @param desde Límite inferior
     * @param hasta Límite superior
     * @return entero con el valor aleatorio     
     */
    public static int valorAleatorio(final int desde, 
	    final int hasta) {   
	 // Valor entre M y N, ambos incluidos.
        return  (int) Math.floor(Math.random() * (hasta - desde + 1) + desde); 
    
    }
    
    /***
     * Obtiene una lista de números enteros aleatorios entre 
     * dos números dados.
     * 
     * @param cantidad int n�mero de resultados deseados
     * @param desde Límite inferior
     * @param hasta Límite superior
     *  
     * @return Lista de tamaño indicada con números aleatorios.
     */
    public static List<Integer> obtenerResultadosDados(final int cantidad, 
	    final int desde, final int hasta) {        
        List<Integer> resultados = new ArrayList<Integer>(); 
        for (int i = 1; i <= cantidad; i++) {            
            resultados.add(valorAleatorio(desde, hasta));
        }                  
        return resultados;          
    }
    
    /**
     * Convierte un long to int siempre que est� dentro de los l�mites del int.
     * @param number Long n�mero a convertir
     * @return integer con el n�mero convertido
     * 
     * @throws IllegalArgumentException si el n�mero no est� comprendido en
     * los l�mites de un integer
     */
    public static int safeLongToInt(final long number) {
	if (number < Integer.MIN_VALUE || number > Integer.MAX_VALUE) {
	    throw new IllegalArgumentException(number 
		    + " cannot be cast to int without changing its value.");
	}
	
	return (int) number;
    }
}
