// Introduction to Java programming and Data Structures, Daniel liang 12th edition.
// Class Term:              Spring 2024
// Name:                    Elliotte Wideman
// IDE:                     netBeans, 15
/** (Financial application: calculate tips) Write a program that reads the subtotal
    and the gratuity rate, then computes the gratuity and total. For example, if the 
    user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
    as gratuity and $11.5 as total. Here is a sample run:
    
        enter the subtotal and gratuity rate: 10 15
        The gratuity is $1.5 and total is $11.5**/
package Chapter2_Exercises;

import java.util.Scanner;
/**
 *
 * @author ciaon
 */
public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       
       System.out.print("Enter subtotal and gratuity rate: ");
       // Enter subtotal and gratuity rate
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        
        // Close the Scanner to avoid resource leak
        input.close();

        // Calculate gratuity and total
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;

        // Display the result
        System.out.printf("The gratuity is $%.2f and total is $%.2f%n", gratuity, total);
        
    }
}
