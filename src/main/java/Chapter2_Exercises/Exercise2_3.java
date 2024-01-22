// Introduction to Java programming and Data Structures, Daniel liang 12th edition.
// Class Term:              Spring 2024
// Name:                    Elliotte Wideman
// IDE:                     netBeans, 15
/** (Convert feet into meters) Write a program that reads a number in feet,
 * converts it to meters, and displays the result. One foot is 0.0305 meters.
 * Here is a sample run.* */
package Chapter2_Exercises;

import java.util.Scanner;

/**
 *
 * @author ciaon
 */
public class Exercise2_3 {

    public static void main(String[] args) {
        // Constant for the conversion factor
        final double FEET_TO_METERS_CONVERSION = 0.305;

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number in feet
        System.out.print("Enter a length in feet: ");
        double feet = input.nextDouble();

        // Convert feet to meters
        double meters = feet * FEET_TO_METERS_CONVERSION;

        // Display the result
        System.out.println(feet + " feet is equal to " + meters + " meters.");
    }
}
