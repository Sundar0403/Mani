package newTask;

import java.util.Scanner;

public class ReverseWords 
{
	String reverseWords(String word) 
	{
		int length=word.length();
		
		String temp="";
		String output="";
		
		for(int i=0;i<length;i++)
		{
		    char letter=word.charAt(i);
		    
		    if(letter=='.')
		    {
		        temp+=letter;
		        output+=temp;
		        temp="";
		    }
		    else
		    {
		    temp=letter+temp;
		    }    
		    
		}
		
		output+=temp;
		
		return output;
	}
	public static void main(String args[])
	{
		ReverseWords reverseObj=new ReverseWords();
		try (Scanner scan = new Scanner(System.in)) 
		{
			System.out.println("Enter the Input String :");
			String input=scan.nextLine();
			System.out.println(reverseObj.reverseWords(input))	;
		}
			
		catch(Exception e)
		{
			System.out.println("Error Occured :"+e.getMessage());
			e.printStackTrace();
		}
	}
}
