package com.company;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.util.Date;

public class Person extends Record implements Scheduled {

    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private LocalDate birthdate;
    private int dismissYear;


    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(String last_name) {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail(String email) {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        var str = super.toString();
        return String.format("%s; first name: %s; last name: %s; phone: %s; email: %s; birthdate: %s", str, firstName, lastName, phone, email, InputUtils.dateToString(birthdate));
    }

    @Override
    public boolean isDue() {
        boolean active = LocalDate.now().getYear() != dismissYear;
//        LocalDateTime notificationStart = birthdate.withDayOfMonth(1).atStartOfDay();
        LocalDateTime notificationStart = birthdate.minusWeeks(1).atStartOfDay();
        return active && LocalDateTime.now().isAfter(notificationStart);
    }

    @Override
    public void dismiss() {
        dismissYear = LocalDate.now().getYear();
    }

    @Override
    public void askData() {
        firstName = InputUtils.askString("First name");
        lastName = InputUtils.askString("Last name");
        phone = InputUtils.askString("Phone");
        email = InputUtils.askString("Email");
        birthdate = InputUtils.askDate("Birthdate");

    }

    @Override
    public boolean contains(String substr) {
        return super.contains(substr)
                || firstName.toLowerCase().contains(substr)
                || phone.toLowerCase().contains(substr)
                || lastName.toLowerCase().contains(substr)
                || email.toLowerCase().contains(substr)
                || InputUtils.dateToString(birthdate).toLowerCase().contains(substr);
    }
}
