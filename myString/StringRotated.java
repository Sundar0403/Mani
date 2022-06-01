package myString;
import java.util.*;

public class StringRotated
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Rotated rotateObj=new Rotated();
		String inputString=scan.nextLine();
		String rotatedString=scan.nextLine();
		boolean newBoolean=rotateObj.findRotated(inputString,rotatedString);
		System.out.println(newBoolean);
	}
}
class Rotated
{
	public boolean findRotated(String inputString,String rotatedString)
	{
		if(inputString==null||rotatedString==null)
		{
			return false;
		}
		if(inputString.length()!=rotatedString.length())
		{
			return false;
		}
		if(inputString.length()==rotatedString.length())
		{
			inputString=inputString+inputString;
		}
		if(inputString.contains(rotatedString))
		{
			return true;
		}
		return false;
	}
}			
