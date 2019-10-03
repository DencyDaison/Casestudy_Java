package examq1;
import java.util.Scanner;
public class Qstn1 {

	public Qstn1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=0,n1=0,r1=0;
		int sum=0;
		while(n!=0)
		{
			r=n%10;
			r1=(n/10)%10;
			sum=(int)(sum+Math.pow(r1,r));
			n=n/10;
			
		}
		System.out.println(sum+1);

	}

}
