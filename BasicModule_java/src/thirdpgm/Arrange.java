package thirdpgm;

import java.util.Scanner;

public class Arrange 
{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j;
		System.out.println("Enter the number of students:");
		int n=sc.nextInt();
		System.out.println("Enter the heights of students:");
		float[] a=new float[20];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextFloat();
		}
		System.out.println("The heights in order are:");
		
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					float temp=a[i];
					      a[i]=a[j];
					      a[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
