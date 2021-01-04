package com.company;

import java.util.ArrayList;

public class Notepad {
    private ArrayList<Record> records = new ArrayList<>();


    public void createRecord(RecordType recType) {
        var rec = recType.createRecord();
        rec.askData();
        records.add(rec);
        System.out.println("Created: " + rec);
    }

    public void listRecords() {
        for (Record rec : records) {
            System.out.println(rec);
        }
    }



}
