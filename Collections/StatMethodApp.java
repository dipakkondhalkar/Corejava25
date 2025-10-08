import java.util.*;
public class StatMethodApp {
	public static void main(String[] args) {
		int choice;
		Vector v = new Vector();
		do {
			
			Scanner xyz = new Scanner(System.in);
			System.out.println("1: Add Element in collection");
			System.out.println("2: View All Data");
			System.out.println("3: Search Data");
			System.out.println("4: Find index and delete");
			System.out.println("5: count element ");
			System.out.println(" Enter your choice.");
			choice = xyz.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter data in vector");
				int data=xyz.nextInt();
				boolean b=v.add(data);
				if(b) {
					System.out.println("Data added");
				}
				else
	s			{
					System.out.println("Data not added");
				}
				break;
			case 2:
				Iterator i=v.iterator();
				while(i.hasNext()) {
					Object obj =i.next();
					System.out.println(obj);
				}
				break;
			case 3:
				System.out.println("Enter data in vector");
				 data=xyz.nextInt();
				 b=v.contains(data);
				 if(b) {
					 System.out.println("Data found");
				 }
				 else {
					 System.out.println("data not found");
				 }
				break;
			case 4:
				System.out.println("Enter data for delete");
				 data=xyz.nextInt();
				 int index=v.indexOf(data);
				 if(index!=-1) {
					 System.out.println("Data foud");
					 v.remove(index);
				 }
				 else {
					 System.out.println("Data not found");
				 }
				break;
			case 5:
				System.out.println("Number of element in Vector "+v.size());
				break;
			default:
				System.out.println("Wrong choice");
			}
		} while (choice != 6);
	}
}
