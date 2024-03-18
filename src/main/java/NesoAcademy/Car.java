/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NesoAcademy;

/**
 *
 * @author ciaon
 */
public class Car {

    public static void main(String[] args) {



        /* 
              1
              2 1 
              3 2 1
              4 3 2 1
              5 4 3 2 1
              6 5 4 3 2 1
        */      

        for(int row = 1; row <=6; row++) 
        {
           for(int col = row; col <= row; col++ ){
               System.out.println(col + " ");
           }   
         System.out.println();    
        }
        

  }
}
