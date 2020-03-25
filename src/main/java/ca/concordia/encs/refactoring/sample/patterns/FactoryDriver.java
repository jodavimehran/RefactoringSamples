package ca.concordia.encs.refactoring.sample.patterns;

import ca.concordia.encs.refactoring.sample.patterns.factory.Shape;
import ca.concordia.encs.refactoring.sample.patterns.factory.ShapeFactory;

public class FactoryDriver {

    public static void main(String[] args) {

        //get an object of Circle and call its draw method.
        Shape shape1 = ShapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.drawIt(10, "normal");

        //get an object of Rectangle and call its draw method.
        Shape shape2 = ShapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.drawIt(10, "normal");

        //get an object of Square and call its draw method.
        Shape shape3 = ShapeFactory.getShape("SQUARE");

        //call draw method of circle
        shape3.drawIt(10, "normal");
    }

    private void startDriver() {
        System.out.println("Start Driver");
    }
}