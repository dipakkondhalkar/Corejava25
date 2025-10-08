/*Q15. Create a program where account numbers (Integer) are stored as keys and balances
 (Double) as values in a HashMap. Perform the following operations:
Insert 5 accounts with initial balances.
Deposit money into one account (update value).
Withdraw money from another account (decrease value, check for insufficient balance).
Remove any account with a balance of 0.
Display all accounts sorted by balance (ascending).
Explanation:
Shows insert, update, conditional withdrawal check, deletion, and sorting.
Sorting requires converting entrySet() into a list and using Collections.sort()
*/
import java.util.*;
public class AccountManager 
{
    public static void main(String[] args)
     {
       Scanner sc = new Scanner(System.in);

        // HashMap for account number → balance
        HashMap<Integer,Double> accounts = new HashMap<>();

        // 1. Insert 5 accounts with initial balances
        System.out.println("Enter Account Number and Initial Balance for 5 Accounts:");
        for (int i = 0; i < 5; i++) {
            int accNo = sc.nextInt();
            double balance = sc.nextDouble();
            accounts.put(accNo, balance);
        }

        System.out.println("\nOriginal Account Data:");
        for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
            System.out.println("Account: " + entry.getKey() + " ----> Balance: " + entry.getValue());
        }

        // 2. Deposit money
        System.out.print(" \nEnter Account Number to Deposit: ");
        int depositId = sc.nextInt();
        System.out.print("Enter Amount to Deposit: ");
        double depositAmt = sc.nextDouble();


        for(Map.Entry<Integer, Double> en : accounts.entrySet()) {
            if (en.getKey() == depositId) {
                en.setValue(en.getValue() + depositAmt);
                System.out.println("Deposit Successful: " + en.getValue());
                break;
            }
        }

        // 3. Withdraw money
        System.out.print("\n Enter Account Number to Withdraw: ");
        int withdrawId = sc.nextInt();
        System.out.print("Enter Amount to Withdraw: ");
        double withdrawAmt = sc.nextDouble();

        for (Map.Entry<Integer, Double> en : accounts.entrySet()) {
            if (en.getKey() == withdrawId) {
                if (en.getValue() >= withdrawAmt) {
                    en.setValue(en.getValue() - withdrawAmt);
                    System.out.println("Withdrawal Successful: " + en.getValue());
                }
				else
				{
                    System.out.println("Insufficient Balance. Withdrawal Denied.");
                }
                break;
            }
        }

        // 4. Remove accounts with zero balance
        Iterator<Map.Entry<Integer, Double>> it = accounts.entrySet().iterator();
        while (it.hasNext())
		{
            Map.Entry<Integer, Double> en = it.next();
            if(en.getValue() == 0.0) {
                it.remove();
         }
        }

        // 5. Sorting by balance (ascending)
        List<Map.Entry<Integer, Double>> list = new ArrayList<>(accounts.entrySet());
        Collections.sort(list, Map.Entry.comparingByValue());

        System.out.println("\nAccounts Sorted by Balance (Ascending):");
        for (Map.Entry<Integer, Double> en : list) {
            System.out.println("Account: " + en.getKey() + " ----> Balance: " + en.getValue());
        }

        sc.close();
    }
}
output:Enter Account Number and Initial Balance for 5 Accounts:
12
2000
13
30000
23
400000
45
60000
67
50000

Original Account Data:
Account: 67 ----> Balance: 50000.0
Account: 23 ----> Balance: 400000.0
Account: 12 ----> Balance: 2000.0
Account: 13 ----> Balance: 30000.0
Account: 45 ----> Balance: 60000.0

Enter Account Number to Deposit: 67
Enter Amount to Deposit: 100000
Deposit Successful: 150000.0

Enter Account Number to Withdraw: 150000
Enter Amount to Withdraw: 150000

Accounts Sorted by Balance (Ascending):
Account: 12 ----> Balance: 2000.0
Account: 13 ----> Balance: 30000.0
Account: 45 ----> Balance: 60000.0
Account: 67 ----> Balance: 150000.0
Account: 23 ----> Balance: 400000.0
