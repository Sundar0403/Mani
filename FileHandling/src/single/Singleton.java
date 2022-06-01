package single;

/*public class Singleton 
{
	private static Singleton Singletons = null;
	
	private Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{
		if(Singletons==null)
		{
			synchronized(Singleton.class)
			{
				if(Singletons==null)
				{	
					Singletons=new Singleton();
				}	
			}
		}

		return Singletons;
	}
	
	public void getMessages()
	{
		System.out.println("We are in Singleton Class :");
	}
}*/


public enum Singleton
{
	INSTANCE;
	
	public void display()
	{
		System.out.println("Enum is Used as Singleton Here :");
	}
}