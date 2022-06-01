package newTask;

import java.util.Scanner;

public class CharacterRepeat {
	
	private boolean isNumber(String ch) throws Exception
	{
		try
		{
			int num=Integer.parseInt(ch);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	private String getRepeat(String input) throws Exception
	{
		String result="";
		int count=0;
		int innerCount=0;
		int num=0;
		String temp="";
		for(int i=0;i<input.length();i++)
		{
			
			System.out.println(temp);
			if(isNumber(String.valueOf(input.charAt(i))))
			{
				num=Integer.parseInt(String.valueOf(input.charAt(i)));
				count++;
			}
			
			if(!isNumber(String.valueOf(input.charAt(i))))
			{
				System.out.println(temp);
				if(input.charAt(i)=='(')
				{
					innerCount++;
				}
				if(innerCount==1)
				{
					while(input.charAt(i)!=')')
					{
						temp=temp+input.charAt(i);
					}
				}
				if(input.charAt(i)==')')
				{
					temp=temp+"";
				}
				else
				{
					temp=temp+input.charAt(i);
				}
				
			}	
			if(count>0)
			{
				for(int j=0;j<num;j++)
				{
					result=result+temp;
				}
			}
			innerCount=0;
		}
		return result;
	}
	
	public static void main(String args[])
	{
		CharacterRepeat repeatObj=new CharacterRepeat();
		try (Scanner scan = new Scanner(System.in)) 
		{
			System.out.println("Enter the String :");
			String input=scan.nextLine();
			String result=repeatObj.getRepeat(input);
			System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println("Error Occured :"+e.getMessage());
			e.printStackTrace();
		}
	}
}
