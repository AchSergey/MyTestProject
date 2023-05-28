package ru.inno.course.calculator;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
        public static void main(String[] args) {
            List<String> tasks  = new ArrayList<>();
            tasks.add("Покормить детей");
            tasks.add("Сделать зарядку");
            tasks.add("Позвонить другу");
            tasks.add("Прочитать книгу");
            tasks.add("Сделать покупки");

            for (int i = 0; i < tasks.size(); i++) {
                String task = tasks.get(i);
                System.out.println("Задача " + (i + 1) + ": " + task);

        }
    }

}
