package preparationMain;
import preparationLogic.*;
import java.util.*;

public class PreparationMain
{
	Scanner scan=new Scanner(System.in);
	PreparationLogic logicObj=new PreparationLogic();
	private void palindromeNumber()
	{
		System.out.println("Enter Which Palindrome Number Need to get ");
		int num=scan.nextInt();
		scan.nextLine();
		int value=10;
		int result=logicObj.palindromeNumber(num,value);
		System.out.println(result);
	}	
	private void trimBST()
	{
		System.out.println("Enter the Number of elements in the BST ");
		int num=scan.nextInt();
		scan.nextLine();
		int inputArray[]=new int[num];
		System.out.println("Enter the BST Elements");
		for(int i=0;i<num;i++)
		{
			inputArray[i]=scan.nextInt();
		}
		System.out.println("Enter the Low Value");
		int low=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the high Value");
		int high=scan.nextInt();
		scan.nextLine();
		logicObj.trim(inputArray,low,high);
	}
	/*private void mergeSort()
	{
		System.out.println("Enter the Number of elements in the Array ");
		int num=scan.nextInt();
		scan.nextLine();
		int inputArray[]=new int[num];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<num;i++)
		{
			inputArray[i]=scan.nextInt();
		}
		logicObj.mergeSort(inputArray);
	}*/
	private void sumSubArray()
	{
		System.out.println("Enter the Number of elements in the Array ");
		int num=scan.nextInt();
		scan.nextLine();
		int inputArray[]=new int[num];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<num;i++)
		{
			inputArray[i]=scan.nextInt();
		}
		int value=scan.nextInt();
		scan.nextLine();
		logicObj.sumSubArray(inputArray,value);
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		PreparationMain mainObj=new PreparationMain();
		System.out.println("Enter Your Choice");
		int choice=scan.nextInt();
		scan.nextLine();
		
		switch(choice)
		{
			case 1:
				mainObj.palindromeNumber();
				break;
				
			/*case 3:
				mainObj.mergeSort();
				break;*/
				
			case 4:
				mainObj.trimBST();
				break;	
				
			case 5:
				mainObj.sumSubArray();
				break;		
		}
	}
}
