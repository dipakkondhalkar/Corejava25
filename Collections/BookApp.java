/*Q5. Sort Books by Title (Alphabetically)
Create a Book class with id, title, and author.
Store books in an ArrayList.
Sort them alphabetically by title.
 Explanation:
 This shows how to sort strings (lexicographically) using compareToIgnoreCase().*/


import java.util.*;

class Book implements Comparable {
    private int id;
    private String title;
    private String author;

    // Constructor
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // Getters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    // compareTo method to sort alphabetically by title
    public int compareTo(Object o) {
        Book b = (Book)o; // cast Object to Book
        return this.title.compareToIgnoreCase(b.title);
    }
}

public class BookApp {
    public static void main(String[] args) {
        // Raw ArrayList (without generics)
        List books = new ArrayList();
        books.add(new Book(101, "Titanic", "James Cameron"));
        books.add(new Book(102, "Koi Mil Gaya", "Rakesh Roshan"));
        books.add(new Book(103, "Drishyam", "Nishikant Kamat"));
        books.add(new Book(104, "Panchayat", "Deepak Kumar"));
        books.add(new Book(105, "Sanam Teri Kasam", "Radhika Rao"));

        // Display books before sorting
        System.out.println("Books Before Sorting:");
        for (Object obj : books) {
            Book b = (Book)obj; // cast to Book
            System.out.println(b.getId() + "\t" + b.getTitle() + "\t" + b.getAuthor());
        }

        // Sort books by title
        Collections.sort(books);

        // Display books after sorting
        System.out.println("\nBooks After Sorting by Title:");
        for (Object obj : books) {
            Book b = (Book)obj; // cast to Book
            System.out.println(b.getId() + "\t" + b.getTitle() + "\t" + b.getAuthor());
        }
    }
}
