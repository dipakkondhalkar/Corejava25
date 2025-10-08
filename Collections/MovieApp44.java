/*10. WAP to create a Movie class with id, name, and rating, store 10 movies in a Vector,
 and display the movie(s) with the highest rating.*/
 
 
import java.util.*;
class Movie
{
	private int id;
	private String name;
	private int rating;
	
	public Movie(int id, String name, int rating)
	{
		this.id = id;
		this.name = name;
		this.rating = rating;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getRating()
	{
		return rating;
	}
}

public class MovieApp44
{
	public static void main(String x[])
	{
		Vector <Movie> v = new Vector<Movie>();
		v.add(new Movie(101, "Titanic", 5));
		v.add(new Movie(102, "Koi Mil Gaya", 7));
		v.add(new Movie(103, "Drishyam", 9));
		v.add(new Movie(104, "Panchayat", 8));
		v.add(new Movie(105, "Sanam Teri Kasam", 5));
		v.add(new Movie(102, "Koi Mil Gaya", 7));
		v.add(new Movie(103, "Titanic", 9));
		v.add(new Movie(104, "Panchayat", 8));
		v.add(new Movie(103, "Sanam Teri Kasam", 9));
		v.add(new Movie(104, "Titanic", 5));
		
		 int maxRating = v.get(0).getRating();
        for (int i = 1; i < v.size(); i++) 
		{
            int rating = v.get(i).getRating();
            if (rating > maxRating) 
			{
                maxRating = rating;
            }
        }

     
        System.out.println("Movies with the highest rating (" + maxRating + "):");
        for (int i = 0; i < v.size(); i++) 
		{
            Movie m = v.get(i);
            if (m.getRating() == maxRating) 
			{
                System.out.printf("%d\t%s\t%d\n", m.getId(), m.getName(), m.getRating());
            }
        }
    }
}