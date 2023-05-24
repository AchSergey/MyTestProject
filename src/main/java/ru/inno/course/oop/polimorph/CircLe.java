package ru.inno.course.oop.polimorph;

public class CircLe implements HasArea {

    public int r;
    private double Pi = 3.14;

    public CircLe(int r) {
        this.r = r;
    }

    public double area() {
        return Pi * r * r;
    }
}
