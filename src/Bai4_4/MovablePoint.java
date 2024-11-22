package Bai4_4;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // Default constructor
    public MovablePoint() {
        super(); // Calls Point's default constructor
    }

    // Constructor with xSpeed and ySpeed
    public MovablePoint(float xSpeed, float ySpeed) {
        super(); // Calls Point's default constructor
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Constructor with x, y, xSpeed, and ySpeed
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y); // Calls Point's parameterized constructor
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter for xSpeed
    public float getXSpeed() {
        return xSpeed;
    }

    // Setter for xSpeed
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    // Getter for ySpeed
    public float getYSpeed() {
        return ySpeed;
    }

    // Setter for ySpeed
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Set both speeds
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Get both speeds as an array
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    // Move the point by updating x and y
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this; // Return the current object
    }

    // Override toString
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + "), speed=(" + xSpeed + ", " + ySpeed + ")";
    }
}
