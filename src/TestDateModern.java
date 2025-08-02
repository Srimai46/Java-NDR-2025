
public class TestDateModern {

    public static void main(String[] args) {
        // create object d1 call method in class DateModern
        DateModern d1 = new DateModern(2025, 8, 25);
        System.out.println("Original Date : " + d1);

        // use a chain of with methods to create a modified copy
        DateModern d2 = d1.withDate(2012, 12, 23);
        System.out.println("New Date(from chain) : " + d2);
        System.out.println("Year is : " + d2.getYear());
        System.out.println("Month is : " + d2.getMonth());
        System.out.println("Day is : " + d2.getDay());

        // d1 unchain
        System.out.println("Original Date (d1) is : " + d1);

    }
}
