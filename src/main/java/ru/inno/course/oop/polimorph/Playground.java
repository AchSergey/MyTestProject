package ru.inno.course.oop.polimorph;

public class Playground {

    public static void main(String[] args) {
//        CircLe circLe = new CircLe(2);
//        double Scircle = circLe.area();
//
//        Rect rect = new Rect(4,5);
//        int Srect = (int) rect.area();
//
//        System.out.println(Scircle);
//        System.out.println(Srect);
//
//        HasArea circLe = new CircLe(2);
//        CircLe circLe2 = new CircLe(2);
//
//        circLe2.area();
//        circLe.area();

        HasArea[] shapes = new HasArea[2];
        shapes[0] = new Rect(4, 5);
        shapes[1] = new CircLe(2);

        for (HasArea shape : shapes) {
            System.out.println(shape.area());
            
        }

    }
}
