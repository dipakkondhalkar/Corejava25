import java.util.*;
class Employee extends Object
{
  private int id;
  private String name;
  private int sal;
   
   public void setid(int id)
   {
      this.id = id;
   }
   public int getid()
   {
      return id;
   }
   public void  setname(String name)
   {
      this.name = name;
   }  
   public String getname()
   {
      return name;
   }
   public void setsal(int sal)
   {
	   
	   this.sal = sal;
   }
   public int getsal()
   {
	  return sal;  
   } 	   
}
public class VSAPP
{
    public static void main(String[]args)
	{
	   Vector v = new Vector();
	   
	   Employee emp1 = new Employee();
	   emp1.setid(1);
	   emp1.setname("Dipak");
	   emp1.setsal(1000);
	   
	   Employee emp2 = new Employee();
	   emp2.setid(2);
	   emp2.setname("Manish");
	   emp2.setsal(2000);
	   
	   Employee emp3 = new Employee();
	   emp3.setid(3);
	   emp3.setname("Deep");
	   emp3.setsal(3000);
	   
	   Employee emp4 = new Employee();
	   emp4.setid(4);
	   emp4.setname("Vijay");
	   emp4.setsal(4000);
	   
	   Employee emp5 = new Employee();
	   emp5.setid(5);
	   emp5.setname("Rohan");
	   emp5.setsal(5000);
	   
	   
	  v.add(emp1);
	  v.add(emp2);
	  v.add(emp3);
	  v.add(emp4);
	  v.add(emp5);
	  
	  Iterator i = v.iterator();
	  
	  while(i.hasNext())
	  {
	     Object obj = i.next();
		 Employee emp = (Employee)obj;
		 
		 System.out.println(emp.getid()+ "\t" + emp.getname() + "\t" + emp.getsal());
		 
	   }	    
   }
}