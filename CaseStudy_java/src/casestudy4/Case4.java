package casestudy4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Case4
{

	public Case4()
	{
		// TODO Auto-generated constructor stub
	}
	public static String name[] = new String[10];
	public static String mail[] = new String[10];
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//String name;
    	String address;
    	String contactNumber;
    	String email;
    	String proofType;
    	String proofID;
    	String n,a;    	
    	
    	int i=0;
    	
    	do
    	{
    		System.out.println("Registration");
    		//i++;
     	System.out.println("Enter your name");
    	//name=br.readLine();
     	i++;
    	     name[i] = br.readLine();
    	     
    	   
    	
    	System.out.println("Enter your address");
    	address=br.readLine();
    	System.out.println("Contact Number");
    	contactNumber=br.readLine();
    	System.out.println("E-Mail ID");
    	mail[i]=br.readLine();
    
    	System.out.println("Enter proof type");
    	proofType=br.readLine();
    	System.out.println("Enter proof id");
    	proofID=br.readLine();
    		System.out.println("Thank you for registering. Your id is "+i+"..");
    	System.out.println("Do you want to continue registration (y/n)?");
    	n=br.readLine();
    	}
    	while(n.equalsIgnoreCase("y"));
    	ViewCustomers(i);
    	
	}
	public static void ViewCustomers(int a)
	{    	
    	int j;
    	System.out.println("Customers list");
    	System.out.println("The registered customers are");
    	System.out.println("Customer ID  Customername   MailID");
    	for(j=1;j<=a;j++) 
    	{
    	    // name[i] = br.readLine();
    		System.out.println(j+"\t\t"+name[j]+"\t\t"+mail[j]);
    	   
    	}
    	System.out.println("Thank You");
    	
    	        
    	 }
}
    	