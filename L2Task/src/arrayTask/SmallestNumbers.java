package arrayTask;

import java.util.Scanner;

public class SmallestNumbers {
	
	private int[] getSmallest(int[] arr, int num) 
	{
		int newArr[]=new int[num];
		
		for(int i=0;i<num;i++)
		{
			int count=0;
			for(int j=0;j<num;j++)
			{
				if(arr[i]>arr[j])
				{
					count++;
				}
			}
			newArr[i]=count;
		}
		return newArr;
	}
	
	public static void main(String args[])
	{
		SmallestNumbers smallObj=new SmallestNumbers();
		try(Scanner scan=new Scanner(System.in))
		{
			System.out.println("Enter the Number of Elements in the Array :");
			int num=scan.nextInt();
			scan.nextLine();
			int arr[]=new int[num];
			for(int i=0;i<num;i++)
			{
				arr[i]=scan.nextInt();
			}
			int result[]=smallObj.getSmallest(arr,num);
			for(int i=0;i<num;i++)
			{
				System.out.print(result[i]+" ");
			}	
		}
		catch(Exception e)
		{
			System.out.println("Error Occured :"+e.getMessage());
			e.printStackTrace();
		}
	}

	
}
