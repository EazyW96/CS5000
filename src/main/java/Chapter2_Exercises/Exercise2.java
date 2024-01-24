// Introduction to Java programming and Data Structures, Daniel liang 12th edition.
// Class Term:              Spring 2024
// Name:                    Elliotte Wideman
// IDE:                     netBeans, 15
/** (Compute the volume of a cylinder) Write a program that reads in the radius
 * and length of a cylinder and computes the area and volume using the following
 * formula:
 *
 * area = radius * radius * PI
 * volume = area * length
 *
 * */
package Chapter2_Exercises;

import java.util.Scanner;

/**
 *
 * @author ciaon
 */
public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // constant for PI
        final double PI = 3.14159;
        // get user prompt for radius
        System.out.print("Enter the radius of and length cylinder: e.g. 5.5 12 ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        // compute the radius and volume
        double area = radius * radius * PI;
        double volume = area * length;

        //Display results
        System.out.println("The area is " + String.format("%.5f", area));
        System.out.println("The volume of the cylinder is " + String.format("%.5f", volume));

    }
}
