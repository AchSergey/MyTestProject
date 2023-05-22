package ru.inno.course.conditions;

public class ComplexCondition {

    public static void main(String[] args) {

        boolean wantToReceiveNotification = true;
        boolean smsNotification = true;
        boolean emailNotification = true;
        if (wantToReceiveNotification) {

            if (smsNotification) {
                System.out.println("Отправляем смс уведомление");
            } else {
                System.out.println("Отправляем email");
            }
        } else {

            System.out.println("Никак не уведомили");

        }
    }
}
