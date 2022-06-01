package remove;
import java.util.*;

public class RemovePalindrome
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Remove removeObj=new Remove();
		String inputString=scan.nextLine();
		String newString=removeObj.findPalindrome(inputString);
		System.out.println(newString);
	}
}
class Remove
{
	public String findPalindrome(String inputString)
	{
		char ch[]=inputString.toCharArray();
		String temp="";
		String rev="";
		String result="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				rev=rev+ch[i];
			}
			if(ch[i]==' ')
			{
				for(int j=rev.length()-1;j>=0;j--)
				{
					temp=temp+rev.charAt(j);
				}
				System.out.println(temp);
			}	
			
		}
			if(temp==rev)
			{
				result=result+"";
			}
			if(temp!=rev)
			{
				result=result+rev;
			}
		return result;
	}
}			
