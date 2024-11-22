package Bai2_6;

public class MyPoint {
    private int x = 0; // Tọa độ x
    private int y = 0; // Tọa độ y

    // Constructor mặc định
    public MyPoint() {
    }

    // Constructor với tham số
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter cho x
    public int getX() {
        return x;
    }

    // Setter cho x
    public void setX(int x) {
        this.x = x;
    }

    // Getter cho y
    public int getY() {
        return y;
    }

    // Setter cho y
    public void setY(int y) {
        this.y = y;
    }

    // Lấy tọa độ {x, y} dưới dạng mảng
    public int[] getXY() {
        return new int[]{x, y};
    }

    // Thiết lập lại tọa độ
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Chuyển đổi tọa độ thành chuỗi "(x, y)"
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Tính khoảng cách đến một tọa độ khác (x, y)
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    // Tính khoảng cách đến một đối tượng MyPoint khác
    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow(this.y - another.y, 2));
    }

    // Tính khoảng cách đến gốc tọa độ (0, 0)
    public double distance() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
}
