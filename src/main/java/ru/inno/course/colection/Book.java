package ru.inno.course.colection;

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private String genre;
    private String ISBN;
    private int price;

    public Book(String title, String author, String genre, String ISBN, int price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.ISBN = ISBN;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getISBN() {
        return ISBN;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    //    public boolean equals(Object o) {
//
//
//        boolean areEquals = true;
//
//        if (!this.getTitle().equals(o.getTitle())) {
//            areEquals = false;
//        }
//        if (!this.getAuthor().equals(o.getAuthor())) {
//            areEquals = false;
//        }
//        if (!this.getGenre().equals(o.getGenre())) {
//            areEquals = false;
//        }
//        if (!this.getISBN().equals(o.getISBN())) {
//            areEquals = false;
//        }
//        if (this.getPrice() != o.getPrice()) {
//            areEquals = false;
//        }
//        return areEquals;
//
//   }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(genre, book.genre) && Objects.equals(ISBN, book.ISBN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, genre, ISBN, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", price=" + price +
                '}';
    }
}

