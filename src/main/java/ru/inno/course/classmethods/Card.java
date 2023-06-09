package ru.inno.course.classmethods;

public class Card {
    private String number;
    private String validityPeriod;
    private int cvv;

    private String pinCod;

    public String getNumber() {
        return number;
    }


    public String getValidityPeriod() {
        return validityPeriod;
    }


    public int getCvv() {
        return cvv;
    }


    public String getPinCod() {
        return pinCod;
    }


    public Card(String number, String validityPeriod, int cvv, String pinCod) {
        this.number = number;
        this.validityPeriod = validityPeriod;
        this.cvv = cvv;
        this.pinCod = pinCod;
    }

    public void printMaskedNumber() {
        String maskedNumber = "**** **** **** " + number.substring(number.length() - 4);
        System.out.println(maskedNumber);
    }


    public void printUpPinCode(String upPinCode) {
        if (upPinCode.equals(pinCod)) {
            System.out.println(number);
        } else {
            System.out.println("Не верный пин код!");
        }
    }

}

