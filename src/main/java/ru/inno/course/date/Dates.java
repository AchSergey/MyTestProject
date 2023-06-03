package ru.inno.course.date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dates {

    public static void main(String[] args) {

//        LocalDate date = LocalDate.now();
//        LocalDate yesterday = LocalDate.of(2023, 5, 30);
//        LocalDate tomorrow = LocalDate.parse("2023-05-31");
//
//
//        System.out.println(yesterday);
//        System.out.println(tomorrow);
//        System.out.println(date);
//        System.out.println(date.plusDays(3));
//        System.out.println(date.minusMonths(2));
//        System.out.println(date.isAfter(tomorrow));
//
//        LocalTime time = LocalTime.now();
//        System.out.println(time); // формат работы анологичен дате
//
//        LocalDateTime dateTime = LocalDateTime.now();
//        LocalDateTime dateTime1 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
//        System.out.println(dateTime);
//        System.out.println(dateTime1);
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
//
//        System.out.println(formatter.format(dateTime));

        // продолжительность между двумя точками
        Duration duration = Duration.between(LocalDateTime.now(), LocalDateTime.now().plusHours(1));
        System.out.println(duration.toHours()); // выразить разницу в часах, можно в любом формате
    }
}
