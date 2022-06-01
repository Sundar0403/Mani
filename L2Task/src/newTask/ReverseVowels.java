package newTask;

import java.util.Scanner;

public class ReverseVowels {
	
	private String reverseVowels(String input) 
	{
		String temp="";
		String result="";
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u')
			{
				temp=temp+input.charAt(i);
			}
		}
		int end=temp.length()-1;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u')
			{
				result=result+temp.charAt(end);
				end--;
			}
			else
			{
				result=result+input.charAt(i);
			}
		}
		return result;
	}
	
	public static void main(String args[])
	{
		ReverseVowels reverseObj=new ReverseVowels();
		try (Scanner scan = new Scanner(System.in)) 
		{
			System.out.println("Enter the String :");
			String input=scan.nextLine();
			String result=reverseObj.reverseVowels(input);
			System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println("Error Occured : "+e.getMessage());
			e.printStackTrace();
		}
	}

	
}
