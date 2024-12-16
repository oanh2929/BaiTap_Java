package Bai4_5;

public class TestMain {
    public static void main(String[] args) {
        Shape shape = new Shape("blue", false);
        System.out.println(shape); // Output: Shape[color=blue, filled=false]

        Circle circle = new Circle(5.5, "yellow", true);
        System.out.println(circle); // Output: Circle[Shape[color=yellow, filled=true], radius=5.5]

        Rectangle rectangle = new Rectangle(2.0, 3.0, "green", false);
        System.out.println(rectangle); // Output: Rectangle[Shape[color=green, filled=false], width=2.0, length=3.0]

        Square square = new Square(4.0, "pink", true);
        System.out.println(square); // Output: Square[Rectangle[Shape[color=pink, filled=true], width=4.0, length=4.0]]
    }
}
