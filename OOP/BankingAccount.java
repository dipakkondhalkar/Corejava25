/*Question 6: Banking System – Interest Calculation for Different Accounts
Description:
Create a base class BankAccount with fields accountNumber, balance, and a method calculateInterest().
Create subclasses:
SavingsAccount – 4% interest
CurrentAccount – No interest
FixedDepositAccount – 6.5% interest
Task:
Create multiple accounts and store them in an array.
Loop through and calculate interest for each using polymorphism.
Goal:
Understand runtime method overriding without using any abstract/interface-based design */

import java.util.*;

class BankAccount
{
    int accNo;
	String name;
	double balance;
	
	BankAccount(int accNo,String name,double balance)
	{
	    this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
     double calculateInterest()
	 {
	    return 0.0;
	 }
}
class SavingsAccount extends BankAccount
{
	 SavingsAccount(int accNo, String name, double balance)
	 {
		 super(accNo,name,balance);
	 }
	 double calculateInterest()
	 {
		 return balance - (balance * 0.05);
	 }
	
} 
class CurrentAccount  extends BankAccount
{
	CurrentAccount(int accNo,String name, double balance)
	{
		super(accNo,name,balance);
    }		
	double CalculateInterest()
	{
		return 0.0;
	}
}
class FixedDepositAccount extends BankAccount
{
	FixedDepositAccount(int accNo,String name, double balance)
	{
		super(accNo,name,balance);
	}
	double CalculateInterest()
	{
		return balance - (balance * 6.5);
	}
}
class bank
{
	 bankacc(BankAccount b)
	 {
		 b.calculateInterest();
	 }
}


public class BankingAccount
{
   public static void main(String []args)
   {
     Scanner sc = new Scanner(System.in);
	 
	 bank b1 = new bank();
	 
	boolean running = false;

     while(true)
	 {
		 System.out.println("Enter Account Number :");
		 int accNo = sc.nextInt();
		 System.out.println("Enter Name ");
		 String name = sc.next();
		 
		 System.out.println("Enter Balance :");
		 double balance = sc.nextDouble;
		 
		 System.out.println("Bank Details----");
		 System.out.println("1.Saving Acount");
		 System.out.println("2.Current Account");
		 System.out.println("3.Fixed Deposit Account");
		 System.out.println("3.Exit ");
		 System.out.println("Enter Choice----");
		 int choice = sc.nextInt();
		 
		  switch(choice)
		  {
			  case 1:
			  b = new SavingAccount();
			  break;
			  
			  case 2:
			  b = new CurrentAccount();
			  break;
	          
              case 3:
              b = new FixedDepositAccount();
              break;
			  
			  default:
			  System.out.println("Invalid Input Please Enter Valid Input ...");
			  break;
	         
	 }		  
   }
}