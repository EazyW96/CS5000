// Introduction to Java programming and Data Structures, Daniel liang 12th edition.
// Class Term:              Spring 2024
// Name:                    Elliotte Wideman
// IDE:                     netBeans

/** (Average speed in kilometers) Assume that a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. Write a program that displays the average speed in
 kilometers per hour. (Note 1 mile is equal to 1.6 kilometers.) **/
 

package Chapter1_Exercises;


public class Exercise_12 {
    public static void main(String[] args) {
        // Distance in miles 
        double distanceInMiles = 24.0;
        
        // Time in hours 
        double timeInHours = 1.0 + (40.0 / 60.0) + (35.0 / 3600.0);
        
        // Conversion factor: 1 mile = 1.6 kilometers
        double kilometersPerMile = 1.6;
        
        // Calculate average speed in kilometers per hour
        double speedInKilometersPerHour = distanceInMiles * kilometersPerMile / timeInHours;
        
        // Display result
         System.out.println("Average speed: " + speedInKilometersPerHour + " kilometers per hour");
    }
}
