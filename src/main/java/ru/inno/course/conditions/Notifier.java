package ru.inno.course.conditions;

public class Notifier {

    public static void main(String[] args) {

        String notificationType = "post";

//      if(notificationType.equals("sms")) {
//
//      } else {
//          if(notificationType.equals("email")) {
//
//          } else {
//              if(notificationType.equals("push")) {
//
//              } else {
//
//              }
//          }
//      }

        switch (notificationType) {
            case "sms":
                System.out.println("по смс");
                break;
            case "email":
                System.out.println("по email");
                break;
            case "push":
                System.out.println("по push");
                break;
            case "tg":
                System.out.println("по tg");
                break;
            case "call":
                System.out.println("manager call");
                break;
            default:
                System.out.println("Ничего не нужно делать");
        }
        System.out.println("finish");
    }
}
