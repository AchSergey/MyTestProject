package ru.inno.course.hw;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class PlayerServiceJSON implements PlayerService {
    public ObjectMapper getMapper() {
        ObjectMapper mapper = new ObjectMapper();
        return mapper;
    }

    private List<Player> players;

    public PlayerServiceJSON() {
        players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    @Override
    public int getPlayerById(int id) {
        for (Player player : players) {
            if (player.getId() == id) {
                return player.getId();
            }
        }
        return id;
    }

    @Override
    public Collection<Player> getPlayers() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(Path.of("D:/Рабочий стол/учёба/Тестировщик автоматизация/Проекты на Java/MyTestProject/src/main/resources/json/player.json").toFile(), players);

        return players;
    }

    @Override
    public int createPlayer(Player player) {
        players.add(player);
        return player.getId();
    }

    @Override
    public Player deletePlayer(int id) {
        Iterator<Player> iterator = players.iterator();
        while (iterator.hasNext()) {
            Player player = iterator.next();
            if (player.getId() == getPlayerById(id)) {
                iterator.remove();
                break;
            }
        }
        return null;
    }


    @Override
    public int addPoints(int playerId, int points) {
        for (Player player : players) {
            if (player.getId() == playerId) {
                int updatedPoints = player.getPoints() + points;
                player.setPoints(updatedPoints);
                return updatedPoints;
            }
        }
        return -1; // Если игрок с указанным номером не найден
    }

}


