/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Arrays;

/**
 *
 * @author ESTUDIANTE
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ORDENAR UN VECTOR
        
        int[] numero ={15,18,95,35,2,8,130,31,9,12};
        int[] num2=new int [10];
               Arrays.fill(num2, 35); //fill:permite llenar el vector con un numero
               Arrays.sort(numero); //sort:permite ordenar un vector
               for(int n:numero){
               System.out.println(n + ",");
               
               
               
               }
               System.out.println("\n");
        
               
               
               //*********************************************************
              
               int [] num3 =new int[num2.length];
               boolean vb = Arrays.equals(num2,num3); //Comparando dos vectores
               System.out.println("iguales : " + vb);
               
               int pos= Arrays.binarySearch(numero, 35); //buscar la posicion del numero 35
               if(pos>=0)
               {
                   System.out.println("se encuentra en la posicion: " + pos);
                  
               }
               
               else{
               
               System.out.println("no se encuentra");
               
               }
    }
    
}
