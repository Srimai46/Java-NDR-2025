import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeModern {
    // use LocalTime
    private LocalTime time;

    public TimeModern() {
        this.time = LocalTime.of(0, 0, 0); // Default to 00:00:00
    }

    public TimeModern(int hour, int minute, int second) {
        this.time = LocalTime.of(hour, minute, second);
    }

    public int getHour() {
        return time.getHour();
    }
    public int getMinute() {
        return time.getMinute();
    }
    public int getSecond() {
        return time.getSecond();
    }

    public TimeModern withTime(int hour, int minute, int second) {
        return new TimeModern(hour, minute, second);
    }

    /*สร้าง object ที่มีเวลาเพิ่มมากกว่าเดิม 1 วินาที 
     * return object TimeModern ใหม่ที่มีเวลาเพิ่มขึ้น 1 วินาที
    */

    public TimeModern nextSecond() {
        // call plusSeconds(1) 1 time only
        LocalTime newTIme = this.time.plusSeconds(1);
        return new TimeModern(newTIme.getHour(), newTIme.getMinute(), newTIme.getSecond());
    }

    @Override
    public String toString() {
        return time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}
