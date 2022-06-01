package convert;
import java.util.*;

public class ConvertNum
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		scan.nextLine();
		Convert convertObj=new Convert();
		convertObj.convertNum(num);
	}
}
class Convert
{
	public void convertNum(int num)
	{
		Map<Integer,String> newMap=new HashMap<>();
		int rem=0;
		int newRem=0;
		int sum=0;
		int count=0;
		int i=1;
		int intermediate=0;
		List<Integer> newList=new ArrayList(num);
		
		newMap.put(1,"one");
		newMap.put(2,"two");
		newMap.put(3,"three");
		newMap.put(4,"four");
		newMap.put(5,"five");
		newMap.put(6,"six");
		newMap.put(7,"seven");
		newMap.put(8,"eight");
		newMap.put(9,"nine");
		newMap.put(10,"ten");
		newMap.put(11,"eleven");
		newMap.put(12,"twelve");
		newMap.put(13,"thirteen");
		
		newMap.put(14,"fourteen");
		newMap.put(15,"fifteen");
		newMap.put(16,"sixteen");
		newMap.put(17,"seventeen");
		newMap.put(18,"eighteen");
		newMap.put(19,"nineteen");
		newMap.put(20,"twenty");
		newMap.put(30,"thirty");
		newMap.put(40,"forty");
		newMap.put(50,"fifty");
		newMap.put(60,"sixty");
		newMap.put(70,"seventy");
		newMap.put(80,"eighty");
		newMap.put(90,"ninety");
		newMap.put(100,"hundred");
		newMap.put(1000,"thousand");
		
		if(num>9999)
		{
			System.out.println("Unable to Process Further");
		}
		rem=num%100;
		if(rem<20)
		{
			newList.add(rem);
			num=num-rem;
			while(num>0)
			{
				newRem=num%10;
				sum=newRem*i;
				i=i*10;
				num=num/10;
				if(sum>=100&&sum<1000)
				{
					intermediate=sum/100;
					sum=sum/intermediate;
					newList.add(sum);
					newList.add(intermediate);
				}
				if(sum>=1000)
				{
					intermediate=sum/1000;
					sum=sum/intermediate;
					newList.add(sum);
					newList.add(intermediate);	
				}
				else if(sum<100)
				{
					newList.add(sum);
				}	
			}
		}
		if(rem>=20)
		{
			while(num>0)
			{
				newRem=num%10;
				sum=newRem*i;
				i=i*10;
				num=num/10;
				if(sum>=100&&sum<1000)
				{
					intermediate=sum/100;
					sum=sum/intermediate;
					newList.add(sum);
					newList.add(intermediate);
				}
				if(sum>=1000)
				{
					intermediate=sum/1000;
					sum=sum/intermediate;
					newList.add(sum);
					newList.add(intermediate);	
				}
				else if(sum<100)
				{
					newList.add(sum);
				}
			}
		}

		for(int j=newList.size()-1;j>=0;j--)
		{
			count++;
			if(newList.get(j)!=null)
			{
				System.out.print(newMap.getOrDefault(newList.get(j),"")+" ");	
			}
			
		}	
		System.out.println();
	}
} 
