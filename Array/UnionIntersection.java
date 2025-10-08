import java.util.*;
public class UnionIntersection{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);

int a[] = new int[4];
int b[] = new int[3];
int c[]=new int[a.length+b.length];

System.out.println("Enter the values");
for(int i=0;i<a.length;i++)
{
	a[i]=sc.nextInt();
}
System.out.println("Enter the values");
for(int i=0;i<b.length;i++)
{
	b[i]=sc.nextInt();
}
int k=0;
for(int i=0;i<a.length;i++)
{
	c[k++]=a[i];
}
for(int i=0;i<b.length;i++)
{
	c[k++]=b[i];
}



System.out.println("Union Elements");

for(int i=0;i<c.length;i++)
{
	boolean flag=false;
	  for(int j=0; j<i;j++)
  {
     if(c[i] == c[j]){
	  
	  flag = true ;
	  break;
	  
  }
  }
  if(!flag)
  {
	  System.out.println(c[i]);
    }
   }
  }
}
  

		
		
		
		
		
		
		
		
		

