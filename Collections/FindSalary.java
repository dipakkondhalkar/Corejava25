/*9. WAP to create an Employee class with id, name, and salary, store 10 employees 
in a Vector, and display employees with salary above a given amount.*/


import java.util.*;

class Employeee {
    private int id;
    private String name;
    private int salary;

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
}

public class FindSalary {
    public static void main(String x[]) 
	{
		Vector<Employeee> v = new Vector<Employeee>();
		
        Employeee emp1 = new Employeee();
        emp1.setId(11); 
		emp1.setName("Sarthak"); 
		emp1.setSalary(34000);
        v.add(emp1);

        Employeee emp2 = new Employeee();
        emp2.setId(22); 
		emp2.setName("Manoj"); 
		emp2.setSalary(64000);
        v.add(emp2);

        Employeee emp3 = new Employeee();
        emp3.setId(33); 
		emp3.setName("Rahul"); 
		emp3.setSalary(45000);
        v.add(emp3);

        Employeee emp4 = new Employeee();
        emp4.setId(44); 
		emp4.setName("Rohit");
		emp4.setSalary(55000);
        v.add(emp4);

        Employeee emp5 = new Employeee();
        emp5.setId(55); 
		emp5.setName("Ganesh"); 
		emp5.setSalary(30000);
        v.add(emp5);

        Employeee emp6 = new Employeee();
        emp6.setId(66); 
		emp6.setName("Priya"); 
		emp6.setSalary(35000);
        v.add(emp6);

        Employeee emp7 = new Employeee();
        emp7.setId(77); 
		emp7.setName("Tanu"); 
		emp7.setSalary(59000);
        v.add(emp7);

        Employeee emp8 = new Employeee();
        emp8.setId(88);
		emp8.setName("Amit"); 
		emp8.setSalary(58000);
        v.add(emp8);

        Employeee emp9 = new Employeee();
        emp9.setId(99); 
		emp9.setName("Karan"); 
		emp9.setSalary(47000);
        v.add(emp9);

        Employeee emp10 = new Employeee();
        emp10.setId(100); 
		emp10.setName("Sneha"); 
		emp10.setSalary(51000);
        v.add(emp10);

        int Sal = 50000;
        System.out.println("Employees with salary above " + Sal + ":");
        Iterator<Employeee> i = v.iterator();
        while (i.hasNext()) {
            Employeee emp = (Employeee)i.next();
            if (emp.getSalary() > Sal) {
                System.out.printf("%d\t%s\t%d\n", emp.getId(), emp.getName(), emp.getSalary());
            }
        }
    }
}