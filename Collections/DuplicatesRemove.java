/*Q.1
Remove Duplicates from ArrayList
Input: [1, 2, 3, 2, 1, 4]
Output: [1, 2, 3, 4] without using Set.*/
import java.util.*;

public class DuplicatesRemove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> al = new ArrayList<>();

        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        System.out.println("Add Elements in Arraylist : ");
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }

        for (int i = 0; i < al.size(); i++) {
            for (int j = i + 1; j < al.size(); j++) { 
                if (al.get(i).equals(al.get(j))) {
                    al.remove(j);
                    j--; 
                }
            }
        }

        System.out.println("After Removing Duplicates");
        System.out.println(al);
    }
}
/*
output:
Enter Number :
5
Add Elements in Arraylist :
1
2
2

4
4
After Removing Duplicates
[1, 2, 4] */