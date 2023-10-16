package lec04.ex01;

import java.util.Random;
import java.util.stream.DoubleStream;

public class SumOfCircleAreas {
    private final int numberOfCircles;

    public SumOfCircleAreas(int numberOfCircles) {
        this.numberOfCircles = numberOfCircles;
    }

    public double calculate() {
        return DoubleStream.generate(() -> new Random().nextDouble(numberOfCircles))
                .limit(numberOfCircles)
                .mapToObj(Circle::new)
                .mapToDouble(Circle::area)
                .sum();
    }
}
