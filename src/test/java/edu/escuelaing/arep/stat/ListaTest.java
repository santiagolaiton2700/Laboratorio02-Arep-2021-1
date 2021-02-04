package edu.escuelaing.arep.stat;

import junit.framework.TestCase;

import java.util.ArrayList;

public class ListaTest extends TestCase {

    public void testList()throws Exception{
        ArrayList<Double>lista=new ArrayList<Double>();
        lista.add((double)20);
        lista.add((double)8);
        lista.add((double)11);
        lista.add((double)78);
        lista.add((double)1);
        lista.add((double)15);
        lista.add((double)14);
        Lista enlazada=new Lista();
        enlazada.agregar(20);
        enlazada.agregar(8);
        enlazada.agregar(11);
        enlazada.agregar(78);
        enlazada.agregar(1);
        enlazada.agregar(15);
        enlazada.agregar(14);
        double numero=0.0;
        for (int i=0;i<lista.size();i++){
            try{
               numero=enlazada.getValor(i);
            }catch (Exception e){
                assertTrue(false);
            }
            assertEquals(numero,lista.get(i));
        }

    }
    public void testUltimo()throws Exception{
        ArrayList<Double>lista=new ArrayList<Double>();
        lista.add((double)20);
        lista.add((double)8);
        lista.add((double)11);
        lista.add((double)78);
        lista.add((double)1);
        lista.add((double)15);
        lista.add((double)14);
        Lista enlazada=new Lista();
        enlazada.agregar(20);
        enlazada.agregar(8);
        enlazada.agregar(11);
        enlazada.agregar(78);
        enlazada.agregar(1);
        enlazada.agregar(15);
        enlazada.agregar(14);
        try{
            assertEquals(enlazada.getValor(6),lista.get(6));
        }catch (Exception e){
            assertFalse(true);
        }
    }
    public void testInicio()throws Exception{
        ArrayList<Double>lista=new ArrayList<Double>();
        lista.add((double)20);
        lista.add((double)8);
        lista.add((double)11);
        lista.add((double)78);
        lista.add((double)1);
        lista.add((double)15);
        lista.add((double)14);
        Lista enlazada=new Lista();
        enlazada.agregar(20);
        enlazada.agregar(8);
        enlazada.agregar(11);
        enlazada.agregar(78);
        enlazada.agregar(1);
        enlazada.agregar(15);
        enlazada.agregar(14);
        try {
            assertEquals(lista.get(0),enlazada.getValor(0));
        }catch (Exception e){
            assertFalse(true);
        }
    }
    public void testLongitud(){
        ArrayList<Double>lista=new ArrayList<Double>();
        lista.add((double)20);
        lista.add((double)8);
        lista.add((double)11);
        lista.add((double)78);
        lista.add((double)1);
        lista.add((double)15);
        lista.add((double)14);
        Lista enlazada=new Lista();
        enlazada.agregar(20);
        enlazada.agregar(8);
        enlazada.agregar(11);
        enlazada.agregar(78);
        enlazada.agregar(1);
        enlazada.agregar(15);
        enlazada.agregar(14);
        try {
            assertEquals(enlazada.getLongitud(),lista.size());
        }catch (Exception e){
            assertFalse(true);
        }
    }
    public void testNodoSiguiente()throws Exception{

        ArrayList<Double> lista=new ArrayList<Double>();
        lista.add((double)20);
        lista.add((double)8);
        lista.add((double)11);
        lista.add((double)78);
        lista.add((double)1);
        lista.add((double)15);
        lista.add((double)14);
        Lista enlazada=new Lista();
        enlazada.agregar(20);
        enlazada.agregar(8);
        enlazada.agregar(11);
        enlazada.agregar(78);
        enlazada.agregar(1);
        enlazada.agregar(15);
        enlazada.agregar(14);
        Nodo combrobar=enlazada.getInicio();
        try{
            assertEquals(combrobar.getDerecha().getValor(),lista.get(1));
        }catch (Exception e){
            assertFalse(true);
        }
    }

}
