/*5. Problem:
Create a class BankAccount with fields: accountHolder, principal, rate, and time.
Set values using setters.
In main method, calculate and display simple interest.
Formula:
 Simple Interest = (P × R × T) / 100
Explanation:
 Tests how to work with real-world financial logic using a POJO object. */
 
class Bank{
  
     String name;
	 int principal;
	 int rate;
	 int time;
	 
	 public String getName()
	 {
	    return name;
	 }
	 public int getprincipal()
	 {
	    return principal;
	 
	 }
	 public int getrate()
	 {
	    return rate;
	 
	 }
	 public int gettime()
	 {
	    return time;
	 }
	 
	 public void setname(String name)
	 {
	   this.name = name;
	 
	 }
	 public void setprincipal(int principal)
	 {
		 this.principal = principal;
		 
	 }
	 
	 public void setRate(int rate)
	 {
		 
		 this.rate = rate;
	 }	 
	 public void settime(int time)
	 {
		 this.time = time;
	 }
 }

public class BankAccount{
	
	public static void main(String[]args)
	{
		 Bank obj = new Bank();
		 
		 obj.setname("Manish");
		 obj.setprincipal(5000);
		 obj.setRate(10);
		 obj.settime(2);
		 
		 int SimpleInterest = ( obj.getprincipal() * obj.getrate() * obj.gettime()) /100  ;
		 
		 System.out.print("Simple Interest is : " + SimpleInterest );
		
	}		
	
}
/*  
output: 
Simple Interest is : 1000  */

















