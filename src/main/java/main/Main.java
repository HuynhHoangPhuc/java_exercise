package main;

import lec04.ex01.CircleTest;
import lec04.ex02.SumOfCircleAreas;

public class Main {
    public static void main(String[] args) {
        CircleTest circleTest = new CircleTest();
        circleTest.testField();
        circleTest.testConstructor();
        circleTest.testArea();

        SumOfCircleAreas sumOfCircleAreas = new SumOfCircleAreas(100);
        System.out.println(sumOfCircleAreas.calculate());
    }
}