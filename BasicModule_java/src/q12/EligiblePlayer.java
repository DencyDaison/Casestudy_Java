package q12;

import java.util.Scanner;

public class EligiblePlayer 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int min=0,m=0;
		System.out.println("Enter the number of players");
		int n=sc.nextInt();
		System.out.println("Enter the number of fouls made by each player");
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			 min=a[0];
		}
		for(int i=0;i<n;i++)
		{
			
			if(a[i]<min)
			{
				min=a[i];
				m=i+1;
			}
		}
		System.out.println("The eligible player is player no:"+m+"("+min+" fouls)");
}}

