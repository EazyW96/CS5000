package Chapt_13_AbstractClassesAndInterfaces;

/**
 *
 * @author ciaon
 */
import java.util.*;
public class TestCalender {
    public static void main(String[] args) {
        
        Calendar calendar = new GregorianCalendar();
        
        System.out.println("Current Time is: " + new Date());
        
        System.out.println("Year:\t" + calendar.get(Calendar.YEAR) );
        System.out.println("MONTH:\t" + calendar.get(Calendar.MONTH) );
        System.out.println("DATE:\t" + calendar.get(Calendar.DATE) );
        System.out.println("HOUR:\t" + calendar.get(Calendar.HOUR) );
        System.out.println("HOUR OF DAY\t" + calendar.get(Calendar.HOUR_OF_DAY));
        
        System.out.println("MINUTE:\t" + calendar.get(Calendar.MINUTE));
        System.out.println("SECOND:\t" + calendar.get(Calendar.SECOND) );
        
        System.out.println("DAY OF WEEK:\t" + calendar.get(Calendar.DAY_OF_WEEK) );
        System.out.println("DAY OF MONTH:\t" + calendar.get(Calendar.DAY_OF_MONTH) );
        System.out.println("DAY OF YEAR:\t" + calendar.get(Calendar.DAY_OF_YEAR) );
        
        System.out.println("AM_PM:\t" + calendar.get(Calendar.AM_PM) );
        
        Calendar calendar1 = new GregorianCalendar(2001,8,11);
        System.out.println("September 11, 2001 is a " +
                dayNameOfWeek(calendar.get(Calendar.DAY_OF_WEEK)));
    }
    
    public static String dayNameOfWeek(int dayOfWeek) {
        switch(dayOfWeek) {
            case 1: return "Sunday";
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
            case 7: return "Saturday";
            default: return null;
        }
    }
}
