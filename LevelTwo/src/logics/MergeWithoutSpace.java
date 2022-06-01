package logics;

import java.util.Arrays;
import java.util.Scanner;

public class MergeWithoutSpace {
	
	private int getSmallestElement(int[] arr, int[] newArr, int value) throws Exception
	{
		int start=0;
		int end=arr.length-1;
		
		while(start<arr.length && end>=0)
		{
			if(arr[end]>newArr[start])
			{
				int temp=arr[end];
				arr[end]=newArr[start];
				newArr[start]=temp;
				start++;
				end--;
			}
			else
			{
				break;
			}
		}
		//System.out.println(Arrays.toString(arr));
		mergeSort(arr,0,arr.length);
		mergeSort(newArr,0,newArr.length);
		//System.out.println(Arrays.toString(arr));
		int count=arr.length;
		
		int result[]=new int[arr.length+newArr.length];
		for(int i=0;i<arr.length;i++)
		{
			result[i]=arr[i];
		}
		
		for(int i=0;i<newArr.length;i++)
		{
			result[count++]=newArr[i];
		}
		
		return result[value-1];
	}
	
	private void mergeSort(int arr[],int start,int end) throws Exception
	{
		if((end-start)==1)
		{
			return;
		}
		int middle=(start+end)/2;
		
		mergeSort(arr,start,middle);
		mergeSort(arr,middle,end);
		
		merge(arr,start,middle,end);
	}
	
	private void merge(int[] arr, int start, int middle, int end) throws Exception
	{
		int result[]=new int[end-start];
		
		int i=start,j=middle,k=0;
		
		while(i<middle && j<end)
		{
			if(arr[i]<arr[j])
			{
				result[k++]=arr[i++];
			}
			else
			{
				result[k++]=arr[j++];
			}
		}
		while(i<middle)
		{
			result[k++]=arr[i++];
		}
		while(j<end)
		{
			result[k++]=arr[j++];
		}
		
		for(int a=0;a<result.length;a++)
		{
			arr[start+a]=result[a];
		}
	}

	public static void main(String args[])
	{
		MergeWithoutSpace obj=new MergeWithoutSpace();
		try(Scanner scan=new Scanner(System.in);)
		{
			System.out.println("Enter the Number of Elements in the first Array :");
			int first=scan.nextInt();
			scan.nextLine();
			int arr[]=new int[first];
			System.out.println("Enter the Array Elements :");
			for(int i=0;i<first;i++)
			{
				arr[i]=scan.nextInt();
			}
			System.out.println("Enter the Number of Elements in the second Array :");
			int second=scan.nextInt();
			scan.nextLine();
			int newArr[]=new int[second];
			System.out.println("Enter the second array elements :");
			for(int i=0;i<second;i++)
			{
				newArr[i]=scan.nextInt();
			}
			System.out.println("Enter the K'th Smallest Number to Find :");
			int value=scan.nextInt();
			scan.nextLine();
			System.out.println( obj.getSmallestElement(arr,newArr,value));
		}
		catch(Exception e)
		{
			System.out.println("Error Occured :"+e.getMessage());
			e.printStackTrace();
		}
	}

}
