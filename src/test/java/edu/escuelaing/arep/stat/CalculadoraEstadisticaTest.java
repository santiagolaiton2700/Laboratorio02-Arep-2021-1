package edu.escuelaing.arep.stat;

import junit.framework.TestCase;

public class CalculadoraEstadisticaTest extends TestCase {
    /**
     * Prueba que da el promedio de unos datos creados
     */
    public void testPromedio(){
        Stat calculadora=new Stat();
        calculadora.anadirNumero(14);
        calculadora.anadirNumero(15);
        calculadora.anadirNumero(16);
        calculadora.anadirNumero(12);
        calculadora.anadirNumero(17);
        calculadora.anadirNumero(13);
        try{
            assertEquals(calculadora.mean(),14.5);
        }catch (ListaException e){
            assertFalse(true);
        }

    }
    /**
     * Prueba que da la desviacion estandar de datos creados
     */
    public void testDesviacionEstandar(){
        Stat calculadora=new Stat();
        calculadora.anadirNumero(14);
        calculadora.anadirNumero(15);
        calculadora.anadirNumero(16);
        calculadora.anadirNumero(12);
        calculadora.anadirNumero(17);
        calculadora.anadirNumero(13);
        try{
            assertEquals(calculadora.stddev(),1.87);
        }catch (Exception e){
            assertFalse(true);
        }
    }
    /**
     * Prueba que da el primedio de la columna uno del pdf
     */
    public void testPromedioColumna1(){
        Stat calculadora=new Stat("Recursos/numeros.txt");
        try{
            assertEquals(calculadora.stddev(),572.03);
            assertEquals(calculadora.mean(),550.6);
        }catch (Exception e){
            assertFalse(true);
        }
    }
    /**
     * Prueba que da la desviacion estandar  de la columna uno del pdf
     */
    public void testDesviacionColumna1(){
        Stat calculadora=new Stat("Recursos/numeros.txt");
        try{
            assertEquals(calculadora.stddev(),572.03);
        }catch (Exception e){
            assertFalse(true);
        }
    }

    /**
     * Prueba que da la desviacion de mas de 100 datos
     */
    public void testCiendatosDesviacion(){
        Stat calculadora=new Stat("Recursos/numeros3.txt");
        try{
            assertEquals(calculadora.stddev(),14087.06);
        }catch (Exception e){
            assertFalse(true);
        }
    }
    /**
     * Prueba que da el promedio de mas de 100 datos
     */
    public void testCiendatosPromedio(){
        Stat calculadora=new Stat("Recursos/numeros3.txt");
        try{
            assertEquals(calculadora.mean(),4762.61);
        }catch (Exception e){
            assertFalse(true);
        }
    }
    /**
     * Prueba que da la desviacion estandar de la columna dos del pdf
     */
    public void testDesviacionColumna2(){

        Stat calculadora=new Stat("Recursos/numeros2.txt");
        try{
            assertEquals(calculadora.stddev(),62.26);
        }catch (Exception e){
            assertFalse(true);
        }
    }
    public void testPromedioColumna2(){
        Stat calculadora=new Stat("Recursos/numeros2.txt");
        try{
            assertEquals(calculadora.mean(),60.32);
        }catch (Exception e){
            assertFalse(true);
        }
    }
}
