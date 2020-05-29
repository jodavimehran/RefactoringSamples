package ca.concordia.encs.refactoring.sample.patterns.adapter.twoway;

import ca.concordia.encs.refactoring.sample.patterns.adapter.SquarePeg3;

/**
 * The PegAdapter class. This is the two-way adapter class.
 */
public class PegAdapter implements ISquarePeg, IRoundPeg {
    private RoundPeg roundPeg;
    private SquarePeg3 squarePeg;

    public PegAdapter(RoundPeg peg) {
        this.roundPeg = peg;
    }

    public PegAdapter(SquarePeg3 peg) {
        this.squarePeg = peg;
    }

    public void insert(String str) {
        roundPeg.insertIntoHole(str);
    }

    public void insertIntoHole(String msg) {
        squarePeg.insert(msg);
    }
}
