package ca.concordia.encs.refactoring.sample.patterns.observer;// A Sub-class of Observable: a Clock Timer
//

import java.util.Observable;

class ClockTimerModel extends Observable {
    int minute;

	int second;

	private
    int hour;

	public int GetHour() {
        return hour;
    }

	int GetMinute() {
        return minute;
    }

	int GetSecond() {
        return second;
    }

    void tick() {
        // update internal state
        second++;
        if (second >= 60) {
            minute++;
            second = 0;
            if (minute >= 60) {
                hour++;
                minute = 0;
                if (hour >= 24) {
                    hour = 0;
                }
			}
		}
		// specify that my state was changed
        setChanged();
        // notify all attached Observers of a change
        notifyObservers(this);
    }

    void start(int secs) {
        for (int i = 1; i <= secs; i++)
            tick();
    }
}
