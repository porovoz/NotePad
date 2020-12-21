package com.company;

public class Reminder extends RecurringAlarm {
    private String text;
    private String time;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
    public String getTime() {
        return time;
    }

    @Override
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        var str = super.toString();
        return String.format("%s; date: %s", str, date);
    }
}
