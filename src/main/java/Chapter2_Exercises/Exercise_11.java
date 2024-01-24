// Introduction to Java programming and Data Structures, Daniel liang 12th edition.
// Class Term:              Spring 2024
// Name:                    Elliotte Wideman
// IDE:                     netBeans, 15
/** (Population projection) Rewrite Programming Exercise 1.11 to prompt the user to enter the number
    of years and display the population after the number of years. Use the hint in programming Exercise
    1.11 for this program Here is a sample Run of the program;
    
    Enter the number of years: 5
    The population in 5 years is 325932969   **/
package Chapter2_Exercises;

import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Initial population
        long currentPopulation = 312032486;

        // Number of seconds in a year
        long secondsInYear = 365 * 24 * 60 * 60;

        // Birth, death, and immigrant rates per second
        long birthsPerSecond = secondsInYear / 7;
        long deathsPerSecond = secondsInYear / 13;
        long immigrantsPerSecond = secondsInYear / 45;

        // Prompt user to enter the number of years
        System.out.print("Enter the number of years: ");
        int numberOfYears = input.nextInt();

        // Close the scanner
        input.close();

        // Calculate population after the specified number of years
        for (int i = 1; i <= numberOfYears; i++) {
            currentPopulation += birthsPerSecond - deathsPerSecond + immigrantsPerSecond;

            // Display population only for the fifth year
            if (i == 5) {
                System.out.println("Year: " + i + " Population = " + currentPopulation);
            }
        }
    }
}