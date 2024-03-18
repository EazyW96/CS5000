// Introduction to Java programming and Data Structures, Daniel liang 12th edition.
// Class Term:              Spring 2024
// Name:                    Elliotte Wideman
// IDE:                     netBeans, 15
/** 3.1 (Algebra: solve quadratic equations) The two roots of a quadratic equation ax^2 + bx + c = 0
        can be obtained using the following formula:
        
        r sub 1 = -b + square root of b^2 - 4ac / 2a and r sub 2 = -b - square root ob b^2 / 2a
        
        b^2-4ac is called the discriminanat of the quadratic equation. If it is positive, the 
        equation has two real roots. If it is zero, the quation has one root. If it is negative
        the equation has no real roots.
        
        Write a program that prompts the user to enter values for a, b, and c and displays the 
        result based on the discriminant. if the discriminanat is 0, displays one root. Ohterwise
        display "The equation has no real root." 
        
        Note: you can use Math.pow(x,0.5) to compute square root.**/
package Chapter3_Exercises;

import java.util.Scanner;
/**
 *
 * @author ciaon
 */
public class Exercise1 {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter values for a, b, and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        // Calculate discriminant
        double discriminant = b * b - 4 * a * c;
        
        // Check the discriminant and display the result
        if (discriminant > 0) {
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("The equation has two real roots: r1 = " + r1 + ", r2 = " + r2);
        }else if (discriminant == 0){
            double r = -b / (2* a);
            System.out.println("The equation has one real root: r = " + r);
        }else {
            System.out.println("The equation has no real root.");
        }
        input.close();
    }
    
}
