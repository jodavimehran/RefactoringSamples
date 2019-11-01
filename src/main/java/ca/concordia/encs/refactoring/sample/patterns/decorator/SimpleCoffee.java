package ca.concordia.encs.refactoring.sample.patterns.decorator;

/**
 * Kind of Coffee
 */
public class SimpleCoffee extends Coffee {
    public double getCost() {
        return 1;
    }

    public String getIngredients() {
        return "Coffee";
    }
}