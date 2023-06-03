package ru.inno.course.hw;

import jakarta.xml.bind.JAXBException;

public class TestClassXML {
    public static void main(String[] args) throws JAXBException {

        PlayerServiceXML playerServiceXML = new PlayerServiceXML();
        playerServiceXML.addPlayer(new Player(11, "player1", 0, true));
        playerServiceXML.addPlayer(new Player(7, "player2", 0, true));
        playerServiceXML.addPlayer(new Player(6, "player3", 8, false));
        playerServiceXML.addPoints(11, 5);
        playerServiceXML.addPoints(7, 5);
        playerServiceXML.addPoints(6, 2);

        int playerNumberToUpdate = 7;
        int pointsToAdd = 0;
        playerServiceXML.deletePlayer(1);

        System.out.println(playerServiceXML.getPlayers());

        int updatedPoints = playerServiceXML.addPoints(playerNumberToUpdate, pointsToAdd);
        if (updatedPoints != -1) {
            System.out.println("Обновленный рейтинг: " + updatedPoints);
        } else {
            System.out.println("Игрок не найден.");
        }

    }

}


