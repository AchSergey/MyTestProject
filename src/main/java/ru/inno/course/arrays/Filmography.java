package ru.inno.course.arrays;

public class Filmography {

    public static void main(String[] args) {

        Movie[] films  = new Movie[9];

    films[0] = new Movie("1999", "Крокодил Данди", 6, "Приключение", "США",false);
    films[1] = new Movie("2000", "Миссия невыполнима", 10, "Боевик", "США", true);
    films[2] = new Movie("2002", "Трансформеры", 10, "Фантастика-боевик", "США", true);
    films[3] = new Movie("2016", "Отряд самоубийц", 5, "Боевик", "США",false);
    films[4] = new Movie("2017", "Чудо-женщина", 4, "Фантастика", "США", true);
    films[5] = new Movie("2018", "Лига справедливости", 5, "Боевик", "США",false);
    films[6] = new Movie("1991", "Хищник", 6, "Боевик", "США", true);
    films[7] = new Movie("1987", "Один дома", 6, "Комедия", "США",false);
    films[8] = new Movie("2017", "Ледниковый период", 9, "Мультфильм", "США", true);

    Company company1 = new Company("Paramount Pictures", "1912", films[0], films[1],films[2]);
    Company company2 = new Company("Warner Brothers", "1923", films[3], films[4], films[5]);
    Company company3 = new Company("20th Century Fox", "1935", films[6], films[7], films[8]);


    System.out.println(company1.name + "-" + company1.yearOfFoundation + " Известные фильмы: " + films[0].name +
            "," + films[1].name + "," + films[2].name);
    System.out.println(company2.name + "-" + company2.yearOfFoundation + " Известные фильмы: " + films[3].name +
                "," + films[4].name + "," + films[5].name);
    System.out.println(company3.name + "-" + company3.yearOfFoundation + " Известные фильмы: " + films[6].name +
                "," + films[7].name + "," + films[8].name);

    }
}















//        for (int i = 0; i < films.length; i++) { // тело цикла
//            System.out.println(films[i].year + "-" + films[i].name +"-" + films[i].genre + "-" + films[i].rating);
//        }
