package ca.concordia.encs.refactoring.sample.patterns.observer;

import java.util.Scanner;

public class ObserverDriver extends Object {
    DigitalClockView clockView;
    ClockTimerModel clockModel;

    public ObserverDriver() {
        //create the View object
        clockView = new DigitalClockView();
        //create the Model object
        clockModel = new ClockTimerModel();
        //connect the View object to the Model object
        clockModel.addObserver(clockView);
    }

  public static void main(String[] args) {
        ObserverDriver od = new ObserverDriver();
        od.demo();
    }

  public void demo() {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter number of seconds: ");
        int secs = kbd.nextInt();
        clockModel.start(secs);
        kbd.close();
    }

}
