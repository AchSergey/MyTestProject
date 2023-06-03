package ru.inno.course.hw;
import java.io.IOException;

public class TestClassJson {
    public static void main(String[] args) throws IOException {
        PlayerServiceJSON playerServiceJSON = new PlayerServiceJSON();
        playerServiceJSON.addPlayer(new Player(11,"player1", 0, true));
        playerServiceJSON.addPlayer(new Player(7,"player2", 0, true));
        playerServiceJSON.addPlayer(new Player(6,"player3", 8, false));
        playerServiceJSON.addPoints(11,5);
        playerServiceJSON.addPoints(7,5);
        playerServiceJSON.addPoints(6,2);
        int playerNumberToUpdate = 7;
        int pointsToAdd = 0;
        playerServiceJSON.deletePlayer(1);

        System.out.println(playerServiceJSON.getPlayers());

        int updatedPoints = playerServiceJSON.addPoints(playerNumberToUpdate,pointsToAdd);
        if (updatedPoints != -1) {
            System.out.println("Обновленный рейтинг: " + updatedPoints);
        } else {
            System.out.println("Игрок не найден.");
        }
       
    }
    
}






