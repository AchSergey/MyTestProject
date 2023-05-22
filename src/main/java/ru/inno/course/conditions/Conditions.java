package ru.inno.course.conditions;

public class Conditions {
    public static void main(String[] args) {

        System.out.println("start");

        boolean smsNotification = true;
        boolean emailNotification = false;
        if (smsNotification) {

            System.out.println("Отправляем смс уведомление");
        }
        if (emailNotification) {

            System.out.println("Отправляем email");
        } else {

            System.out.println("Никак не уведомили");
        }

        System.out.println("finish");
    }
}
