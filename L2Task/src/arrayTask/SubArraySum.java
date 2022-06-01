package arrayTask;

import java.util.Scanner;

public class SubArraySum {
	
	private int getMax(int[] arr, int num) 
	{		
		int max=arr[0];
		int currentMax=arr[0];
		for(int i=1;i<num;i++)
		{
			currentMax=getLargest(arr[i],currentMax+arr[i]);
			max=getLargest(max,currentMax);
		}
		return max;		
	}
	
	private int getLargest(int max, int currentMax) 
	{
		if(max>currentMax)
		{
			return max;
		}
		return currentMax;
	}

	public static void main(String args[])
	{
		SubArraySum subObj=new SubArraySum();
		try(Scanner scan=new Scanner(System.in))
		{
			System.out.println("Enter the Number of Elements in the Array :");
			int num=scan.nextInt();
			scan.nextLine();
			int arr[]=new int[num];
			System.out.println("Enter the Number of Elements :");
			for(int i=0;i<num;i++)
			{
				arr[i]=scan.nextInt();
			}
			int max=subObj.getMax(arr,num);
			System.out.println(max);
		}
		catch(Exception e)
		{
			System.out.println("Error Occured : "+e.getMessage());
			e.printStackTrace();
		}
	}

}
