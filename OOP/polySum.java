//Program to find addition.

public class polySum
{
    public static void main(String x[])
	{
	     calAdd(10,20); //call integer function 
		 float result = calAdd(5.4f,2.5f); //call float function 
		 System.out.printf("Addition is %f\n",result);
	}
	public static void calAdd(int x,int y)
	{
	   System.out.printf("Addition of integer is %d\n",x+y);
	}
	public static float calAdd(float x,float y)
	{    return x+y;
	}
}

