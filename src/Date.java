
public class Date {

    private int year;
    private int month;
    private int day;

    // private int year , month , day
    // Constructor (method that same name of class)
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // method Getters คืรนค่ากลับ ให้ object
    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    // method Setters กำหนดค่าให้ attribute
    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    // method toString() เป็น method ที่เรียกใช้ได้เลยผ่าน object
    public String toString() {
        return String.format("%02d%02d%4d", this.month, this.day, this.year);
    }

    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
