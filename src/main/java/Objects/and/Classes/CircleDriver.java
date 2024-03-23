/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects.and.Classes;

/**
 *
 * @author ciaon
 */
public class CircleDriver {
    public static void main(String[] args) {
        Circle1 circleOne = new Circle1();
        Circle1 circleTwo = new Circle1();
        
        System.out.println(circleOne.getRadius());
        System.out.println(circleTwo.getRadius());
        circleOne.setRadius(30);
        circleTwo.setRadius(50);
        
        System.out.println(circleOne.getRadius());
        System.out.println(circleTwo.getRadius());
        
        System.out.println(circleOne.getArea());
        System.out.println(circleTwo.getArea());
        
        System.out.println(circleOne);
        System.out.println(circleTwo);
        
        if (circleOne.radiusGreater(circleTwo)) {
            System.out.println("circleOne has a larger radius.");
        }
        else {
            System.out.println("circleTwo has a larger radius");
        }
    }
}
