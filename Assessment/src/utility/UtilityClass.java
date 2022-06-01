package utility;

public class UtilityClass {
	
	public void stringCheck(String input) throws Exception
	{
		if(input==null || input.isEmpty())
		{
			throw new Exception("String cant be empty");
		}
	}
	
	public void objectCheck(Object obj) throws Exception
	{
		if(obj==null)
		{
			throw new Exception("Object cant be empty");
		}
	}
	
}
