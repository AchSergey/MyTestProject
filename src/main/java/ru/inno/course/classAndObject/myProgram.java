package ru.inno.course.classAndObject;

public class myProgram {
    public static void main(String[] args) {

        User ivan = new User("ivan");
        User alena = new User("Alena");

        Movie m = new Movie("Toy story 3");

        ivan.rateMovie(m, 8.0);
        alena.rateMovie(m, 9.2);
        System.out.println(m.getRating());
        System.out.println(m.getCounter());
    }
}
