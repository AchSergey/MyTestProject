package ru.inno.course.hw;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.Objects;

//@XmlRootElement(name = "player")
@XmlRootElement
public class Player {

    private int id;
    private String nick;
    private int points;
    private boolean isOnline;

    public Player(int id, String nick, int points, boolean isOnline) {
        this.id = id;
        this.nick = nick;
        this.points = points;
        this.isOnline = isOnline;
    }

    public Player() {

    }

    public int getId() {
        return id;
    }

   // @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    //@XmlAttribute
    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getPoints() {
        return points;
    }

    //@XmlAttribute
    public void setPoints(int points) {
        this.points = points;
    }

    public boolean isOnline() {
        return isOnline;
    }

    //@XmlAttribute
    public void setOnline(boolean online) {
        isOnline = online;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player player)) return false;
        return getId() == player.getId() && getPoints() == player.getPoints() && isOnline() == player.isOnline() && Objects.equals(getNick(), player.getNick());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNick(), getPoints(), isOnline());
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", nick='" + nick + '\'' +
                ", points=" + points +
                ", isOnline=" + isOnline +
                '}';
    }
}
