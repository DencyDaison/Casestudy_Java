package q15;

import java.util.Scanner;

public class PerfectNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int[] a=new int[10];
		int sum=0;
		System.out.print("The divisors of the number are ");
		for(int i=1;i<=n/2;i++)
		{
			if((n%i)==0)
			{
				System.out.print(i+" ");
				sum=sum+i;
			}
		}
		System.out.println("\nThe sum of the divisors are "+sum);
		if(n==sum)
		{
			System.out.println("It is a perfect number");
		}
		else
		{
			System.out.println("It is not a perfect number");
		}
		

	}
}
