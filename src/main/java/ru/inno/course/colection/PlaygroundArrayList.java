package ru.inno.course.colection;

import java.util.ArrayList;
import java.util.List;

public class PlaygroundArrayList {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        System.out.println(strings.size());

        for (String s: strings) {
            System.out.println(s);
        }

        String s = strings.get(0);
        System.out.println("s = " + s);

        List<Point> points = new ArrayList<>();
        points.add(new Point(2, 3));
        points.add(new Point(1, 4));

        System.out.println(points.contains(new Point(1, 4)));
    }
}
