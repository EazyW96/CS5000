package Patterns;

import java.util.Scanner;

/**
 *
 * @author ciaon
 */
public class NumberIncreasingPyramid {

    // Function to demonstrate pattern
    public static void printPattern(int n) {
        int i, j;
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            // inner loop to handle number of columns 
            for (j = 1; j <= i; j++) {
                // printing column values upto the row
                // value
                System.out.print(j + " ");
            }

            // print new line for each row
            System.out.println();
        }
    }

    // Driver function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();
        printPattern(n);
        input.close();
    }
}
