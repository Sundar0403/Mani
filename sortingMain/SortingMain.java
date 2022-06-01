package sortingMain;
import sortingLogic.*;
import java.util.*;

public class SortingMain
{
	Scanner scan=new Scanner(System.in);
	SortingLogic logicObj=new SortingLogic();
	
	private void selectionSort()
	{
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
			scan.nextLine();
		}
		logicObj.selectionSort(arr,num);
	}
	private void insertionSort()
	{
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
			scan.nextLine();
		}
		logicObj.insertionSort(arr,num);
	}
	private void mergeSort()
	{
		System.out.println("Enter the Number of Elements in the Array:");
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		System.out.println("Enter the Elements:");
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		int newArr[]=logicObj.mergeSort(arr);
		for(int i=0;i<newArr.length;i++)
		{
			System.out.print(newArr[i]+" ");
		}
	}
	
	private void checkArray()
	{
		System.out.println("Enter the Elements in the Array:");
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		boolean cond=logicObj.checkArray(arr);
		if(cond==true)
		{
			System.out.println("The Given array is Sorted");
		}
		else
		{
			System.out.println("The Given array is Unsorted");
		}
	}
	
	private void kthSmallestNumber()
	{
		System.out.println("Enter the Number of Elements in the Array:");
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		System.out.println("Enter the Elements:");
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter Which Smallest Number to Find :");
		int k=scan.nextInt();
		scan.nextLine();
		int small=logicObj.kthSmallestNumber(arr,k);
		System.out.println("The Smallest Number is :"+small);
	}
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		SortingMain mainObj=new SortingMain();
		
		int count=scan.nextInt();
		scan.nextLine();
		
		switch(count)
		{
			
			case 1:
				mainObj.selectionSort();
				break;
				
			case 2:
				mainObj.insertionSort();
				break;	
				
			case 3:
				mainObj.mergeSort();
				break;	
				
			case 4:
				mainObj.kthSmallestNumber();
				break;
				
			case 5:
				mainObj.checkArray();
				break;		
		}
	}
}
