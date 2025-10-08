/*Q1. Write a java program to create pojo class name as Product with a following properties like 
as pid, pname, quantity and rate. create the another class name as Bill and this class is depend 
on product but we want to pass more than one product details to Bill class so here we use the 
var-args concept.
- Calculate bill without Gst.
- Calculate bill with 18% Gst.
*/

import java.util.*;
public class Product{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Size");
		int n = sc.nextInt();
		
		Bill a[] = new Bill[n];
		for(int i=0; i<a.length; i++){
			a[i] = new Bill();
			
			System.out.println("\nEnter "+(i+1)+" id");
			a[i].setId(sc.nextInt());
			
			sc.nextLine();
			System.out.println("Enter Name");
			a[i].setName(sc.nextLine());
			
			System.out.println("Enter quantity");
			a[i].setQuantity(sc.nextInt());
			
			System.out.println("Enter rate");
			a[i].setRate(sc.nextDouble());
		}
		GST g = new GST();
		g.getGst(a);		
	}
}

class GST{
	void getGst(Bill ... a){
		
		for(int i=0; i<a.length; i++){
			
			double billWithoutGst = a[i].getQuantity() * a[i].getRate();
            double gstAmount = billWithoutGst * 0.18;
            double billWithGst = billWithoutGst + gstAmount;
			
			System.out.println("Id: "+a[i].getId());
			System.out.println("Name: "+a[i].getName());
			System.out.println("bill without Gst: "+billWithoutGst);
			System.out.println("bill with 18% Gst: "+billWithGst);
		}
	}
}
class Bill{
	private int pid;
	private String pname;
	private int quantity;
	private double rate;
	
	public void setId(int pid){
		this.pid = pid;
	}
	public int getId(){
		return pid;
	}
	
	public void setName(String pname){
		this.pname = pname;
	}
	public String getName(){
		return pname;
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	public int getQuantity(){
		return quantity;
	}
	
	public void setRate(double rate){
		this.rate = rate;
	}
	public double getRate(){
		return rate;
	}
}