import java.util.*;
public class ShiftLeftByTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		
        Vector<Integer> v = new Vector<Integer>();

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            v.add(sc.nextInt());
        }
        System.out.println("Original Vector: " + v);

        for (int i = 0; i < 2; i++) {  
            int first = v.remove(0);     // remove first element
            v.add(first);              // add it at the end
        }
    	System.out.println("Vector after shifting left by 2 positions: " + v);
    }
}
