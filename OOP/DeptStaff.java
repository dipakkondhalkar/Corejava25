/*Q.3
College Department Staff
Create a Faculty class with: name, dept, experience, salary.
Task:
Create an array of faculty.
Display average salary department-wise.
Find faculty with maximum experience. */


class Department
{
  private String name;
  private String dept;
  private int exp;
  private int salary;
  
  public void setname(String name)
  {
    this.name = name;
  }
  public String getname()
  {
    return name;
  }
  public void setdept(String dept)
  {
    this.dept = dept;
  }
  public String getdept()
  {
    return dept;
  }
  public void setexp(String exp)
  {
    this.exp = exp;
  }
  public String getexp()
  {
    return exp;
  }
  public void setsalary(String salary)
  {
    this.salary = salary;
  }
  public String getsalary()
  {
    return salary;
  }
}

class FacultyDisplay
{
  void display(Department f)
  {
     System.out.println("---------------------------");
	 System.out.println("Name : " + f.getname());
	 System.out.println("Department : " + f.getdept());
	 System.out.println("Experience : "+  f.getexp());
	 System.out.println("Salary : " + f.salary());
	 
  }
}


public class DeptStaff
public static void main(String []args)
{
   Scanner sc = new Scanner(System.in);
   
   Department []Staff = new Department();
   
  for(int i=0;i<Staff.lenght;i++)
  {
      Staff[] =  new Department();
	  
	  System.out.println("Enter Staff Details ");
	  
	  System.out.println("Enter Name: ");
	  String name = sc.nextLine();
	  
	  System.out.println("Enter department : ");
	  String dept = sc.nextLine();
	  
	  System.out.println("Enter Experience");
	  int exp = sc.nextInt();
	  
	  System.out.println("Enter Salary");
	  int salary = sc.nextInt();
	  
  }
} 
	  
	  for (int j = 0; j < n; j++) {
                if (Staff[j].getdept().equals(deptName)) {
                    total += Staff[j].getsalary();
                    count++;
                }
            }

            double avg = (double) total / count;
            System.out.println("Department: " + deptName + " Average Salary: " + avg);
        }

	  
     Department max = Staff[0];
        for (int i = 1; i < n; i++) {
            if (Staff[i].getexp() > max.getexp()) {
                max = Staff[i];
            }
        }

        System.out.println("\nFaculty with Maximum Experience:");
        fd.display(max);	  
  }
}















