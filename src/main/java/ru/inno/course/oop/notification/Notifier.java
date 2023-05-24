package ru.inno.course.oop.notification;

import ru.inno.course.oop.User;
public interface Notifier {
    void notifyUser(User user, String text);

    default void test() {
        System.out.println("Не поддерживается");
    }

}
