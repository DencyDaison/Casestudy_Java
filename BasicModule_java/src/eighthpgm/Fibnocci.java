package eighthpgm;

import java.util.Scanner;

public class Fibnocci
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=0,b=1,c=0,i;
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		System.out.print("The fibonacci series is " +a +" "+b );
		while(n>=0)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;			
			n--;
		}
		
	}
}