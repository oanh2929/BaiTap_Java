package Bai4_4;

public class TestMain {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(1.0f, 2.0f, 0.5f, 0.7f);
        System.out.println(mp); // Output: (1.0, 2.0), speed=(0.5, 0.7)

        mp.move();
        System.out.println(mp); // Output: (1.5, 2.7), speed=(0.5, 0.7)

        mp.setSpeed(1.0f, 1.5f);
        mp.move();
        System.out.println(mp); // Output: (2.5, 4.2), speed=(1.0, 1.5)
    }
}
