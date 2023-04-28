package BuilderPattern;

public class Student {
    private int age;
    private String name;
    private String gender;
    private double psp;
    private double attendance;

    public Student(Builder b) {
        this.age = b.getAge();
        this.name = b.getName();
        this.gender = b.getGender();
        this.psp = b.getPsp();
        this.attendance = b.getAttendance();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getPsp() {
        return psp;
    }

    public double getAttendance() {
        return attendance;
    }
}
