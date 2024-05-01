package Chapt_13_AbstractClassesAndInterfaces;

/**
 *
 * @author ciaon
 * Abstract Class name is intalicized
 */
public abstract class GeometricObject {
    
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    
    /** Construct a default geometric object */
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }
    
    /** Construct a geometric object with color and filled value */
    protected GeometricObject (String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    
    
}
