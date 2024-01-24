// Introduction to Java programming and Data Structures, Daniel liang 12th edition.
// Class Term:              Spring 2024
// Name:                    Elliotte Wideman
// IDE:                     netBeans, 15
/** (Convert pounds into kilograms) Write a program that converts pounds into 
    kilograms. The program prompts the user to enter a number in pounds, converts 
    it to kilograms, and displays the result. one pound is 0.454 kilograms. Here is a 
    sample run:   
    
        Enter a number in pounds: 55.5
        55.5 pounds is 25.197 kilograms**/
package Chapter2_Exercises;

import java.util.Scanner;
/**
 *
 * @author ciaon
 */
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter number for pounds
        System.out.print("Ente number for pounds: e.g. 65.7: ");
        double pounds = input.nextDouble();
        
        // Close scanner
        input.close();
        
        // Convert pounds to kilograms (1 pound = 0.454 kilograms)
        double kilograms = pounds * 0.454;

        // Display the result
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}
