package ru.inno.course.classmethods;

public class myProgram {

    public static void main(String[] args) {

        Card card = new Card("1234 5678 9012 3456", "08.23/08.26", 123, "0102");
        card.printMaskedNumber();
        card.printUpPinCode("1234");
        card.printUpPinCode("0102");







    }
}
