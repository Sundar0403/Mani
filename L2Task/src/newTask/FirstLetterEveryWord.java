package newTask;

import java.util.Scanner;

public class FirstLetterEveryWord {
	
	private String getFirstLetter(String input) 
	{
		String result="";
		for(int i=0;i<input.length();i++)
		{
			if(i==0)
			{
				result=result+input.charAt(i);
			}
			if(input.charAt(i)==' ')
			{
				result=result+input.charAt(i+1);
				i++;
			}
		}
		return result;
	}
	
	public static void main(String args[])
	{
		FirstLetterEveryWord firstObj=new FirstLetterEveryWord();
		try (Scanner scan = new Scanner(System.in))
		{
			System.out.println("Enter the String :");
			String input=scan.nextLine();
			String result=firstObj.getFirstLetter(input);
			System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println("Error Occured :"+e.getMessage());
		}
	}
}
