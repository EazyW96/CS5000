// Introduction to Java programming and Data Structures, Daniel liang 12th edition.
// Class Term:              Spring 2024
// Name:                    Elliotte Wideman
// IDE:                     netBeans, 15
/** (Find the number of years) Write a program that prompts the user to enter the 
    minutes (e.g. 1 billion), and displays the maximum number of years and remaining
    days for the minute. For simplicity, assume that a year is 365 days. Here is a sample
    run:
    
            Enter the number of minutes: 1000000000
            1000000000 minutes is approximately 1902 years and 214 days**/
package Chapter2_Exercises;

import java.util.Scanner;
/**
 *
 * @author ciaon
 */
public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // get user input 
        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();
        
        // close scanner
        input.close();
        
        // Constants for calculations
        int minutesInADay = 24 * 60;
        int minutesInAYear = 365 * minutesInADay;

        // Calculate years and remaining days
        long years = minutes / minutesInAYear;
        long remainingMinutes = minutes % minutesInAYear;
        long days = remainingMinutes / minutesInADay;

        // Display the result
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
