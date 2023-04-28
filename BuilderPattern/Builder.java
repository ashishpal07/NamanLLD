package BuilderPattern;

public class Builder {

    private int age;
    private String name;
    private String gender;
    private double psp;
    private double attendance;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setAttendance(double attendance) {
        this.attendance = attendance;
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

    public boolean validate() {
        if (age > 24 && psp < 70) {
            return false;
        }

        return age >= 18;
    }
}
