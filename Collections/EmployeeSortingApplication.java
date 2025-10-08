//import java.util.*;
class Employee{
   private int id;
   private String name;
   private int sal;
   
   public void setId(int id)
   {  this.id=id;
   }
   public int getId()
   { return id;
   }
   public void setName(String name)
   { this.name=name;
   }
   public String getName()
   { return name;
   }
   public  void setSal(int sal)
   { this.sal=sal;
   }
   public int getSal()
   { return sal;
   }
   
}
public class SortEmployeeBySal implements Comparator {

	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		if (e1.getSal() > e2.getSal()) {
			return 1;
		} else if (e1.getSal() < e2.getSal()) {
			return -1;
		} else {
			return 0;
		}
	}
}
public class SortEmployeeById implements Comparator{
	
	public int compare(Object o1, Object o2) {
		
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		if(e1.getId()>e2.getId()) {
			return 1;
		}
		else if(e1.getId()<e2.getId()) {
			return -1;
		}
		else {
	 	   return 0;
		}
	}
}

public class EmployeeSortingApplication {
	public static void main(String[] args) {
		  ArrayList list = new ArrayList();
		  list.add(new Employee("ZPQ",5,1900));
		  list.add(new Employee("MNO",2,2000));
		  list.add(new Employee("PQR",3,1800));
		  list.add(new Employee("ABC",4,1200));
		  list.add(new Employee("GHI",1,4000));
		  System.out.println("Original Employee Data");
		  
		  for(Object obj:list) {
			  Employee e=(Employee)obj;
			  System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		  }
		  Comparator  c = new SortEmployeeById();
		  Collections.sort(list,c);
		  System.out.println("Employee Sorted by using id");
		  
		  for(Object obj:list) {
			  Employee e=(Employee)obj;
			  System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		  }
		  c = new SortEmployeeBySal();
		  Collections.sort(list,c);
		  System.out.println("Employee sorted by using sal");
		  for(Object obj:list) {
			  Employee e=(Employee)obj;
			  System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		  }
		  c = new SortEmployeeByName();
		  Collections.sort(list,c);
		  System.out.println("Employee sorted by using Name");
		  for(Object obj:list) {
			  Employee e=(Employee)obj;
			  System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		  }
		 
	}
}



