//Q1.Write a Java program to create an ArrayList of integers, add 5 numbers, and display them.

import java.util.*;

public class ArrayListAddDisplay{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size");
		int n = sc.nextInt();
		
		ArrayList al = new ArrayList();
		System.out.println("Enter Element");
		
		for(int i=0; i<n; i++){
			al.add(sc.nextInt());
		}
		
		System.out.println("Display");
		
		for(int i=0; i<al.size(); i++){
			
			int a = (int) al.get(i);
			
			System.out.println(a);
		}
		
	/*	Iterator i = al.iterator();
		while(i.hasNext()){
			Object obj = i.next();
			System.out.println(obj);
		}
	*/
	}
}