/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapt9_Objects.and.Classes;

/**
 *
 * @author ciaon
 */
public class Circle1 {
    public double radius;
    
    public Circle1() {
        this(10);
    }
    
    public Circle1(double radius) {
        this.radius = radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double getArea() {
        return radius * radius * Math.PI;
    }
    
    public String toString() {
        return "radius: " + radius + " area: " + getArea();
    }
    
    public boolean radiusGreater(Circle1 c) {
        if (this.radius > c.radius) {
            return true;
        }
        else{
            return false;
        }
    }
}
