/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Vector;
 /*
 * @author ESTUDIANTE
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       int[]vector;
       vector=new int[12];
       SecureRandom sr= new SecureRandom();
       for(int i = 0; i < vector.length ;i++){
           vector[i]= sr.nextInt(1000000);
           System.out.println("");
      
           
       } 
             
       
              
}
    
    
}
