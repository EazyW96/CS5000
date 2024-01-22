// Introduction to Java programming and Data Structures, Daniel liang 12th edition.
// Class Term:              Spring 2024
// Name:                    Elliotte Wideman
// IDE:                     netBeans
/* (Average speed in miles) Assume that a runner runs 14 kilometers in 45 minutes and 
    30 seconds. Write a program tha displays the average speed in miles per hour.
    (Note 1 mile is equal to 1.6 kilometers.*/


package Chapter1_Exercises;

public class Exercise_10 {
    public static void main(String[] args) {
        // Distance in kilometers
        double distanceInKilometers = 14.0;

        // Time in minutes and seconds
        double timeInMinutes = 45.0 + 30.0 / 60.0;

        // Conversion factor: 1 mile = 1.6 kilometers
        double milesPerKilometer = 1 / 1.6;

        // Calculate average speed in miles per hour
        double speedInMilesPerHour = (distanceInKilometers * milesPerKilometer) / (timeInMinutes / 60.0);

        // Display the result
        System.out.println("Average speed: " + speedInMilesPerHour + " miles per hour");
    }
}
