package ru.inno.course.oop;

public class Office {

    public static void main(String[] args) {

        Employee jack = new Employee("Jack", 1000);
        // плохой вариант
//        double bonus = 0.25;
//        if (bonus > 0.1) {
//            bonus = 0.1;
//        }
//        jack.salary = jack.salary * (1 + bonus);
//
//        System.out.println(jack.salary);

        Employee rose = new Employee("Rose", 100);
        rose.setBonus(-1);
        System.out.println(rose.salary);

        Employee mike = new Employee("Mike", 100);
        mike.setBonus(0.25);
        System.out.println(mike.salary);
    }
}
