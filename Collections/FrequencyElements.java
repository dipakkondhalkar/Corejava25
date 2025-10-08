/*Q.4
Find Frequency of Elements
Input: [1,2,2,3,1,4,2]
Output: {1=2, 2=3, 3=1, 4=1} using only ArrayList operations.*/

import java.util.*;
public class FrequencyElements
{
  public static void main(String[]args)
  {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Element :");
  int n = sc.nextInt();
  
  ArrayList<Integer> list = new ArrayList<>();
  System.out.println("Enter Element In  ArrayList :");
  
  for(int i=0;i<n;i++)
  {
     list.add(sc.nextInt());
  
  }
  //These seperates duplicates in another array and so we can get only unique elements here.
  ArrayList<Integer> unique = new ArrayList<>();
        for (Integer num : list) {
            if (!unique.contains(num)) {  // check duplicates
                unique.add(num);
            }
        }

     // Step 2: count frequency of each unique element
        System.out.println("Frequency of elements:");
        for (Integer num : unique) {
            int count = 0;
            for (Integer val : list) {
                if (val.equals(num)) {
                    count++;
                }
            }
            System.out.println(num + " = " + count);
        }

        sc.close();
    }
}