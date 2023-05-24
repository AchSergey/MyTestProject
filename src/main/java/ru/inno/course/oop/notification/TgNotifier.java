package ru.inno.course.oop.notification;

import ru.inno.course.oop.User;

public class TgNotifier implements Notifier{
    @Override
    public void notifyUser(User user, String text) {

        String tg = user.getTg();
        System.out.println("Уведомляем пользователя " + user.getName() + " no " + tg + ": " + text);

    }
}
