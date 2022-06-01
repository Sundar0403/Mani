package newTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Permutation {
	
	private static List<String> newList=new ArrayList<>();
	
	private void permutation(String input) 
	{
		int d=0;
		
		int length=input.length();
		d=d%length;
		String temp="";
		while(d<length)
		{
			for(int i=0;i<length;i++)
			{
				
				int index=(length+i-d)%length;
				temp=temp+input.charAt(index);
			}
			if(!newList.contains(temp))
			{
				newList.add(temp);
			}
			d++;
			temp="";
		}
	}
	private String reverse(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		return rev;
	}
	public static void main(String args[])
	{
		Permutation permutationObj=new Permutation();
		
		try (Scanner scan = new Scanner(System.in)) 
		{
			System.out.println("Enter the String :");
			String input=scan.nextLine();
			for(int i=0;i<input.length();i++)
			{
				permutationObj.permutation(input);
			}
			String rev=permutationObj.reverse(input);
			for(int i=0;i<rev.length();i++)
			{
				permutationObj.permutation(rev);
			}
			
			Collections.sort(newList);
			
			for(int i=0;i<newList.size();i++)
			{
				System.out.print(newList.get(i)+" ");
			}
		}
			
		catch(Exception e)
		{
			System.out.println("Error Occured :"+e.getMessage());
		}
	}

}
