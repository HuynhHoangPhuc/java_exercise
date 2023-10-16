package lec03.ex04;

import java.util.Random;
import java.util.stream.DoubleStream;

public class SumOfSquareRoots {
    private final int size;

    public SumOfSquareRoots(int size) {
        this.size = size;
    }

    public double calculate() {
        return DoubleStream.generate(() -> new Random().nextDouble(this.size))
                .limit(this.size)
                .map(Math::sqrt)
                .sum();
    }
}
