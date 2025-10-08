/*Q.4
Hospital Patient Records
Create a Patient class with: patientId, name, age, disease, billAmount.
Tasks:
Store and display patient data.
Display all patients suffering from a specific disease.
Find and display patient with maximum bill amount.
Display count of patients above age 60. */


import java.util.*;
class Patient
{
    int id;
	String name;
	int age;
	String disease;
	int billAmount;
	
	public void setid(int id)
	{
	   this.id = id;
	}
	public int getid()
	{
	   return id;
	}
	public void setname(String name)
	{
	   this.name = name;
	}
	public String getname()
	{
	  return name;
	}
	public void setage(int age)
	{
	  this.age = age;
	}
	public int getage()
	{
	  return age;
	}
	public void setdisease(String disease)
	{
	  this.disease = disease;
	}
	public  String getdisease()
	{
	   return disease;
	}
	public void setbillAmount(int billAmount)
	{
	  this.billAmount = billAmount;
	}
	public int getbillAmount()
	{
	   return billAmount;
	}
	
public void display()
{
    System.out.println("ID : "  + id + "Name " +  name + "disease : " + disease + " billAmount  : "+ billAmount);
	
}
public class PatientRecord
{
   public static void main(String []args)
   {
      Scanner sc = new Scanner(System.in);
	  
	  Patient a[] = new Patient[5];
	  
	  for(int i=0 ;i<a.length ;i++)
	  {
	      a[i] = new Patient();
		 System.out.println("Enter the details of Patient :");
	     System.out.println("Enter Id :");
		 
		 int id = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("Enter the name of patient");
		 String name = sc.nextLine();
		 
		 System.out.println("Enter the Disease : " );
		 String disease = sc.nextLine();
		 
		 System.out.println("Enter the age : ");
		 int age = sc.nextInt();
		 
		 a[i].setid(id);
		 a[i].setname(name);
		 a[i].setdisease(disease);
		 a[i].setage(age);
	  }
	  
	  System.out.println("Display Patent Record ");
	  for(int i=0;i<a.length;i++)
	  {
		   a[i].display();
	  }
	  
	 
     }
  }
}
