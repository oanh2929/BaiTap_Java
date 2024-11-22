package Bai4_2;

public class Staff extends Person {
        private String school;
        private double pay;

        // Constructor
        public Staff(String name, String address, String school, double pay) {
            super(name, address);
            this.school = school;
            this.pay = pay;
        }

        // Getter cho school
        public String getSchool() {
            return school;
        }

        // Setter cho school
        public void setSchool(String school) {
            this.school = school;
        }

        // Getter cho pay
        public double getPay() {
            return pay;
        }

        // Setter cho pay
        public void setPay(double pay) {
            this.pay = pay;
        }

        // Phương thức toString
        @Override
        public String toString() {
            return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
        }
}
