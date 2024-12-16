package Bai3_1;

public class TestMyComplex {
    public static void main(String[] args) {
        // Tạo hai đối tượng MyComplex
        MyComplex num1 = new MyComplex(3.0, 4.0);
        MyComplex num2 = new MyComplex(1.5, -2.5);

        // In ra số phức
        System.out.println("Số phức 1: " + num1);
        System.out.println("Số phức 2: " + num2);

        // Kiểm tra số thực và số ảo
        System.out.println("Số phức 1 có phải là số thực? " + num1.isReal());
        System.out.println("Số phức 2 có phải là số ảo? " + num2.isImaginary());

        // Tính độ lớn
        System.out.println("Độ lớn của số phức 1: " + num1.magnitude());

        // Cộng thêm số phức 2 vào số phức 1
        System.out.println("Cộng số phức 2 vào số phức 1: " + num1.addInto(num2));

        // Tạo số phức mới bằng cách cộng số phức 1 và 2
        MyComplex result = num1.addNew(num2);
        System.out.println("Tạo số phức mới bằng cách cộng số phức 1 và 2: " + result);
    }
}

