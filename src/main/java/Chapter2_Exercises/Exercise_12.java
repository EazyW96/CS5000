// Introduction to Java programming and Data Structures, Daniel liang 12th edition.
// Class Term:              Spring 2024
// Name:                    Elliotte Wideman
// IDE:                     netBeans, 15
/** (physics: finding runway length) Given an airplanes's acceleration a and take-off
 * speed v, you can compute the minimum runway length needed for an airplane to
 * take off using the following formula:  *
 * length = v^2 / 2a  *
 * Write a program that prompts the user to enter v in meters/second (m/s) and the acceleration a in
 * meters/second squared (m/s^2), then, displays the minimum runway length.
 *
 * Enter speed and acceleration: 60 3.5
 * The minimum runway length for this airplane is 514.286 * */
package Chapter2_Exercises;

import java.util.Scanner;

/**
 *
 * @author ciaon
 */
public class Exercise_12 {

    public static void main(String[] args) {
        // Create scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double takeOffSpeed = input.nextDouble();
        double acceleration = input.nextDouble();

        // close scanner
        input.close();
        // Compute runway length
        double length = Math.pow(takeOffSpeed, 2) / (2 * acceleration);

        // Format the result to display up to 3 decimal places
        String formattedLength = String.format("%.3f", length);

        // Display results
        System.out.println("The minimum runway length for this airplane is " + formattedLength);
    }
}
