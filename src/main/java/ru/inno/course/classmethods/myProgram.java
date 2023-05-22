package ru.inno.course.classmethods;

import java.util.Scanner;

public class myProgram {

    public static void main(String[] args) {

//        Card card = new Card("1234 5678 9012 3456", "08.23/08.26", 123, "0102");
//        card.printMaskedNumber();
//        card.printUpPinCode("1234");
//        card.printUpPinCode("0102");

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите PIN-код: ");
//        String pin = sc.nextLine();

        Car car = new Car("Volvo", "S60");
        int speed = car.getCurrentSpeed();
        System.out.println(speed); // 0
        car.speedUp(25);
        speed = car.getCurrentSpeed();
        System.out.println(speed); // 25
        car.brake();
        speed = car.getCurrentSpeed();
        System.out.println(speed); // 15
        car.brake();
        speed = car.getCurrentSpeed();
        System.out.println(speed); // 5
        car.brake();
        speed = car.getCurrentSpeed();
        System.out.println(speed); // 0

    }
}
