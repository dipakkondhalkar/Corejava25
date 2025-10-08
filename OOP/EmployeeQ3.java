/*Q3. Create a class called Employee to hold empid, empname , empemail , empcontact and empsalry.
write a menu driven program in cpp that implements the working of a Employee Using create a set and get function
and implements the logic.
The menu options should be: 
1. Add Employee Details.
2. Display All Employee Details.
3.Search Employee Using:
		- id.
		-name.
		-email.
		-salary.
		-address.
4.Delete Employee Details Using:
		- id.
		-name.
		-email.
		-salary. 
		-address.
5.Update Employee Details Using:
		- id.
		-name.
		-email.
		-salary.
		-address.
6. Display Details count of the Employee in Company.
7. Display Details the employee in the ascending order of employee salary.
8. Display the employee details in highest salary.
9. Display the employee details in minimum salary is 10000 to maximum salary is 60000.
10. Exit.
*/

import java.util.*;
class EmployeeQ3{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size");
		int n = sc.nextInt();
		
		EmployeeData a[] = new EmployeeData[n];
		int ch;
		
		do{
			System.out.println("Enter 1 for Add Employee Details");
			System.out.println("Enter 2 for Display All Employee Details");
			System.out.println("Enter 3 for Search Employee Details");
			System.out.println("Enter 4 for Delete Employee Details");
			System.out.println("Enter 5 for Update Employee Details");
			System.out.println("Enter 6 for count of the Employee in Company");
			System.out.println("Enter 7 for employee in the ascending order of employee salary");
			System.out.println("Enter 8 for employee details in highest salary");
			System.out.println("Enter 9 for employee details in minimum salary");
			System.out.println("Enter 10 for Exit");
			
			
			ch = sc.nextInt();
			
			switch(ch){
				case 1:
				System.out.println("\nEnter Employee Records");
					
					for(int i=0; i<a.length; i++){
						a[i] = new EmployeeData();
			
						System.out.println("\nEnter "+(i+1)+" id");
						a[i].setId(sc.nextInt());
			
						sc.nextLine();
						System.out.println("Enter Name");
						a[i].setName(sc.nextLine());
			
						System.out.println("Enter Email");
						a[i].setMail(sc.nextLine());
			
						System.out.println("Enter salary");
						a[i].setSalary(sc.nextInt());
						sc.nextLine();
						
						System.out.println("Enter address");
						a[i].setAddress(sc.nextLine());
						
						System.out.println("Enter contact Number");
						a[i].setContact(sc.nextInt());
						System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					}
					break;
					
				case 2:
				
				System.out.println("<<<<<<<<<<<<<<<<  All Employee Details >>>>>>>>>>>>>>>>>");
				 for (int i = 0; i < a.length; i++) {
					if (a[i] != null) {
						
						System.out.println("Id: " + a[i].getId());
						System.out.println("Name: " + a[i].getName());
						System.out.println("Email: " + a[i].getMail());
						System.out.println("Salary: " + a[i].getSalary());
						System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					}
				}
				
				break;
				
				case 3:
				System.out.println("Search By: 1.ID 2.Name 3.Email 4.Salary 5.Address");
				int e = sc.nextInt();
				
				sc.nextLine();
				boolean flag = false;
				
				switch(e){

					case 1:
					System.out.println("\nEnter id for Search");
					int skey = sc.nextInt();
					
					for(int i=0; i<a.length; i++){
						
						if(a[i] != null && a[i].getId() == (skey)){
							flag = true;
							
							System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
							System.out.println("Id: "+a[i].getId());
							System.out.println("Name: "+a[i].getName());
							System.out.println("Address: "+a[i].getAddress());
							System.out.println("Contact Number: "+a[i].getContact());
							System.out.println("Email: "+a[i].getMail());
							System.out.println("Salary: "+a[i].getSalary());
							System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
						}
					}
					if(!flag){
						System.out.println(skey+" not found:");
						System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					}
					break;
					
					case 2:
					
					System.out.println("\nserch using name");
					String sname = sc.nextLine();
					
					
					for(int i=0; i<a.length; i++){
						if(a[i] != null && a[i].getName().equals(sname)){
							flag = true;
							
							System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
							System.out.println("Id: "+a[i].getId());
							System.out.println("Name: "+a[i].getName());
							System.out.println("Address: "+a[i].getAddress());
							System.out.println("Contact Number: "+a[i].getContact());
							System.out.println("Email: "+a[i].getMail());
							System.out.println("Salary: "+a[i].getSalary());
							System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
							
						}
					}
					if(!flag){
						System.out.println(sname+" not found:");
						System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					}
					break;
					
					case 3:
					
					System.out.println("Enter email for search");
					String emails = sc.nextLine();
					
					for(int i=0; i<a.length; i++){
						
						if(a[i] != null && a[i].getMail().equals(emails)){
							flag = true;
							
							System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
							System.out.println("Id: "+a[i].getId());
							System.out.println("Name: "+a[i].getName());
							System.out.println("Address: "+a[i].getAddress());
							System.out.println("Contact Number: "+a[i].getContact());
							System.out.println("Email: "+a[i].getMail());
							System.out.println("Salary: "+a[i].getSalary());
							System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
						}
					}
					if(!flag){
						System.out.println(emails+" not found:");
						System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					}
					break;
					
					case 4:
					
					System.out.println("Enter salary for search");
					int salary = sc.nextInt();
					
					for(int i=0; i<a.length; i++){
						
						if (a[i] != null && a[i].getSalary() == salary) {

							flag = true;
							System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
							System.out.println("Id: "+a[i].getId());
							System.out.println("Name: "+a[i].getName());
							System.out.println("Address: "+a[i].getAddress());
							System.out.println("Contact Number: "+a[i].getContact());
							System.out.println("Email: "+a[i].getMail());
							System.out.println("Salary: "+a[i].getSalary());
							System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
						}
					}
					if(!flag){
						
						System.out.println(salary+" not found:");
						System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					}
					break;
					
					case 5:
					
					System.out.println("Enter address for search");
					String add = sc.nextLine();
					
					for(int i=0; i<a.length; i++){
						
						if(a[i] != null && a[i].getAddress().equals(add)){

							flag = true;
							System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
							System.out.println("Id: "+a[i].getId());
							System.out.println("Name: "+a[i].getName());
							System.out.println("Address: "+a[i].getAddress());
							System.out.println("Contact Number: "+a[i].getContact());
							System.out.println("Email: "+a[i].getMail());
							System.out.println("Salary: "+a[i].getSalary());
							System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
						}
					}
					if(!flag){
						System.out.println(add+" \nnot found:");
						System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					}
				}
				break;
				
				case 4:
				System.out.println("Delete By: 1.ID 2.Name 3.Email 4.Address 5.Salary");
				int del = sc.nextInt();
				sc.nextLine();
				
				switch(del){
					
					case 1 :
					System.out.println("Enterr id for delete record:");
					int did = sc.nextInt();
					flag = false;
					
					for(int i=0; i<a.length; i++){
						if(a[i] != null && a[i].getId() == did){
							
							
							a[i] = null;
							System.out.println("Deleted record with Name: " + did);
							System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
							flag = true;
							break;
						}
					}
					if (!flag) {
						System.out.println(did + " not found.");
						System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					}
					
					break;
					
					case 2:
					sc.nextLine(); 
					System.out.println("Enter name for delete record:");
					String dname = sc.nextLine();
					flag = false;
					
					for(int i=0; i<a.length; i++){
						
						if (a[i] != null && a[i].getName().equalsIgnoreCase(dname)) {
							a[i] = null;
							System.out.println("Deleted record with Name: " + dname);
							System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
							flag = true;
							break;
						}
					}
					
					 if (!flag) {
						System.out.println(dname + " not found.");
						System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					}
					
					break;
					
					case 3:
					sc.nextLine(); 
					System.out.println("Enter Email for delete record:");
					String dmail = sc.nextLine();
					flag = false;
					
					for(int i=0; i<a.length; i++){
						
						if (a[i] != null && a[i].getMail().equalsIgnoreCase(dmail)) {
							a[i] = null;
							System.out.println("Deleted record with Name: " + dmail);
							System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
							flag = true;
							break;
						}
					}
					 if (!flag) {
						System.out.println(dmail + " not found.");
						System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					}
					break;
					
					case 4:
					
					sc.nextLine(); 
					System.out.println("Enter Address for delete record:");
					String Address = sc.nextLine();
					flag = false;
					
					for(int i=0; i<a.length; i++){
						
						if (a[i] != null && a[i].getAddress().equalsIgnoreCase(Address)) {
							a[i] = null;
							System.out.println("Deleted record with Name: " + Address);
							System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
							flag = true;
							break;
						}
					}
					 if (!flag) {
						System.out.println(Address + " not found.");
						System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
						
					}
					
					break;
					
					case 5:
					System.out.println("Enter salary for delete record:");
					int salary = sc.nextInt();
					flag = false;
					
					for(int i=0; i<a.length; i++){
						
						if (a[i] != null && a[i].getSalary() == salary) {
							a[i] = null;
							System.out.println("Deleted record with Name: " + salary);
							System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
							flag = true;
							break;
						}
					}
					 if (!flag) {
						System.out.println(salary + " not found.");
						System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					}
					break;
				}
				break;
				
				case 5:
				System.out.println("Update By: 1.ID 2.Name 3.Email 4.Address 5.Salary");
				int upd = sc.nextInt();
				sc.nextLine();
				
				switch(upd){
					case 1:
					System.out.println("enter Update id:");
					int uid = sc.nextInt();
					flag = false;
					
					for(int i=0; i<a.length; i++){
						if(a[i] != null && a[i].getId() == uid){
							
							flag = true;
							
							System.out.println("\nEnter id");
							a[i].setId(sc.nextInt());
							 sc.nextLine(); 
			
							sc.nextLine();
							System.out.println("Enter Name");
							a[i].setName(sc.nextLine());
			
							System.out.println("Enter Email");
							a[i].setMail(sc.nextLine());
			
							System.out.println("Enter salary");
							a[i].setSalary(sc.nextInt());
							 sc.nextLine(); 
						
							System.out.println("Enter address");
							a[i].setAddress(sc.nextLine());
						
							System.out.println("Enter contact Number");
							a[i].setContact(sc.nextInt());
							System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
						}
					}
					if(!flag){
						System.out.println(uid+" Not found");
						System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					}
					break;
					
					case 2:
					System.out.println("Enter Update Name: ");
					String uname = sc.nextLine();
					flag = false;
					
					for(int i=0; i<a.length; i++){
						if(a[i] != null && a[i].getName().equals(uname)){
							flag = true;
							
							System.out.println("\nEnter id");
							a[i].setId(sc.nextInt());
							sc.nextLine(); 
			
							sc.nextLine();
							System.out.println("Enter Name");
							a[i].setName(sc.nextLine());
			
							System.out.println("Enter Email");
							a[i].setMail(sc.nextLine());
			
							System.out.println("Enter salary");
							a[i].setSalary(sc.nextInt());
							 sc.nextLine(); 
						
							System.out.println("Enter address");
							a[i].setAddress(sc.nextLine());
						
							System.out.println("Enter contact Number");
							a[i].setContact(sc.nextInt());
							System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
							
						}
					}
					if(!flag){
						System.out.println(uname+" Not found");
						System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					}
					
					break;
					case 3:
					
					System.out.println("Enter Update Email: ");
					String umail = sc.nextLine();
					flag = false;
					
					for(int i=0; i<a.length; i++){
						if(a[i] != null && a[i].getMail().equals(umail)){
							flag = true;
							
							System.out.println("\nEnter id");
							a[i].setId(sc.nextInt());
							sc.nextLine(); 
			
							sc.nextLine();
							System.out.println("Enter Name");
							a[i].setName(sc.nextLine());
			
							System.out.println("Enter Email");
							a[i].setMail(sc.nextLine());
			
							System.out.println("Enter salary");
							a[i].setSalary(sc.nextInt());
							 sc.nextLine(); 
						
							System.out.println("Enter address");
							a[i].setAddress(sc.nextLine());
						
							System.out.println("Enter contact Number");
							a[i].setContact(sc.nextInt());
							System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
							
						}
					}
					if(!flag){
						System.out.println(umail+" Not found");
						System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					}
					
					break;
					case 4:
					System.out.println("Enter Update Address: ");
					String uadd = sc.nextLine();
					flag = false;
					
					for(int i=0; i<a.length; i++){
						if(a[i] != null && a[i].getAddress().equals(uadd)){
							flag = true;
							
							System.out.println("\nEnter id");
							a[i].setId(sc.nextInt());
							sc.nextLine(); 
			
							sc.nextLine();
							System.out.println("Enter Name");
							a[i].setName(sc.nextLine());
			
							System.out.println("Enter Email");
							a[i].setMail(sc.nextLine());
			
							System.out.println("Enter salary");
							a[i].setSalary(sc.nextInt());
							 sc.nextLine(); 
						
							System.out.println("Enter address");
							a[i].setAddress(sc.nextLine());
						
							System.out.println("Enter contact Number");
							a[i].setContact(sc.nextInt());
							System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
						}
					}
					if(!flag){
						System.out.println(uadd+" Not found");
						System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					}
					break;
					case 5:
					System.out.println("enter Update salary:");
					int usal = sc.nextInt();
					flag = false;
					
					for(int i=0; i<a.length; i++){
						if(a[i] != null && a[i].getSalary() == usal){
							
							flag = true;
							
							System.out.println("\nEnter id");
							a[i].setId(sc.nextInt());
							 sc.nextLine(); 
			
							sc.nextLine();
							System.out.println("Enter Name");
							a[i].setName(sc.nextLine());
			
							System.out.println("Enter Email");
							a[i].setMail(sc.nextLine());
			
							System.out.println("Enter salary");
							a[i].setSalary(sc.nextInt());
							 sc.nextLine(); 
						
							System.out.println("Enter address");
							a[i].setAddress(sc.nextLine());
						
							System.out.println("Enter contact Number");
							a[i].setContact(sc.nextInt());
							System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
						}
					}
					if(!flag){
						System.out.println(usal+" Not found");
						System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					}
					break;
				}
				
				break;
				case 6:
				int count = 0;
				
				for (int i = 0; i < a.length; i++) {
					
					if (a[i] != null) {
						++count;
					}
				}
				System.out.println("Total Employees in Company: " + count);
				System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

				break;
				case 7:
				System.out.println("\nAscending order of Employee by Salary:");
				
				
				for(int i=0; i<a.length; i++){
					for(int j= i+1; j<a.length; j++){
						if (a[i] != null && a[j] != null) {
							if(a[i].getSalary() > a[j].getSalary()){
							
								EmployeeData temp = a[i];
								a[i] = a[j];
								a[j] = a[i];
							}
						}
					}
				}
				for (int i = 0; i < a.length; i++) {
					if (a[i] != null) {
						System.out.println("Id: " + a[i].getId());
						System.out.println("Name: " + a[i].getName());
						System.out.println("Address: " + a[i].getAddress());
						System.out.println("Contact Number: " + a[i].getContact());
						System.out.println("Email: " + a[i].getMail());
						System.out.println("Salary: " + a[i].getSalary());
						System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					}
				}
				break;
				
				case 8:
				System.out.println("\nHighest Salary");
				EmployeeData top = a[0];
				for(int i=0; i<a.length; i++){
					
					if(a[i].getSalary() > top.getSalary()){
						top = a[i];	
					}
				}
				System.out.println(top.getSalary());
				System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

	
			
				break;
				case 9:
				System.out.println("All minimum salary is 10000 to maximum salary is 60000 Employee: ");
				flag = false;
				
				for(int i=0; i<a.length; i++){
					if(a[i].getSalary() <= 10000 && a[i].getSalary() >= 60000){
						
						flag = true;
							
							System.out.println("Id: "+a[i].getId());
							System.out.println("Name: "+a[i].getName());
							System.out.println("Address: "+a[i].getAddress());
							System.out.println("Contact Number: "+a[i].getContact());
							System.out.println("Email: "+a[i].getMail());
							System.out.println("Salary: "+a[i].getSalary());
							System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					}
				}
				if(!flag){
					
					System.out.println("Not found: ");
					System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				}
				break;
				case 10 :
				System.out.println("Exit");
				break;
				
				default:
				System.out.println("Invalid Option");
				
			}
			
		}while(ch != 10);
	}
}

class EmployeeData{
	private int empid;
	private String empname;
	private String empemail;
	private String empaddress;
	private int empcontact;
	private int empsalry;
	
	public void setId(int empid){
		this.empid = empid;
	}
	public int getId(){
		return empid;
	}
	
	public void setName(String empname){
		this.empname = empname;
	}
	public String getName(){
		return empname;
	}
	
	public void setMail(String empemail){
		this.empemail = empemail;
	}
	public String getMail(){
		return empemail;
	}
	
	public void setContact(int empcontact){
		this.empcontact = empcontact;
	}
	public int getContact(){
		return empcontact;
	}
	
	public void setAddress(String empaddress){
		this.empaddress = empaddress;
	}
	public String getAddress(){
		return empaddress;
	}
	
	public void setSalary(int empsalry){
		this.empsalry = empsalry;
	}
	public int getSalary(){
		return empsalry;
	}
}