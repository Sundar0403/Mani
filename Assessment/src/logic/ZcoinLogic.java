package logic;

import java.util.Map;

import account.ZcoinAccount;
import storage.DetailsStorage;
import user.UserDetails;
import utility.UtilityClass;

public class ZcoinLogic {
	DetailsStorage cacheObj=new DetailsStorage();
	UtilityClass utilObj=new UtilityClass();
	private int h_Id;
	private int z_Id;
	
	public int getH_Id()
	{
		++h_Id;
		return h_Id;
	}
	
	public int getZ_Id()
	{
		++z_Id;
		return z_Id;
	}

	public Map<String, UserDetails> setUserDetails(String email_Id, UserDetails userObj) throws Exception
	{
		utilObj.stringCheck(email_Id);
		utilObj.objectCheck(userObj);
		Map<String,UserDetails> userMap=cacheObj.setUserDetails(email_Id,userObj);
		return userMap;
	}
	
	public UserDetails getUserDetails(String email_Id) throws Exception
	{
		utilObj.stringCheck(email_Id);
		UserDetails userObj=cacheObj.getUserDetails(email_Id);
		return userObj;
	}
	
	public boolean passwordCheck(String password,String name,String email_Id,long mobNo) throws Exception
	{
		utilObj.stringCheck(email_Id);
		utilObj.stringCheck(name);
		utilObj.stringCheck(password);
		if(password.length()<8)
		{
			return false;
		}
		
		if(password.equals(name) || password.equals(email_Id) || password.equals(String.valueOf(mobNo)))
		{
			return false;
		}
		
		char character[]= {'!','#','%','>','<','&','*'};
		int count=1;
		for(int i=0;i<character.length;i++)
		{
			if(password.contains(String.valueOf(character[i])))
			{
				
				count++;
				System.out.println(count);
			}
		}
		char checkChar='a';
		while(checkChar>='a' && checkChar<='z')
		{
			if(password.contains(String.valueOf(checkChar)))
			{
				
				count++;
			}
			
			checkChar++;
		}
		if(count==0)
		{
			return false;
		}
		checkChar='A';
		while(checkChar>='A' && checkChar<='Z')
		{
			if(password.contains(String.valueOf(checkChar)))
			{
				
				count++;
			}
			checkChar++;
		}
		for(int i=0;i<10;i++)
		{
			if(password.contains(String.valueOf(i)))
			{
				count++;
			}
		}
		System.out.println(count);
		System.out.println(password.length());
		if(count<=password.length())
		{
			System.out.println("true");
			return true;
		}
		return false;
	}

	public Map<Integer, ZcoinAccount> setAccountDetails(int z_Id2, ZcoinAccount accountObj) 
	{
		return null;
	}
}
