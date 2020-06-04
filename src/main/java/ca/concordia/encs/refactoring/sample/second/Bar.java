package ca.concordia.encs.refactoring.sample.second;

public class Bar {

    public long mX(int a, int b) {
        return a * b;
    }

    public double mC(int[] numbers) {
        long sum = 0;
        double result;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        result = (double) sum / numbers.length;
        return result;
    }
}
