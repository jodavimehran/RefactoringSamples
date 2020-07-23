package ca.concordia.encs.refactoring.sample.anonymous;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        AbstractOperation localSum = new AbstractOperation(a, b) {

            private long result;

            @Override
            public void action() {
                result = a + b + 1;
            }

            @Override
            public long getResult() {
                return result;
            }
        };

        localSum.action();
        System.out.println(localSum.getResult());
    }

}
