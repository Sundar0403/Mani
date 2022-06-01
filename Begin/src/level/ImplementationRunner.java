package level;

import java.util.Scanner;

import logic.ImplementationLogic;

public class ImplementationRunner {
	
	ImplementationLogic logicObj=new ImplementationLogic();  
	Scanner scan=new Scanner(System.in);
	
	private void getDifferent() throws Exception
	{
		System.out.println("Enter the Number of Elements in the First Array :");
		int num=scan.nextInt();
		scan.nextLine();
		int first[]=new int[num];
		System.out.println("Enter the Array ELements :");
		for(int i=0;i<num;i++)
		{
			first[i]=scan.nextInt();
			scan.nextLine();
		}
		System.out.println("Enter the Number of Elements in the First Array :");
		int value=scan.nextInt();
		scan.nextLine();
		int second[]=new int[value];
		System.out.println("Enter the Array ELements :");
		for(int i=0;i<value;i++)
		{
			second[i]=scan.nextInt();
			scan.nextLine();
		}
		int index=logicObj.getDifferent(first,second);
		System.out.println(index);
	}
	private void getShuffledString() throws Exception
	{
		System.out.println("Enter the Number of Elements in the Array :");
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
			scan.nextLine();
		}
		System.out.println("Enter the Input String :");
		String input=scan.nextLine();
		
		String result=logicObj.getShuffledString(arr,input);
		System.out.println(result);
	}
	
	private void getAbsoluteSort() throws Exception
	{
		System.out.println("Enter the Number of Elements in the Array :");
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
			scan.nextLine();
		}
		System.out.println("Enter the Number to Find Absolute Differnce :");
		int absolute=scan.nextInt();
		scan.nextLine();
		int result[]=logicObj.getAbsolute(arr,absolute);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]+" ");
		}
	}
	
	private void minElement() throws Exception
	{
		System.out.println("Enter the Number of Elements in the Array :");
		int num=scan.nextInt();
		scan.nextLine();
		int arr[]=new int[num];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.nextInt();
			scan.nextLine();
		}
		int min=logicObj.getMin(arr);
		System.out.println("The Minimum Element is :"+min);
	}
	
	private void noOfOpenDoors() throws Exception
	{
		System.out.println("Enter the Number of Doors :");
		int num=scan.nextInt();
		scan.nextLine();
		int result=logicObj.getNoOfOpen(num);
		System.out.println(result);
	}
	
	private void setZeros() throws Exception
	{
		System.out.println("Enter the No of Rows :");
		int row=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the No of Columns :");
		int column=scan.nextInt();
		scan.nextLine();
		int arr[][]=new int[row][column];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=scan.nextInt();
			}
			scan.nextLine();
		}
		
		int result[][]=logicObj.setZeros(arr);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	private void diagonalSort() throws Exception
	{
		System.out.println("Enter the No of Rows :");
		int row=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the No of Columns :");
		int column=scan.nextInt();
		scan.nextLine();
		int arr[][]=new int[row][column];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=scan.nextInt();
			}
			scan.nextLine();
		}
		
		int result[][]=logicObj.diagonalSort(arr);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	private void getUglyNumber() throws Exception
	{
		System.out.println("Enter the Number to find");
		int num=scan.nextInt();
		scan.nextLine();
		
		int result=logicObj.getUglyNumber(num);
		
		System.out.println("The "+num+"th Ugly Number is :"+result);
	}
	
	public static void main(String args[]) 
	{
		ImplementationRunner mainObj=new ImplementationRunner();
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the Choice :");
			int choice=scan.nextInt();
			scan.nextLine();
			switch(choice)
			{
				case 1:
					try
					{
						mainObj.getDifferent();
						break;
					}
					catch(Exception e)
					{
						System.out.println("Error Occured :"+e.getMessage());
						e.printStackTrace();
					}
					
				case 2:
					try
					{
						mainObj.getShuffledString();
						break;
					}
					catch(Exception e)
					{
						System.out.println("Error Occured :"+e.getMessage());
						e.printStackTrace();
					}
					
				case 3:
					try
					{
						mainObj.noOfOpenDoors();
						break;
					}
					catch(Exception e)
					{
						System.out.println("Error Occured :"+e.getMessage());
						e.printStackTrace();
					}
					
				case 4:
					try
					{
						mainObj.getAbsoluteSort();
						break;
					}
					catch(Exception e)
					{
						System.out.println("Error Occured :"+e.getMessage());
						e.printStackTrace();
					}
					
				case 5:
					try
					{
						mainObj.minElement();
						break;
					}
					catch(Exception e)
					{
						System.out.println("Error Occcured :"+e.getMessage());
						e.printStackTrace();
					}
					
				case 6:
					try
					{
						mainObj.setZeros();
						break;
					}
					catch(Exception e)
					{
						System.out.println("Error Occcured :"+e.getMessage());
						e.printStackTrace();
					}
					
				case 7:
					try
					{
						mainObj.diagonalSort();
						break;
					}
					catch(Exception e)
					{
						System.out.println("Error Occcured :"+e.getMessage());
						e.printStackTrace();
					}
					
				case 8:
					try
					{
						mainObj.getUglyNumber();
						break;
					}
					catch(Exception e)
					{
						System.out.println("Error Occcured :"+e.getMessage());
						e.printStackTrace();
					}	
			}
		}
	}
	

	
}
