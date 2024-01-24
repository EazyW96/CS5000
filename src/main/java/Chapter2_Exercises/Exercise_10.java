// Introduction to Java programming and Data Structures, Daniel liang 12th edition.
// Class Term:              Spring 2024
// Name:                    Elliotte Wideman
// IDE:                     netBeans, 15
/** (Science: calculating energy) Write a program that calculates the energy
    needed to heat water from an initial temperature to a final temperature. 
    Your program should prompt the user to enter the amount of water in kilograms 
    and the initial and final temperature of the water. The formula to compute the 
    energy is 
    
    Q = M * (finalTemperature - initialTemperature) * 4184 
    
    Where M is the weight of water in kilograms, initial and final temperatures are in 
    degrees Celsius and energy Q is measured in joules. Here is a sample run:
    
    Enter the amount of water in kilograms: 55.5
    
    Enter the final temperature: 3.5 
    
    Enter the final temperature: 10.5
    
    The energy needed is 1625484.0**/
package Chapter2_Exercises;

import java.util.Scanner;
/**
 *
 * @author ciaon
 */
public class Exercise_10 {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter amount of water in kilograms
        System.out.print("Enter the amount of water in kilograms: e.g. 45.2 \t");
        double amountOfWater = input.nextDouble();
        
        System.out.print("Enter the initial temperature: e.g. 5.5: \t\t ");
        double initialTemperature = input.nextDouble();
        
        System.out.print("Enter the final temperature: e.g. 9.5 \t\t\t");
        double finalTemperature = input.nextDouble();
        
        // close scanner 
        input.close();
        
        // Compute energy
        double measureInJoules = amountOfWater * (finalTemperature - initialTemperature) * 4184;
        
        // display results
        System.out.println("The energy needed is: \t\t\t\t\t" + measureInJoules);
        
    }
}
