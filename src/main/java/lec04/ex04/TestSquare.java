package lec04.ex04;

public class TestSquare {
    public void testField() {
        Square square = new Square();
        square.setSide(10);
        System.out.printf("Side (getter&setter): %f\n", square.getSide());
    }

    public void testConstructor() {
        Square square = new Square(9);
        System.out.printf("Side (constructor): %f\n", square.getSide());
    }

    public void testArea() {
        Square square = new Square(8);
        System.out.printf("Area with side is %f: %f\n", square.getSide(), square.area());
    }
}
