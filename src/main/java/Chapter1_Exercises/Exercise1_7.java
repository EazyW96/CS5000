// Introduction to Java programming and Data Structures, Daniel liang 12th edition.
// Class Term:              Spring 2024
// Name:                    Elliotte Wideman
// IDE:                     netBeans
/** (Approximate pie) pie can be computed using the following formula.
 *
 * pie = 4 * (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + ...)
 *
 * Write a program that displays the result of 4 *( 1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11)
 *
 * and 4 * (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + (1/13)). Use 1.0 instead of 1 in your program.* */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter1_Exercises;

/**
 *
 * @author ciaon
 */
public class Exercise1_7 {

    public static void main(String[] args) {

        double piApproximation1 = 4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
        double piApproximation2 = 4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13));

        System.out.println("Approximation of pi (1): " + piApproximation1);
        System.out.println("Approximation of pi (2): " + piApproximation2);

    }
}
