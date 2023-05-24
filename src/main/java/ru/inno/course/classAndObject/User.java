package ru.inno.course.classAndObject;

public class User {

    // свойства (properties)

    String name;
    int age;
    String email;
    String phone;
    boolean isOnline;
    double rating;

    public User(String name) {
        this.name = name;
    }

    public void rateMovie(Movie movie, double rating) {
        System.out.println(this.name + ": оценивает фильм " + movie.getTitle() + " , " + rating);
        movie.rate(rating);
    }
    public User clone() {
        User newUser = new User(this.name);
        return newUser;
    }
}

