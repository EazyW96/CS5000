package Chapt_13_AbstractClassesAndInterfaces;

/**
 *
 * @author ciaon
 */
public class TestCompareTo {
    public static void main(String[] args) {
        System.out.println(Integer.valueOf(3).compareTo(Integer.valueOf(5)));
        System.out.println("ABC".compareTo("ABC")); // Compare "ABC" with "ABC"
        java.util.Date date1 = new java.util.Date(2324343434L);
        java.util.Date date2 = new java.util.Date(12343434L);
        System.out.println(date1.compareTo(date2));
    }
}
