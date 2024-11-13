package Bai1_3;

public class Rectangle {
        private float length;
        private float width;

        // Constructor với tham số
        public Rectangle(float length, float width) {
            this.length = length;
            this.width = width;
        }

        // Constructor mặc định
        public Rectangle() {
            this.length = 1.0f;
            this.width = 1.0f;
        }

        // Getter và Setter cho chiều dài và chiều rộng
        public float getLength() {
            return length;
        }

        public void setLength(float length) {
            this.length = length;
        }

        public float getWidth() {
            return width;
        }

        public void setWidth(float width) {
            this.width = width;
        }

        // Tính diện tích
        public float getArea() {
            return length * width;
        }

        // Tính chu vi
        public float getPerimeter() {
            return 2 * (length + width);
        }

        // Phương thức toString để in thông tin của hình chữ nhật
        @Override
        public String toString() {
            return "Rectangle[length=" + length + ", width=" + width + "]";
        }
    }

