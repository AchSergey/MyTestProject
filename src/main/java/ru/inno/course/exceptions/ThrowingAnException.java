package ru.inno.course.exceptions;

import ru.inno.course.exceptions.Copier;

import java.io.IOException;

public class ThrowingAnException {

    public static void main(String[] args) {

        try {
            Copier.copyTextFile("C://Test/", "D://");
            System.out.println("Файл успешно скопирован.");
        } catch (IOException e) {
            System.out.println("Что-то пошло не так: " + e.getMessage());
        }
    }
}


