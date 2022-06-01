package newTask;

import java.util.Scanner;

public class CountAndSay 
{
	private String countAndSay(int number) throws Exception
	{
		String output="1";
		
		
		
		for(int i=1;i<number;i++)
		{
			String temp="";
			
			
			int length=output.length();
			
			int k=0;
			while(k<length)
			{
				int count=1;
				while(k<length-1 && (output.charAt(k)==output.charAt(k+1)))
				{
					count++;
					k++;
				}
				temp=temp+count+String.valueOf(output.charAt(k));
				k++;
				
			}
			//temp=temp+count+output.charAt(k);
			output=temp;
		}
		return output;
	}
	public static void main(String args[])
	{
		CountAndSay countObj=new CountAndSay();
		try (Scanner scan = new Scanner(System.in)) 
		{
			System.out.println("Enter the Number :");
			int number=scan.nextInt();
			scan.nextLine();
			String result=countObj.countAndSay(number);
			System.out.println("The Count And Say Sequence is :");
			System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println("Error Occured :"+e.getMessage());
			e.printStackTrace();
		}
	}

	
}
