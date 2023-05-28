package ru.inno.course.calculator;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private int foundingYear;
    private List<String> films;

    public Company(String name, int foundingYear, List<String> films) {
        this.name = name;
        this.foundingYear = foundingYear;
        this.films = films;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public void setFoundingYear(int foundingYear) {
        this.foundingYear = foundingYear;
    }

    public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }
}
