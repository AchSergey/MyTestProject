package ru.inno.course.classmethods;

public class PasswordCheck {
    public static void main(String[] args) {
        String password = "password123$";

        // Проверка длины пароля
        if (password.length() < 8) {
            System.out.println("Пароль не менее 8 символов");
        }
        // Проверка наличия цифр в пароле
        else if (!password.matches(".*\\d.*")) {
            System.out.println("Пароль должен содержать минимум 1 цифру");
        }
        // Проверка наличия специальных символов в пароле
        else if (!password.matches(".*[!@#$%^&*№].*")) {
            System.out.println("Пароль должен содержать минимум 1 спецсимвол");
        }
        // Пароль удовлетворяет всем условиям
        else {
            System.out.println("Пароль принят");
        }
    }
}

