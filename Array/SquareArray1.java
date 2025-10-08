//Replace every elements with Square of array.

impport java.util.*;
public class SquareArray1{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

Ssytem.out.println("Enter the values in array");

int  n = sc.nextInt();
int []a = new Int[no];

System.out.println("Enter the elements in array");
for(int i=0;i<a.length;i++){

 a[i] = sc.nextInt();
}

System.out.println("Square of given array is");
for(int i=0;i<a.length;i++){

   a[i] = a[i]* a[i];
   System.out.printf(a[i] + " ");
}
}
}
/*
output:
Enter the size of array
5
Enter the elements in array
1
2
3
4
5
Square of given array is
1 4 9 16 25    */