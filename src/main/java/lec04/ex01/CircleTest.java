package lec04.ex01;

public class CircleTest {
    public void testField() {
        Circle circle = new Circle();
        circle.setRadius(100);
        System.out.printf("Radius (getter & setter): %f\n", circle.getRadius());
    }

    public void testConstructor() {
        Circle circle = new Circle(400);
        System.out.printf("Radius (constructor): %f\n", circle.getRadius());
    }

    public void testArea() {
        Circle circle = new Circle(5);
        System.out.printf("Area of circle with %f: %f\n", 5.0, circle.area());
    }
}
