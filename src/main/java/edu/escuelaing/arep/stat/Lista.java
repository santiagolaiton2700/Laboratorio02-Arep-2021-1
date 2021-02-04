package edu.escuelaing.arep.stat;

import javax.swing.*;


public class Lista {
    private Nodo inicio;
    private Nodo fin;
    private int longitud;

    /**
     * Constructor de la lista enlazada
     */
    public Lista(){
        inicio=null;
        fin=null;
        longitud=0;
    }

    /**
     * Metodo que confirma si la lista esta vacia
     * @return confirmación si esta vacia
     */
    public Boolean estaVacia(){
        return inicio==null;
    }

    /**
     * Metodo que agrega a lista y manda a crear los nodos
     * @param valor El valor que contiene cada nodo
     */
    public void agregar(double valor){
        Nodo siguiente;
        if(estaVacia()){
            inicio=new Nodo(valor);
            fin=inicio;
            longitud=longitud+1;
        }else if(!estaVacia()&&longitud==1){
            siguiente=new Nodo(valor,inicio,longitud);
            inicio.anadir(siguiente);
            fin=siguiente;
            longitud=longitud+1;
        }else{
            siguiente=new Nodo(valor,fin,longitud);
            fin.anadir(siguiente);
            fin=siguiente;
            longitud=longitud+1;
        }
    }

    /**
     * Metodo que informa la longitud de la lista enlazada
     * @return longitud de la lista
     */
    public int getLongitud() {
        return longitud;
    }

    /**
     * Metodo que informa el valor almacenado en cada nodo
     * @param indice la posicion que se desea consultar del nodo para saber el valor
     * @return el valor almacenado en dicho nodo
     * @throws ListaException
     */
    public double getValor(int indice) throws ListaException {
        Nodo examinar=inicio;
        Double numero=null;
        for(int i=0;i<longitud && numero==null;i++){
            if(examinar.getPosicion(indice)){
                numero=examinar.getValor();
            }else{
                examinar=examinar.getDerecha();
            }
        }
        if (numero==null){
            throw new ListaException(ListaException.fuera);
        }else{
            return numero;
        }

    }

    /**
     * Este metodo es para obtener el primer nodo que se creo para poder obtener el siquiente
     * @return primer elemento de la lista enlazada
     */
    public Nodo getInicio() {
        return inicio;
    }
}

