package newTask;

import java.util.Scanner;

public class MaximumCharacters {
	
	private int lastIndex(String s,char ch) throws Exception
	{
		int lastIndex=-1;
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)==ch)
			{
				lastIndex=i;
				return lastIndex;
			}
		}
		return lastIndex;
	}
	
	private int firstIndex(String s,char ch) throws Exception
	{
		int firstIndex=-1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			{
				firstIndex=i;
				return firstIndex;
			}
		}
		return firstIndex;
	}
	
	private int getMaxChar(String input) throws Exception
	{
		int length=input.length();
		int diff=-1;
		for(int i=0;i<length;i++)
		{
			char ch=input.charAt(i);
			if(lastIndex(input,ch)>0)
			{
				int firstIndex=firstIndex(input,ch);
				int lastIndex=lastIndex(input,ch);
				
				diff=Math.max(diff,lastIndex-firstIndex-1);
			}
		}
		return diff;
	}
	
	public static void main(String args[])
	{
		MaximumCharacters maxObj=new MaximumCharacters();
		
		try (Scanner scan = new Scanner(System.in)) 
		{
			System.out.println("Enter the String");
			String input=scan.nextLine();
			System.out.println(maxObj.getMaxChar(input));
		}
		catch(Exception e)
		{
			System.out.println("Error Occured :"+e.getMessage());
			e.printStackTrace();
		}
	}

	
}
