import java.util.*;

public class CommonElements{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
int []a = new int[5];
System.out.println(" Enter the values of 1 st array");
for(int i=0 ;i<a.length;i++){
    a[i] = sc.nextInt();
	}
int []b = new int[5];
System.out.println("Enter the values of 2 nd Array");
for(int i=0; i<b.length;i++){
     b[i] = sc.nextInt();

}

for(int i=0;i<a.length;i++){

   for(int j=0 ;j<b.length;j++){
   
      if(a[i] == b[j]){
System.out.println("Common elements are");
System.out.println(a[i]);
break;
	  }
}
}
}
}
/*
output:
 Enter the values of 1 st array
1
2
3
4
5
Enter the values of 2 nd Array
5
6
7
8
9
Common elements are
5          */

	