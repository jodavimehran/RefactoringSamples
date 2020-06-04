package ca.concordia.encs.refactoring.sample.second;

public class Qux {
    public double mC(int[] numbers) {
        long sum = mE(numbers);
        double result;
        result = (double) sum / numbers.length;
        return result;
    }

    public long mE(int[] numbers) {
        long sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
