
package Elementary.Programming;

/**
 *
 * @author ciaon
 */
public class ComputeArea {
    public static void main(String[] args) {
        double radius;
        double area;
        
        
        // Step 1: read in radius 
        radius = 20.0;
        // Step 2: Compute Area
        area = radius * radius * 3.14159;
        // Step 3: Display the area 
        System.out.println("The area for the circle of radius " +
                radius + " is " + area);
    }
}
