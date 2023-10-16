package lec04.ex03;

public class TestRectangle {
    public void testField() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(30);
        System.out.printf("Width (getter&setter): %f\n", rectangle.getWidth());
        System.out.printf("Height (getter&setter): %f\n", rectangle.getHeight());
    }

    public void testConstructor() {
        Rectangle rectangle = new Rectangle(40, 20);
        System.out.printf("Width (constructor): %f\n", rectangle.getWidth());
        System.out.printf("Height (constructor): %f\n", rectangle.getHeight());
    }

    public void testArea() {
        Rectangle rectangle = new Rectangle(15, 13);
        System.out.printf("Area of rectangle with height is %f and width is %f: %f\n",
                rectangle.getHeight(),
                rectangle.getWidth(),
                rectangle.area());
    }
}
