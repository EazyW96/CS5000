// Introduction to Java programming and Data Structures, Daniel liang 12th edition.
// Class Term:              Spring 2024
// Name:                    Elliotte Wideman
// IDE:                     netBeans, 15
/** (Current time) Listing 2.7 ShowCurrentTime.java gives a program that displays
    the current time in GMT. Revise the program so it prompts the user to enter the
    time zone offset to GMT and displays the time in the specified time zone. Here is 
    a sample run:
    
                enter the time zone offset to GMT: -5
                The current time is 4:50:34  **/
package Chapter2_Exercises;

import java.util.Scanner;
/**
 *
 * @author ciaon
 */
public class Exercise8 {
    public static void main(String[] args) {
    // Create Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the time zone offset to GMT
        System.out.print("Enter the time zone offset to GMT: ");
        int timeZoneOffset = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Calculate the total seconds, minutes, and hours
        long totalSeconds = totalMilliseconds / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;

        // Calculate the current second, minute, and hour in the specified time zone
        long currentSecond = totalSeconds % 60;
        long currentMinute = totalMinutes % 60;
        long currentHour = (totalHours + timeZoneOffset) % 24;

        // Display the current time in the specified time zone
        System.out.println("The current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond + " GMT");
    }
}
