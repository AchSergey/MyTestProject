package ru.inno.course.oop;

public class User {

    // свойства (properties)

    String name;
    int age;
    String email;
    String phone;
    boolean isOnline;
    double rating;

    public User(String futureEmail, String futureName, int futureAge){
        email = futureEmail;
        name = futureName;
        age = futureAge;
        isOnline = true;
        rating = 0;
        phone = "1111";
        System.out.println("я создался!");

    }
}
