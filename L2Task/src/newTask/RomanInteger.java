package newTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanInteger {
	
	private int getRomanInteger(String input) 
	{
		int result=0;
		Map<Character,Integer> newMap=new HashMap<>();
		newMap.put('I',1);
		newMap.put('V',5);
		newMap.put('X',10);
		newMap.put('L',50);
		newMap.put('C',100);
		newMap.put('D',500);
		newMap.put('M',1000);
		
		for(int i=0;i<input.length();i++)
		{
			if(i<input.length()-1 && input.charAt(i)=='I' && (input.charAt(i+1)=='V' || input.charAt(i+1)=='X'))
			{
				result=result+newMap.get(input.charAt(i+1))-1;
				i++;
			}
			else if(i<input.length()-1 && input.charAt(i)=='X' && (input.charAt(i+1)=='L' || input.charAt(i+1)=='C'))
			{
				result=result+newMap.get(input.charAt(i+1))-10;
				i++;
			}
			else if(i<input.length()-1 && input.charAt(i)=='C' && (input.charAt(i+1)=='D' || input.charAt(i+1)=='M'))
			{
				result=result+newMap.get(input.charAt(i+1))-100;
				i++;
			}
			else
			{
				result=result+newMap.get(input.charAt(i));
			}
		}
		return result;
	}
	
	public static void main(String args[])
	{
		RomanInteger romanObj=new RomanInteger();
		try (Scanner scan = new Scanner(System.in)) 
		{
			System.out.println("Enter the String to Find Roman Integer :");
			String input=scan.nextLine();
			int result=romanObj.getRomanInteger(input);
			System.out.println("The Number is :");
			System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println("Error Occured :"+e.getMessage());
		}
	}

	
}
