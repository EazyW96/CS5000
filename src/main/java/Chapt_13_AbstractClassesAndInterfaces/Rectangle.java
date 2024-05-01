/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapt_13_AbstractClassesAndInterfaces;

/**
 *
 * @author ciaon
 */
public class Rectangle extends GeometricObject {

    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Set a new width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Set a new height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    /**
     * Return area
     */
    public double getArea() {
        return width * height;
    }

    @Override
    /**
     * Return perimeter
     */
    public double getPerimeter() {
        return 2 * (width + height);
    }
    
    @Override /** Return a string representation of Rectangle object */
    public String toString() {
        return super.toString() + " width: " + width + " height: " + height;
    }
}
