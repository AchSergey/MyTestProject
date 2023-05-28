package ru.inno.course.calculator;

import java.util.Objects;

public class Player {

    private int id;
    private final String nickname;
    private boolean isOnline;

    public Player(int id, String nickname, boolean isOnline) {
        this.id = id;
        this.nickname = nickname;
        this.isOnline = isOnline;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Player player = (Player) obj;
        return id == player.id;
    }

    // Переопределение метода hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", isOnline=" + isOnline +
                '}';
    }
}
