/*7. Implement Voting Eligibility
Create a class Voter with a method isEligible that checks if a person (age provided) is eligible to vote.
Explanation: Introduces basic logical validation.
*/

import java.util.*;
class vote
{
  int age;
  
  void getData(int a)
  
  {
    age = a;
  
  }
  void showData()
  {
     if(age>18)
	 {
	 System.out.println("person is eligible to vote");
	 }
	 
	 else
	 {
	   System.out.println("person is not eligible to vote");
	 }
  
  }
}
class voteCheck
{
  public static void main(String[]args)
  {
    Scanner sc=  new Scanner(System.in);
	System.out.println("Enter age");
	int a = sc.nextInt();
	vote s1= new vote();
	s1.getData(a);
	s1.showData();
  
  }

}
/*  
output:
Enter age
17
person is not eligible to vote   */