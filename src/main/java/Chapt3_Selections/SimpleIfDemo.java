/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapt3_Selections;
import java.util.Scanner;
/**
 *
 * @author ciaon
 */
public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        if(number % 5 == 0)
            System.out.println("HiFive");
        
        if(number % 2 == 0)
            System.out.println("Hieven");
    }
}
