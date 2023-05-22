package ru.inno.course.oop;

public class myProgram {
    public static void main(String[] args) {

        Item trousers = new Item("брюки", 11, 2500, 56, "синие");
        Item dress = new Item("платье вечернее", 22, 18000, 5, "черное");
        Item shoes = new Item("туфли женские", 97, 7500, 15, "черные");
        Item handbag = new Item("сумочка женская", 17, 9500, 11, "персиковая");
        Item shirt = new Item("рубашка мужская", 19, 2500, 157, "белая");

        System.out.println("брюки " + trousers.color + " " + "рубашка " + shirt.color);
        System.out.println(dress.articleNumber + " " + dress.name + " " + dress.price +
                " " + dress.quantity + " " + dress.color);
        System.out.println(shoes.articleNumber + "-" + shoes.name + "-" + shoes.price + "-"
                + shoes.quantity + "-" + shoes.color);


//        Flat My = new Flat("Москва, Шаболовка 37", 2, 5, 3);
//        System.out.println(My.address);
//        System.out.println(My.entrance);
//        System.out.println(My.floor);
//        System.out.println(My.numberOfRooms);


    }

}


//        User ivan = new User("ivanivanych@mail.ru", "Ivan", 36 );
//
//        System.out.println(ivan.name);
//        System.out.println(ivan.isOnline);
//        System.out.println(ivan.rating);
//        System.out.println(ivan.phone);

//        User alena = new User("alenushka@mail.ru", "Alena", 18);
//
//        System.out.println(alena.name);
//        System.out.println(alena.isOnline);
//        System.out.println(alena.rating);

//        ivan.email = "ivanivanych@mail.ru"; //!
//        ivan.age = 36; //!
//        ivan.name = "Ivan"; //!
//        ivan.isOnline = true; //true
//        ivan.phone = "89895331331"; //**
//        ivan.rating = 10; //0
//        System.out.println(ivan.name);
//

//        User alena = new User();
//        alena.email = "alenushka@mail.ru";
//        Smartphone iphone = new Smartphone();
//        iphone.brand = "Apple";
//        iphone.model = "5s";
//        iphone.os = "ios";

