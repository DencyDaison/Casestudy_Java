package fifthpgm;

import java.util.Scanner;

public class AverageMarks
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,sum=0,avg;
		System.out.println("Enter the number of students:");
		int n=sc.nextInt();
		System.out.println("Enter the marks of students:");
		int[] a=new int[20];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		avg=sum/n;
		
		System.out.println("The average is " +avg);
	}
}
