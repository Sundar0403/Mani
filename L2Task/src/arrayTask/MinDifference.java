package arrayTask;

import java.util.Scanner;

public class MinDifference {
	
	private int getMinDiff(int[] arr, int num) throws Exception
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<num-1;i++)
		{
			min=getMin(min,getAbsolute(arr[i]-arr[i+1]));
		}
		return min;
	}
	
	private int getAbsolute(int i) throws Exception
	{
		if(i>=0)
		{
			return i;
		}
		i*=-1;
		return i;
	}

	private int getMin(int first,int second) throws Exception
	{
		if(first<second)
		{
			return first;
		}
		return second;
	}
	
	public static void main(String args[])
	{
		MinDifference minObj=new MinDifference();
		try (Scanner scan = new Scanner(System.in)) 
		{
			System.out.println("Enter the Number of Elements in the Array");
			int num=scan.nextInt();
			scan.nextLine();
			int arr[]=new int[num];
			System.out.println("Enter the Array Elements :");
			for(int i=0;i<num;i++)
			{
				arr[i]=scan.nextInt();
			}
			System.out.println(minObj.getMinDiff(arr,num));
		}
		catch(Exception e)
		{
			System.out.println("Error Occured : "+e.getMessage());
			e.printStackTrace();
		}
	}
}
