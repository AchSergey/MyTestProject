package ru.inno.course.conditions;

public class Filters {

    public static void main(String[] args) {

        Movie[] movies = new Movie[50];
        // сгенерить тестовые данные
        for (int i = 0; i < 50; i++) {
            movies[i] = new Movie("фильм_" + i, 1995 + i, i % 3 == 0);
        }
        if (movies.length > 0) { // если количество фильмов больше 0
            for (Movie movie : movies) { // для этого списка
                if (movie.hasOskar) { // применяем фильтр (у кого есть Оскар)

                    System.out.println(movie.title);

                }


            }

        }


    }

}
