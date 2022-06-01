package newTask;

import java.util.Scanner;

public class StringEquivalent 
{
	private boolean equal(String[] word1,String[] word2) throws Exception
	{
		String first="";
		String second="";
		for(int i=0;i<word1.length;i++)
		{
			first=first+word1[i];
		}
		for(int i=0;i<word2.length;i++)
		{
			second=second+word2[i];
		}
		if(first.equals(second))
		{
			return true;
		}
		return false;
	}
	public static void main(String args[])
	{
		StringEquivalent equalObj=new StringEquivalent();
		try (Scanner scan = new Scanner(System.in)) 
		{
			System.out.println("Enter the Number of Strings in Array 1");
			int num1=scan.nextInt();
			scan.nextLine();
			System.out.println("Enter the Strings :");
			String arr[]=new String[num1];
			for(int i=0;i<num1;i++)
			{
				arr[i]=scan.nextLine();
			}
			System.out.println("Enter the Number of Strings in Array 2");
			int num2=scan.nextInt();
			scan.nextLine();
			System.out.println("Enter the Strings :");
			String newArr[]=new String[num1];
			for(int i=0;i<num2;i++)
			{
				newArr[i]=scan.nextLine();
			}
			if(equalObj.equal(arr,newArr))
			{
				System.out.println("The Given Two String Arrays are Equal");
			}
			else
			{
				System.out.println("The Given Two String Arrays are Not Equal");
			}
		}
		catch(Exception e)
		{
			System.out.println("Error Occured :"+e.getMessage());
		}
	}
}
