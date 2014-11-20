package com.ipartek.ejercicio.migracion.object;

import java.util.LinkedList;

import com.ipartek.ejercicio.migracion.Constantes;
import com.ipartek.ejercicio.migracion.Validations;
import com.ipartek.ejercicio.migracion.Constantes.eErrorCause;

/**
 * Objeto que guardar� los datos de un registro.
 * 
 * @author Sergio Rubio Nieto
 *
 */
public class Persona {
    
    /**
     * Save the posible errors in data.
     */
    private LinkedList<eErrorCause> errors = null;
        

    /**
     * Variable que guardar� el nombre.
     */
    private String nombre;
    
    /**
     * Variable que guardar� el apellido1.
     */
    private String apellido1;
    
    /**
     * Variable que guardar� la poblaci�n.
     */
    private String poblacion;
    
    /**
     * Variable que guardar� la edad (-1 si es err�nea).  
     */
    private int edad;
    
    /**
     * Variable que guardar� el dni.
     */
    private String email;
    
    /**
     * Variable que guardar� el DNI.
     */
    private String dni;
    
    /**
     * Variable que guardar� el cargo.
     */
    private String cargo;
    
    /**
     * Get all type errors ocurred in object.
     * @return eErrorCause error
     */
    public LinkedList<eErrorCause> getErrors() {
	return errors;
    }
    
    
    /**
     * Get the value for nombre.
     * @return String with value
     */
    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	if (!Validations.isValidUTF8(nombre)) {
	    errors.add(eErrorCause.UTF8);
	}
		
	this.nombre = nombre;
    }

    /**
     * Get the value for apellido1.
     * @return String with value
     */
    public String getApellido1() {
	return apellido1;
    }

    public void setApellido1(String apellido1) {
	if (!Validations.isUTF8MisInterpreted(apellido1)) {
	    errors.add(eErrorCause.UTF8);
	}
		
	this.apellido1 = apellido1;
    }

    /**
     * Get the value for poblaci�n.
     * @return String with value
     */
    public String getPoblacion() {
	return poblacion;
    }

    
    public void setPoblacion(String poblacion) {
	if (!Validations.isUTF8MisInterpreted(poblacion)) {
	    errors.add(eErrorCause.UTF8);
	}
		
	this.poblacion = poblacion;
    }

    /**
     * Get the value for edad.
     * @return String with value
     */
    public int getEdad() {
	return edad;
    }

    public void setEdad(final String edad) {
	
	try {
	    //check validations 
	    if (!Validations.isValidEdad(edad)) {
		errors.add(eErrorCause.EDAD);		
	    }
	    //save the edad
	    this.edad = Integer.valueOf(edad);
	} catch (Exception ex) {
	    //error in edad passed, save -1
	    this.edad = -1;
	}	
	
    }

    /**
     * Get the value for email.
     * @return String with value
     */
    public String getEmail() {
	return email;
    }

    public void setEmail(final String email) {
	
	if (!Validations.isValidEmail(email)) {
	    errors.add(eErrorCause.EMAIL);
	}
	
	this.email = email;
    }

    /**
     * Get the value for DNI.
     * @return String with value
     */
    public String getDni() {
	return dni;
    }

    public void setDni(String dni) {
	if (!Validations.isValidDNI(dni)) {
	    errors.add(eErrorCause.DNI);
	}
	
	this.dni = dni;
    }

    /**
     * Get the value for Cargo.
     * @return String with value
     */
    public String getCargo() {
	return cargo;
    }

    
    public void setCargo(String cargo) {
	
	if (!Validations.isUTF8MisInterpreted(cargo)) {
	    errors.add(eErrorCause.UTF8);
	}
		
	this.cargo = cargo;	
    }

    
    /**
     * Create a new object empty.
     */
    public Persona() {
	//initialize list of errors
	errors = new LinkedList<eErrorCause>();
    }
    
    /**
     * Check if object has error.
     * 
     * @return true if yes, false if not
     */
    public boolean hasErrors() {
	
	if (errors != null) {
	    if (errors.size() > 0) { 
		return true; 
	    }
	}	
		
	return false;		
    }
    

    @Override
    public String toString() {
	
	String text = "";
	
	//configuramos los errores
	if (errors != null && errors.size() > 0) {
	    for (eErrorCause errorCause : errors) {
		text += errorCause.toString() + ","; 
	    }
	}
	if (text.length() > 0) {
	    text = text.substring(0, text.length() - 1);
	    text += " => ";
	}
	
	/*
	text += "nombre=" + nombre + ", apellido1=" + apellido1
		+ ", poblacion=" + poblacion + ", edad=" + edad + ", email="
		+ email + ", dni=" + dni + ", cargo=" + cargo;
	*/
	
	text += nombre + "," + apellido1 + "," + poblacion 
		+ "," + edad + "," + email + "," + dni + "," + cargo;
	
	return text;
    }

}
