package q17;

import java.util.Scanner;

public class Sculptorist
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the kgs of gold");
		int n=sc.nextInt();
		int sum=0,a=0;
		sum=sum+n;
		while(n>5)
		{
			n=n/5;
			sum=sum+n;
		}
		
		System.out.println("Number of Sculptors can be made is "+sum);
	}

}
