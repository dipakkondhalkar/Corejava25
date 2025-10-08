import java.util.*;
public class MajorityArray{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter SIZE of ARRAY");
int no = sc.nextInt();
int []a= new int[no];

System.out.println("Enter the values of array");
for(int i=0;i<no;i++){
	a[i] = sc.nextInt();
}
int count=0;
boolean found = false;

for(int i=0;i<no;i++){
	  count = 0;
	for(int j=0; j<no;j++){
		
		if(a[i] == a[j]){
			
			count++;
		}
	}
	if(count> no/2){
		
		System.out.println("	Majority element is " + a[i]);
		found = true;
		break;
	}	
}
	if(!found){
		
		
		System.out.println("Majority element not found");
		
	}
}
}
/*
output:
Enter SIZE of ARRAY
8
Enter the values of array
2
3
2
2
2
2
5
4
        Majority element is 2     */