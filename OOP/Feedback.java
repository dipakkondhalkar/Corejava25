/*Q.5
20. Customer Feedback Analyzer
Class: Feedback
Fields: feedbackId, customerName, rating (1 to 5), comment
Tasks:
Count how many gave 5-star ratings.
Display all feedbacks with rating < 3.
Show average customer rating. */


import java.util.Scanner;
class CustomerFed

{

  private int Cid;
  private String Cname;
  private int Crating;
  private String Ccomment;
 
 
 void setCid(int id)
 {
   Cid = id;
 }
 int getCid()
 {
   return Cid;
 }

 void setCname(String name)
 {
   Cname = name;
 }
  String getCname()
 {
   return Cname;
 }

 void setCrating(int rating)
 {
   Crating = rating;
 }
 int getCrating()
 {
   return Crating;
 } 
 
 void setCcomment(String comment)
 {
   Ccomment = comment;
 }
 String getCcomment()
 {
   return Ccomment;
 }
}
class Show
{
 void showFullRating(CustomerFed b)
 { 
	   System.out.printf("Customer ID: %d, Customer Name:  %s, Customer Rating:  %d, Customer Comment: %s",b.getCid(),b.getCname(),b.getCrating(),b.getCcomment());
	 
   }
   
   void showlessrate(CustomerFed b)
   {
       System.out.printf("Customer ID: %d, Customer Name:  %s, Customer Rating:  %d, Customer Comment: %s",b.getCid(),b.getCname(),b.getCrating(),b.getCcomment());
	 
   }
}	
   
 
 public class Feedback
 {
  public static void main(String x[])
  {
    CustomerFed a[] = new CustomerFed[5];
	Show s = new Show();
    
	
	for(int i=0;i<a.length;i++)
	{
	   a[i] = new CustomerFed();
	  Scanner xyz = new Scanner(System.in);
	  System.out.println("Submit Your Feedback");
	  
	  System.out.println("Enter Customer ID");
	  int id = xyz.nextInt();
	  	  xyz.nextLine();
		  
	  System.out.println("Enter Customer Name");
	      String name = xyz.nextLine();

	  
	  System.out.println("Enter Customer Rating");
	  int rating = xyz.nextInt();
	  	  xyz.nextLine();
	  
	  System.out.println("Enter Customer Comment");
	  String comment = xyz.nextLine();


	  a[i].setCid(id);
	  a[i].setCname(name);
	  a[i].setCrating(rating);
	  a[i].setCcomment(comment);
	  
	}
	System.out.println("Customer who gave 5 Star Ratings\n");
	for(int i=0;i<a.length;i++)
	{
	if(a[i].getCrating() == 5)
	{
		s.showFullRating(a[i]);	
	 }
    }
    System.out.println("\nCustomer Feedback with Low Rating");
	 for(int i=0;i<a.length;i++)
	{
		
	 if(a[i].getCrating() < 3)
		 
	  {
	     s.showlessrate(a[i]);
      }
	  
	}
	System.out.println("\nAverage of Rating");
	
	int count= 0, sum = 0;
	for(int i=0;i<a.length;i++)
	{  
        if(a[i].getCrating() > 0)
		sum =  sum + a[i].getCrating();
	    count++;
	}
	
	double avg = ((double)sum)/count;
	System.out.println(avg);
      
	  }
	  
}
	
