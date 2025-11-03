import java.util.*;

public class ValidTriangleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three angles: ");
    int a = sc.nextInt(),
     b = sc.nextInt(),
    c = sc.nextInt();
    System.out.println((a + b + c == 180 && a > 0 && b > 0 && c > 0) ? "Valid Triangle" : "Invalid Triangle");
}
}
  //Enter three angles: 60
  //60
  // 60
  //Valid Triangle