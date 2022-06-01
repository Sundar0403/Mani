package magical;
import java.util.*;

public class MagicalString
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String inputString=scan.nextLine();
		String secondString=scan.nextLine();
		Magical magicObj=new Magical();
		boolean newString=magicObj.getMagical(inputString,secondString);
		System.out.println(newString);
	}
}
class Magical
{
	public boolean getMagical(String inputString,String secondString)
	{
		Map<Character,Character> newMap=new HashMap<>();
		char ch1[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char ch2[]=inputString.toCharArray();
		char ch3[]=secondString.toCharArray();
		int length=ch1.length-1;
		int count=0;
		for(char ch='a';ch<='z';ch++)
		{
			newMap.put(ch,ch1[length]);
			length--;
		}

		if(inputString.length()!=secondString.length())
		{
			return false;
		}
		for(int i=0;i<ch2.length;i++)
		{
			if(newMap.get(ch2[i])==ch3[i])
			{
				count++;
			}
		}
		if(count==ch2.length)
		{
			return true;
		}
		
		return false;
	}
}
