package ru.inno.course.exceptions;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

public class Playground {

    public static void main(String[] args)  {

        try {

            List<String> lines = Files.readAllLines(Path.of("D:/Рабочий стол/учёба.../Тестировщик автоматизация/примеры/новый 1.txt"));
            for (String line : lines) {
                System.out.println(line);

            }
        } catch (IOException ex) {
            System.out.println("Проблемка. Нет такого файла или не правильно указан путь!");
            System.out.println(ex.getMessage());
        } finally {

        }

        System.out.println("Finish");

        LinkedList<String> s = new LinkedList<>();
        s.add("test");
        try {
            s.get(10); // запрос элемента по индексу
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}


//      try {
//            //open
//            //write
//        } catch (Exception ex) { // проблема может быть разной
//            System.out.println("не смогли отправить запрос");
//        } finally {
//            //close
//            System.out.println("Печать в консоль");
//        }
//        System.out.println("Finish");