package balanced;
import java.util.*;

public class BalancedValue
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String inputString=scan.nextLine();
		Balance balanceObj=new Balance();
		balanceObj.getBalanced(inputString);
	}
}
class Balance
{		
	public void getBalanced(String inputString)
	{
		Map<String,Integer> newMap=new HashMap<>();
		int count=1;
		String first="";
		String second="";
		int length=0;
		int sum1=0;
		int sum2=0;
		int temp=0;
		String ch1="";
		for(char ch='a';ch<='z';ch++)
		{
			newMap.put(String.valueOf(ch),count);
			count++;
		}
		count=0;
		for(int i=1;i<inputString.length();i++)
		{
			first=inputString.substring(0,i);
			second=inputString.substring(i+1);
			length=first.length();
			
			while(length>0)
			{
				sum1=sum1+length*newMap.get(String.valueOf(first.charAt(first.length()-length)));
				
				length--;
			}
			
			int j=0;
			while(j<second.length())
			{
				sum2=sum2+(j+1)*newMap.get(String.valueOf(second.charAt(j)));
				j++;
			}
			if(sum1==sum2)
			{
				ch1=String.valueOf(inputString.charAt(i));
				System.out.println(ch1);
				break;
			}
			else
			{
				System.out.println("No Balanced Word Found");
			}
		}
	}
}
