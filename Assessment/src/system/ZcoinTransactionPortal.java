package system;
import user.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import account.*;
import agent.*;
import logic.ZcoinLogic;


public class ZcoinTransactionPortal {
	
	Scanner scan=new Scanner(System.in);
	ZcoinLogic logicObj=new ZcoinLogic();
	Map<String,UserDetails> userMap=new HashMap<>();
	Map<Integer,ZcoinAccount> accountMap=new HashMap<>();
	boolean flag=false;
	
	private void createUser()
	{
		try
		{
			UserDetails userObj=new UserDetails();
			System.out.println("--------------WELCOME TO Z COIN USER REGISTRATION ---------------");
			System.out.println();
			System.out.println();
			System.out.println("Enter the User Name :");
			String name=scan.nextLine();
			userObj.setUserName(name);
		
			System.out.println("Enter the User Email-ID :");
			String email_Id=scan.nextLine();
			userObj.setEmailId(email_Id);
		
			System.out.println("Enter the user Mobile Number :");
			long mobNo=scan.nextLong();
			scan.nextLine();
			userObj.setMobileNo(mobNo);
		
			int h_Id=logicObj.getH_Id();
			userObj.setH_ID(h_Id);
			
			System.out.println("------PASSWORD MUST CONTAIN MIN 8 Characters -------");
			System.out.println("------PASSWORD MUST HAVE ALPHANUMERIC WITH SPECIAL CHARACTERS-----");
		
			String password="";
			while(flag==false)
			{	
				System.out.println("Enter the Password :");
				String entered=scan.nextLine();
			
				flag=logicObj.passwordCheck(entered,name,email_Id,mobNo);
				if(flag==true)
				{
					password=entered;
				}
				else
				{
					System.out.println("Enter the Password as per Credentials :");
				}
			}
			userObj.setPassword(password);
			
			System.out.println("Enter the Intial Deposit to Your RC :");
			double amount=scan.nextDouble();
			scan.nextLine();
			userObj.setIntial_RC_deposit(amount);
			
			userMap=logicObj.setUserDetails(email_Id,userObj);
			System.out.println(userMap);
			
			System.out.println("--------- USERDETAILS SAVED SUCCESSFULLY -----------");
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured :"+e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	

	private boolean getLogin() throws Exception
	{
		System.out.println("-----------------WELCOME TO LOGIN PORTAL------------------");
		System.out.println();
		System.out.println();
		System.out.println("Enter Your Email Id :");
		String email_Id=scan.nextLine();
		
		System.out.println("Enter the Password :");
		String password =scan.nextLine();
		
		UserDetails userObj=logicObj.getUserDetails(email_Id);
		
		if(userObj.getEmailId().equals(email_Id) && userObj.getPassword().equals(password))
		{
			System.out.println("---------LOGIN SUCCESSFULLY-----------------");
			return true;
		}
		return false;
		
	}
	
	private void createAccount() throws Exception
	{
		ZcoinAccount accountObj=new ZcoinAccount();
		System.out.println("Enter the Email Id :");
		String email_Id=scan.nextLine();
		accountObj.setEmail_Id(email_Id);
		
		int z_Id=logicObj.getZ_Id();
		accountObj.setZ_Id(z_Id);
		
		accountMap=logicObj.setAccountDetails(z_Id,accountObj);
	}
	
	public static void main(String args[])
	{
		int choice=0;
		try (Scanner scan = new Scanner(System.in)) {
			ZcoinTransactionPortal zcoinObj=new ZcoinTransactionPortal();
			
			System.out.println("----------- 1.USERDETAILS REGISTRATION --------------- ");
			
			while(true)
			{
				System.out.println("Enter the Choice :");
				try
				{
					choice=scan.nextInt();
					scan.nextLine();
				}	
				catch(Exception e)
				{
					System.out.println("Error Occured :"+e.getMessage());
					e.printStackTrace();
				}
				switch(choice)
				{
					case 1:
							try
							{
								zcoinObj.createUser();
								break;
							}	
							catch(Exception e)
							{
								System.out.println("Exception Occured :"+e.getMessage());
								e.printStackTrace();
							}
					case 2:
						try
						{
							boolean flag=false;
							while(flag==false)
							{
								zcoinObj.getLogin();
								break;
							}	
						}	
						catch(Exception e)
						{
							System.out.println("Exception Occured :"+e.getMessage());
							e.printStackTrace();
						}
						
					case 3:
						try
						{
							zcoinObj.createAccount();
							break;
						}	
						catch(Exception e)
						{
							System.out.println("Exception Occured :"+e.getMessage());
							e.printStackTrace();
						}	
							
				}
			}
		}
	}


	
}
