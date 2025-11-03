import java.util.*;

public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println(((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) ? "Alphabet" : "Not Alphabet");
    }
}
