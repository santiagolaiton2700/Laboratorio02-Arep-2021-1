package edu.escuelaing.arep.stat;

/**
 * Clase creada para manjerar excepciones de lista
 * @author Santiago Agustin Laiton Cubides
 */
public class ListaException extends Exception {
    public static final String fuera="fuera de rango";
    public ListaException(String message){
        super(message);
    }


}
