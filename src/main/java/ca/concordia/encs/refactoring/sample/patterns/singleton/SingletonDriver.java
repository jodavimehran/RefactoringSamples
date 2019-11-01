package ca.concordia.encs.refactoring.sample.patterns.singleton;

public class SingletonDriver {
    public static void main(String[] args) {

        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //use the Singleton
        object.showMessage();
    }
}