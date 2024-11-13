package Bai4_5;

public class Shape {
    private String color;
    private boolean filled;
    private Shape (){
        color="red";
        filled="true";
    }
    private Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    private String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public String toString(){
        return "Shape[color="+color+",filled="+filled+"]";
    }
}
