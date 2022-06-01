package mathematicalMain;
import mathematicalLogic.*;
import java.util.*;

public class MathematicalMain
{
	Scanner scan=new Scanner(System.in);
	MathematicalLogic logicObj=new MathematicalLogic();
	private void palindromeNumber()
	{
		System.out.println("Enter the Number to get Palindrome");
		int num=scan.nextInt();
		scan.nextLine();
		int count=10;
		int result=logicObj.palindromeNumber(num,count);
		System.out.println("The Palindrome Number :");
		System.out.println(result);
	}
	private void uglyNumber()
	{
		System.out.println("Enter the Number");
		int num=scan.nextInt();
		int result=logicObj.uglyNumber(num);
	}
	private void maxSum(int a[])
	{
		int sum=0;
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=arr[i];
			max=Math.max(sum,max);
		}
		System.out.println(Arrays.toString(max));
	}
	private void permutation()
	{
		System.out.println("Enter the Number");
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		System.out.println("Enter the Elements");
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
			//scan.nextLine();
		}
		maxSum(arr);
		logicObj.permutation(arr,num);
	}
	private void largest()
	{
		System.out.println("Enter the Number");
		int number=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the Number to search");
		int d=scan.nextInt();
		scan.nextLine();
		logicObj.largest(number,d);
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		MathematicalMain mainObj=new MathematicalMain();
		int choice=scan.nextInt();
		scan.nextLine();
		switch(choice)
		{
			
			case 3:
				mainObj.uglyNumber();
				break;
			
			case 5:
				mainObj.palindromeNumber();
				break;
				
			case 4:
				mainObj.permutation();
				break;	
				
			case 7:
				mainObj.largest();
				break;	
				
		}
	}
}

