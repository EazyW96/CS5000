package Elementary.Programming;

import java.util.Scanner;
/**
 *
 * @author ciaon
 */
public class ComputeChange {
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner(System.in);
        
        // prompt user to enter amount as decimal
        System.out.print("Enter the amount as decimal, e.g. 11.56  ");
        double amount = input.nextDouble();
        
        // Convert the amount into cents
        int remainingAmount = (int)(amount * 100);
        
        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        
        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        
        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        
        // Find the number of nickles in the remaining amount
        int numberOfNickles = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        
        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;
        
        // Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickles + " nickles");
        System.out.println(" " + numberOfPennies + " pennies");
        
    }
}
