package ru.inno.course.classAndObject;

public class Movie {
    private String title;
    private double rating;
    private int counter;

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }

    public int getCounter() {
        return counter;
    }

    public Movie(String title) {
        this.title = title;
        rating = 0;
        counter = 0;
    }

    public void rate(double rating) {
        // if rating > 10
        // if rating < 10

        double newVal = this.rating + rating;
        int newCounter = this.counter += 1;
        this.rating = newVal / newCounter;
    }
}
