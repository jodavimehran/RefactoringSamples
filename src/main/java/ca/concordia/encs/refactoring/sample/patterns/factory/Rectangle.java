package ca.concordia.encs.refactoring.sample.patterns.factory;

/**
 * Rectangle class that is one kind of Shape that may be produced by the ShapeFactory
 */
public class Rectangle implements Shape {

    @Override
    public void draw(int thickness, String lineType) {
        System.out.println("Inside Rectangle::draw() method.");
    }
}