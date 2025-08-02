public class TestTimeMordern {
    public static void main(String[] args) {
        TimeModern t = new TimeModern(23, 59, 59);
        System.out.println("Starting time: " + t); // 23:59:59

        // Test nextSecond()
        TimeModern t2 = t.nextSecond();
        System.out.println("After adding 1 second: " + t2); // 00

        TimeModern t3 = t2.nextSecond().nextSecond();
        System.out.println("After adding 2 more seconds: " + t3); // 00:00:01

        //Getters
        System.out.println("Hour is : " + t3.getHour());
        System.out.println("Minute is : " + t3.getMinute());
        System.out.println("Second is : " + t3.getSecond());

        //Create new Time
        TimeModern t4 = t3.withTime(7, 30, 15);
        System.out.println("New Time (from chain) : " + t4); // 07:30:15
    }
}
