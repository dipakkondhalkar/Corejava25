import java.util.*;

public class MenuDrivenArray{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
int choice = 0;

System.out.println("Enter number of elements");
int n = sc.nextInt();
int []a = new int[5];

System.out.println("Enter values in array");
for(int i=0;i<a.length;i++)
{
 a[i] =sc.nextInt();
 
}
System.out.println("--------- CHOOSE TO FIND NUMBER---------- ");
System.out.println("1.Find prime number");
System.out.println("2.find Duck number");
System.out.println("3.Find Perfect Number");
System.out.println("4.Find Strong Number");
System.out.println("5.Find Armstrong Number");

System.out.println("Enter your Choice=");
choice = sc.nextInt();
 
switch(choice)
{
 case 1:
 
 boolean flag= true;
 for(int i=0;i<a.length;i++){
 
 int j=2; 
 flag = true;
 while(j<=a[i]/2){
 
 if(a[i]%i==0)
 {
   flag = false;
  break;
 }
 i++;
 
 }
 if(flag && a[i]!=1)
 {
 
 System.out.println(a[i]);
 }
 }
 break;
 
 case 2:
int num=0;
 while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        
        if (original == reverse) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
 break;
}
}
}