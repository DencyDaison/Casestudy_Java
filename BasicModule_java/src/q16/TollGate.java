package q16;

import java.util.Scanner;

public class TollGate
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		System.out.println("Enter the fare collected for each vehicles");
		int[] a=new int[10];
		int c=0,c1=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]!=0)
			{
				if(a[i]>50)
				{
					c++;
				}	
				else
				{
					c1++;
				
				}
				}
		}
		System.out.println("Number of heavy vehicles "+c+" and the number of light weight vehicles is "+c1);
		
	}
	
}
