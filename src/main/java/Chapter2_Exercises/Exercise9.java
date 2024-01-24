// Introduction to Java programming and Data Structures, Daniel liang 12th edition.
// Class Term:              Spring 2024
// Name:                    Elliotte Wideman
// IDE:                     netBeans, 15
/** (Physics: acceleration) Average acceleration is defined as the change of velocity
    divided by the time taken to make the change, as given by the following formula:
            
                    a = v sub1 - v sub 0 / t 
                 
     Write a program that prompts the user to enter the starting velocity v sub 0 in meters/second, 
     the ending velocity v sub 1 in meters/second, and the time span t in seconds, then display the 
     average acceleration. Here is a sample run:
     
     Enter v0, v1, and t: 5.5 50.9 4.5
     The average acceleration is 10.0889  **/
package Chapter2_Exercises;

import java.util.Scanner;
/**
 *
 * @author ciaon
 */
public class Exercise9 {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner input = new Scanner(System.in);
        
        // prompt the user to enter velocity0, velocity1, and time
        System.out.print("Enter velocity0, velocity1, and time: ");
        double velocity0 = input.nextDouble();
        double velocity1 = input.nextDouble();
        double time = input.nextDouble();
        
        // close the scanner to prevent resourse leak
        input.close();
        
          // Calculate the average acceleration using the formula
        double acceleration = (velocity1 - velocity0) / time;

        // Format the result and display
        System.out.printf("The average acceleration of %.2f and %.2f = %.4f\n",
                velocity1, velocity0, acceleration);
    }
}
