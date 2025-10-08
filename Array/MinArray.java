import java.util.*;
public class MinArray{
public static void main(String[]args){

int []a = new int[5];
Scanner sc = new Scanner(System.in);
System.out.println("Enter the values");
for(int i=0; i<a.length;i++){
	a[i] = sc.nextInt();
}

int min = a[0];

for(int i=1;i<a.length;i++){	
if(a[i]<min){
	min = a[i];
}
}
System.out.println("Minimum number " + min);

}
}
/*
output:
Enter the values
12
11
14
2
13
Minimum number2*/