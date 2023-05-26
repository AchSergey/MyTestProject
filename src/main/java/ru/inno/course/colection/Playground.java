package ru.inno.course.colection;

public class Playground {
    public static void main(String[] args) {

        // 1. BD
        Book bookFromDB = new Book("12 стульев", "И.Ильф и Е.Петров", "Юмор", "1234-654-09876", 250);

        //Book duplicate = bookFromDB;
        // 2. XML
        Book bookFromXML = new Book("12 стульев", "И.Ильф и Е.Петров", "Юмор", "1234-654-09876", 250);
        // 3. Проверить, что это одна и та же книга
        //System.out.println(bookFromDB==bookFromXML); // false это два разных объекта (не корректное сравнение)
        // самый простой (не лучший) способ сравнить два объекта
//        System.out.println(bookFromDB.getTitle().equals(bookFromXML.getTitle()));
//        System.out.println(bookFromDB.getAuthor().equals(bookFromXML.getAuthor()));
//        System.out.println(bookFromDB.getGenre().equals(bookFromXML.getGenre()));
//        System.out.println(bookFromDB.getISBN().equals(bookFromXML.getISBN()));
//        System.out.println(bookFromDB.getPrice()==bookFromXML.getPrice());


        // System.out.println(bookFromDB.equals(bookFromXML));
//        System.out.println(bookFromDB.equals(bookFromXML));
//
//        System.out.println(bookFromDB.hashCode());
//        System.out.println(bookFromXML.hashCode());

        // коллизия
        Point p1 = new Point(1, 4);
        Point p2 = new Point(2, 3);

        System.out.println(p2.equals(p1));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(bookFromDB);
    }
}
