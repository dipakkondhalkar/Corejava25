/*Q10. Create a class InternetBill with overloaded constructors:
Constructor 1: Accepts customerId, customerName, dataUsedInGB.
Constructor 2: Accepts customerId, customerName, dataUsedInGB, planType.
 Inside constructors:
Default cost = ₹50 per GB.
If planType is "Premium", cost per GB = ₹40.
If data usage exceeds 100 GB, apply 15% discount.
 Display final bill in constructor.*/

import java.util.*;

class Internet
{
  int Id;
  String name;
  int GB;
  String planType;
  double billAmount;
  
    Internet(int Id,  String name , int GB)
	{
		this.Id = Id;
		this.name = name;
		this.GB = GB;
		this.planType = "Regular";
		calculateData();
		display();
		
	}
	//Constructor.
	
	Internet(int Id,  String name , int GB , String planType)
	{
		this.Id = Id;
		this.name = name;
		this.GB = GB;
		this.planType = planType;
		calculateData();
		display();
	}
	
	void calculateData()
	{ 
	    double costperGB = 50;
		
		if(planType.equalsIgnoreCase("Premium"))
		{
			costperGB = 40;
		
		}
		
		
		billAmount = GB * costperGB;
		
		if(GB > 100)
		{
			 billAmount = billAmount - billAmount * 0.15;
		}
		}
	void display()
		{
			System.out.println("ID :" + Id);
			System.out.println("Name :" + name);
			System.out.println("Data GB :" + GB);
			System.out.println("Plan Type :" + planType);
			System.out.println("Final Bill :" + billAmount);
				
			
		}
		
	}

public class InternetBill
{
	public static void main(String []args)
	{
	  Scanner sc = new Scanner(System.in);

       System.out.println("Enter Internet Details");

       System.out.println("ID");
       int i	 = sc.nextInt();

        sc.nextLine();
       System.out.println("Name :");
       String n = sc.nextLine();	   
		
	   System.out.println("Data Used : ");
	   int d = sc.nextInt();
	   
	   Internet s1 = new Internet(i,n,d);
	   
	   sc.nextLine();
	   
	   System.out.println("PlanType");
	   String p = sc.nextLine();
	   
	   Internet s2 = new Internet(i,n,d,p);
	   
    }			
}
/*
output:
Enter Internet Details
ID
120
Name :
dipak
Data Used :
200
ID :120
Name :dipak
Data GB :200
Plan Type :Regular
Final Bill :8500.0
PlanType
premium
ID :120
Name :dipak
Data GB :200
Plan Type :premium
Final Bill :6800.0  */