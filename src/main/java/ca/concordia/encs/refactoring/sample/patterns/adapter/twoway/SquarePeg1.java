package ca.concordia.encs.refactoring.sample.patterns.adapter.twoway;

/**
 * The SquarePeg Target/Adaptee class.
 */
public class SquarePeg1 implements ISquarePeg {
    public void insert(String str) {
        System.out.println("SquarePeg insert(): " + str);
    }
}
