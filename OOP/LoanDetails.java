/*8. Question:
 Create a base class Loan with fields amount and years.
HomeLoan has interest rate of 7%.
CarLoan has interest rate of 9%.
 Write a program to calculate and print EMI for both loans.
Explanation:
 Tests inheritance with customized formula calculations. */
 
import java.util.*;
class Loan
{
  String name;
  double amount;
  int years;
  
  Loan(String name, double amount , int years)
  {
     this.name = name;
	 this.amount = amount;
	 this.years = years;
	 
  }
  void calculate()
  {
    System.out.println("Name : " + name +" amount  : " + amount + "years : " + years);
  }
} 
class HomeLoan  extends Loan
{
	HomeLoan(String name, double amount , int years)
	{
		super(name, amount, years);
		
	}
	void calculate()
	{
		double rate = 7.0 / 12 / 100;  // monthly interest rate (7% annual)
        int months = years * 12;
        double emi = (amount * rate * Math.pow(1 + rate, months)) / (Math.pow(1 + rate, months) - 1);
        System.out.println("Home Loan EMI for " + name + " = " + String.format("%.2f", emi));
	}
}
class Carloan  extends Loan
{
	Carloan(String name, double amount , int years)
	{
		super(name, amount, years);
		
	}
	void calculate()
	{
		double rate = 9.0 / 12 / 100;  // monthly interest rate (7% annual)
        int months = years * 12;
        double emi = (amount * rate * Math.pow(1 + rate, months)) / (Math.pow(1 + rate, months) - 1);
        System.out.println("Home Loan EMI for " + name + " = " + String.format("%.2f", emi));
	}
}


public class LoanDetails
{
  public static void main(String []args)
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("-----------Home Loan Details----------");
		 System.out.println("Enter Name :");
		 String name = sc.next();
		 
		 System.out.println("Enter Amount : ");
		 double amount = sc.nextDouble();
		 
		 System.out.println("Enter Years : ");
		 int year = sc.nextInt();
		 
		 HomeLoan h1 = new HomeLoan( name, amount , year);
		 h1.calculate();
		 
		 System.out.println("-----------CarLoan Details----------");
		 System.out.println("Enter Name :");
		  name = sc.next();
		 
		 System.out.println("Enter Amount : ");
		  amount = sc.nextDouble();
		 
		 System.out.println("Enter Years : ");
		  year = sc.nextInt();
		 
		CarLoan h2 = new CarLoan( name, amount , year);
		 h2.calculate();
		 
	 }
}


















