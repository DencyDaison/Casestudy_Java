package casestudy3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Case3 {

	public static void main(String[] args) throws IOException
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String name;
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
	    		i++;
	     	System.out.println("Enter your name");
	    	name=br.readLine();
	    	System.out.println("Enter your address");
	    	address=br.readLine();
	    	System.out.println("Contact Number");
	    	contactNumber=br.readLine();
	    	System.out.println("E-Mail ID");
	    	email=br.readLine();
	    	System.out.println("Enter proof type");
	    	proofType=br.readLine();
	    	System.out.println("Enter proof id");
	    	proofID=br.readLine();
	    	
	    	System.out.println("Thank you for registering. Your id is "+i+"..");
	    	System.out.println("Do you want to continue registration (y/n)?");
	    	n=br.readLine();
	    	}
	    	while(n.equalsIgnoreCase("yes"));
	    	
	    	 System.out.println("Do you want to update the email id?(yes/no)");
	    	    a=br.readLine();
	    	    while(a.equalsIgnoreCase("yes"))
	    	    {
	    	      System.out.println(" Update Email:");
	    	      email=br.readLine();
	    	      System.out.println("Email updated");
	    	      System.out.println("Your details are as follows");
	    	      System.out.println("Name:"+name);
	    	      System.out.println("Address:"+address);
	    	      System.out.println("Contact Number:"+contactNumber);
	    	      System.out.println("E-Mail ID:"+email);
	    	      System.out.println("Proof type:"+proofType);
	    	      System.out.println("Proof id:"+proofID);
	    	      
	    	      System.exit(0);
	    	 }
	    	        
	    	 }
	}
	    	
	    