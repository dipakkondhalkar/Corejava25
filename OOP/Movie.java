/*Q.2
Movie Rating System
Create a Movie class with: id, title, rating, collection.
Task:

Accept details of 10 movies.

Display top 3 highest-rated movies.

Display movie with maximum collection. 
___________________________________________*/


import java.util.Scanner;
class MovieDetails
{
 private int id;
 private String title;
 private int rating;
 private int collection;
 
 void setid(int id)
 {
   this.id = id;
 }
  int getid()
  {
    return id;
  }
  void settitle(String title)
  {
    this.title=title;
  }
  String gettitle()
  {
    return title;
  }
  void setrating(int rating)
  {
    this.rating = rating;
  }
  int getrating()
  {
    return rating;
  }
  void setcollection(int collection)
  {
    this.collection = collection;
  }
  int getcollection ()
  {
    return collection;
  }
}
  class Highestrating
  {
	  void hrate(MovieDetails ab[])
	  {
		  System.out.println("High Rated Movies");
    for(int i=0;i<ab.length;i++)
	{
	  if(ab[i].getrating() > 3 )
	  {
	    System.out.println(ab[i].getid()+"\t"+ab[i].gettitle()+"\t"+ab[i].getrating()+"\t"+ab[i].getcollection());
	  }
	
  }
	  }
} 
 class HighestCollection
  {
	  void hcoll(MovieDetails ab[])
	  {
		  System.out.println("Highest Collection Movies");
    for(int i=0;i<ab.length;i++)
	{
	  if(ab[i].getcollection() > 50000 )
	  {
	    System.out.println(ab[i].getid()+"\t"+ab[i].gettitle()+"\t"+ab[i].getrating()+"\t"+ab[i].getcollection());
	  }
	
  }
	  }
}
public class Movie
{
 public static void main(String x[])
 {
	Highestrating hr = new Highestrating();
	HighestCollection hc = new HighestCollection();
    MovieDetails ab[] = new MovieDetails[5];
   
   for(int i=0;i<ab.length;i++)
   {
     Scanner xyz = new Scanner(System.in);
	 ab[i]= new MovieDetails();
	 System.out.println("Enter the id , title,rating & Collection of Movie");
	      int id = xyz.nextInt();
	 String title = xyz.next();
	int rating = xyz.nextInt();
	int collection = xyz.nextInt();
	ab[i].setid(id);
	ab[i].settitle(title);
	ab[i].setrating(rating);
	ab[i].setcollection(collection);
   }
   hr.hrate(ab);
   hc.hcoll(ab);
 }
}