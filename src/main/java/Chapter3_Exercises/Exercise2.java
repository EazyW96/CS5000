// Introduction to Java programming and Data Structures, Daniel liang 12th edition.
// Class Term:              Spring 2024
// Name:                    Elliotte Wideman
// IDE:                     netBeans, 15
/** (Game add three numbers) The program in codeAnimation 3.1 AdditionQuiz.java
    generates two integers and prompts the user to enter the sum of these two integers.
    Revise the program to generate three single-digit integers and prompt the user to 
    enter the sum of three integers.**/
package Chapter3_Exercises;

import java.util.Scanner;

/**
 *
 * @author ciaon
 */
public class Exercise2 {
    public static void main(String[] args) {
        // generate three random integers
        int digit1 = (int)(Math.random() * 10);
        int digit2 = (int)(Math.random() * 10);
        int digit3 = (int)(Math.random() * 10);
        
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is the sum of " + digit1 + " + " + digit2 + " + " + digit3 + " = " );
        
        int answer = input.nextInt();
        
        System.out.println( digit1+  " + " + digit2 + " + " + digit3 + " = " + answer + " is " +
                (digit1 + digit2 + digit3 == answer));
    }
}
