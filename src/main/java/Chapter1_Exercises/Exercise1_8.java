// Introduction to Java programming and Data Structures, Daniel liang 12th edition.
// Class Term:              Spring 2024
// Name:                    Elliotte Wideman
// IDE:                     netBeans
/** (Area and perimeter of a circle) write a program that displays the area and perimeter of a circle
 * that has a radius of 5.5 using the following formulas:
                        
                        perimeter = 2 * radius * pie
                        
                        area = radius * radius * pie.  **/

package Chapter1_Exercises;

/**
 *
 * @author ciaon
 */
public class Exercise1_8 {
    public static void main(String[] args) {
        
        // Given radius
        double radius = 5.5;
        
        // Constants 
        final double PI = 3.14159;
        
        // Calculate perimeter and area
        double perimeter = 2 * radius * PI;
        double area = radius * radius * PI;
        
        //Display the result
        System.out.println("Radius: " + radius);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
