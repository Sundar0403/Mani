package arrayTask;

import java.util.Scanner;

public class MergeSort {
	
	private int[] mergeSort(int[] arr) throws Exception
	{
		if(arr.length==1)
		{
			return arr;
		}
		
		int middle=(arr.length)/2;
		
		int left[]=mergeSort(getSplit(arr,0,middle));
		int right[]=mergeSort(getSplit(arr,middle,arr.length));
		
		return merge(left,right);
	}
	
	private int[] merge(int[] left, int[] right) 
	{
		int result[]=new int[left.length+right.length];
		
		int i=0,j=0,k=0;
		
		while(i<left.length && j<right.length)
		{
			if(left[i]<right[j])
			{
				result[k++]=left[i++];
			}
			else
			{
				result[k++]=right[j++];
			}
		}
		while(i<left.length)
		{
			result[k++]=left[i++];
		}
		while(j<right.length)
		{
			result[k++]=right[j++];
		}
		return result;
	}

	private int[] getSplit(int[] arr, int middle, int length) throws Exception
	{
		int newArr[]=new int[length-middle];
		int k = 0;
		for(int i=middle;i<length;i++)
		{
			newArr[k++]=arr[i];
		}
		return newArr;
	}

	public static void main(String args[])
	{
		MergeSort mergeObj=new MergeSort();
		try (Scanner scan = new Scanner(System.in)) 
		{
			System.out.println("Enter the Number of Elements in the Array :");
			int num=scan.nextInt();
			scan.nextLine();
			int arr[]=new int[num];
			System.out.println("Enter the Array ELements :");
			for(int i=0;i<num;i++)
			{
				arr[i]=scan.nextInt();
			}
			int newArr[]=mergeObj.mergeSort(arr);
			for(int i=0;i<newArr.length;i++)
			{
				System.out.print(newArr[i]+" ");
			}
		}
		catch(Exception e)
		{
			System.out.println("Erro Occured :"+e.getMessage());
			e.printStackTrace();
		}
	}

}
