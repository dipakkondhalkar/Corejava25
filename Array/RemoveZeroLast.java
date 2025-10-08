import java.util.*;
public class RomoveZeroLast{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array");

int no = sc.nextInt();

int []a = new int[no];
System.out.println("Enter the elements in array");
for(int i=0;i<n;i++){
	
	a[i] = sc.nextInt();
	
}
int index=0;
for(int i=0;i<a.length;i++){
	
		
		if(a[i]!=0){
			a[index]= a[i];	
          index++;
		  }
	while(index<n){
		a[index]=0;
		index++;
	}
	}
	
for(int i=0;i<n;i++){

System.out.printf("%d",a[i]);
      }
}

}