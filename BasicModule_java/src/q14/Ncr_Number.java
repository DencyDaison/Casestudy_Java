package q14;

import java.util.Scanner;

public class Ncr_Number 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the value of n");
	long n=sc.nextInt();
	System.out.println("Enter the value of r");
	int r=sc.nextInt();
	long n1=1,r1=1,n2=0,n3=1,a=0,i;
	for(i=1;i<=n;i++)
	{
		n1=n1*i;
		
	}
	
	for(i=1;i<=r;i++)
	{
		r1=r1*i;
	}
	
	n2=n-r;
	for(i=1;i<=n2;i++)
	{
		n3=n3*i;
	}
	a=(n1/(r1*n3));
	System.out.println("The NCR factor for given values is "+a); 
	
}
}
