package Chapt_18_Recursion;


/**
 *
 * @author ciaon
 */
import java.util.Scanner;

public class Main {
    
    public static String findBinary(int decimal, StringBuilder breakdown) {
        if (decimal == 0)
            return breakdown.toString();
        
        int remainder = decimal % 2;
        breakdown.append(decimal).append(" / 2 = ").append(decimal / 2).append(", Remainder = ").append(remainder).append("\n");
        return findBinary(decimal / 2, breakdown);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        StringBuilder breakdown = new StringBuilder();
        String binary = findBinary(decimal, breakdown);

        System.out.println("\nBinary equivalent: " + binary);
        System.out.println("Breakdown:\n" + breakdown);
    }
}
