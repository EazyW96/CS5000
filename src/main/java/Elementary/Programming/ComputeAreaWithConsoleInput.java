package Elementary.Programming;
import java.util.Scanner;
/**
 *
 * @author ciaon
 */
public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // prompt the user to enter a radius
        System.out.print("Enter a number for the radius: ");
        double radius = input.nextDouble();
        
        // Compute area
       // double area = radius * radius * 3.14159;
        if (radius < 0){                                // selection statement 
            System.out.println("Incorrect input");
        }else{
            double area = radius * radius * 3.14159;
            System.out.println("Area is " + area);
        }
        // Display results
       // System.out.println("The area for the circle of radius " +
            //    radius + " is " + area);
    }
}
