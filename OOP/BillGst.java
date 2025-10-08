/*14. Problem:
 Create class FinalBill with fields: customerName, baseAmount.
 Method addGST():
Add 12% GST to base amount
Print total payable amount using displayTotal().
Objective: Percentage addition and simple finance logic.*/

import java.util.*;
class Bill
{
	 String name;
	 int baseAmount;
	 int totalAmount;
	 
	 
	 public String getname()
	 {
		 return name;
	 }
	 public void setname(String name)
	 { 
	     this.name = name;
	 }
	 public int getbaseAmount()
	 {
		 return baseAmount;
	 }
	 public void setbaseAmount(int baseAmount)
	 {
		 this.baseAmount = baseAmount;
	 }
	 
	 
void addGst()
  {
	int gst = (int)( 0.12* baseAmount);
	totalAmount = baseAmount + gst;
	
  }	  

void displayTotal()
  {  
	System.out.println("Customwer Name: " + name);
	System.out.println("Base Amount : " + baseAmount );
	System.out.println("Total payable with gst is " + totalAmount);
  }
}
public class BillGst{  
public static void main(String[]args)
	 {
		 Scanner sc = new Scanner(System.in);
		 Bill a = new Bill();
		 
		 System.out.print("Custome Name  : " );
		 a.setname(sc.nextLine());
		 
		 System.out.print("BaseAmount :" );
		 a.setbaseAmount(sc.nextInt());
		 
		a.addGst();
	    a.displayTotal();	 
	 }
}
/*
output:
Custome Name  : Rohan
BaseAmount :50000
Customwer Name: Rohan
Base Amount : 50000
Total payable with gst is 56000 */