Q. Problem:
 Create a movie playlist using an ArrayList<String>. Perform the following operations:
Add 8 movies.
Display the playlist.
Remove all movies starting with letter "A".
Insert a new movie at index 2.
Reverse the playlist and display it.
Explanation:
Tests add(), removeIf(), add(index, element), Collections.reverse().
Demonstrates how ArrayList can be manipulated dynamically.

import java.util.*;

public class MoviePlaylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        ArrayList<String> playlist = new ArrayList<>();

        
        System.out.println("Enter 8 movie names:");
        for (int i = 0; i < 8; i++) {
            playlist.add(sc.nextLine());
        }

        
        System.out.println("Original Playlist: " + playlist);

      
        playlist.removeIf(movie -> movie.toUpperCase().startsWith("A"));
        System.out.println("After removing movies starting with 'A': " + playlist);

       
        System.out.println("Enter a new movie to insert at index 2:");
        String newMovie = sc.nextLine();
        if (playlist.size() >= 2) {
            playlist.add(2, newMovie);
        } else {
            
            playlist.add(newMovie);
        }
		
        System.out.println("After inserting new movie: " + playlist);

        
        Collections.reverse(playlist);
        System.out.println("Reversed Playlist: " + playlist);
    }
}
