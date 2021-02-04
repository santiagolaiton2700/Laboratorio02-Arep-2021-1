package edu.escuelaing.arep.stat;

/**
 * Clase que representa al objeto nodo
 * @author Santiago Agustin Laiton Cubides
 */
public class Nodo {
    public double valor;
    public Nodo derecha ;
    public int indice;

    /**
     * Contructor del nodo cuando no hay ningún nodo en la lista
     * @param valor numero que se almacenara en el nodo
     */
    public Nodo(double valor){
        this.valor=valor;
        derecha=null;
        indice=0;
    }
    /**
     * Contructor del nodo
     * @param valor El numero que se almacenara en el nodo
     * @param derecha La conexion de este nodo con el siguiente
     * @param indice La posicion del nodo en la lista doblemente
     */
    public Nodo(double valor,Nodo derecha,int indice){
        this.valor=valor;
        this.derecha=derecha;
        this.indice=indice;
        
    }

    /**
     * Metodo que va unir a los nodos
     * @param siguiente el nodo al cual será enlazado
     */
    public void anadir(Nodo siguiente){
        derecha=siguiente;
    }

    /**
     * Metodo que devuelve el valor con el que fue creado dicho nodo
     * @return el valor del nodo
     */
    public double getValor() {
        return valor;
    }

    /**
     *
     * @param indice Valor para comprobar el indice con el que se necesita cuando se esta calculando el promedio y la desviación estandar
     * @return Si es verdad el indice que se esta buscando corresponde a la posicion que ocupa en la lista
     */

    public boolean getPosicion(int indice) {
        return this.indice == indice;
    }

    /**
     * Metodo que informa el nodo enlazado al que se esta ejecutando
     * @return el siguiente nodo enlazado
     */
    public Nodo getDerecha() {
        return derecha;
    }


}
