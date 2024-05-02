package Chapt_13_AbstractClassesAndInterfaces;

/**
 *
 * @author ciaon
 */
public interface Java89Interface {
    /** default method in java 8*/
    public default void doSomething() {
        System.out.println("Do Something");
    }
    
    /** static method in Java 8 */
    public static int getAValue() {
        return 0;
    }
    
    /** private static method Java 9 */
    private static int getAStaticValue() {
        return 0;
    }
    
    /** private instance method Java 9 */
    private void performPrivateAction() {
        
    }
}
