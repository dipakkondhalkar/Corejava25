/*5. Create a Worker class with fields workerId, name, and hoursWorked. Create 3 worker objects. If any worker worked more than 8 hours, calculate overtime payment (e.g., ₹100/hour extra) and display their total payment.
📝 Explanation:
 Use logic: payment = base + ((hoursWorked - 8) * 100) only for overtime workers.   */

import java.util.*;
class Worker {
    private int workerId;
    private String name;
    private int hoursWorked;
    private int basePay = 800; // Assuming ₹100/hour for 8 hours
    private int totalPayment;

    // Setters
    public void setWorkerId(int id) {
        this.workerId = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setHoursWorked(int hours) {
        this.hoursWorked = hours;
    }

    // Calculate payment
    public void calculatePayment() {
        if (hoursWorked > 8) {
            totalPayment = basePay + ((hoursWorked - 8) * 100);
        } else {
            totalPayment = basePay;
        }
    }

    // Display worker details
    public void display() {
        System.out.println("Worker ID: " + workerId);
        System.out.println("Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Payment: ₹" + totalPayment);
        System.out.println("-----------------------------");
    }
}

public class WorkerPayment {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
       
	   Worker[] workers = new Worker[3];
           for (int i = 0; i < 3; i++) {
            workers[i] = new Worker();
            System.out.println("Enter details for Worker " + (i + 1));

            System.out.print("ID: ");
            workers[i].setWorkerId(sc.nextInt());

            sc.nextLine(); // Consume newline

            System.out.print("Name: ");
            workers[i].setName(sc.nextLine());

            System.out.print("Hours Worked: ");
            workers[i].setHoursWorked(sc.nextInt());

            workers[i].calculatePayment();
        }
		
       System.out.println("\n--- Worker Payment Details ---");
      for (int i = 0; i < 3; i++) {
            workers[i].display();
       }
     }
  }

/*
  
output:
Enter details for Worker 1
ID: 1
Name: Dipak
Hours Worked: 10
Enter details for Worker 2
ID: 2
Name: Manish
Hours Worked: 12
Enter details for Worker 3
ID: 3
Name: deep
Hours Worked: 7

--- Worker Payment Details ---
Worker ID: 1
Name: Dipak
Hours Worked: 10
Total Payment: ?1000
-----------------------------
Worker ID: 2
Name: Manish
Hours Worked: 12
Total Payment: ?1200
-----------------------------
Worker ID: 3
Name: deep
Hours Worked: 7
Total Payment: ?800
-----------------------------  */