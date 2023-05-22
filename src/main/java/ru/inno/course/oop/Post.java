package ru.inno.course.oop;

public class Post {
    String url;
    private int likes;
    String[] comments;
    String publishDate;

    public Post() {
        this.likes = 0;
    }


    public void incrementLike() {
        this.likes += 1;
    }
}