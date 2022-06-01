package logic;
//import implement.*;
import cache.*;

import file.*;
import utility.*;

import java.io.*;
import pojo.*;

import java.util.*;

import account.AccountDetails;
import excep.*;

public class BankLogic //implements ImplementorFunction 
{
	FileLayer fileObj=new FileLayer();
	CacheLayer cacheObj=new CacheLayer();
	Scanner scan=new Scanner(System.in);

	private int id=0;
	private int actId=1000;
	private long actNo=324500000;
	private int mergeId=0;
	//private int lastCustId=0;
	public int lastActId=1000;
	public long lastActNo=324500000;
	public static Map<Integer,CustomerDetails> customerMap=new HashMap<>();
	//public static Map<Integer,AccountDetails> tempMap=new HashMap<>();
	public static Map<Integer,Map<Integer,AccountDetails>> customerAccountMap=new HashMap<>();
	UtilityClass utilObj=new UtilityClass();
	AccountDetails accObj=new AccountDetails();
	public long getAccountNo()
	{
		actNo=actNo+1;
		++lastActId;
		return actNo;
	}
	public int getId()
	{
		id=id+1;
		return id;
	}
	
	public int getAccountId()
	{
		++lastActNo;
		return ++actId;
	}
	
	public Map<Integer,CustomerDetails> addCustomer(CustomerDetails customerObj,int customerId) throws CustomException
	{
		//int custId=customerId;
		while(customerMap.containsKey(customerId))
		{
			//throw new CustomException("The Customer Id is Already Present");
			customerId=customerId+1;
		}
			customerMap.put(customerId,customerObj);
			return customerMap;
	}
	
	public Map<Integer,Map<Integer,AccountDetails>> addAccount(AccountDetails accountObj,int customerId,int accountId) throws CustomException
	{
		
		customerMapCheck(customerId);
		Map<Integer,AccountDetails> accountMap=customerAccountMap.get(customerId);
		if(accountMap==null)
		{	
			accountMap=new HashMap<>();
			
			accountMap.put(accountId, accountObj);
			
			customerAccountMap.put(customerId, accountMap);
		}
		else
		{
			
				//accountId=accountId+1;
			
			accountMap.put(accountId, accountObj);
		}
		
		return customerAccountMap;
	}
	
	public Map<Integer,CustomerDetails> addCustomerDetails(CustomerDetails customerObj) throws CustomException
	{
		
		Map<Integer,CustomerDetails> customerMap=fileObj.addCustomer(customerObj);
		cacheObj.addCustomer(customerMap);
		return customerMap;
	}
	public Map<Integer,Map<Integer,AccountDetails>> addAccountDetails(AccountDetails accountObj,int customerId) throws CustomException
	{
		
		Map<Integer,Map<Integer,AccountDetails>> customerAccountMap=fileObj.addAccount(accountObj,customerId);
		System.out.println(customerAccountMap);
		cacheObj.addAccount(customerAccountMap);
		return customerAccountMap;
	}
	
	public void getCustomerDetails(int customerId,String fName) throws CustomException
	{
		System.out.println("This is in File Layer :");
		fileObj.getCustomerDetails(customerId,fName);
		
	}
	
	public void getAccountDetails(int customerId,int accountId,String fName) throws CustomException
	{
		System.out.println("This is in File Layer :");
		fileObj.getAccountDetails(customerId,accountId,fName);
	}
	public void getCustomerCacheDetails(int customerId,String fName) throws CustomException
	{
		System.out.println("This is in Cache Layer :");
		Map<Integer,CustomerDetails> tempMap=fileObj.readCustomerFile();
		cacheObj.getCustomerCacheDetails(customerId,tempMap);
	}
	
	public void getAccountCacheDetails(int customerId,int accountId,String fName) throws CustomException
	{
		System.out.println("This is in Cache Layer :");
		Map<Integer,Map<Integer,AccountDetails>> tempMap=fileObj.readAccountFile(fName);
		cacheObj.getAccountCacheDetails(customerId,accountId,tempMap);
	}
	
	public void fetchCustomerStatus(int custId,String fName) throws CustomException
	{
		System.out.println("This is in Cache Layer :");
		Map<Integer,CustomerDetails> tempMap=fileObj.readCustomerFile();
		cacheObj.fetchCustomerStatus(custId,tempMap);
		System.out.println("This is in File Layer :");
		fileObj.fetchCustomerStatus(fName,custId);
	}
	public void fetchAccountStatus(int custId,int ActId,String fName) throws CustomException
	{
		System.out.println("This is in Cache Layer :");
		Map<Integer,Map<Integer,AccountDetails>> tempMap=fileObj.readAccountFile(fName);
		cacheObj.fetchAccountStatus(custId,ActId,tempMap);
		System.out.println("This is in File Layer :");
		fileObj.fetchAccountStatus(fName,custId,ActId);
	}
	
	public void customerMapCheck(int id) throws CustomException
	{
		if(customerMap.get(id)==null)
		{
			throw new CustomException("Key Does Not Exist");
		}
		
	}
	public void readCustomer(String fName) throws CustomException
	{
		Map<Integer,CustomerDetails> tempMap=fileObj.readCustomerFile();
		cacheObj.addCustomer(tempMap);
	}
	public void readAccount(String fName) throws CustomException
	{
		Map<Integer,Map<Integer,AccountDetails>> tempMap=fileObj.readAccountFile(fName);
		cacheObj.addAccount(tempMap);
	}
	
	public void deposit(int customerId,int accountId,double amount,String fName) throws CustomException
	{
		try
		{
			System.out.println("-------------This is in Cache Layer-----------");	
			Map<Integer,Map<Integer,AccountDetails>> tempMap=fileObj.readAccountFile(fName);
			System.out.println(tempMap);
			cacheObj.deposit(customerId,accountId,amount,tempMap);
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("--------------This is in File Layer-----------");
			fileObj.deposit(customerId,accountId,amount);
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured :");
		}
	}
	public void withdraw(int customerId,int accountId,double amount,String fName) throws CustomException
	{
		try
		{
			System.out.println("-------------This is in Cache Layer-----------");
			Map<Integer,Map<Integer,AccountDetails>> tempMap=fileObj.readAccountFile(fName);
			System.out.println(tempMap);
			cacheObj.withdraw(customerId,accountId,amount,tempMap);
			System.out.println("");
			System.out.println("");
			System.out.println("");	
			System.out.println("--------------This is in File Layer-----------");
			fileObj.withdraw(customerId,accountId,amount);
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured :");
		}
	}
	
	public void fileCheck(File fileObj) throws CustomException
	{
		if(fileObj==null)
		{
			throw new CustomException("File Can't be Null");
		}
	}
	
	public void createFile(String fileName) throws CustomException
	{
		fileObj.createFile(fileName);
		
	}
	
	/*public void readCustomerFile(String fileName) throws CustomException
	{
		Map<Integer,CustomerDetails> tempMap=fileObj.readCustomerFile(fileName);
		cacheObj.addCustomer(tempMap);
	}*/
	/*public void readAccountFile(String fileName) throws CustomException
	{
		Map<Integer,Map<Integer,AccountDetails>> accountMap=fileObj.readAccountFile(fileName);
		cacheObj.addAccount(accountMap);
	}*/
	
	public void writeFile(String filePath,String fileName/*,Map<Integer,CustomerDetails> customerMap,Map<Integer,Map<Integer,AccountDetails>> customerAccountMap*/) throws CustomException
	{
		//fileCheck(fileObj);
		//utilObj.stringCheck(filePath);
		//utilObj.stringCheck(fileName);
		try(FileOutputStream output=new FileOutputStream(filePath+fileName);
				ObjectOutputStream object=new ObjectOutputStream(output);)
		{
			object.writeObject(customerMap);
			object.writeObject(customerAccountMap);
			object.writeObject(lastActId);
			object.writeObject(lastActNo);
		}
	
		catch(IOException e)
		{
			System.out.println("IOException Occured:");
			e.printStackTrace();
		}
	}
	
	public void readsFile(String filePath,String fileName/*,Map<Integer,CustomerDetails> customerMap*/) throws CustomException
	{
		//fileCheck(fileObj);
		//utilObj.stringCheck(filePath);
		//utilObj.stringCheck(fileName);
		//Map<Integer,CustomerDetails> customerMap=new HashMap<>();
		try(FileInputStream input=new FileInputStream(filePath+fileName);
				ObjectInputStream object=new ObjectInputStream(input);)
		{
			customerMap=(Map<Integer,CustomerDetails>)object.readObject();
			System.out.println(customerMap);
			customerAccountMap=(Map<Integer,Map<Integer,AccountDetails>>)object.readObject();
			System.out.println(customerAccountMap);
			lastActId=(int)object.readObject();
			System.out.println("Last Used Account Id : "+lastActId);
			lastActNo=(long)object.readObject();
			System.out.println("Last Used Account Number : "+lastActNo);
		}
	
		catch(IOException e)
		{
			System.out.println("IOException Occured:");
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured:");
			e.printStackTrace();
		}
		//return customerMap;
	}
	
	
	/*public void writeFileAccounts(String filePath,String fileName,Map<Integer,Map<Integer,AccountDetails>> customerAccountMap) throws CustomException
	{
		//fileCheck(fileObj);
		utilObj.stringCheck(filePath);
		utilObj.stringCheck(fileName);
		try(FileOutputStream output=new FileOutputStream(filePath+fileName);
				ObjectOutputStream object=new ObjectOutputStream(output);)
		{
			
		}
	
		catch(IOException e)
		{
			System.out.println("IOException Occured:");
			e.printStackTrace();
		}
	}
	
	public Map<Integer,Map<Integer,AccountDetails>> readFileAccounts(String filePath,String fileName) throws CustomException
	{
		//fileCheck(fileObj);
		utilObj.stringCheck(filePath);
		utilObj.stringCheck(fileName);
		//Map<Integer,Map<Integer,AccountDetails>> customerAccountMap=new HashMap<>();
		try(FileInputStream input=new FileInputStream(filePath+fileName);
				ObjectInputStream object=new ObjectInputStream(input);)
		{
			
		}
	
		catch(IOException e)
		{
			System.out.println("IOException Occured:");
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured:");
			e.printStackTrace();
		}
		return customerAccountMap;
	}*/
	
	public void customerAccountMapCheck(int id,Map<Integer,AccountDetails> accountMap) throws CustomException
	{
		if(accountMap.get(id)==null)
		{
			throw new CustomException("Key Does Not Exist");
		}
		
	}
	
	/*
	
	public Map<Integer,AccountDetails> getAllAccounts(int id/*,Map<Integer,Map<Integer,AccountDetails>> customerAccountMap) throws CustomException
	{
		customerMapCheck(id);
		return customerAccountMap.get(id);
	}*/
	
	public AccountDetails fetchAccountStatus(AccountDetails accountObj,boolean condition)
	{
		accountObj.setAccountStatus(condition);
		return accountObj;
	}
	
	public CustomerDetails fetchCustomerStatus(CustomerDetails accountObj,boolean condition)
	{
		accountObj.setCustomerStatus(condition);
		return accountObj;
	}
	
	public AccountDetails getSpecificAccount(int id,int actId) throws CustomException
	{
		//customerMapCheck(id);
		Map<Integer,AccountDetails> tempMap=customerAccountMap.get(id);
		if(tempMap!=null)
		{	
			return tempMap.get(actId);
		}
		else
		{
			throw new CustomException("Key Does Not Exist");
		}
	}
	
	
}