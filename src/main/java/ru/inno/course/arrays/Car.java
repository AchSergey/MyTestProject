package ru.inno.course.arrays;

public class Car {

    private String color;
    private String brand;
    private String model;
    private int hp;

    public String getPlateNumber() {
        return plateNumber;
    }

    private String plateNumber;

    public Car(String color, String brand, String model, int hp, String carPlateNumber) {
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.hp = hp;
        plateNumber = carPlateNumber;
    }

    public  void beep() {
        System.out.println("Beeeeeep!");
    }
    public int getHp() {
        return this.hp;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
