package edu.escuelaing.arep.stat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class Stat {
    private Lista numeros;

    /**
     * Contructor para la calculadora sin archivo de texto
     */
    public Stat(){
        numeros=new Lista();
    }

    /**
     * Constructor para la calculadora que necesita archivo de texto y agregar los numeros leidos a la lista.
     * @param direccion el nombre del archivo de la prueba
     */
    public Stat(String direccion){
        numeros=new Lista();

        try{
            BufferedReader lectura=new BufferedReader(new FileReader(direccion));
            Double temporal;
            String bfRead;
            while ((bfRead = lectura.readLine())!=null) {
                temporal=Double.parseDouble(bfRead);
                numeros.agregar(temporal);
            }

        }catch (Exception e){

        }


    }


    /**
     * Metodo que calcula el promedio de los numeros de la lista enlazada
     * @return promedio de los numeros de la lista
     * @throws ListaException Clase de excepciones creada
     */
    public double mean()throws ListaException{
        int redondear=2;
        double suma=0.0;
        int longitud=numeros.getLongitud();
        try{
            for (int i=0;i<longitud;i++){
                suma=suma+numeros.getValor(i);
            }
            Double enviar=suma/longitud;
            return operacionMeanYstddev(enviar,redondear);
        }catch (ListaException exception) {
            throw new ListaException(ListaException.fuera);
        }
    }

    /**
     * Metodo realizado para simplificar operacion que hay en comun entre el calculo del promedio y desviación estandar
     * @param numero de cual se va a hacer la operación
     * @param redondeo las cifras significativas que voy a tener encuenta para el redondeo
     * @return El promedio de todos los datos de lista enlazada
     */
    public Double operacionMeanYstddev(double numero,int redondeo){
        double respuesta;
        respuesta=numero*Math.pow(10,redondeo);
        respuesta=Math.round(respuesta);
        respuesta=respuesta/Math.pow(10,redondeo);
        return respuesta;

    }

    /**
     * Metodo que calcula la desviación estandar
     * @return La desviación estandar calculada de los datos de la lista enlazada
     * @throws ListaException clase creada para excepciones de lista
     */

    public double stddev() throws ListaException {
        double listaPromedio=mean();
        double suma=0.0;
        int longitud= numeros.getLongitud();
        for(int i=0;i<longitud;i++){
            suma=suma+(Math.pow((numeros.getValor(i)-listaPromedio),2));
        }
        double enviar=Math.sqrt(suma/(longitud-1));
        return operacionMeanYstddev(enviar,2);
    }

    public void anadirNumero(double numero){
        numeros.agregar(numero);
    }
}
