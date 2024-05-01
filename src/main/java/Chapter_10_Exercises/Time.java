package Chapter_10_Exercises;

/**
 *
 * @author ciaon
 */
/** ----------------------------
|           Time           |
----------------------------
| -hour: long              |
| -minute: long            |
| -second: long            |
----------------------------
| +Time()                  |
| +Time(elapsedTime: long) |
| +Time(hour: long, minute: long, second: long) |
| +getHour(): long         |
| +getMinute(): long       |
| +getSecond(): long       |
| +setTime(elapsedTime: long) |
----------------------------
**/
import java.util.Date;

public class Time {
    private long hour;
    private long minute;
    private long second;

    public Time() {
        this(System.currentTimeMillis());
    }

    public Time(long elapsedTime) {
        setTime(elapsedTime);
    }

    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;
        this.second = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        this.minute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        this.hour = totalHours % 24;
    }

    public static void main(String[] args) {
        Time currentTime = new Time();
        Time specifiedTime = new Time(555550000);
        Time customTime = new Time(10, 30, 45);

        System.out.println("Current Time: " + currentTime.getHour() + ":" +
                currentTime.getMinute() + ":" + currentTime.getSecond());
        System.out.println("Specified Time: " + specifiedTime.getHour() + ":" +
                specifiedTime.getMinute() + ":" + specifiedTime.getSecond());
        System.out.println("Custom Time: " + customTime.getHour() + ":" +
                customTime.getMinute() + ":" + customTime.getSecond());
    }
}

