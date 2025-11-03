import java.util.*;
public class TriangleType {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first sides: ");
        int a = sc.nextInt();
       System.out.println(" Enter second side:"); 
       int b = sc.nextInt();
        System.out.println(" Enter third side:");
       int c = sc.nextInt();
        if (a == b && b == c)
        System.out.println("Equilateral Triangle");
        else if (a == b || b == c || a == c)
        System.out.println("Isosceles Triangle");
        else
        System.out.println("Scalene Triangle");
    }
}
