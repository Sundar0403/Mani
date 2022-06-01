package newTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BalancedWord {
	
	Map<Character,Integer> newMap=new HashMap<>();
	public BalancedWord()
	{
		newMap.put('a',1);
		newMap.put('b',2);
		newMap.put('c',3);
		newMap.put('d',4);
		newMap.put('e',5);
		newMap.put('f',6);
		newMap.put('g',7);
		newMap.put('h',8);
		newMap.put('i',9);
		newMap.put('j',10);
		newMap.put('k',11);
		newMap.put('l',12);
		newMap.put('m',13);
		newMap.put('n',14);
		newMap.put('o',15);
		newMap.put('p',16);
		newMap.put('q',17);
		newMap.put('r',18);
		newMap.put('s',19);
		newMap.put('t',20);
		newMap.put('u',21);
		newMap.put('v',22);
		newMap.put('w',23);
		newMap.put('x',24);
		newMap.put('y',25);
		newMap.put('z',26);
		
	}
	
	private boolean isBalanced(String input) 
	{
		for(int i=1;i<input.length();i++)
		{
			if(i<input.length()-1)
			{
				String first=firstSubstring(i-1,input);
				System.out.println(first);
				String second=substring(i+1,input);
				System.out.println(second);
				int left=0;
				int right=0;
				for(int j=first.length()-1;j>=0;j--)
				{
					int count=1;
					left=left+((count)*newMap.get(first.charAt(j)));
					count++;
				}
				for(int j=0;j<second.length();j++)
				{
					right=right+((j+1)*newMap.get(second.charAt(j)));
				}
				System.out.println(left);
				System.out.println(right);
				if(left==right)
				{
					return true;
				}
			}
		}	
		return false;
	}
	
	private String firstSubstring(int i, String s) 
	{
		String result="";
		for(int a=0;a<=i;a++)
		{
			result=result+s.charAt(a);
		}
		return result;
	}

	private String substring(int i,String s) 
	{
		String result="";
		for(int a=i;a<s.length();a++)
		{
			result=result+s.charAt(a);
		}
		return result;
	}

	public static void main(String args[])
	{
		BalancedWord balanceObj=new BalancedWord();
		try (Scanner scan = new Scanner(System.in)) 
		{
			System.out.println("Enter the String :");
			String input=scan.nextLine();
			if(balanceObj.isBalanced(input))
			{
				System.out.println("The Given Word is Balanced :");
			}
			else
			{
				System.out.println("The Given Word is Not Balanced :");
			}
		}
		catch(Exception e)
		{
			System.out.println("Error Occured :"+e.getMessage());
			e.printStackTrace();
		}
	}

}
