package ru.inno.course.calculator;

import java.util.ArrayList;
import java.util.List;

public class ListOfCompanies {

    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>();

        Company company1 = new Company("Warner Bros", 1923, List.of("Зеленая миля","Гарри Поттер","Одиннадцать друзей Оушена"));
        List<String> films1 = new ArrayList<>();
        films1.add("Зеленая миля");
        films1.add("Гарри Поттер");
        films1.add("Одиннадцать друзей Оушен");
        company1.setFilms(films1);
        companies.add(company1);

        Company company2 = new Company("Paramount Pictures", 1912,List.of("Вавилон","Придурки","Интерстеллар"));
        List<String> films2 = new ArrayList<>();
        films2.add("Вавилон");
        films2.add("Придурки");
        films2.add("Интерстеллар");
        company2.setFilms(films2);
        companies.add(company2);

        Company company3 = new Company("Columbia Pictures", 1918,List.of("Основной инстинкт", "День сурка","Пятый элемент"));
        List<String> films3 = new ArrayList<>();
        films3.add("Основной инстинкт");
        films3.add("День сурка");
        films3.add("Пятый элемент");
        company3.setFilms(films3);
        companies.add(company3);

        for (int i = 0; i < companies.size(); i++) {
            Company company = companies.get(i);
            System.out.println("Кинокомпания " + (i + 1) + ":");
            System.out.println("Название: " + company.getName());
            System.out.println("Год основания: " + company.getFoundingYear());
            System.out.println("Фильмы:");
            List<String> films = company.getFilms();
            for (int j = 0; j < films.size(); j++) {
                System.out.println("  " + (j + 1) + ": " + films.get(j));
            }
            System.out.println();
        }
    }

}


//List.of("Зеленая миля","Гарри Поттер","Одиннадцать друзей Оушена")

//        Movie film1 = new Movie("Зеленая миля", 10.0, "Фэнтези-драма", "США", true);
//        Movie film2 = new Movie("Зарри Поттер", 9.5, "Фэнтези", "США", true);
//        Movie film3 = new Movie("Одиннадцать друзей Оушена", 9.5, "Детектив", "США", false);
//        Movie film4 = new Movie("Вавилон", 8.0, "Фэнтези-драма", "США", false);
//        Movie film5 = new Movie("Придурки", 6.7, "Комедия", "США", false);
//        Movie film6 = new Movie("Интерстеллар", 6.0, "Фантастика", "США", false);
//        Movie film7 = new Movie("Основной инстинкт", 8.0, "Психологиская драма", "США", true);
//        Movie film8 = new Movie("День сурка", 5.0, "Фэнтези-комедия", "США", false);
//        Movie film9 = new Movie("Пятый элемент", 7.7, "Фэнтези-драма", "США", true);
//        strings.add("Гарри Поттер");
//        strings.add("Одиннадцать друзей Оушена");
//        strings.add("Вавилон");
//        strings.add("Придурки");
//        strings.add("Интерстеллар");
//        strings.add("Основной инстинкт");
//        strings.add("День сурка");
//        strings.add("Пятый элемент");
//        Company company1 = new Company("Warner Bros", "1923", );
//        Company company2 = new Company("Paramount Pictures", "1912", ArrayList.);
//        Company company3 = new Company("Columbia Pictures", "1918", ArrayList);