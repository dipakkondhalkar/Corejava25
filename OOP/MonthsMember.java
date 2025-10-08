/*8. Create a Member class with memberId, name, and membershipMonths. Create 2 members. If months < 6, add 2 months bonus and show new duration.
📝 Explanation:
 Use setMembershipMonths(months + 2) conditionally and display updated data.  */

import java.util.*;
class Member
{
   int memberId;
   String name;
   int membershipMonths;
   
   public void setmemberid(int memberId)
   {
      this.memberId = memberId;
   }
   public int getmemberid()
   {
      return memberId;
   }
   public void setname(String name)
   {
     this.name = name;
   }
   public String getname()
   {
      return name;
   }
   public void setMembershipMonths(int membershipMonths)
   {
     this.membershipMonths = membershipMonths;
   }
   public int getmembershipMonths()
   {
     return membershipMonths;
   }
void display()
  {

  System.out.println("Member Id : " + memberId + "Name : " + name + "Month work : " + membershipMonths );

   }   
}
public class MonthsMember
{
  public static void main(String[]args)
  {  
     Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the Member Details ");
	 
	 Member s1 = new Member();
	 Member s2 = new Member();
	 
	 System.out.println("Member id :");
	 s1.setmemberid(sc.nextInt());
	 sc.nextLine();
	 
	 System.out.println("Name: ");
	 s1.setname(sc.nextLine());
	 
	 System.out.println("Membership month  : ");
	 int month1 = sc.nextInt();
	 
	 if(month1 < 6 )
	 {
	   month1 = month1 + 2;
	 }
	 s1.setMembershipMonths(month1);
	 
	 
	 System.out.println("Member id :");
	 s2.setmemberid(sc.nextInt());
	 sc.nextLine();
	 
	 System.out.println("Name: ");
	 s2.setname(sc.nextLine());
	 
	 System.out.println("Membership Month");
	 int month2 = sc.nextInt();
	 
	 if(month2 < 6 )
	 {
	   month2  = month2 + 2;
	 }
	 s2.setMembershipMonths(month2);
	 
     System.out.println("\n updated Member Details ");
    s1.display();
    s2.display();	
  }
}
/*
output:
Enter the Member Details
Member id :
12
Name:
dipak
Membership month  :
5
Member id :
23
Name:
deep
Membership Month
4

 updated Member Details
Member Id : 12Name : dipakMonth work : 7
Member Id : 23Name : deepMonth work : 6 */
















