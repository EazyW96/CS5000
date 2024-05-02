/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapt_13_AbstractClassesAndInterfaces;

/**
 *
 * @author ciaon
 */
public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {
    /**Construct a Comparable Rectangle with specified properties */
    public ComparableRectangle(double width, double height) {
        super(width, height);
    }
    
    @Override // Override the compareTo method defined in Comparable
    public int compareTo(ComparableRectangle o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else 
            return 0;
    }
    
    @Override // Implement the toString method in GeometricObject
    public String toString() {
        return "Width: " + getWidth() + " Height: " + getHeight() +
                " Area: " + getArea();
    }
}
