package q13;

import java.util.Scanner;

public class Sum 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Enter a number");
			 n=sc.nextInt();
		}
		for(int i=n;i>0;i--)
		{
			sum=sum+i;
		}
		System.out.println("The sum is "+sum);
}
}
