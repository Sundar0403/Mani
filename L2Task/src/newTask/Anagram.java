package newTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Anagram
{
	private List<List<String>> getAnagram(String[] input) 
	{
		int length=input.length;
		List<List<String>> newList=new ArrayList<>();
		Map<String,List<String>> newMap=new HashMap<>();
		for(int i=0;i<length;i++)
		{
			char temp[]=input[i].toCharArray();
			
			Arrays.sort(temp);
			
			String newOne=String.valueOf(temp);
			
			List<String> subList=newMap.get(newOne);
			if(subList==null)
			{
				subList=new ArrayList<>();
				newMap.put(newOne, subList);
			}
			subList.add(input[i]);
		}
		for(String key : newMap.keySet())
		{
			List<String> subList=newMap.get(key);
			newList.add(subList);
		}
		return newList;
	}
	
	public static void main(String args[])
	{
		Anagram anagObj=new Anagram();
		try (Scanner scan = new Scanner(System.in))
		{
			System.out.println("Enter the No of Strings :");
			int num=scan.nextInt();
			scan.nextLine();
			String input[]=new String[num];
			for(int i=0;i<num;i++)
			{
				input[i]=scan.nextLine();
			}
			List<List<String>> result=anagObj.getAnagram(input);
			for(int i=0;i<result.size();i++)
			{
				List<String> temp=result.get(i);
				for(int j=0;j<temp.size();j++)
				{
					System.out.print(temp.get(j)+" ");
				}
				System.out.println();
			}
		}
		catch(Exception e)
		{
			System.out.println("Error Occured :"+e.getMessage());
		}
	}

	

}
