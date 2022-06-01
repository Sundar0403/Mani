package newTask;

import java.util.ArrayList;
import java.util.Scanner;

public class SubstringPair {
	
	private ArrayList<String> getPair(String first, String second) 
	{
		ArrayList<String> newList=new ArrayList<>();
		String s1="";
		String s2="";
		String result="";
		int count=0;
		for(int i=0;i<first.length();i++)
		{
			if(first.charAt(i)!=second.charAt(i))
			{
				s1=s1+first.charAt(i);
				s2=s2+second.charAt(i);
				count++;
			}
			else if(count>0 && s1!="" && s2!="")
			{
				result=s1+","+s2;
				newList.add(result);
				//System.out.println(result);
				s1="";
				s2="";
				result="";
			}
		}
		return newList;
	}
	
	public static void main(String args[])
	{
		SubstringPair subObj=new SubstringPair();
		try (Scanner scan = new Scanner(System.in)) 
		{
			System.out.println("Enter the first String :");
			String first=scan.nextLine();
			System.out.println("Enter the second String :");
			String second=scan.nextLine();
			ArrayList<String> newList=subObj.getPair(first,second);
			for(int i=0;i<newList.size();i++)
			{
				System.out.println(newList.get(i));
			}
		}
		catch(Exception e)
		{
			System.out.println("Error Occured :"+e.getMessage());
			e.printStackTrace();
		}
	}

	
}
