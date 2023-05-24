package ru.inno.course.oop.notification;

import ru.inno.course.oop.User;

public class Processor {

    public static void main(String[] args) {

        String notificationType = "email";
        User usr = new User("Ivan", "abv@cd.ru", "+79997543322", "@tg-adf");

        Notifier notifier = null;

        switch (notificationType) {
            case "sms":
                notifier = new SmsNotifier();
                break;
            case "email":
                notifier = new EmailNotifier();
                break;
            case "tg":
                notifier = new TgNotifier();
                break;
            default:
                System.out.println("Ничего не нужно делать");
        }
        notifier.notifyUser(usr, "Всё хорошо!");
        notifier.test();
    }
}

