package datetimedemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeCreate {

    public static void main(String[] args) {
        var currentDate = LocalDate.now();
        System.out.println("current date: " + currentDate);

        var currentTime = LocalTime.now();
        System.out.println("current time: " + currentTime);

        var currentDateTime = LocalDateTime.now();
        System.out.println("current date/time: " + currentDateTime);

        var myBirthday1 = LocalDate.of(1985, Month.SEPTEMBER, 24);
        System.out.println("my birthday 1:" + myBirthday1);

        var myBirthday2 = LocalDate.of(1985, 9, 24);
        System.out.println("my birthday 2:" + myBirthday2);

        var lessonStartTime = LocalTime.of(18, 30,50, 1);
        System.out.println("lesson start time: " + lessonStartTime);

        var firstLessonStart = LocalDateTime.of(2020, 11, 23, 18, 30);
        System.out.println("first lesson start: " + firstLessonStart);

        var dateFormatter = DateTimeFormatter.ofPattern("d.M.yyyy");
        var strDate = "07.01.2021";
        var date = LocalDate.parse(strDate, dateFormatter);
        System.out.println("date: " + date);

        var dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM uuuu @ HH:mm");
        var dt = LocalDateTime.of(currentDate, lessonStartTime);
        var strDT = dateTimeFormatter.format(dt);
        System.out.println("dt: " + strDT);

        var dt1 = currentDate.atTime(lessonStartTime); // the same as dt
        System.out.println("dt1: " + dt1);
        var dt2 = dt1.plusMinutes(98760);
        System.out.println("dt1: " + dt1);
        System.out.println("dt2: " + dt2);




    }
}
