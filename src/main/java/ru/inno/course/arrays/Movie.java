package ru.inno.course.arrays;

public class Movie {

    String name;
    int rating;
    String genre;
    String country;
    boolean isThereOskar;
    String year;

      public Movie( String year, String name,  int rating, String genre, String country, boolean isThereOskar){
          this.name = name;
          this.rating = rating;
          this.genre = genre;
          this.country = country;
          this.isThereOskar =isThereOskar;
          this.year = year;



    }
}
