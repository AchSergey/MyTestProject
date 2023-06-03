package ru.inno.course.hw;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import ru.inno.course.serializer.Book;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@XmlRootElement
public class PlayerServiceXML implements PlayerService {


    @XmlElement
    private List<Player> players;

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public PlayerServiceXML() {
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
    public Collection<Player> getPlayers() throws  JAXBException {
        JAXBContext context = JAXBContext.newInstance(PlayerServiceXML.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(this, Path.of("D:/Рабочий стол/учёба/Тестировщик автоматизация/Проекты на Java/MyTestProject/src/main/resources/xml/player.xml").toFile());
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

