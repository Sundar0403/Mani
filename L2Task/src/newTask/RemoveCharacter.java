package newTask;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveCharacter {
	
	private boolean isContains(List<Character> newList,char ch) throws Exception
	{
		for(int i=0;i<newList.size();i++)
		{
			if(ch==newList.get(i))
			{
				return true;
			}
		}
		return false;
	}
	private List<Character> getCharList(String s) throws Exception
	{
		List<Character> newList=new ArrayList<>();
		for(int i=0;i<s.length();i++)
		{
			newList.add(s.charAt(i));
		}
		return newList;
	}
	
	private String removeCharacters(String input, String remove) throws Exception
	{
		String result="";
		List<Character> newList=getCharList(remove);
		for(int i=0;i<input.length();i++)
		{
			char newChar=input.charAt(i);
			if(isContains(newList,newChar))
			{
				result=result+"";
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
		RemoveCharacter removeObj=new RemoveCharacter();
		try (Scanner scan = new Scanner(System.in)) 
		{
			System.out.println("Enter the Input String :");
			String input=scan.nextLine();
			System.out.println("Enter the String to Remove :");
			String remove=scan.nextLine();
			String result=removeObj.removeCharacters(input,remove);
			System.out.println("Result is :");
			System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println("Error Occured :"+e.getMessage());
		}
		
	}

	

}
