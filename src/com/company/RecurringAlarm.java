package com.company;

public class RecurringAlarm extends StickyNote {
    private String text;
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        var str = super.toString();
        return String.format("%s; time: %s", str, time);
    }
}
