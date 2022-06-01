package fragment;
import java.util.*;

public class CommonFragment
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number of Strings:");
		int n=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the Strings");
		String newString[]=new String[n];
		for(int i=0;i<n;i++)
		{
			newString[i]=scan.nextLine();
		}
		Fragment fragObj=new Fragment();
		fragObj.getFragment(newString,n);
	}
}
class Fragment
{
	public boolean isContains(String input,String[] newString,int n)
	{
		int count=0;
		for(int i=0;i<newString.length;i++)
		{
			String str=newString[i];
			if(str.contains(input))
			{
				count++;
			}
		}
		if(count==n)
		{
			return true;
		}
		return false;
	} 
	public void getFragment(String[] newString,int n)
	{
		int count=0;
		String temp=newString[0]+" ";
		List<String> newList=new ArrayList();
		String secondTemp="";
		String result="";
		String result2="";
		for(int i=0;i<temp.length();i++)
		{
			if(temp.charAt(i)!=' ')
			{
				result=result+temp.charAt(i);
			}
			else
			{
				if(isContains(result,newString,n))
				{
					count++;
					result2=result2+result;
					result2=result2+" ";	
				}
				result="";
			}
		}
		if(count==3)
		{
			System.out.println(result2);
		}
		else
		{
			System.out.println("No Common Factor Found");
		}	
	}
}
