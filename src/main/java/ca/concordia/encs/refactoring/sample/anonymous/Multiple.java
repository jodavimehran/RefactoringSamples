package ca.concordia.encs.refactoring.sample.anonymous;

public class Multiple extends AbstractOperation  {
    private long result;

    public Multiple(int a, int b) {
        super(a, b);
    }

    @Override
    public void action() {
        result = a * b;
    }

    @Override
    public long getResult() {
        return result;
    }
}
