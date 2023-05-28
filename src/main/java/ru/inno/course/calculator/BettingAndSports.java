package ru.inno.course.calculator;

public class BettingAndSports {
    public static void main(String[] args) {
        Player player1 = new Player(12, "Dreamer", true);
        Player player2 = new Player(12, "Dreamer", true);

        System.out.println(player1==player2);
        System.out.println(player1.equals(player2));

        if(player1==player2) {
            System.out.println("Это один игрок");
        }else {
            System.out.println("Это разные люди");
        }

    }
}
