package mathematicalLogic;
import java.util.*;

public class MathematicalLogic
{
int newCount=0;
List<String> newList=new ArrayList<>();
	public int palindromeNumber(int num,int count)
	{
		if(isPalindrome(count))
		{
			newCount++;
			
		}
		if(newCount==num)
		{
			return count;
		}
		
		return palindromeNumber(num,++count);
	}
	public void permutation(int arr[],int num)
	{
		String inputString="";
		int temp=0;
		String ans="";
		for(int i=0;i<num;i++)
		{
			inputString=inputString+String.valueOf(arr[i]);
		}
		List<String> newList=printPermutn(inputString,ans);
		int max=Integer.MIN_VALUE;
		for(int i=0;i<newList.size();i++)
		{
			temp=Integer.parseInt(newList.get(i));
			for(int j=2;j<Math.sqrt(temp);j++)
			{
				if(temp%1==0&&temp%j!=0)
				{
					max=Math.max(max,temp);
				}	
			}		
		}
		System.out.println(max);
	}
	public List<String> printPermutn(String str, String ans)
    	{
 		
        	if (str.length() == 0) 
        	{
            		//System.out.println(ans);
            		newList.add(ans);
            		//return;
       	}
 
        	for (int i=0;i<str.length();i++) 
        	{
           		char ch = str.charAt(i);
            		String ros = str.substring(0, i) +str.substring(i + 1);
            		printPermutn(ros,ans+ch);
        	}
        	return newList;
    }
	public void largest(int num,int d)
	{
		String inputString=String.valueOf(num);
		int index=inputString.indexOf(String.valueOf(d));
		System.out.println(index);
		String result=inputString.substring(index+1);
		System.out.println(result);
		int max=Integer.parseInt(String.valueOf(result.charAt(0)));
		int temp=0;
		int min=0;
		for(int i=1;i<result.length();i++)
		{
			min=Integer.parseInt(String.valueOf(result.charAt(i)));
			if(max<min)
			{
				temp=max;
				max=min;
				min=temp;
			}
		}
		System.out.println(max);
	}
	public boolean isPalindrome(int n)
	{
		StringBuilder newBuilder=new StringBuilder();
		String value=String.valueOf(n);
		newBuilder.append(value);
		String temp=newBuilder.reverse().toString();
		if(temp.equals(value))
		{
			return true;
			
		}
		return false;
		
	}
	public int uglyNumber(int num)
	{
		Map<Integer,Integer> newMap=new HashMap<>();
		newMap.put(1,1);
		newMap.put(2,2);
		newMap.put(3,3);
		newMap.put(4,4);
		newMap.put(5,5);
		newMap.put(6,6);
		
		int count=7;
		int newCount=6;
		while(count<num)
		{
			for(int i=7;i<100000;i++)
			{
			
				if((count%2==0 || count%3==0 || count%5==0)&&count%i!=0)
				{
					newMap.put(++newCount,count);
				}
				
			}
			
		}
		System.out.println(count);
		return count;
	}	
}




