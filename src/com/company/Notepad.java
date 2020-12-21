package com.company;

import java.util.ArrayList;

public class Notepad {
    private ArrayList<Record> records = new ArrayList<>();

    public void createPerson() {
        var person = new Person();
        person.setFirstName(InputUtils.askString("First Name"));
        person.setLastName(InputUtils.askString("Last Name"));
        person.setPhone(InputUtils.askString("Phone"));
        person.setEmail(InputUtils.askString("Email"));
        records.add(person);
    }

    public void listRecords() {
        for (Record rec : records) {
            System.out.println(rec);
        }
    }

    public void createBook() {
        var book = new Book();
        book.setAuthor(InputUtils.askString("Author"));
        book.setTitle(InputUtils.askString("Title"));
        book.setIsbn(InputUtils.askString("ISBN"));
        records.add(book);
    }

    public void createStickyNote() {
        var note = new StickyNote();
        note.setText(InputUtils.askString("Text"));
        records.add(note);
    }

    public void createRecurringAlarm() {
        var alarm = new RecurringAlarm();
        alarm.setTime(InputUtils.askString("Time"));
        records.add(alarm);
    }

    public void createReminder() {
        var date = new Reminder();
        date.setDate(InputUtils.askString("Date"));
        records.add(date);
    }
}
