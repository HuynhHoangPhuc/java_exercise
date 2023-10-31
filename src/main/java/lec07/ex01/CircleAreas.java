package lec07.ex01;

import lec04.ex01.Circle;

import java.util.LinkedList;
import java.util.Random;

public class CircleAreas {
    private LinkedList<Circle> circles;

    public CircleAreas() {
        this.circles = new LinkedList<>();
    }

    public void print() {
        double radius = Math.random();

        while (radius >= 0.01) {
            Circle circle = new Circle(radius);
            System.out.printf("Radius: %f -> Area: %f\n", circle.getRadius(), circle.area());
            radius = Math.random();
        }
    }
}
