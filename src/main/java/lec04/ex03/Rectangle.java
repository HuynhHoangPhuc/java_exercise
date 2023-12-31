package lec04.ex03;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle() {
        this.height = 0.0;
        this.width = 0.0;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area() {
        return width * height;
    }
}
