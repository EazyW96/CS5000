package Chapt9_Objects.and.Classes;

/**
 * LiveExample 9.11 gives an example that demonstrates how to use an array of
 * objects. The program summarizes the areas of an array of circles. The program
 * creates circleArray, an array composed of five Circle objects; it then
 * initializes circle radii with random values and displays the total area of
 * the circles in the array.*
 */
/**
 *
 * @author ciaon
 */
public class TotalArea {
  /** Main method */
  public static void main(String[] args) {
    // Declare circleArray
    Circle[] circleArray; // Circle defined in Listing 9.8

    // Create circleArray
    circleArray = createCircleArray();

    // Print circleArray and total areas of the circles
    printCircleArray(circleArray);
  }

  /** Create an array of Circle objects */
  public static Circle[] createCircleArray() {
    Circle[] circleArray = new Circle[5];

    for (int i = 0; i < circleArray.length; i++) {
      circleArray[i] = new Circle(Math.random() * 100);
    }

    // Return Circle array
    return circleArray;
  }

  /** Print an array of circles and their total area */
  public static void printCircleArray(Circle[] circleArray) {
    System.out.printf("%-30s%-15s\n", "Radius", "Area");
    for (int i = 0; i < circleArray.length; i++) {
      System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),
        circleArray[i].getArea());
    }

    System.out.println("-----------------------------------------");

    // Compute and display the result
    System.out.printf("%-30s%-15f\n", "The total areas of circles is",
      sum(circleArray));
  }

  /** Add circle areas */
  public static double sum(Circle[] circleArray) {
    // Initialize sum
    double sum = 0;

    // Add areas to sum
    for (int i = 0; i < circleArray.length; i++)
      sum += circleArray[i].getArea();

    return sum;
  }
}