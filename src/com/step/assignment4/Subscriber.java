package com.step.assignment4;

import java.util.ArrayList;

public enum Subscriber {
    MANAGER, ATTENDANT, ASSISTANT, CIVIC_BODY;

    private final ArrayList<ParkingState> notifications = new ArrayList<>();

    public void inform(ParkingState state) {
        this.notifications.add(state);
    }

    public ArrayList<ParkingState> getNotifications() {
        return this.notifications;
    }
}
