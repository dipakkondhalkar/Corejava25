/*Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.*/

import java.util.*;
public class PassFail{
public static void main(String[]argsS){

int score;
Scanner sc = new Scanner(System.in);
System.out.println(" Enter the score");
score = sc.nextInt();

String result = (score >= 40 )? " The student is pass" : " The student is fail";

System.out.println(result);
}
}

