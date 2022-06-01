package newTask;

import java.util.Scanner;

public class Palindrome {
	
	private boolean isPalindrome(String s) throws Exception
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			return true;
		}
		return false;
	}
	
	private String checkPalindrome(String input) throws Exception
	{
		String temp="";
		String result="";
		int index=0;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)!=' ')
			{
				temp=temp+input.charAt(i);
			}
			else
			{
				index=i;
				if(!isPalindrome(temp))
				{
					result=result+temp+" ";
				}
				temp="";
			}
		}
		String last=lastIndex(input,index);
		if(!isPalindrome(last))
		{
			result=result+last;
		}
		return result;
	}
	
	private String lastIndex(String input,int index) 
	{
		String result="";
		for(int i=index+1;i<input.length();i++)
		{
			result=result+input.charAt(i);
		}
		return result;
	}

	public static void main(String args[])
	{
		Palindrome newObj=new Palindrome();
		try(Scanner scan=new Scanner(System.in);)
		{
			System.out.println("Enter the String :");
			String input=scan.nextLine();
			String result=newObj.checkPalindrome(input);
			System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println("Error Occured :"+e.getMessage());
			e.printStackTrace();
		}
	}
	
}
