package ru.inno.course.calculator;

import java.util.*;

public class Tournament {
    public static void main(String[] args) {
        Set<Player> players = new HashSet<>();

        // Создание 10 игроков и добавление их в хранилище
        Player player1 = new Player(1, "Player1", true);
        Player player2 = new Player(2, "Player2", true);
        Player player3 = new Player(3, "Player3", false);
        Player player4 = new Player(4, "Player4", true);
        Player player5 = new Player(5, "Player5", true);
        Player player6 = new Player(6, "Player6", false);
        Player player7 = new Player(7, "Player7", true);
        Player player8 = new Player(8, "Player8", false);
        Player player9 = new Player(9, "Player9", true);
        Player player10 = new Player(10, "Player10", false);

        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        players.add(player6);
        players.add(player7);
        players.add(player8);
        players.add(player9);
        players.add(player10);

        // Убедитесь, что дубликаты не добавляются
        Player player11 = new Player(1, "Player1", true);
        players.add(player11);

        // Создание Map для хранения очков игроков
        Map<Player, Integer> points = new HashMap<>();
        points.put(player1, 0);
        points.put(player2, 0);
        points.put(player3, 0);
        points.put(player4, 0);
        points.put(player5, 0);
        points.put(player6, 0);
        points.put(player7, 0);
        points.put(player8, 0);
        points.put(player9, 0);
        points.put(player10, 0);

        // Обновление очков игроков
        points.put(player4, 10);
        points.put(player7, 12);
        points.put(player8, 11);
        points.put(player9, 13);
        points.put(player10, 5);

        // Получение трех лучших игроков
        List<Map.Entry<Player, Integer>> sortedPlayers = new ArrayList<>(points.entrySet());
        sortedPlayers.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        System.out.println("Топ 3 игрока:");

        for (int i = 0; i < 3 && i < sortedPlayers.size(); i++) {
            Map.Entry<Player, Integer> entry = sortedPlayers.get(i);
            Player player = entry.getKey();
            int point = entry.getValue();
            System.out.println("Игрок: " + player.toString() + ", Очки: " + point);
        }

    }
}