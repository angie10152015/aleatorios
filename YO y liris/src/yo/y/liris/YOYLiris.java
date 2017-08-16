/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yo.y.liris;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class YOYLiris {

    int vInt;
  float vFloat;
  String vstr;
    public static void main(String[] args) {
         int vInt;
         float vFloat;
         String vstr;
         boolean b1,b2;
         
         Scanner vscan=new Scanner (System.in);
         
         vInt= 5+2;
         System.out.println("vInt= 5 + 2: " +vInt);
         vInt= 5 - 2;
         System.out.println("vInt= 5 - 2: " +vInt);
         vInt= 5 * 2;
         System.out.println("vInt= 5 * 2: " +vInt);
         vInt= 5 % 2;
         System.out.println("vInt= 5 % 2: " +vInt);
         vInt= 5 ^ 2;
         System.out.println("vInt= 5 ^ 2: " +vInt);
         
         vFloat= 5+2;
         System.out.println("vInt= 5 + 2: " +vFloat);
         vFloat= 5 - 2;
         System.out.println("vInt= 5 - 2: " +vFloat);
         vFloat= 5 * 2;
         System.out.println("vInt= 5 * 2: " +vFloat);
         vFloat= 5 % 2;
         System.out.println("vInt= 5 % 2: " +vFloat);
         vFloat= 5 ^ 2;
         System.out.println("vInt= 5 ^ 2: " +vFloat);
         
         vstr= "David";
         vstr=vstr + "Williams";
         System.out.println("Cadena: "+vstr);
         
         b1= true;
         b2= false;
         System.out.println("b1 and b2: "+ (b1 && b2));
         System.out.println("b1 or b2: "+ (b1 || b2));
         System.out.println("not b1: "+ (!b1));
         System.out.println("not b2: "+ (!b2));
         
         System.out.println("introduzca un texto:");
         System.out.println(vscan.nextLine());
         
          //CICLOS
         int i;
         for ( i=0; i<5; i++){
             System.out.println(i);
     }
         i= 5;
         i= ++i + 2;
         System.out.println(i);
         i= 5;
         i= i++ + 2;
         System.out.println(i);
         
         int a= 33;
         int b;
         
         
         System.out.println("a");
         b= a << 2;
         System.out.println("b");
         b= a >> 2;
         System.out.println("b");
         b= a & 2;
         System.out.println("b");
         
         
          //CICLOS
        
         
         for ( i=0; i<5; i++){
             if (i==3)
                 continue;
             System.out.println(i);
             
     }
         System.out.println("i");
         i=2;
         while (i<10){
             System.out.println("i");
             i+=2;
         }
         i=2;
                 do{
                     System.out.println("i");
                     i +=2;
                     
                 }while (i<10);
                 if (i<=8){
                     System.out.println("menor igual que 8");
                 }else if (i>10){
                     System.out.println("mayor a 10");
                 }else{
                     System.out.println("entre 9 y 10");
                 }
                 switch (i){
                     case 8:
                         System.out.println("igual que 8");
                         break;
                          case 10:
                         System.out.println("igual que 10");
                          break;
                          default:
                           System.out.println("diferente");    
                         
                 }
} 
        // TODO code application logic here
    }
    

