package Bai4_2;

public class Student extends Person  {
        private String program;
        private int year;
        private double fee;

        // Constructor
    public Student(String name, String address, String program, int year, double fee) {
            super(name, address);
            this.program = program;
            this.year = year;
            this.fee = fee;
        }

        // Getter cho program
        public String getProgram() {
            return program;
        }

        // Setter cho program
        public void setProgram(String program) {
            this.program = program;
        }

        // Getter cho year
        public int getYear() {
            return year;
        }

        // Setter cho year
        public void setYear(int year) {
            this.year = year;
        }

        // Getter cho fee
        public double getFee() {
            return fee;
        }

        // Setter cho fee
        public void setFee(double fee) {
            this.fee = fee;
        }

        // Phương thức toString
        @Override
        public String toString() {
            return "Student[" + super.toString() + ",program=" + program + ",year=" + year + ",fee=" + fee + "]";
        }
}
