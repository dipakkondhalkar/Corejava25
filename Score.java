/*Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50)
— using nested ternary operators.
*/
import java.util.*;
public class Score{
public static void main(String[]args){
int score;
Scanner sc = new Scanner(System.in);
System.out.println(" Enter the out of 100");
score = sc.nextInt();

String result = (score >= 90)? "Excellent":
                (score >= 75)? "Good":
				(score >= 50)? "Average":"poor";
				
System.out.println(result);
}
}
				