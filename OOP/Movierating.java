/*Q.2
Movie Rating System
Create a Movie class with: id, title, rating, collection.
Task:
Accept details of 10 movies.
Display top 3 highest-rated movies.
Display movie with maximum collection. */



import java.util.*;

class Movie {
    private int id;
    private String title;
    private int rating;
    private int collection;

    public void setid(int id) {
        this.id = id;
    }

    public int getid() {
        return id;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public String gettitle() {
        return title;
    }

    public void setrating(int rating) {
        this.rating = rating;
    }

    public int getrating() {
        return rating;
    }

    public void setCollection(int collection) {
        this.collection = collection;
    }

    public int getCollection() {
        return collection;
    }
}

public class Movierating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of movies: ");
        int n = sc.nextInt();
        Movie[] m1 = new Movie[n];

        // Accept movie details
        for (int i = 0; i < n; i++) {
            m1[i] = new Movie();
            System.out.println("\nEnter Movie " + (i + 1) + " Details:");

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            System.out.print("Enter Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Rating: ");
            int rating = sc.nextInt();

            System.out.print("Enter Collection: ");
            int collection = sc.nextInt();

            m1[i].setid(id);
            m1[i].settitle(title);
            m1[i].setrating(rating);
            m1[i].setCollection(collection);
        }

        // Sort by rating in descending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (m1[i].getrating() < m1[j].getrating()) {
                    Movie temp = m1[i];
                    m1[i] = m1[j];
                    m1[j] = temp;
                }
            }
        }

        
        System.out.println("\nTop 3 Highest-Rated Movies:");
        for (int i = 0; i < 3 && i < n; i++) {
            System.out.println("Title: " + m1[i].gettitle() + "  Rating: " + m1[i].getrating());// Display top 3 movies by rating
        }

        
        Movie max = m1[0];
        for (int i = 1; i < n; i++) {
            if (m1[i].getCollection() > max.getCollection()) { // Find the movie with the highest collection
                max = m1[i];
            }
        }

        System.out.println("\nMovie with Highest Collection:");
        System.out.println("Title: " + max.gettitle() + " Collection: " + max.getCollection());
    }
}
/*
ouput:
Enter the number of movies: 5

Enter Movie 1 Details:
Enter ID: 1
Enter Title: de dakkha
Enter Rating: 5
Enter Collection: 10000

Enter Movie 2 Details:
Enter ID: 2
Enter Title: three idiot
Enter Rating: 7
Enter Collection: 15000

Enter Movie 3 Details:
Enter ID: 3
Enter Title: saiyara
Enter Rating: 4
Enter Collection:
2000

Enter Movie 4 Details:
Enter ID: 5
Enter Title: tiger
Enter Rating: 8
Enter Collection: 2000

Enter Movie 5 Details:
Enter ID: 5
Enter Title: shershah
Enter Rating: 9
Enter Collection: 10000

Top 3 Highest-Rated Movies:
Title: shershah  Rating: 9
Title: tiger  Rating: 8
Title: three idiot  Rating: 7

Movie with Highest Collection:
Title: three idiot Collection: 15000 */
