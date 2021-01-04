package com.company;

public class RecurringAlarm extends StickyNote {

    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void askData() {
        super.askData();
        time = InputUtils.askString("Time");
    }

    @Override
    public String toString() {
        var str = super.toString();
        return String.format("%s; time: %s", str, time);
    }
}
