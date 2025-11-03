//Q5. Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.

import java.util.*;
public class voteAPP{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the age ");
int age = sc.nextInt();

if(age>18){

System.out.println("candidate is eligible to vote");
}
else{

 System.out.println("the candidate is not eligible to vote");
}
}
}