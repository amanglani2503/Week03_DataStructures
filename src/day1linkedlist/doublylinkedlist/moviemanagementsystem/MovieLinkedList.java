package day1linkedlist.doublylinkedlist.moviemanagementsystem;


public class MovieLinkedList {
    private MovieNode head;
    private MovieNode tail;

    public void addAtBeginning(String movieTitle, String director, int yearOfRelease, double rating){
        MovieNode newNode = new MovieNode(movieTitle, director, yearOfRelease, rating);

        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addAtPosition(String movieTitle, String director, int yearOfRelease, double rating, int position){
        if(position < 1){
            System.out.println("Invalid Position");
            return;
        }

        if(position == 1){
            this.addAtBeginning(movieTitle, director, yearOfRelease, rating);
            return;
        }

        MovieNode newNode = new MovieNode(movieTitle, director, yearOfRelease, rating);
        MovieNode current = head;

        while(current != null && position > 2){
            current = current.next;
            position--;
        }

        newNode.next = current.next;
        newNode.prev = current;

        if(current.next != null){
            current.next.prev = newNode;
        } else {
            tail = newNode;
        }
        current.next = newNode;
    }

    public void addAtEnd(String movieTitle, String director, int yearOfRelease, double rating){
        MovieNode newNode = new MovieNode(movieTitle, director, yearOfRelease, rating);

        if(tail == null){
            head = tail = newNode;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void displayMovieList(){
        if (head == null) {
            System.out.println("No Movie records available.");
            return;
        }

        MovieNode current = head;
        System.out.println("Movie Records:");
        while (current != null) {
            System.out.println("Movie Title: " + current.movieTitle );
            System.out.println("Director: " + current.director);
            System.out.println("Year of Release: " + current.yearOfRelease);
            System.out.println("Rating: " + current.rating);
            System.out.println();
            current = current.next;
        }
    }

    public void displayMovieListReverse(){
        if (tail == null) {
            System.out.println("No Movie records available.");
            return;
        }

        MovieNode current = tail;
        System.out.println("Movie Records:");
        while (current != null) {
            System.out.println("Movie Title: " + current.movieTitle );
            System.out.println("Director: " + current.director);
            System.out.println("Year of Release: " + current.yearOfRelease);
            System.out.println("Rating: " + current.rating);
            System.out.println();
            current = current.prev;
        }
    }

    public MovieNode updateRating(String title, double rating){
        if(head == null){
            System.out.println("Empty list");
            return null;
        }

        MovieNode current = head;

        while(current.next != null){
            if(current.movieTitle.equals(title)){
                System.out.println("Movie Found with director name !");
                return current;
            } else if (current.rating == rating) {
                System.out.println("Movie Found with director name !");
                return current;
            }
            current = current.next;
        }

        System.out.println("Movie not found");
        return null;
    }

    public MovieNode searchMovie(String director, double rating){
        if(head == null){
            System.out.println("Empty list");
            return null;
        }

        MovieNode current = head;

        while(current.next != null){
            if(current.director.equals(director)){
                System.out.println("Movie Found with director name !");
                return current;
            }
            if (current.rating == rating) {
                System.out.println("Movie Found with given rating !");
                return current;
            }
            current = current.next;
        }

        System.out.println("Movie not found");
        return null;
    }

    public void removeMovie(String title){
        if(head == null){
            System.out.println("Empty list");
            return;
        }

        if(head.movieTitle.equals(title)){
            head = head.next;
            head.prev = null;
            return;
        }

        MovieNode current = head;

        while(current != null){
            if(current.movieTitle.equals(title)){
                System.out.println("Removing Movie ");
                if(current.next != null){
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                else{
                    current.prev.next = null;
                    tail = current.prev;
                }

                return;
            }
            current = current.next;
        }
        System.out.println("Movie to remove not found !!");
    }
}