package de;
import java.util.*;


public class String8
{
	public void task8(String s1,String s2)
	{
		if(s2.length()==3)
		{
			s2=s2+s1.substring(3);
			System.out.println("The Replaced String is : "+s2);
		}
		else
		{
			System.out.println("The Number of Characters are Less than or More Than 3");
		}
	}
	public static void main(String args[])
	{
		String8 s=new String8();
		Scanner sc=new Scanner(System.in);
		String s11=sc.nextLine();
		String s12=sc.nextLine();
		s.task8(s11,s12);
	}
}
