package examq1;

import java.util.Scanner;

public class Qstn2 {

	public Qstn2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev="";
		int c=0,i=0;
		//int c=str.length();
	for(i=1;i<=str.length()-1;i++)
	{
		c++;
	}
	for(i=c;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
		System.out.println(rev);
		

	}

}
