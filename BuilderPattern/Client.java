package BuilderPattern;

public class Client {

    public static void main(String[] args) throws Exception {
        Builder b = new Builder();
        b.setAge(24);
        b.setAttendance(100);
        b.setGender("male");
        b.setPsp(98);
        b.setName("Jonathan");

        if(!b.validate()) {
            throw new Exception("Invalid Parameters");
        }

        Student st = new Student(b);
    }

}
