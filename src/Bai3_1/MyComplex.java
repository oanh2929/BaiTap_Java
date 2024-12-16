package Bai3_1;

public class MyComplex {
    // Thuộc tính phần thực và phần ảo
    private double real = 0.0;
    private double imag = 0.0;

    // Constructor không tham số
    public MyComplex() {}

    // Constructor có tham số
    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Getter cho real
    public double getReal() {
        return real;
    }

    // Setter cho real
    public void setReal(double real) {
        this.real = real;
    }

    // Getter cho imag
    public double getImag() {
        return imag;
    }

    // Setter cho imag
    public void setImag(double imag) {
        this.imag = imag;
    }

    // Phương thức setValue để thiết lập cả real và imag
    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Phương thức toString để hiển thị số phức dưới dạng "real+imagi"
    @Override
    public String toString() {
        if (imag >= 0) {
            return real + "+" + imag + "i";
        } else {
            return real + "" + imag + "i";
        }
    }

    // Kiểm tra nếu là số thực
    public boolean isReal() {
        return imag == 0;
    }

    // Kiểm tra nếu là số ảo
    public boolean isImaginary() {
        return real == 0;
    }

    // Phương thức equals để so sánh với giá trị thực và ảo
    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    // Phương thức equals để so sánh với một số phức khác
    public boolean equals(MyComplex another) {
        return this.real == another.real && this.imag == another.imag;
    }

    // Tính độ lớn của số phức
    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    // Cộng một số phức khác vào số phức hiện tại
    public MyComplex addInto(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    // Tạo một số phức mới bằng cách cộng thêm một số phức khác
    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }
}
