/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapt_12_Exception_handling;

import java.util.Scanner;

/**
 *
 * @author ciaon
 */
public class Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter two integers
        System.out.print("Enter two integers:  ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        
        System.out.println(number1 + " / " + number2 + " is " + 
                (number1 / number2));
    }
}
