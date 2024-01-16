// Introduction to Java programming and Data Structures, Daniel liang 12th edition.
// Class Term:              Spring 2024
// Name:                    Elliotte Wideman
// IDE:                     netBeans
/** (Population projection) The U.S. Census Bureau projects population based
on the following assumption:
* One birth every 7 seconds
* One death every 13 seconds 
* One new immigrant every 45 seconds
 
    Write a program to display the population for each of the next five years. 
    Assume that the current population is 312,032,486, and one year has 365 days. 
    Hint: in Java, if two integers perform division, the result is an integer. 
    The fractional part is truncated.
    
    For example, 5/4 is 1 (not 1.25) and 10/4 is 2 (not 2.5). To get an accurate 
    result with the fractional part, one of the values involved in the division must
    be a number with a decimal point. 
    
    For example, 5.0/4 is 1.25 and 10/ 4.0 is 2.5.
**/
package Chapter1_Exercises;

/**
 *
 * @author ciaon
 */
public class Exercise1_11 {
    public static void main(String[] args) {
        // Current population
        long currentPopulation = 312032486;
        
        // number of seconds in a year
        long secondsInYear = 365 * 24 * 60 * 60;
        
        // Birth, death, and immigrant rates per second
        long birthsPerSecond = secondsInYear /7;
        long deathsPerSecond = secondsInYear / 13;
        long immigrantsPerSecond = secondsInYear / 45;
        
        // Calculate population for the next five years
        for (int i = 1; i <= 5; i++) {
            currentPopulation += birthsPerSecond - deathsPerSecond + immigrantsPerSecond;
            
            // Display population for the current year
            System.out.println("Year: " + i + " Population = " + currentPopulation);
        }
    }
}
