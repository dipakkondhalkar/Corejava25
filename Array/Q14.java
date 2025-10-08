
/*Q14. Write a program in java to find the maximum circular subarray sum of a given array.
Expected Output :
 The given array is : 10 8 -20 5 -3 -5 10 -13 11
 The maximum circular sum in the above array is: 29
 */
 

public class Q14
{
    public static void main(String args[])
    {
        int a[] = {10, 8, -20, 5, -3, -5, 10, -13, 11};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++)
        {
            int sum = 0;
            int j = i;
            int count = 0;

           for(j=i,count =0;count <=a.length; j++) // and count will work until the same as length like 9<=9
		   {
                sum= sum+ a[j % a.length]; //so this mod operator goes again to first index 0 
			// for ex if j become 8 and 8%9 =8   9%9 =0 so 0 means the j goes to a[0]
                if (sum > max)
                {
                    max = sum;
                }
				count++;
                
            }
        }

        System.out.println("The maximum circular sum in the above array is: " + max);
    }
}
