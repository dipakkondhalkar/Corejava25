0/*Question 6: Banking System – Interest Calculation for Different Accounts
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
Understand runtime method overriding without using any abstract/interface-based design.*/

import java.util.*;

class BankAccount
{
   int accountNumber;
   String name;
   double balance;
   
   
   BankAccount(int accountNumber,String name, double balance)
   {
      this.accountNumber = accountNumber;
	  this.name = name;
	  this.balance = balance;
   }
   double calculateInterest()
   {
      return 0;
   }
}
class SavingsAccount extends BankAccount
{   
    SavingsAccount(int accountNumber, String name , double balance)
	{
		super(accountNumber,name,balance);
	}
   double calculateInterest()
    {
	      return balance * 0.04;  
	}    
   
}
class CurrentAccount extends BankAccount
{  
   CurrentAccount(int accountNumber,String name, double balance)
   {
	  super(accountNumber,name,balance);   
   }	   
     double calculateInterest()	{
	     
        return 0.0;		 
	}


}
class FixedDepositAccount extends BankAccount
{
	FixedDepositAccount(int accountNumber,String name, double balance)
	{
		
		super(accountNumber,name,balance);
		
	}
   double calculateInterest()
   {
       return balance * 6.5;
   }

}
class Bill
{
   double 

}		

public class BankingSystem
{
    public static void main(String []args)
	{
	   Scanner sc = new Scanner(System.in);
        
	   
	}
}


