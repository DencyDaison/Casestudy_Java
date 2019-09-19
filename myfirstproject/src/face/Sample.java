package face;
import java.util.Scanner;
	class Sample
	{
		String name;
    	String address;
    	String contactNumber;
    	String email;
    	String proofType;
    	String proofID;
    	static int regID=0;
    	
    	public Sample(String name, String address, String contactNumber, String email, String proofType, String proofID)
    	{
    	this.name=name;
    	this.address=address;
    	this.contactNumber=contactNumber;
    	this.email=email;
    	this.proofType=proofType;
    	this.proofID=proofID;
    	
		
	}
	public static void main(String args[])
	{
		String name;
    	String address;
    	String contactNumber;
    	String email;
    	String proofType;
    	String proofID;
    	
    	Scanner sc=new Scanner(System.in);
    	name=sc.nextLine();
    	address=sc.nextLine();
    	contactNumber=sc.nextLine();
    	email=sc.nextLine();
    	proofType=sc.nextLine();
    	proofID=sc.nextLine();
    	//nextInt();
    	//next().charAt(0);
    	//nextFloat();
    	//nextDouble();
    	Sample cus=new Sample(name,address,contactNumber,email,proofType,proofID);
    	Sample cus1=new Sample(name,address,contactNumber,email,proofType,proofID);
    	cus.register(name,address,contactNumber,email,proofType,proofID);
    	//cus1.register(name,address,contactNumber,email,proofType,proofID);
    	
    }
	
	void register(String name,String address,String contactNumber,String email,String proofType,String proofID) 
	{
		System.out.println(this.name);
		System.out.println(this.address);
		System.out.println(this.contactNumber);
		System.out.println(this.email);
		System.out.println(this.proofType);
		System.out.println(this.proofID);
		
	}
	}
	
	
	
