// Introduction to Java programming and Data Structures, Daniel liang 12th edition.
// Class Term:              Spring 2024
// Name:                    Elliotte Wideman
// IDE:                     netBeans, 15
/** (Convert celsius to Fahrenheit) Write a program that reads a Celsius degree
    in a double value from the console. then converts it to fahrenheit, and display 
    the resule. The formula for the conversion is as follows:
    
    
    fahrenheit = (9 / 5) * celsuis + 32
    Hint: in java, 9 / 5 is 1, but 9.0 / 5 is 1.8
    Here is a sample run:
    Enter a degree in Celsius: 43.8
    43.8 Celsius is 110.3 Fahrenheit  **/


package Chapter2_Exercises;
import java.util.Scanner;
/**
 *
 * @author ciaon
 */
public class Exercise2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Step 1: get double value Celsius from user
        System.out.print("Enter a degree in Celsius: e.g. 23.9  ");
        double celsius = input.nextDouble();
        
        double fahrenheit = (9.0 / 5) * celsius + 32;
        
        System.out.println(celsius + " celsius is " + fahrenheit + " Fahrenheit"  );
    }
}
