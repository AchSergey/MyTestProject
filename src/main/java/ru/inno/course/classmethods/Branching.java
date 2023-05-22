package ru.inno.course.classmethods;

public class Branching {

    public static void main(String[] args) {

//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        int balance = 5;
//        if(balance==10) {
//            System.out.println("Десятка");
//        } else {
//            if(balance>10) {
//                System.out.println("Баланс большой");
//            } else {
//                System.out.println("Недостаточный баланс");
//            }
//        }

//        int a = 18;
//        if(a%2 == 0) {
//            System.out.println("Четное число.");
//        } else {
//            System.out.println("Нечетное число.");
//        }

        int a = 18;
        if (a % 2 == 0) {
            System.out.println("Четное число.");
        }
        if (a % 4 == 0) {
            System.out.println("Четное число. Кратно четырем");
        }
        if (a % 3 == 0) {
            System.out.println("Нечетное число. Кратно трем.");
        } else {
            System.out.println("Нечетное число.");
        }


    }
}