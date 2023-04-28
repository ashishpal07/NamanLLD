package BuilderPattern;

public class Student {
    private int age;
    private String name;
    private String gender;
    private double psp;
    private double attendance;

    private Student(Builder builder) {
        this.name = builder.getName();
        this.gender = builder.getGender();
        this.psp = builder.getPsp();
        this.attendance = builder.getAttendance();
        this.age = builder.getAge();
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {

        private int age;
        private String name;
        private String gender;
        private double psp;
        private double attendance;

        public Student build() throws Exception {
            if(!validate()) throw new Exception("Wrong Parameters");
            return new Student(this);
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setAttendance(double attendance) {
            this.attendance = attendance;
            return this;
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
}
