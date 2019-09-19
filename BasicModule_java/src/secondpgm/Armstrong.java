package secondpgm;
import java.util.Scanner;

public class Armstrong 
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();
//	sc.nextLine();
	int rem=0,c=0,tmp,arm=0,am=1,i;
	tmp=n;
	while(n>0)
	{
		c++;
		n=n/10;
		
	}
	n=tmp;
	while(n>0)
	{
		rem=n%10;
		/*for(i=1;i<=c;i++)
		{
			am=am*rem;
		}
		//System.out.println(am);
		arm=arm+am;
		am=1;*/
		arm=arm+(int)Math.pow(rem,c);
		n=n/10;
	}
	
	if(tmp==arm)
	{
		System.out.println("The given number is armstrong");
	}
	else
	{
		System.out.println("The given number is not armstrong");
	}	

}
}
