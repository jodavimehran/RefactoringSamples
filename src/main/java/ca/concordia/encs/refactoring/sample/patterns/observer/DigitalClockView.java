package ca.concordia.encs.refactoring.sample.patterns.observer;

import java.util.Observable;
import java.util.Observer;

class DigitalClockView implements Observer {
    public void update(Observable obs, Object x) {
        int hour = ((ClockTimerModel) x).GetHour();
        int minute = ((ClockTimerModel) x).GetMinute();
        int second = ((ClockTimerModel) x).GetSecond();
        System.out.println(hour + ":" + minute + ":" + second);
    }

}

