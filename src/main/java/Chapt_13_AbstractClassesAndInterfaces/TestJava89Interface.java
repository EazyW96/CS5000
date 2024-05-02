
package Chapt_13_AbstractClassesAndInterfaces;

/**
 *
 * @author ciaon
 */
import java.util.*;
public class TestJava89Interface implements Java89Interface {
    public static void main(String[] args) {
        TestJava89Interface obj = new TestJava89Interface();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        
        System.out.println("Hello, " + name + "!");
        
        // Calling default method
        obj.doSomething();
        
        // Calling static method
        int value = Java89Interface.getAValue();
        System.out.println("Value from static method: " + value);
        input.close();
    }
}
