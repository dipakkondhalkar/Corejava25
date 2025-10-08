/*2. Question:
 Create a class BankAccount with a method calculateInterest(). Create subclasses SavingsAccount (interest rate 5%) and CurrentAccount (interest rate 3%).
 Calculate interest for different account types and display it.
Explanation:
 This tests inheritance with customized implementations in child classes */
 
import java.util.*;
class BankAccount
{
    int accType;
	double balance;
	
	void set(int accType , double balance)
	{
	  this.accType = accType;
	  this.balance = balance;
	}
}
class saving extends BankAccount
{   
    double interest;
   double show()
   {
      interest = balance +(balance * 0.05);
	  return interest; 
   
   }
}
class current extends  BankAccount
{
   double interest;
   double show()
   {
      interest = balance +(balance * 0.03);
	  return interest; 
   
   }
}
public class  BankCheck
{
  public static void main(String []args)
  {
     Scanner sc=  new Scanner(System.in);
	 System.out.println("-----Saving Bank Details-----");
	 System.out.println("Enter Account Number :");
	 int accNo = sc.nextInt();
	 
	 System.out.println("Enter Balance : ");
	 double balance = sc.nextDouble();
	 
	 saving  s1 = new saving();
	 s1.set(accNo, balance);
	 double result = s1.show();
	 System.out.println("Total Balance after 5% Interest : " + result);
	 
	 System.out.println("-----Current Bank Details-----");
	 System.out.println("Enter Account Number :");
	 int acc = sc.nextInt();
	 
	 System.out.println("Enter Balance  :");
	 double bal = sc.nextDouble();
	 
	 current c1 = new current();
	 c1.set(acc, bal);
	 double result1 = c1.show();
	 System.out.println("Total Balance after 3% Interest : " + result1);
	 
 
	 }
}
/*
output:
-----Saving Bank Details-----
Enter Account Number :
12113
Enter Balance :
100
Total Balance after 5% Interest : 105.0
-----Current Bank Details-----
Enter Account Number :
1232324
Enter Balance  :
200
Total Balance after 3% Interest : 206.0 */
















 