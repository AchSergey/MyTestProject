package ru.inno.course.oop;

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {

        this.name = name;
        this.salary = salary;
    }

    // public - можно вызывать откуда угодно
    // void - ничего не возвращает (своего рода заглушка)
    // setBonus - это просто придуманное название метода
    // () - параметры
    public void setBonus(double rate) {

        double checkedRate = checkRate(rate);
        this.salary = this.salary * (1 + checkedRate);
        System.out.println("Увеличиваем зп для " + this.name + ": " + this.salary);

    }

    private double checkRate(double rateToCheck) {
        if (rateToCheck > 0.2) {
            rateToCheck = 0.2;
        }
        if (rateToCheck < 0) {
            rateToCheck = 0;
        }
        return rateToCheck;
    }

}

