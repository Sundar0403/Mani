package newTask;

import java.util.Scanner;

public class KPangrams {
	
	private String replaceString(String s) throws Exception
	{
		String result="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				result=result+s.charAt(i);
			}
			else
			{
				result=result+"";
			}
		}
		return result;
	}
	
	private boolean toGetPangram(String input) throws Exception
	{
		String result = replaceString(input);
		int count=0;
		if(result.length()<26)
		{
			return false;
		}
		boolean b[]=new boolean[26];
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)>='a' && input.charAt(i)<='z')
			{
				b[input.charAt(i)-97]=true;
			}
		}
		for(boolean t : b)
		{
			count++;
		}
		if(count>=26)
		{
			return true;
		}
		return false;
	}
	
	public static void main(String args[])
	{
		KPangrams gramObj=new KPangrams();
		
		try (Scanner scan = new Scanner(System.in)) 
		{
			System.out.println("Enter the String :");
			String input=scan.nextLine();
			System.out.println( gramObj.toGetPangram(input));
		}
		catch(Exception e)
		{
			System.out.println("Error Occured :"+e.getMessage());
			e.printStackTrace();
		}
	}

	
}
