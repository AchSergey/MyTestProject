package ru.inno.course.oop;

public class SocialMedia {

    public static void main(String[] args) {

        Post post = new Post();

        System.out.println(post);

        post.incrementLike();
        post.incrementLike();
        post.incrementLike();
        post.incrementLike();
        System.out.println();
    }
}
