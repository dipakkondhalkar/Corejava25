/*Q3. Question:
 Create a Java class BankAccount using constructor overloading:
First constructor takes accountNumber, name, and balance.
Second constructor takes accountNumber, name, balance, and accountType ("Savings" or "Current").
Perform the following:
If account type is Savings, add 4% interest to balance.
If account type is Current, add 2% interest to balance.
If account type is not provided, assume "Savings".
Explanation:
 This question involves constructor overloading with default values and logical branching based on string comparisons.
*/

import java.util.*;

class BankAccount
{
     int accNo;
	 String name;
	 double balance;
	 String accType;
	 
	 //First BankAccount.
	 
	 BankAccount(int accNo , String name, double balance)
	 {
	  this.accNo = accNo ;
	   this.name = name ;
	   this.balance = balance ;
	   this.accType = "Savings";
	 }
	 BankAccount(int accNo, String name , double balance  , String accType)
	 {
	   this.accNo = accNo;
	   this.name = name;
	   this.balance = balance;
	   this.accType=accType;
	   
	  
     }
	 void SimpleI()
	 {
	     if((accType).equals("saving"))
		 {
		     balance += balance * 0.04;
			 System.out.println("Add 4% Discount " + balance);
		 }
		 else if((accType).equals("current"))
		 {
		     balance +=balance * 0.02;
			 System.out.println("Add 2% Discount " + balance);
		 }
	 
	 }
	 
	 void display()
	 {
	   System.out.println("Account Number : "+  accNo);
	   System.out.println("Account Name :" + name);
	   System.out.println("Account Balance : " + balance);	
	 }
   

}
 public class BankDetails
 {
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter Details OF 1st AccountHolder:---");
	System.out.println("Enter Acc Number: ");
	int accNo1 = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Enter Name :");
	String name1 = sc.nextLine();
	
	System.out.println("Enter Balance: ");
	double  balance1 = sc.nextDouble();
	
	
	
	BankAccount b1 = new BankAccount(accNo1, name1,balance1);
	b1.SimpleI();
	b1.display();
	
	
	System.out.println("Enter Details of 2Nd Account Holder---->");
	System.out.println("Enter Acc Number :");
	int accNo = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter Name :");
	String name = sc.nextLine();
	System.out.println("Enter Balance :");
	double balance = sc.nextDouble();
	
	sc.nextLine();
	System.out.println("Enter Account Type: ");
	String accType = sc.next();
	
	BankAccount b2 = new BankAccount(accNo, name,balance,accType);
	b2.SimpleI();
	b2.display(); 
	
	
  }
}