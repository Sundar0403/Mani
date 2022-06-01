package newTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckAnagram {
	
	private boolean check(String first, String second, int k) 
	{
		Map<Character,Integer> newMap=new HashMap<>();
		for(int i=0;i<first.length();i++)
		{
			if(newMap.containsKey(first.charAt(i)))
			{
				newMap.put(first.charAt(i),newMap.get(first.charAt(i))+1);
			}
			else
			{
				newMap.put(first.charAt(i),1);
			}
		}
		int count=0;
		for(int i=0;i<second.length();i++)
		{
			if(!newMap.containsKey(second.charAt(i)))
			{
				count++;
			}
			else
			{
				newMap.put(second.charAt(i),newMap.get(second.charAt(i))-1);
				if(newMap.get(second.charAt(i))==0)
				{
					newMap.remove(second.charAt(i));
				}
			}
		}
		if(count<=k)
		{
			return true;
		}
		return false;
	}
	
	public static void main(String args[])
	{
		CheckAnagram anagramObj=new CheckAnagram();
		try(Scanner scan=new Scanner(System.in);)
		{
			System.out.println("Enter the First String :");
			String first=scan.nextLine();
			System.out.println("Enter the Second String :");
			String second=scan.nextLine();
			System.out.println("Enter the Positions changes to make it anagram");
			int k=scan.nextInt();
			scan.nextLine();
			if(anagramObj.check(first,second,k))
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("0");
			}
		}
		catch(Exception e)
		{
			System.out.println("Error Occured :"+e.getMessage());
			e.printStackTrace();
		}
	}

	
}
