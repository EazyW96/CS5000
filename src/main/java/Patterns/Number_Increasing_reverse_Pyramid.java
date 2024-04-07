/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patterns;

/**
 *
 * @author ciaon
 */
public class Number_Increasing_reverse_Pyramid {

    // Function to demonstrate pattern
    public static void printPattern(int n) {
        int i, j;
        // outer loop to handle number of rows
        for (i = n; i >= 1; i--) {
            // inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                // printint coljumn values upto the row 
                // value
                System.out.print(j + " ");
            }

            // print new line for each row
            System.out.println();
        }
    }

// Driver Function 
    public static void main(String[] args) {
        int n = 6;
        printPattern(n);
    }
}
