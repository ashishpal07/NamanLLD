package BuilderPattern;

public class Client {

    public static void main(String[] args) throws Exception {

        Student st = Student.getBuilder()
                .setAttendance(100)
                .setPsp(95.89)
                .setAge(24)
                .setName("NamanBhlla")
                .setGender("male")
                .build();
    }

}
