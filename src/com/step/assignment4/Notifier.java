package com.step.assignment4;

public class Notifier {

    public void notify(ParkingState state) {
        double percentage = state.getOccupiedPercentage();

        if (percentage == 100) {
            this.inform(Subscriber.ASSISTANT, state);
            this.inform(Subscriber.ATTENDANT, state);
        }

        if (percentage >= 80) {
            this.inform(Subscriber.MANAGER, state);
            this.inform(Subscriber.CIVIC_BODY, state);
        }

        if (percentage <= 20) {
            this.inform(Subscriber.ASSISTANT, state);
        }
    }

    private void inform(Subscriber subscribers, ParkingState state) {
        subscribers.inform(state);
    }
}
