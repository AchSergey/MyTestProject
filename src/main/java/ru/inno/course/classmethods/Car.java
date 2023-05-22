package ru.inno.course.classmethods;

public class Car {
    private String brand;
    private String model;
    private int currentSpeed;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.currentSpeed = 0;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void speedUp(int speedIncrease) {
        currentSpeed += speedIncrease;
    }

    public void brake() {
        currentSpeed -= 10;
        if (currentSpeed < 0) {
            currentSpeed = 0;
        }
    }
}