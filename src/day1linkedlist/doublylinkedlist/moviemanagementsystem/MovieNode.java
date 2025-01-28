package day1linkedlist.doublylinkedlist.moviemanagementsystem;

public class MovieNode {
    String movieTitle;
    String director;
    int yearOfRelease;
    double rating;
    MovieNode next;
    MovieNode prev;

    public MovieNode(String movieTitle, String director, int yearOfRelease, double rating) {
        this.director = director;
        this.movieTitle = movieTitle;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
