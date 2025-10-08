/*Q. Problem:
Use a Vector<Integer> to store bank transaction amounts (positive = deposit, negative = withdrawal). Perform the following operations:
Add 10 transactions.
Display all transactions.
Calculate and display total balance.
Remove all withdrawals (< 0).
Display only deposits in descending order.
Explanation:
Tests add(), removeIf(), sorting with Collections.sort().
Shows financial use of Vector with synchronization.*/

import java.util.*;
public class VectorTransaction
{
  public static void main(String[]args)
  {
	  Scanner sc= new Scanner(System.in);
	  
	  System.out.println("Enter Number of Transaction : ");
	  int n = sc.nextInt();
	  Vector<Integer> transactions = new Vector<Integer>();
	  
	  System.out.println("Enter Transaction : ");
	  for(int i=0;i<n;i++)
	  {   int tra = sc.nextInt();
		  transactions.add(tra);
	  }
	  System.out.println("Display all Transaction : " + transactions);
	 
	 int sum = 0;	  
	 for(int t : transactions )
	 {
	    sum = sum + t;
	 }
	 System.out.println("Total Balance is : "+ sum);
	 
	 System.out.println("Withdrawl Transaction less than 0 ");
	 
	 transactions.removeIf(value -> value < 0);
     System.out.println("Withdraw Transaction less than 0 " + transactions);
	
	 Collections.sort(transactions, Collections.reverseOrder());
        System.out.println("Deposits in Descending Order: " + transactions);
	 
	 
  }
}
output:
Enter Number of Transaction :
5
Enter Transaction :
-1
20
30
230
-3
Display all Transaction : [-1, 20, 30, 230, -3]
Total Balance is : 276
Withdrawl Transaction less than 0
Withdraw Transaction less than 0 [20, 30, 230]
Deposits in Descending Order: [230, 30, 20] 