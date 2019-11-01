package ca.concordia.encs.refactoring.sample.patterns.factory;

/**
 * Rectangle class that is one kind of Shape that may be produced by the ShapeFactory
 */
public class Circle implements Shape {

    @Override
    public void drawIt(int thickness, String lineType) {
        System.out.println("Inside Circle::draw() method.");
    }
}