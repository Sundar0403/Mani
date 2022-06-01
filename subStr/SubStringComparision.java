package subStr;
import java.util.*;

public class SubStringComparision
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		SubStr subStringObj=new SubStr();
		String inputString=scan.nextLine();
		String secondString=scan.nextLine();
		subStringObj.findNotMatch(inputString,secondString);
	}
}
class SubStr
{
	public void findNotMatch(String inputString,String secondString)
	{
		char ch1[]=inputString.toCharArray();
		char ch2[]=secondString.toCharArray();
		List<String> newList=new ArrayList();
		String result="";
		String temp1="";
		String temp2="";
		String save="";
		int count=0;
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i])
			{
				temp1=temp1+ch1[i];
				temp2=temp2+ch2[i];
				result=temp1+","+temp2;
				count++;
			}
			if(ch1[i]==ch2[i]&&count>0)
			{
				newList.add(result);
				result="";
				temp1="";
				temp2="";
			}
			
			
		}
		newList.add(result);
		newList.removeAll(Arrays.asList("", null));
		for(String newStr : newList)
		{
			System.out.println(newStr);
		}
	}
}
