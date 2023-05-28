package ru.inno.course.calculator;

import java.util.ArrayList;
import java.util.List;

public class Filmography {
    public static void main(String[] args) {

        List<Movie> films = new ArrayList<>();

        Movie film1 = new Movie("Зеленая миля", 6.0, "Фэнтези-драма", "США", true);
        films.add(film1);

        Movie film2 = new Movie("Миссия невыполнима", 9.5, "Боевик", "США", true);
        films.add(film2);

        Movie film3 = new Movie("Трансформеры", 9.2, "Фантастика-боевик", "США", false);
        films.add(film3);


        for (int i = 0; i < films.size(); i++) {
            Movie movie = (Movie) films.get(i);
            System.out.println("Фильм " + (i + 1) + ":");
            System.out.println("Название: " + movie.getTitle());
            System.out.println("Рейтинг: " + movie.getRating());
            System.out.println("Жанр: " + movie.getGenre());
            System.out.println("Страна: " + movie.getCountry());
            System.out.println("Есть ли оскар: " + (movie.isHasOscar() ? "Есть" : "Нет"));

            System.out.println();
        }


    }
}
