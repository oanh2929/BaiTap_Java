package Bai4_3;

public class Point3D extends Point2D {
        private float z = 0.0f; // Tọa độ z

        // Constructor mặc định
    public Point3D() {
            super(); // Gọi constructor mặc định của Point2D
        }

        // Constructor với tham số
    public Point3D(float x, float y, float z) {
            super(x, y); // Gọi constructor của Point2D
            this.z = z;
        }

        // Getter cho z
        public float getZ() {
            return z;
        }

        // Setter cho z
        public void setZ(float z) {
            this.z = z;
        }

        // Lấy tọa độ {x, y, z} dưới dạng mảng
        public float[] getXYZ() {
            return new float[] {getX(), getY(), z};
        }

        // Thiết lập tọa độ x, y, z
        public void setXYZ(float x, float y, float z) {
            setXY(x, y); // Gọi phương thức setXY của lớp cha
            this.z = z;
        }

        // Phương thức toString
        @Override
        public String toString() {
            return "(" + getX() + ", " + getY() + ", " + z + ")";
        }
}
