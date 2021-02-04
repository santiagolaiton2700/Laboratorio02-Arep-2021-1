
package edu.escuelaing.arep.stat;

public class main{
    public static void main (String [] args) throws ListaException {
        Stat calculadora=new Stat("Recursos/numeros2.txt");
        System.out.println("El promedio de los numeros de la lista "+calculadora.mean());
        System.out.println("La desviacion estandar "+calculadora.stddev());
    }

}