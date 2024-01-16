// Introduction to Java programming and Data Structures, Daniel liang 12th edition.
// Class Term:              Spring 2024
// Name:                    Elliotte Wideman
// IDE:                     netBeans
/*(Area and perimeter of a rectangle) Write a program that displays the area and perimeter of a rectangle 
with a width of 4.5 and a height of 7.9 using the following formula.

                area = width * height

*/
package Chapter1_Exercises;

/**
 *
 * @author ciaon
 */
public class Exercise1_9 {
    public static void main(String[] args) {
        
        // Given width and height
        double width = 4.5;
        double height = 7.9;
        
        // calculate width * height
        double area = width * height;
        
        // print area 
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("The area of " + width + " * " + height + " = " + area);
    }
}
