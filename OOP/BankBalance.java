/*Q.3
Create a class Account with accountNumber, name, balance. Create a subclass SavingsAccount that calculates interest (e.g., 5% annually) and adds it to the balance.
Output: Show updated balance after interest.*/


import java.util.*;
class  Account
{    
    
    int accNo;
	String name;
	double balance;
	
	void setvalue(int accNo, String name , double balance)
	{
	  this.accNo = accNo;
	  this.name = name;
	  this.balance = balance;
	}
}
class cal extends Account
{
   void getCalculation()
   {
     balance = balance+(0.5 * balance);
	 System.out.println("Balance After Applying Interest 5% : "  + balance);
	 
   
   }

}
public class BankBalance
{
  public static void main(String []args)
  {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Account Number : ");
	 int accNo = sc.nextInt();

    System.out.println("Enter Account Holder Name : ");
    String name = sc.next();

    System.out.println("Enter Balance :");
    double balance = sc.nextDouble();
   
     cal s1 = new cal();
	 s1.setvalue(accNo, name, balance);
	 s1.getCalculation();
    	
  }

}
/*
output:
Enter Account Number :
123234
Enter Account Holder Name :
diak
Enter Balance :
500
Balance After Applying Interest 5% : 750.0 */
















 
