package sortingLogic;
import java.util.*;

public class SortingLogic
{
	public void selectionSort(int arr[],int num)
	{
		int min=0;
		int temp=0;
		for(int i=0;i<num;i++)
		{
			min=i;
			for(int j=i+1;j<num;j++)
			{
				if(arr[j]<arr[min])
				{
					temp=arr[j];
					arr[j]=arr[min];
					arr[min]=temp;
				}
			}
			
		}
		for(int i=0;i<num;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public int kthSmallestNumber(int arr[],int k)
	{
		int newArr[]=mergeSort(arr);
		
		int num=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i+1==k)
			{
				num=newArr[i];
				break;
			}
		}
		return num;
	}
	public boolean checkArray(int arr[])
	{
		int newArr[]=mergeSort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=newArr[i])
			{
				return false;
			}
		}
		return true;
	}
	public int[] mergeSort(int arr[])
	{
		if(arr.length==1)
		{
			return arr;
		}
		
		int middle=arr.length/2;
		
		
		int leftArr[]=mergeSort(Arrays.copyOfRange(arr,0,middle));
		int rightArr[]=mergeSort(Arrays.copyOfRange(arr,middle,arr.length));
		
		return merge(leftArr,rightArr);
	}
	
	public int[] merge(int first[],int last[])
	{
		
		
		int result[]=new int[first.length+last.length];
		
		int i=0,j=0,k=0;
		
		while(i<first.length&&j<last.length)
		{
			if(first[i]<last[j])
			{
				result[k++]=first[i++];
			}
			else
			{
				result[k++]=last[j++];
			}
		}
		while(i<first.length)
		{
			result[k++]=first[i++];
		}
		while(j<last.length)
		{
			result[k++]=last[j++];
		}
		return result;
	}
	public void insertionSort(int arr[],int num)
	{
		int n = arr.length;
        	for (int i = 1; i < n; ++i) 
        	{
            		int key = arr[i];
            		int j = i - 1;
 
            
            		while (j >= 0 && arr[j] > key) 
            		{
                		arr[j + 1] = arr[j];
                		j = j - 1;
            		}
            		arr[j + 1] = key;
        	}
		for(int i=0;i<num;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
