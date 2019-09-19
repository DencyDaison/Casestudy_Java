package firstpgm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Resume 
{
	String name;
	String age;
	String degree;
	String branch;
	String contactNumber;
	static int regID=0;
	
	public Resume(String name,String age,String degree,String branch,String contactNumber)
	{
		this.name=name;
		this.age=age;
		this.degree=degree;
		this.branch=branch;
		this.contactNumber=contactNumber;
		
		
	}

public static void main(String args[]) throws IOException
{
	String name;
	String age;
	String degree;
	String branch;
	String contactNumber;
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your Name:");
	name=br.readLine();
	System.out.println("Enter your Age:");
	age=br.readLine();
	System.out.println("Enter your Degree:");
	degree=br.readLine();
	System.out.println("Enter your Branch:");
	branch=br.readLine();
	System.out.println("Enter your Contact Number:");
	contactNumber=br.readLine();
	
	Resume r=new Resume(name,age,degree,branch,contactNumber);
	r.register(name,age,degree,branch,contactNumber);
	}
void register(String name,String age,String degree,String branch,String contactNumber)
{
	System.out.println("Name	 : "+this.name);
	System.out.println("Age	 :" +this.age);
	System.out.println("Degree	 :" +this.degree);
	System.out.println("Branch	 :" +this.branch);
	System.out.println("Contact	 :" +this.contactNumber);
	
	
}
}