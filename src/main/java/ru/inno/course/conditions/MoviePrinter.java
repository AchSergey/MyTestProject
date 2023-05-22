package ru.inno.course.conditions;

public class MoviePrinter {

    public static void main(String[] args) {

        Movie movie = new Movie("Знакомтесь, Джо Блэк", 1999, false);
        //Movie movie1 = new Movie("Формула воды", 2016, true);


        if (movie.hasOskar) {
            System.out.println("[OSCAR]" + movie.title + " (" + movie.year + ")");

        } else {
            System.out.println(movie.title + " (" + movie.year + ")");

        }
    }
}
