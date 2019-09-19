package seventhpgm;

import java.util.Scanner;

public class Fact
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int f=1,i;
		System.out.println("Enter the number of alphabets in your name:");
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("The number of combination is :" +f);
	}
}
