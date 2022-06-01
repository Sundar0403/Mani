package bstMain;
import java.util.*;
import bstLogic.*;

public class BinarySearchTreeMain
{
	Scanner scan=new Scanner(System.in);
	BinarySearchTreeLogic logicObj=new BinarySearchTreeLogic();
	private void minimumElement()
	{
		System.out.println("Enter the Number of Elements");
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the Number of Small Elements you need to Get");
		int k=scan.nextInt();
		scan.nextLine();
		logicObj.minimumElement(arr,num,k);
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		BinarySearchTreeMain mainObj=new BinarySearchTreeMain();
		int choice=scan.nextInt();
		scan.nextLine();
		switch(choice)
		{
			case 1:
				mainObj.minimumElement();
				break;
		}
	}
}
