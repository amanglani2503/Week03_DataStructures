package day1linkedlist.doublylinkedlist.moviemanagementsystem;

public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieLinkedList movieList = new MovieLinkedList();

        movieList.addAtBeginning("Inception", "Christopher Nolan", 2010, 4.3);
        movieList.addAtBeginning("Inception2", "Christopher Nolan", 2010, 4.7);
        movieList.addAtBeginning("Inception3", "Christopher Nolan", 2010, 4.3);
        movieList.addAtBeginning("Inception4", "Christopher Nolan", 2010, 4.3);

        movieList.addAtPosition("Inception5", "Christopher Nolan", 2010, 4.3, 3);
        movieList.addAtPosition("Inception6", "Christopher Nolan", 2010, 4.3, 4);
        movieList.addAtPosition("Inception7", "Christopher Nolan", 2010, 4.3, 2);

        movieList.addAtEnd("Inception10", "Christopher Nolan", 2010, 4.3);
        movieList.addAtEnd("Inception100", "Christopher Nolan", 2010, 4.3);
//        movieList.displayMovieList();

        MovieNode searchNode = movieList.searchMovie("Inception4", 4.7);
        if(searchNode != null){
            System.out.println("Movie Title: " + searchNode.movieTitle);
            System.out.println();
        }

//        movieList.removeMovie("Inception100");
//        movieList.updateRating("Inception", 5);
//        movieList.displayMovieList();
        System.out.println("\n\n");
        movieList.displayMovieListReverse();


    }
}
