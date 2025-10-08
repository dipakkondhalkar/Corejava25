//6. WAP to store 7 integer values in a Vector and display only the prime numbers./

import java.util.*;

class PrimeApp45
{
    public static void main(String x[]) {
        Vector v = new Vector();
        v.add(13);
        v.add(23);
        v.add(24);
        v.add(45);
        v.add(7);
        v.add(17);
        v.add(31);

        System.out.println("Prime numbers in the Vector:");
        for(int i=0; i<v.size(); i++)
		{
			int num = (int) v.get(i);
			if(isPrime(num))
			{
				System.out.println(num);
			}
		}
	}
	
	static boolean isPrime(int n)
	{
		if(n<=1) return false;
		int i=2;
		while(i * i <= n)
		{
			if(n % i == 0) return false;
			i++;
		}
		return true;
	}
}