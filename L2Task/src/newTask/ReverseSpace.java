package newTask;

import java.util.Scanner;

public class ReverseSpace 
{
	private String reverseSpace(String input) throws Exception
	{
		String result="";
		int length=input.length();
		int end=length-1;
		
		for(int i=0;i<length;i++)
		{
			if(input.charAt(i)!=' ')
			{
				if(input.charAt(end)!=' ')
				{
					result+=input.charAt(end);
				}
				else
				{
					while(input.charAt(end)==' ')
					{
						end--;
					}
					result+=input.charAt(end);
				}
				end--;
			}
			else
			{
				result+=" ";
			}
		}
		return result;
	}
	public static void main(String args[])
	{
		ReverseSpace reverseObj=new ReverseSpace();
		
		try (Scanner scan = new Scanner(System.in)) 
		{
			System.out.println("Enter the String :");
			String input=scan.nextLine();
			System.out.println(reverseObj.reverseSpace(input));	
		}
		
		catch(Exception e)
		{
			System.out.println("Error Occured :"+e.getMessage());
			e.printStackTrace();
		}
	}
}
