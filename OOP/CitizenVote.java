/*6. Create a Citizen class with fields id, name, and age. Create 3 citizen objects. Display names of those eligible to vote (age ≥ 18).
📝 Explanation:
 Use if (age >= 18) condition and retrieve name using getter.*/
 

import java.util.*;

class Citizen
{
   int id;
   String name;
   int age;
   
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
void checkVote()
{
	if(age>=18)
	{
		System.out.println("Citizen Eligible for Vote " + name);
		System.out.println("\n---------------------------------");
		
	}
	else
	{
		System.out.println("Not eligible for Vote ");
		System.out.println("\n-----------------------");
	}
}	

void display()
{
   System.out.println("ID : " + id);
   System.out.println("Name :" + name);
   System.out.println("Age :"+ age);
   	
   } 
}

public class CitizenVote
{
	 public static void main(String[] args)
	 {  
	   Scanner sc = new Scanner(System.in);
       
	   Citizen [] Citizen = new Citizen[3];
           for (int i = 0; i < 3; i++) {
           Citizen[i] = new Citizen();
            System.out.println("--------Enter details-------- " );

            System.out.print("ID: ");
            Citizen[i].setid(sc.nextInt());

            sc.nextLine(); // Consume newline

            System.out.print("Name: ");
            Citizen[i].setname(sc.nextLine());

            System.out.print("Age : ");
            Citizen[i].setage(sc.nextInt());

            Citizen[i].checkVote();
        }
		
       System.out.println("\n--- Voter Details ---");
      for (int i = 0; i < 3; i++) {
            Citizen[i].display();
       }
    
	 }
}
