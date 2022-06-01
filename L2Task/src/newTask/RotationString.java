package newTask;

import java.util.ArrayList;
import java.util.Scanner;

public class RotationString {
	
	private boolean isRotation(String input, String rotate) 
	{
		//ArrayList<String> newList=new ArrayList<>();
		int length=input.length();
		
		String result="";
		String antiClock="";
		int d=2;
	//	int n=length-1;
		d=d%length;
		for(int i=0;i<length;i++)
		{
			int index=(length+i+d)%length;
			result=result+input.charAt(index);
		}
		for(int i=length-1;i>=0;i--)
		{
			int index=(length+i+d)%length;
			antiClock=antiClock+input.charAt(index);
		}
		if(result.equals(rotate) || antiClock.equals(rotate))
		{
			return true;
		}
		return false;
	}
	
	public static void main(String args[])
	{
		RotationString rotateObj=new RotationString();
		try (Scanner scan = new Scanner(System.in)) 
		{
			System.out.println("Enter the Input String :");
			String input=scan.nextLine();
			System.out.println("Enter the Rotate String :");
			String rotate=scan.nextLine();
			if(rotateObj.isRotation(input,rotate))
			{
				System.out.println("The Given String is Rotation of String 2");
			}
			else
			{
				System.out.println("The Given String is Not a Rotation of String 2");
			}
		}
		catch(Exception e)
		{
			System.out.println("Error Occured :"+e.getMessage());
		}
	}

	
}
