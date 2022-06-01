import java.util.*;
public class Merge {
	
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
	
	private void merge(int arr[],int start,int mid,int end) throws Exception
	{
		int result[]=new int[end-start];
		
		int i=start,j=mid,k=0;
		
		while(i<mid && j<end)
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
		
		while(i<mid)
		{
			result[k++]=arr[i++];
		}
		
		while(j<end)
		{
			result[k++]=arr[j++];
		}
		
		
		for(int w=0;w<result.length;w++)
		{
			arr[start+w]=result[w];
		}
		
	}
	
	private int [] swap(int firstArr[],int secondArr[],int num1,int num2) throws Exception
	{
		int result[]=new int[num1+num2];
		int start=num1-1;
		int end=0;
		int temp=0;
		
			while(firstArr[start]>secondArr[end])
			{
				temp=firstArr[start];
				firstArr[start]=secondArr[end];
				secondArr[end]=temp;
				
				mergeSort(firstArr,0,firstArr.length);
				mergeSort(secondArr,0,secondArr.length);
				//5start--;
				//end++;
			}
		int i=0,j=num2-1,k=0;
		while(i<firstArr.length && j>=0)
		{
			result[k++]=firstArr[i++];
			result[k++]=secondArr[j--];
		}
		return result;
	}
	
	public static void main(String args[])
	{
		Merge mergeObj=new Merge();
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the Number of Elements in the Array :");
			int num=scan.nextInt();
			scan.nextLine();
			int arr[]=new int[num];
			System.out.println("Enter the Array Elements");
			for(int i=0;i<num;i++)
			{
				arr[i]=scan.nextInt();
			}
			System.out.println("Enter the Number of Elements in the Second Array :");
			int value=scan.nextInt();
			scan.nextLine();
			int newArr[]=new int[value];
			System.out.println("Enter the Second Array Elements");
			for(int i=0;i<value;i++)
			{
				newArr[i]=scan.nextInt();
			}
			int a[]=mergeObj.swap(arr,newArr,num,value);
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
		}
		catch(Exception e)
		{
			System.out.println("Error Occured :"+e.getMessage());
			e.printStackTrace();
		}
	}
}
