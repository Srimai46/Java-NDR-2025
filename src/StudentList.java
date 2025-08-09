
import java.util.ArrayList;

public class StudentList {

    private String name;
    private String address;
    private ArrayList<String> courese;
    private ArrayList<Integer> grade;

    /*
     * Constructor for the StudentList class.
     * Validation of input Data
     */
    public StudentList(String name, String address) {
        //Validatetion of input name
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be null or blank");
        }
        //Validation of input address
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Address must not be null or blank");
        }

        this.name = name;
        this.address = address;
        this.courese = new ArrayList<>();
        this.grade = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Address must not be null or blank");
        }
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", name, address);
    }

    /*
     * Add a new courese nad grade
     * @param courese The courese name.
     * @param grade The grade (0-100)
     */
    public void addcoureseGrade(String coureses, int grade) {
        if (coureses == null || coureses.isBlank()) {
            System.out.print("Error : courese name cannot be blank");
            return; // IF Error Stop
        }
        if (grade < 0 || grade > 100) {
            System.out.print("Error : Grade must be between 0 and 100");
            return;
        }
        //Check if the courese limit reached
        if (courese.size() >= 30) {
            System.out.println("Cannot add more coureses than 30.");
            return;
        } else {
            this.courese.add(coureses);
            this.grade.add(grade);
        }

    }
    //print all the Courese and Grade in the format String

    public void printGrade() {
        System.out.print(this.name + " ");
        for (int i = 0; i < courese.size(); i++) {
            System.out.print(courese.get(i) + " : " + grade.get(i));
            if (i < courese.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public double getAverageGrade() {
        if (courese.isEmpty()) return 0.0;
        int sum = 0;
        //using foreach
        for(int _grade:grade) {
            sum+= _grade;
        }
        return (double) sum/ courese.size();
    }

}
