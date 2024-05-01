/** Note: Any double value x can be rounded up to an integer using 
    (int) (x = 0.5). 
    Thus tax can be rounded up to two decimal places using (int) (tax * 100 + 0.5) / 100.0.**/
package Chapt2_Elementary.Programming;

import java.util.Scanner;
/**
 *
 * @author ciaon
 */
public class SalesTax {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();
        
        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + (int) (tax * 100) / 100.0);
    }
}
