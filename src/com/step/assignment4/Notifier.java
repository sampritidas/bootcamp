package com.step.assignment4;


import java.util.ArrayList;

public class Notifier {

    public void notify(ParkingState state) {
        double percentage = state.getOccupiedPercentage();

        if (percentage == 100) {
            this.inform(Subscribers.ASSISTANT, state);
            this.inform(Subscribers.ATTENDANT, state);
        }

        if (percentage >= 80) {
            this.inform(Subscribers.MANAGER, state);
            this.inform(Subscribers.CIVIC_BODY, state);
        }

        if (percentage <= 20) {
            this.inform(Subscribers.ASSISTANT, state);
        }
    }

    private void inform(Subscribers subscribers, ParkingState state) {
        subscribers.inform(state);
    }
}
