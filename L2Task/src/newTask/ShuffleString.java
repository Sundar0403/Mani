package newTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShuffleString 
{
	private String shuffle(String newString, int[] arr) 
	{
		String temp="";
		Map<Integer,Character> newMap=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			newMap.put(arr[i],newString.charAt(i));
		}
		for(int i=0;i<newMap.size();i++)
		{
			temp=temp+newMap.get(i);
		}
		return temp;
	}
	
	public static void main(String args[])
	{
		ShuffleString shuffleObj=new ShuffleString();
		try (Scanner scan = new Scanner(System.in)) 
		{
			System.out.println("Enter the String :");
			String newString=scan.nextLine();
			System.out.println("Enter the Number of Elements int the Array :");
			int num=scan.nextInt();
			scan.nextLine();
			System.out.println("Enter the Array Elements ");
			int arr[]=new int[num];
			for(int i=0;i<num;i++)
			{
				arr[i]=scan.nextInt();
			}
			System.out.println(shuffleObj.shuffle(newString,arr));
		}
		catch(Exception e)
		{
			System.out.println("Error Occuered :"+e.getMessage());
		}
	}

	
}
