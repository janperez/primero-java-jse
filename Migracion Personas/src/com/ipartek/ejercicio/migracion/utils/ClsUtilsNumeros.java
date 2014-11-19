package com.ipartek.ejercicio.migracion.utils;


import java.util.ArrayList;
import java.util.List;

/**
 * Clase de recopilaci�n de funciones �tiles para elementos num�ricos.
 * 
 * @author baskito
 * @version 03.11.2014
 */
public class ClsUtilsNumeros {
    /**
     * Comprueba si un número es par o impar.
     * @param num Numero a comprobar
     */
    public static boolean isPar(double num)
    {
        return (num % 2 == 0) ? true : false;
    }
    
    /**
     * Comprueba si un número es par o impar.
     * @param num Numero a comprobar
     */
    public static boolean isPar(int num)
    {
        return isPar((double)num);
    }
    
    /**
     * Comprueba si un número es par o impar.
     * @param num Numero a comprobar
     */
    public static boolean isPar(long num)
    {
        return isPar((double)num);
    }
    
    /**
     * Comprueba si un texto es numérico.
     * @param cadena cadena a comprobar
     */
    public static boolean isNumeric(String cadena)
    {
         if (cadena.matches("[0-9]*"))  
             return true;         
         else  
             return false;         
    }
    
    /**
     * Comprueba si un texto es numérico.
     * @param cadena cadena a comprobar
     */
    public static boolean isNumeric(char cadena)
    {
         return isNumeric(Character.toString(cadena));        
    }
    
    public static boolean isNumeric2(String cadena){
        try {            
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }  
    
    /**
     * Obtiene un valor aleatorio entero entre los dos números indicados, ambos inclusive.
     * @param desde Límite inferior
     * @param hasta Límite superior
     * @return entero con el valor aleatorio     
     */
    public static int valorAleatorio(int desde, int hasta)
    {               
        return  (int) Math.floor(Math.random()*(hasta - desde + 1) + desde);  // Valor entre M y N, ambos incluidos.
    
    }
    
    /***
     * Obtiene una lista de números enteros aleatorios entre dos números dados.
     * @param nNumeros
     * @return 
     * @return Lista de tamaño indicada con números aleatorios.
     */
    public static List<Integer> obtenerResultadosDados(int cantidad, int desde, int hasta){        
        List<Integer> resultados = new ArrayList<Integer>(); 
        for (int i=1; i <= cantidad; i++){            
            resultados.add(valorAleatorio(desde,hasta));
        }                  
        return resultados;          
    }
    
    public static int safeLongToInt(long l) {
	if (l < Integer.MIN_VALUE || l > Integer.MAX_VALUE) {
	    throw new IllegalArgumentException
	    (l + " cannot be cast to int without changing its value.");
	}
	return (int) l;
    }
}