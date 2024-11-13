package Bai1_2;

public class Circle {
        private double radius;

        // Constructor
        public Circle(double radius) {
            this.radius = radius;
        }

        // Default constructor
        public Circle() {
            this.radius = 1.0;
        }

        // Getter và Setter
        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        // Tính diện tích
        public double getArea() {
            return Math.PI * radius * radius;
        }

        // Tính chu vi
        public double getCircumference() {
            return 2 * Math.PI * radius;
        }

        // Phương thức toString
        @Override
        public String toString() {
            return "Circle[radius=" + radius + "]";
        }
}



