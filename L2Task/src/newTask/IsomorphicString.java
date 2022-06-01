package newTask;

import java.util.Scanner;

public class IsomorphicString {
	
	private boolean isIsomorphic(String first, String second) 
	{
		int length=first.length();
		int length2=second.length();
        
        if(length!=length2)
        {
            return false;
        }
		
		char firstChar[]=new char[256];
		char secondChar[]=new char[256];
		
		for(int i=0;i<length;i++)
		{
			firstChar[first.charAt(i)]++;
			secondChar[second.charAt(i)]++;
		}
		
		for(int i=0;i<length;i++)
		{
			if(firstChar[first.charAt(i)]!=secondChar[second.charAt(i)])
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[])
	{
		IsomorphicString isomorphicObj=new IsomorphicString();
		try (Scanner scan = new Scanner(System.in)) 
		{
			System.out.println("Enter the First String :");
			String first=scan.nextLine();
			System.out.println("Enter the second String :");
			String second=scan.nextLine();
			if(isomorphicObj.isIsomorphic(first,second))
			{
				System.out.println("Its an Isomorphic String");
			}
			else
			{
				System.out.println("Its Not an Isomorphic String");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured : "+e.getMessage());
			e.printStackTrace();
		}
	}

}
