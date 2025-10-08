/*Q2. Write a program to check whether a given element exists in an ArrayList of strings.
Explanation:
 You should use contains() to search. This helps practice searching without loops.
*/

import java.util.*;
public class ArrayListQ2{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size");
		int n = sc.nextInt();
		
		ArrayList al = new ArrayList();
		System.out.println("Enter Element");
		
		for(int i=0; i<n; i++){
			al.add(sc.nextInt());
		}
		
		sc.nextLine();
		System.out.println("\nEnter search element:");
        String skey = sc.nextLine();
		
		boolean b = al.contains(skey);
		if(b){
			System.out.println("element exist: "+skey);
		}else{
			System.out.println("element is not exist: ");
		}
	}
}