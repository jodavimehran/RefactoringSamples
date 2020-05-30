package ca.concordia.encs.refactoring.sample.patterns.adapter.twoway;

import ca.concordia.encs.refactoring.sample.patterns.adapter.twoway.ISquarePeg;

/**
 * The SquarePeg Target/Adaptee class.
 */
public class SquarePeg implements ISquarePeg {
    public void insert(String str) {
        System.out.println("SquarePeg insert(): " + str);
    }
}
