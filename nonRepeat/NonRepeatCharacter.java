package nonRepeat;
import java.util.*;

public class NonRepeatCharacter
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String inputString=scan.nextLine();
		NonRepeat repeatObj=new NonRepeat();
		repeatObj.notRepeated(inputString);
	}
}
class NonRepeat
{
	public void notRepeated(String inputString)
	{
		char ch1[]=inputString.toCharArray();
		int count=0;
		String getChar="";
		boolean b=false;
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=0;j<ch1.length;j++)
			{
				if(ch1[i]==ch1[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				getChar=String.valueOf(ch1[i]);
				System.out.println(getChar);
				b=true;
				break;
			}
			else
			{
				b=false;
			}
			count=0;
		}
		if(b==false)
		{
			System.out.println("no matching character");
		}
	}
}
