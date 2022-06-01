package mini;

import java.util.ArrayList;

import java.util.Scanner;

import logic.PracticeLogic;

public class Practice {
	
	PracticeLogic practiceObj=new PracticeLogic();
	Scanner scan=new Scanner(System.in);
	private void binaryToHex() 
	{
		System.out.println("Enter the String :");
		String input=scan.nextLine();
		practiceObj.getBinaryToHex(input);
	}
	
	private void kAnagram()
	{
		System.out.println("Enter the first String:");
		String input=scan.nextLine();
		System.out.println("Enter the Second String:");
		String second=scan.nextLine();
		System.out.println("Enter the K position :");
		int k=scan.nextInt();
		scan.nextLine();
		boolean boo=practiceObj.checkKAnagram(input,second,k);
		if(boo)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
	}
	
	private void waveArray()
	{
		System.out.println("Enter the Number of Elements in the Array:");
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		practiceObj.waveArray(arr,num);
	}
	
	private void minimumDiff()
	{
		System.out.println("Enter the Number of Elements in the Array :");
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		int result=practiceObj.getMinDiff(arr,num);
		System.out.println("The Minimum Difference is : "+result);
	}
	/*private boolean stringContains()
	{
		System.out.println("Enter the Number of Elements in the Array:");
		String input=scan.nextLine();
		String output=scan.nextLine();
		for(int i=0;i<input.length();i++)
		{
			if(isContains(input,output))
			{
				return true;
			}
		}
		return false;
	}*/
	
	private void alternativeSortArray()
	{
		System.out.println("Enter the Number of Elements in the Array:");
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		practiceObj.alternativeSortArray(arr,num);
	}
	
	private void getGoodPairs()
	{
		System.out.println("Enter the Elements in the Array :");
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		int result=practiceObj.getGoodPairs(arr,num);
		System.out.println("The Number of Good Pairs is : "+result);
	}
	
	private void mergeSort()
	{
		System.out.println("Enter the Number of Elements in the Array :");
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the Number of Elements in the Second Array :");
		int num2=scan.nextInt();
		scan.nextLine();
		int arr2[]=new int[num];
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<num2;i++)
		{
			arr2[i]=scan.nextInt();
		}
		int result[]=practiceObj.doMerge(arr,arr2);
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+" ");
		}
	}
	
	private void getLeaders() 
	{
		System.out.println("Enter the Number of Elements in the Array :");
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		ArrayList<Integer> newList=practiceObj.getLeaders(arr,num);
		for(int i=0;i<newList.size();i++)
		{
			System.out.print(newList.get(i)+" ");
		}
	}
	
	private void clockwiseRotate()
	{
		System.out.println("Enter the Number of Elements in the Array :");
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		int result[]=practiceObj.clockwiseRotate(arr);
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+" ");
		}
	}
	
	private void getMinDistance() 
	{
		System.out.println("Enter the Number of Elements in the Array :");
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the First Number :");
		int first=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the Second Number :");
		int second=scan.nextInt();
		scan.nextLine();
		int min=practiceObj.getMinDist(arr,num,first,second);
		System.out.println("The Minimum Distance is : "+min);
	}
	
	private void sumZero()
	{
		System.out.println("Enter the Number of Elements in the Array :");
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		System.out.println("Enter the Array Elements:");
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		boolean result=practiceObj.sumZero(arr,num);
		System.out.println(result);
	}
	
	
	
	
	private void alternativePositiveNegative()
	{
		System.out.println("Enter the Number of Elements in the Array:");
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		int result[]=practiceObj.getAlternativePositiveNegative(arr,num);
		for(int i=0;i<num;i++)
		{
			System.out.print(result[i]+" ");
		}
	}
	
	private void nonRepeating() 
	{
		System.out.println("Enter the Number of Elements in the Array :");
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		int result=practiceObj.nonRepeating(arr,num);
		System.out.println("The First Non Repeating Number is :"+result);
	}
	
	private void quickSort()
	{
		System.out.println("Enter the Number of Elements in the Array:");
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		practiceObj.quickSort(arr,0 , num-1);
		for(int i=0;i<num;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	private void getMinElement() 
	{
		System.out.println("Enter the Number of Elements in the Array :");
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		int result=practiceObj.getMinElement(arr,0,num);
		System.out.println("The Minimum Number is :"+result);
	}
	
	private void balanced() 
	{
		System.out.println("Enter the Elements in the Array :");
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		int result=practiceObj.balanced(arr,num);
		System.out.println(" To Make Balanced We need to Add "+result);
	}
	
	private void getAbsoluteDiff() 
	{
		System.out.println("Enter the Number of Elements in the Array:");
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		System.out.println("Enter the array elements :");
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the Number to find the Absolute Difference :");
		int abs=scan.nextInt();
		scan.nextLine();
		int result[]=practiceObj.getAbsoluteDiff(arr,num,abs);
		for(int i=0;i<num;i++)
		{
			System.out.print(result[i]+" ");
		}
	}
	
	private void sumClosest() 
	{
		System.out.println("Enter the Number of Elements in the Array :");
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		System.out.println("Enter the array elements :");
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		int result=practiceObj.getClosest(arr,num);
		System.out.println("The Sum Closest to 0 is : "+result);
	}
	
	private void permutn() 
	{
		System.out.println("Enter the String:");
		String input=scan.nextLine();
		System.out.println("Enter the Check String :");
		String check=scan.nextLine();
		System.out.println(practiceObj.checkPermutn(input,check));
	}
	
	private void checkFragment()
	{
		System.out.println("Enter the first string :");
		String first=scan.nextLine();
		System.out.println("Enter the Second string :");
		String second=scan.nextLine();
		System.out.println("Enter the Third string :");
		String third=scan.nextLine();
		String arr[]=new String[3];
		arr[0]=first;
		arr[1]=second;
		arr[2]=third;
		String result=PracticeLogic.removeFragment(arr);
		System.out.println(result);
	}
	
	private void maxToys() 
	{
		System.out.println("Enter the Number of Elements in the Array :");
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		System.out.println("Enter the array elements :");
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the Amount : ");
		int k=scan.nextInt();
		scan.nextLine();
		int result=practiceObj.maxToys(arr,num,k);
		System.out.println("The Maximum Toys Bought is : "+result);
	}
	
	private void palindrome()
	{
		System.out.println("Enter the Number to Find :");
		int num=scan.nextInt();
		scan.nextLine();
		int start=10;
		int result=practiceObj.getPalindrome(num,start);
		System.out.println(result);
	}
	
	public static void main(String args[])
	{
		Practice practiceObj=new Practice();
		try (Scanner scan = new Scanner(System.in)) 
		{
			int choice=scan.nextInt();
			scan.nextLine();
			
			switch(choice)
			{
				case 1:
						practiceObj.binaryToHex();
						break;
						
				case 2:
						practiceObj.mergeSort();
						break;
						
				case 3:
						practiceObj.clockwiseRotate();
						break;
						
				case 4:
						practiceObj.kAnagram();
						break;
						
				case 5:
						practiceObj.waveArray();
						break;
						
				case 6:
						practiceObj.alternativeSortArray();
						break;
						
				case 7:
						practiceObj.balanced();
						break;
						
				case 8:
						practiceObj.getGoodPairs();
						break;
						
				case 9:
						practiceObj.minimumDiff();
						break;
						
				case 10:
						practiceObj.getLeaders();
						break;
						
				case 11:
						practiceObj.getMinDistance();
						break;
						
				case 12:
						practiceObj.alternativePositiveNegative();
						break;
						
				case 13:
						practiceObj.sumZero();
						break;
						
				case 14:
						practiceObj.nonRepeating();
						break;
						
				case 15:
						practiceObj.getMinElement();
						break;
						
				case 16:
						practiceObj.getAbsoluteDiff();
						break;
						
				case 17:
						practiceObj.sumClosest();
						break;
						
				case 18:
						practiceObj.maxToys();
						break;
						
				case 19:
						practiceObj.palindrome();
						break;
						
				case 20:
						practiceObj.quickSort();
						break;
						
				case 21:
						practiceObj.permutn();
						break;
						
				case 22:
						practiceObj.checkFragment();
						break;
						
						
				/*case 7:
						boolean bool=practiceObj.stringContains();
						System.out.println(bool);
						break;*/
			}
		}
		catch(Exception e)
		{
			System.out.println("Error Occured :"+e.getMessage());
			e.printStackTrace();
		}
	}

	
	


}
