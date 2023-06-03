package ru.inno.course.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PublicationTime {
        public static void main(String[] args) {
            LocalDate publishDate = LocalDate.now().minusDays(1);
            LocalTime publishTime = LocalTime.now().minusHours(5);
            LocalDateTime timestamp = LocalDateTime.of(publishDate, publishTime);

            HumanReadableTimestampImpl humanReadableTimestamp = new HumanReadableTimestampImpl();
            String result = humanReadableTimestamp.getHumanReadableTimestamp(timestamp);
            System.out.println(result);
        }
    }

