package ca.concordia.encs.refactoring.sample.anonymous;

public class Multiple extends AbstractOperation {

    public Multiple(int a, int b) {
        super(a, b);
    }

    @Override
    public void action() {
        result = a * b;
    }

}
