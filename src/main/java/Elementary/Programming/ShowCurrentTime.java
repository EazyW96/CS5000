/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Elementary.Programming;

/**
 *
 * @author ciaon
 */
public class ShowCurrentTime {
    public static void main(String[] args) {
        // obtain the total milliseconds since midnight, jan 1 1970
        long totalMilliseconds = System.currentTimeMillis();
        
        // obtain the total seconds since midnight, jan 1 1970
        long totalSeconds = totalMilliseconds / 1000;
        
        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;
        
        // obtain the total minutes
        long totalMinutes = totalSeconds / 60;
        
        // Compute the current minute in the hour 
        long currentMinute = totalMinutes % 60;
        
        // obtain the total hours 
        long totalHours = totalMinutes / 60;
        
        // Compute the current hour 
        long currentHour = totalHours % 24;
        
        // Display results
        System.out.println("Current time is " + currentHour + ":" 
        + currentMinute + ":" + currentSecond + " GMT");
     }
}
