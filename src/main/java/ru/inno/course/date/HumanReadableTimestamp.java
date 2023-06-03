package ru.inno.course.date;
import java.time.Duration;
import java.time.LocalDateTime;

public interface HumanReadableTimestamp {

    String getHumanReadableTimestamp(LocalDateTime timestamp);
}

class HumanReadableTimestampImpl implements HumanReadableTimestamp {
    @Override
    public String getHumanReadableTimestamp(LocalDateTime timestamp) {
        LocalDateTime currentDateTime = LocalDateTime.now();

        if (timestamp.isAfter(currentDateTime)) {
            return "Invalid timestamp";
        }

        Duration duration = Duration.between(timestamp, currentDateTime);

        if (duration.toMinutes() < 60) {
            long minutes = duration.toMinutes();

            if (minutes == 1 || minutes % 10 == 1) {
                return "опубликовано " + minutes + " минуту назад";
            } else if (minutes >= 2 && minutes <= 4 || minutes % 10 >= 2 && minutes % 10 <= 4) {
                return "опубликовано " + minutes + " минуты назад";
            } else {
                return "опубликовано " + minutes + " минут назад";
            }
        } else if (duration.toHours() < 24) {
            long hours = duration.toHours();

            if (hours == 1 || hours % 10 == 1) {
                return "опубликовано " + hours + " час назад";
            } else if (hours >= 2 && hours <= 4 || hours % 10 >= 2 && hours % 10 <= 4) {
                return "опубликовано " + hours + " часа назад";
            } else {
                return "опубликовано " + hours + " часов назад";
            }
        } else if (duration.toDays() == 1) {
            return "опубликовано вчера";
        } else {
            long days = duration.toDays();

            if (days == 1 || days % 10 == 1) {
                return "опубликовано " + days + " день назад";
            } else if (days >= 2 && days <= 4 || days % 10 >= 2 && days % 10 <= 4) {
                return "опубликовано " + days + " дня назад";
            } else {
                return "опубликовано " + days + " дней назад";
            }
        }
    }
}


