package ru.inno.course.oop.polimorph;

public class Rect implements HasArea {

    private int a;
    private int b;

    public Rect(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a * b;
    }
}
