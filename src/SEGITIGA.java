/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PauL
 */
public class SEGITIGA {
    public static void main(String[] args) {
        for (int i = 0 ; i < 5 ;i++ ){
           for(int k = 0 ; k <((5/2)- i);k++){
               System.out.print("*");
           }
           for(int j = (i+1) ; j <= i+2 ; j++){
              System.out.print((j)+" ");
           }
           
           
           System.out.println(" ");
       }
    }
}
