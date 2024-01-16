// Introduction to Java programming and Data Structures, Daniel liang 12th edition.
// Class Term:              Spring 2024
// Name:                    Elliotte Wideman
// IDE:                     netBeans
/* (Algebra: solve 2 * 2 linear equations) You can use Cramer's rule to solve
    the following 2 * 2 system of linear equatino provided that ad -bc is not 0:

                    ax + by = e       ed - bf       af - ec
                                 x =  -------   y = -------
                    cx + dy = f       ad - bc       ad - bc

    Write a program tha solves the following equation and displays the value for x and 
    y: (Hint: replace the symbols in the formula with numbers to compute x and y. this 
    exercise can be done in chapter without using materials in later chapters.) 


                3.4x + 50.2y = 44.5
                    
                2.1x + .55y = 5.9     */

package Chapter1_Exercises;

/**
 *
 * @author ciaon
 */
public class Exercise1_13 {
    public static void main(String[] args) {
               // Coefficients of the equations
        double a = 3.4, b = 50.2, c = 2.1, d = 0.55, e = 44.5, f = 5.9;

        // Calculate the determinant (ad - bc)
        double determinant = a * d - b * c;

        // Check if the system of equations is solvable
        if (determinant != 0) {
            // Calculate the values of x and y using Cramer's rule
            double x = (e * d - b * f) / determinant;
            double y = (a * f - e * c) / determinant;

          // Display the results with two decimal places
            System.out.printf("Solution:%n");
            System.out.printf("x = %.2f%n", x);
            System.out.printf("y = %.2f%n", y);
        } else {
            System.out.println("The system of equations has no solution.");
        }
    }
}
