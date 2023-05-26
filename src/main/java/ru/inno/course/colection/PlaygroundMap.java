package ru.inno.course.colection;

import java.util.HashMap;
import java.util.Map;

public class PlaygroundMap {

    public static void main(String[] args) {

        Map<String,Point> points = new HashMap();

        points.put("a", new Point(1,2));
        points.put("b", new Point(1,3));
        points.put("c", new Point(4,3));
        points.put("d", new Point(5,3));

        System.out.println(points.get("c"));
        System.out.println(points.size());

    }
}
