package ca.concordia.encs.refactoring.sample.anonymous;

public abstract class AbstractOperation {
    protected final int a;
    protected final int b;
    protected long result;


    public AbstractOperation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public abstract void action();

    public long getResult() {
        return result;
    }
}
