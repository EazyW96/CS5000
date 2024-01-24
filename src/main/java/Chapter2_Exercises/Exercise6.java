// Introduction to Java programming and Data Structures, Daniel liang 12th edition.
// Class Term:              Spring 2024
// Name:                    Elliotte Wideman
// IDE:                     netBeans, 15
/** (Sum the digits in an integer) Write a program that reads an integer between 0 and 1000
    and adds all the digits in the integer. For example, if an integer is 932. The sum of all digits
    is 14.
    
    Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit.
    For instance. 932 % 10 = 2 and 932 / 10 = 93.
    
    Here is a sample run: 
    
    Enter a number between 0 and 1000: 999
    The sum of the digits is 27**/
package Chapter2_Exercises;
import java.util.Scanner;

/**
 *
 * @author ciaon
 */
public class Exercise6 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
    // Read a number
    System.out.print("Enter an integer between 0 and 1000: ");
    int number = input.nextInt();

    // Find all digits in number
    int lastDigit = number % 10;
    int remainingNumber = number / 10;
    int secondLastDigit = remainingNumber % 10;
    remainingNumber = remainingNumber / 10;
    int thirdLastDigit = remainingNumber % 10;

    // Obtain the sum of all digits
    int sum = lastDigit + secondLastDigit + thirdLastDigit;

    // Display results
    System.out.println("The sum of all digits in " + number
      + " is " + sum);
        
    }
}
