public class ObjARR
{
	 public static void main(String[]args)
	 {
		 Object obj[] = new Object[5];
         obj[0] = 100;
		 obj[1] = "Good morning";
		 obj[2] = false;
		 obj[3] = 4.5f;
		 obj[4] = new java.util.Date();
		 
		 for(int i=0;i<obj.length;i++)
		 {
			 
			 System.out.println(obj[i] + " \t");
		 }
		 
	 }
	
}