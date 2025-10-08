public class RightPyramid{
public static void main(String[]args){
int i,j;

for(i=1;i<=13;i++){
    for(j=1;j<=7;j++){
	
	if((j>=1 && j<=8-i) || (j>=1 && j<=i-6)){
	
	System.out.printf(" ");
	
	}
	else{
	
	System.out.printf("*");
     }
	}
	System.out.printf("\n");
	}
}
}

      *
     **
    ***
   ****
  *****
 ******
  *****
   ****
    ***
     **
      *