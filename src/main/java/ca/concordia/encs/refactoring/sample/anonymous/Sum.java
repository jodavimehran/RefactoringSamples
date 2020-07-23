package ca.concordia.encs.refactoring.sample.anonymous;

public class Sum extends AbstractOperation {
    private long result;

    public Sum(int a, int b) {
        super(a, b);
    }

    @Override
    public void action() {
        result = a + b;
    }

    @Override
    public long getResult() {
        return result;
    }
}
