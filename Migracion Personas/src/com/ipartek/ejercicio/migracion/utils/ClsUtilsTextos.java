package com.ipartek.ejercicio.migracion.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *	Funciones �tiles para el tratamiendo de texto.
 *
 * @author Sergio Rubio
 * @version 03.11.2014
 * 
 * - Modificaciones
 * - Casa 04.11.2014
 */
public class ClsUtilsTextos {
   
    public static List<String> getBetweenTwoCharacters(String texto, String a){
        return getBetweenTwoCharacters(texto, a, a);
    }
    
    public static List<String> getBetweenTwoCharacters(String texto, String a, String b)
    {
        List<String> lst = new ArrayList<String>();
        String start = a;
        String end = b;
        String condition = "(.*?)";
        // "\\([^()]*\\)"
        //String condition = "[^()]*";
        
        @SuppressWarnings("serial")
		final ArrayList<String> list = new ArrayList<String>() {{
            add("(");
            add(")");
            add("[");
            add("]");
            add(".");
        }};
                
        if(list.contains(a)){
            start = "\\" + a;
        }else{
            start = a;
        }
        
        if(list.contains(b)){
            end = "\\" + b;
        }else{
            end = b;
        }
        

        //start = a;
        
        //"\\(.*?\\)"
        //String strs = "ZZZZL <%= dsn %> AFFF <%= AFG %>";
        String patternStr = start + condition + end;
        //patternStr = "\\((.*?)\\)";
        
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()) {
            //System.out.println(matcher.group(1));
            lst.add(matcher.group(1));
        }
        
        return lst;
    }
    
    /**
     * Obtiene una cadena de caracteres iniciando por la �ltima posici�n.
     * 
     * @param inputString
     * @param subStringLength
     * @return 
     */
    public static String getLastnCharacters(String inputString, int subStringLength) {
        int length = inputString.length();
        if (length <= subStringLength) {
            return inputString;
        }
        int startIndex = length - subStringLength;
        return inputString.substring(startIndex);
    }
    
    /**
     * A�ade caracteres a la izquierda del texto hasta llegar a un tamaño determinado.
     * Si el tama�o total es menor que el del texto, devuelve la cadena intacta.
     * @param texto Texto al que añadiremos los caracteres
     * @param tamTotal Tamaño total del texto final
     * @param caracter Carácter a añadir
     */
    public static String padLeft(final String texto, 
	    final int tamTotal, final String caracter) 
    {
	String txtTemp = texto;
	
        if (texto.length() >= tamTotal) {
            return txtTemp;        
        }
        else {
            
            txtTemp = String.format("%1$" + tamTotal + "s",texto);
            txtTemp = txtTemp.replace(" ", caracter);
            
            //return String.format("%1$" + tamTotal + "s",texto).replace(" ", caracter);
            return txtTemp;
        }
    }
    
    /**
     * A�ade caracteres a la derecha del texto hasta llegar a un tama�o determinado.
     * Si el tama�o total es menor que el del texto, devuelve la cadena intacta.
     * @param texto Texto al que a�adiremos los caracteres
     * @param tamTotal tama�o total del texto final
     * @param caracter Caracter a a�adir
     */
    public static String padRight(String texto, int tamTotal, String caracter) 
    {   
        if (texto.length() >= tamTotal)
            return texto;        
        else
            return String.format("%1$-" + tamTotal + "s",texto).replace(" ", caracter);
    }
    
    /**
     * Desordena un string.
     * 
     * @param texto
     * @return
     */
    @SuppressWarnings("unused")
	private String desordenarString(String texto)
	{
		List<String> letters = Arrays.asList(texto.split(""));
	    Collections.shuffle(letters);
	 
	    String salida = "";
	    for (String s : letters)
	        salida += s;
	 
	    return salida;		
	}
    
   
}
