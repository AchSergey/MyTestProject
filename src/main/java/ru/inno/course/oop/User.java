package ru.inno.course.oop;

public class User {

    // свойства (properties)

    String name;
    int age;
    String email;
    String phone;
    String tg;
    boolean isOnline;
    double rating;

    public User(String name, String email, String phone, String tg) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.tg = tg;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getTg() {
        return tg;
    }
}

