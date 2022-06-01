package newTask;

import java.util.Scanner;

public class Pangram 
{
	private boolean checkPangram(String input) throws Exception
	{
		/*if(input.isEmpty())
		{
			return false;
		}*/
		int count=0;
		char ch='a';
		while(ch>='a' && ch<='z')
		{
			if(isContains(input,ch)==true)
			{
				count++;
			}
			ch++;
		}
		if(count==26)
		{
			return true;
		}
		return false;
	}
	private boolean isContains(String input, char ch) throws Exception
	{
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==ch)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String args[])
	{
		Pangram pangramObj=new Pangram();
		try (Scanner scan = new Scanner(System.in)) 
		{
			System.out.println("Enter the String :");
			String input=scan.nextLine();
			System.out.println( pangramObj.checkPangram(input));
		}
		catch(Exception e)
		{
			System.out.println("Error Occured :"+e.getMessage());
			e.printStackTrace();
		}
	}
}
