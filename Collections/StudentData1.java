/*Q16. Problem:
Create a program using Map<String, Integer> to store student names and their marks.
Perform the following operations:
Insert 5 students with marks.
Update marks of a student if already present.
Remove a student who failed(marks < 40).
Find the topper (max marks).
Display the final list sorted by marks in descending order.
Explanation :
Use put() for insert/update.
Use remove() with a condition for failures.
Find max using iteration.
*/

import java.util.*;
public class StudentData1
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter Name & Marks :");
	
	Map<String , Integer>  hm = new HashMap<>();
	do{
		
	System.out.println("\n--- Student Marks Management Menu ---");
            System.out.println("1. Insert Student");
			System.out.println("2. Show Details Student .");
            System.out.println("3. Update Student Marks");
            System.out.println("4. Remove Failed Students (Marks < 40)");
            System.out.println("5. Find Topper");
            System.out.println("6. Display Students Sorted by Marks Descending");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
	switch(choice)
	{
	    case 1:
  		
	for(int i=0;i<5;i++)
	{
		System.out.println("Enter Name :");
	   String name = sc.next();
	   System.out.println("Enter Marks : ");
	   int marks = sc.nextInt();
	   hm.put(name ,marks);
	}
	break;
	
	case 2:
	
	System.out.println("Orignal Array  : ");
	for(Map.Entry<String , Integer> entry : hm.entrySet())
	{
	    System.out.println("Name : " + entry.getKey() + "  Marks : " + entry.getValue());
		
	}
	
	break;
	
	case 3:
	
	System.out.println("2.Update Marks Marks : ");
	System.out.println("Enter Name : ");
	String nam = sc.next();
	if(hm.containsKey(nam))
	{
		System.out.println("Enter Marks :");
		int mar = sc.nextInt();
		hm.put(nam ,mar);
		System.out.println("Marks Updated successfully....");
	}
	else
	{
		System.out.println("Student Not get found..");
	}
	break;
	
	case 4:
	
	System.out.println("Enter Name name :");
	String n = sc.next();
	
	if(hm.containsKey(n))
	{
		if(hm.getValue < 40)
		{
			hm.remove(hm);
			System.out.println("Remove Successfully Marks Less than 40...");
		}
		else
		{
			System.out.println("No Marks below 40...");
		}
		
	}
	break;
	
	case 5:
	
	System.out.println("Topper Student is : ");
	
	String toppername = "";
	int newVal = -1;
	
	for(Map.Entry<String,Integer> entry : hs.entrySet())
	{
		if(entry.getValue > newVal)
		{
			newVal = entry.getValue();
            toppername = entry.getKey();
		}
		else
		{
			System.out.println("Data not found !");
		}
	}
	break;
	
	case 6:
	
	
   case 6:
    if (hm.isEmpty()) {
        System.out.println("No student data to display.");
    } else {
        // Sort by marks descending
        List<Map.Entry<String, Integer>> list = new ArrayList<>(hm.entrySet());
        list.sort(Comparator.comparingInt(Map.Entry<String, Integer>::getValue).reversed());

        System.out.println("\nStudents Sorted by Marks Descending:");
        // Classic for loop
        for (int i = 0; i < list.size(); i++) {
            Map.Entry<String, Integer> entry = list.get(i);
            System.out.println("Name: " + entry.getKey() + "  Marks: " + entry.getValue());
        }
    }
    break;


	default :
	
	 System.out.println("Invalid  Case " );
	 System.exit(0);
	  }
	 }
	 }
	while(true);
	}
   }
