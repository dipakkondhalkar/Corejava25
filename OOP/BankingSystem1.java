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
       return balance * 0.065;
   }

}
class Test
{
    void process(BankAccount acc)
	{
      System.out.println("Account Number : " + acc.accNo());
	  System.out.println("Name : "+  acc.name)
	  System.out.println("Interest :"  + acc.calculateInterest());
	}
}

public class BankingSystem1
{
    public static void main(String []args)
	{
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter Number of accounts:");
	   int n = sc.nextInt();
	   
	   BankAccount[] account = new BankAccount[n];
	   Test t1 = new Test();
       for(int i=0;i<n;i++)
         {
		    System.out.println("\n Enter Details for Account " );
			System.out.println(" Enter account Number :");
			int accNo = sc.nextInt();
			
			System.out.println(" Enter Name :");
			String name = sc.next();
			
			System.out.println(" Enter Balance :");
			double balance = sc.nextDouble();
						
	   
             System.out.println("Choose Account Type ");
			 System.out.println("1.Saving ");
			 System.out.println("2.Current ");
			 System.out.println("3.Fixed Deposit ");
			 
			System.out.println("Enter Choice : ");
			int ch = sc.nextInt();
               			 
			switch(ch)
			{
				case 1:
				   account[i] = new SavingsAccount(accNo,name ,balance);
				   break;
				   
				case 2:
                  account[i] = new CurrentAccount(accNo, name, balance);
                  break;

               case 3:
                  account[i]	= new FixedDepositAccount(accNo, name ,balance);
                  break;

               default:
			   
                  System.out.println("Invalid type Please Enter Correct ");
                 			  
				  break;
				  	
			}
		 
		 }	
for (int i = 0; i < n; i++) {
   
      t1.process(account[i]);
}

	   
	}
}


