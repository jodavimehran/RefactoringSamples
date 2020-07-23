package ca.concordia.encs.refactoring.sample.anonymous;

public class Sum extends AbstractOperation {

    public Sum(int a, int b) {
        super(a, b);
    }

    @Override
    public void action() {
        result = a + b;
    }

}
