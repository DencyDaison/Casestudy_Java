package casestudy2;
import java.util.Scanner;

public class Case2
{
	public static int[] room=new int[26];
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String n;
		int j,ch;
		for( j=0;j<25;j++)
		{
			room[j]=0;
		}
		do
		{
			System.out.println("MENU\n1. Book\n2. Check Status\n3. Exit\n enter your choice:");
			 ch=sc.nextInt();
			
			
			int tot=0,a,i,k;
			
			
			switch(ch)
			{
					case 1: booking(); 
							break;
					case 2: CheckStatus();
							break;
					case 3: System.exit(0);
						
					default: System.out.println("You Entered wrong menuOption");
							 break;
			}
			
			//System.out.println("Do you want to proceed?(yes/no)");
			// n=sc.nextLine();
		}
		 while(ch!=3);
	}

	public static void CheckStatus()
	{
		Scanner sc=new Scanner(System.in);
		int a;
		//sc.nextLine();
		System.out.println("Enter room number");
		a=sc.nextInt();
		if(room[a-1]==1)
		{
			System.out.println("Room number "+a+" is booked");
		}
		else
		{
			System.out.println("Room number "+a+" is not booked");
		}
	}
			
	
	
		public static void booking()
		{
			Scanner sc=new Scanner(System.in);
			//sc.nextLine();	
			int tot=0;
			int j;
			
			int roomno=0;
			System.out.println("Booking");
			String ac,cot,cable,wifi,laundry;
			System.out.println("Please choose the services required:\nAC/non-AC(AC/nAC)");
			ac=sc.nextLine();							
			System.out.println("Cot (Single/Double)");
			cot=sc.nextLine();							
			System.out.println("With cable connection/without cable connection (C/nC)");
			cable=sc.nextLine();
			System.out.println("Wi-Fi needed or not (W/nW)");
			wifi=sc.nextLine();							
			System.out.println("Laundry service needed or not (L/nL)");
			laundry=sc.nextLine();	
			
			
			if(ac.equalsIgnoreCase("ac"))
					tot=tot+500;		
			else if(ac.equalsIgnoreCase("nAC"))
				   tot=tot+250;
			else
				ac=null;
			
			if(cot.equalsIgnoreCase("single"))
					tot=tot+200;
			else if(cot.equalsIgnoreCase("double"))
					tot=tot+450;
			else
				cot=null;
			
			if(cable.equalsIgnoreCase("C"))
				tot=tot+400;
			else if(cable.equalsIgnoreCase("nC"))
				tot=tot+350;
			else
				cable=null;
			
			if(wifi.equalsIgnoreCase("W"))
				tot=tot+400;
			else if(wifi.equalsIgnoreCase("nW"))
				tot=tot+350;
			else
				wifi=null;
			
			if(laundry.equalsIgnoreCase("L"))
				tot=tot+400;
			else if(laundry.equalsIgnoreCase("nL"))
				tot=tot+350;
			else
				laundry=null;
			
			System.out.println("The total charge is Rs."+tot);
			System.out.println("The services chosen are");
			System.out.println(cot+" cot "+ac+" room");
			if(cable.compareTo("c")==0)
				System.out.println("cable connection enabled");
			else
				System.out.println("cable connection disabled");
			
			if(wifi.compareTo("w")==0)
				System.out.println("wifi enabled");
			else
				System.out.println("wifi disabled");
			
			if(laundry.compareTo("l")==0)
				System.out.println("with laundry service");
			else
				System.out.println("without laundry service");
			
			System.out.println("Do you want to proceed?(yes/no)");
			 String n=sc.nextLine();
			 int f=0;
			 if(tot>0 &&(n.equalsIgnoreCase("yes")))
			 {
			
			for( j=0;j<25;j++)
			{
				if(room[j]==0)
				{
					room[j]=1;
					roomno=j+1;
					f=1;
					//System.out.println(roomno);
					break;
				}
			}
			if(f==1)
				
			System.out.println("Thank you for booking. Your room number is "+roomno);
			 }
		}
		
		}
	

