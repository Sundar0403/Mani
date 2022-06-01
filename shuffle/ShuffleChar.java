package shuffle;
import java.util.*;
import java.lang.*;

public class ShuffleChar
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.nextLine();
		Character ch[]=new Character[n];
		for(int i=0;i<n;i++)
		{
			 ch[i]=scan.next().charAt(0);
		}
		Shuffle shuffleObj=new Shuffle();
		shuffleObj.getShuffle(ch);
	}
}
class Shuffle
{
	public void getShuffle(Character ch[])
	{
		List<Character> charList = Arrays.asList(ch);
		Collections.shuffle(charList);
		Character[] myShuffledArray = (Character[]) charList.toArray();
		for(int i=0;i<myShuffledArray.length;i++)
		{
			System.out.println(myShuffledArray[i]);
		}
	}
}

