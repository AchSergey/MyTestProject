package ru.inno.course.classmethods;

public class UrlCheck {
    public static void main(String[] args) {
        String url = "http://vk.com";

        if (url.startsWith("https://")) {
            System.out.println("Соединение безопасное");
        } else {
            System.out.println("Небезопасно. Не указывайте логины, пароли и данные банковских карт");
        }
    }
}

