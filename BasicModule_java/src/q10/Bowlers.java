package q10;

import java.util.Scanner;

public class Bowlers {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,count=0;
		float d,c,avg=0,sum=0;
		System.out.println("Enter the number of bowlers :");
		int n=sc.nextInt();
		System.out.println("Enter the runs conceded by the bowlers :");
		float[] a=new float[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number of balls for each bowler :");
		int[] b=new int[n];
		for(i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("Economy of the bowlers is ");
		for(i=0;i<n;i++)
		{
			c=b[i]/6;
			a[i]=a[i]/c;
			System.out.println(a[i]);
		}
		for(i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/n;
		System.out.println("The overall economy of the teanm is " +avg);
		for(i=0;i<n;i++)
		{
			if(a[i]<6)
			{
				count++;
			}
		}
		System.out.println("The number of bowlers eligible are " +count);

}
}