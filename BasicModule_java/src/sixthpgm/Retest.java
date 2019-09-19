package sixthpgm;

import java.util.Scanner;

public class Retest
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i,c=0;
		System.out.println("Enter the number of students:");
		int n=sc.nextInt();
		System.out.println("Enter the marks of students:");
		int[] a=new int[20];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(i=0;i<n;i++)
		{
			if(a[i]<50)
			{
				c++;
			}
		}
		System.out.println("Number of students appearing for retest is " +c);
	}

}
