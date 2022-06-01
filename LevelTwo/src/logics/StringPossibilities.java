package logics;

import java.util.ArrayList;
import java.util.Scanner;

public class StringPossibilities {
	
	private ArrayList<String> getPossibility(String input, int target) throws Exception 
	{
		if(input==null || input.isEmpty())
		{
			throw new Exception("String can't be Null or Empty :");
		}
		ArrayList<String> newList=new ArrayList<>();
		String temp="";
		String temp2="";
		String result="";
		String oper="";
		char ch=0;
		int value=0;
		
		for(int i=0;i<input.length();i++)
		{
			ch=input.charAt(i);
			value=getSum(ch,value);
			if(value==target)
			{
				oper="sum";
				result=getString(input,oper);
				//System.out.println(result);
				newList.add(result);
			}
			value=getSub(ch,value);
			if(value==target)
			{
				oper="sub";
				result=getString(input,oper);
				//System.out.println(result);
				newList.add(result);
			}
			value=getMultiply(ch,value);
			if(value==target)
			{
				oper="multiply";
				result=getString(input,oper);
				//System.out.println(result);
				newList.add(result);
			}
			value=getDivisible(ch,value);
			if(value==target)
			{
				oper="division";
				result=getString(input,oper);
				//System.out.println(result);
				newList.add(result);
			}
		}
		
		for(int i=1;i<input.length();i++)
		{
			temp=input.substring(0,1);
			
		}
		
		return null;
	}
	
	
	
	private String getString(String input, String oper) 
	{
		String result="";
		for(int i=0;i<input.length();i++)
		{
			switch(oper)
			{
				case "sum":
						if(i<input.length()-1)
						{
							result=result+input.charAt(i)+"+";
						}
						else
						{
							result=result+input.charAt(i);
							//System.out.println(result);
						}
						
				case "divisible":
					if(i<input.length()-1)
					{
						result=result+input.charAt(i)+"-";
					}
					else
					{
						result=result+input.charAt(i);
					//	System.out.println(result);
					}
					
				case "Multiply":
					if(i<input.length()-1)
					{
						result=result+input.charAt(i)+"*";
					}
					else
					{
						result=result+input.charAt(i);
						//System.out.println(result);
					}
					
				case "division":
					if(i<input.length()-1)
					{
						result=result+input.charAt(i)+"/";
					}
					else
					{
						result=result+input.charAt(i);
						//System.out.println(result);
					}	
			}
		}
		return null;
	}



	private int getSum(char temp,int value) throws Exception
	{
		int sum=0;
		sum=value+Integer.parseInt(String.valueOf(temp));
		System.out.println(sum);
		return sum;
	}
	
	private int getSub(char temp,int value) throws Exception
	{
		int sub=0;
		sub=Math.abs(value-Integer.parseInt(String.valueOf(temp)));
		System.out.println(sub);
		return sub;
	}
	private int getMultiply(char temp,int value) throws Exception
	{
		int mul=1;
		mul=value*Integer.parseInt(String.valueOf(temp));
		System.out.println(mul);
		return mul;
	}
	private int getDivisible(char temp,int value) throws Exception
	{
		int div=1;
		div=value/Integer.parseInt(String.valueOf(temp));
		System.out.println(div);
		return div;
	}
	
	public static void main(String args[])
	{
		StringPossibilities obj=new StringPossibilities();
		try(Scanner scan=new Scanner(System.in);)
		{
			System.out.println("Enter the Input String :");
			String input=scan.nextLine();
			System.out.println("Enter the Target :");
			int target=scan.nextInt();
			scan.nextLine();
			ArrayList<String> newList=obj.getPossibility(input,target);
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured :"+e.getMessage());
			e.printStackTrace();
		}
	}

	
}
