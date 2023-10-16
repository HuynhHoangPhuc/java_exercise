package lec03.ex03;

public class RandomNumber {
    private final int size;

    public RandomNumber(int size) {
        this.size = size;
    }

    private double[] random() {
        double[] numbers = new double[this.size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random();
        }

        return numbers;
    }

    public void print() {
        double[] numbers = random();

        System.out.print("Forward: ");
        for (double number : numbers) {
            System.out.printf("%f ", number);
        }
        System.out.println();

        System.out.print("Backward: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.printf("%f ", numbers[i]);
        }
        System.out.println();
    }
}
