package hashmain;
import hashlogic.*;
import java.util.*;

public class HashMapMain
{
	public static void main(String args[])
	{
		HashMapFunc hashObj=new HashMapFunc();
		Scanner scan=new Scanner(System.in);
		Map<Object,Object> inputMap=new HashMap();
		int num=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<num;i++)
		{
			Object key=scan.nextLine();
			Object value=scan.nextInt();
			inputMap=hashObj.addInMap(inputMap,key,value);
		}
		hashObj.iterateInMap(inputMap);
	}
}
