package q11;

import java.util.Scanner;

public class GreatestBid {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int max=0;
		System.out.println("Enter the number of applications :");
		int n=sc.nextInt();
		System.out.println("Enter the amount(in crores :");
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("The winning bid is "+max+" crores");
		
	}

}
