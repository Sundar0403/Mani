package newTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EncryptString {
	
	private String getEncrypt(String input) 
	{
		String result="";
		
		int length=input.length();
		for(int i=0;i<length;i++)
		{
			String temp="";
			int count=1;
			if(i<length-1 &&(input.charAt(i)==input.charAt(i+1)))
			{
				count++;
				i++;
			}
			temp=Integer.toHexString(count)+input.charAt(i);
			result=temp+result;
		}
		
		return result;
	}
	
	public static void main(String args[])
	{
		EncryptString encryptObj=new EncryptString();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String :");
		String input=scan.nextLine();
		String result=encryptObj.getEncrypt(input);
		System.out.println(result);
	}

	
}
