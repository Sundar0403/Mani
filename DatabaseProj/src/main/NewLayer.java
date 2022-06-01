package main;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class NewLayer {

	File cust=new File("Mani");
	public void create()
	{
		try
		{
			if(cust.createNewFile())
			{	
				System.out.println("New File is created :"+cust.getName());
			}
			else
			{
				System.out.println("The File is Already Exists :");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured :"+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void writeFile()
	{
		try (FileWriter newWriter = new FileWriter(cust)) 
		{
			newWriter.append("Hai I am Fine How are You??");
			System.out.println("The File is Writed :");
		}
		
		catch(Exception e)
		{
			System.out.println("Exception Occured :"+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void main(String args)
	{
		NewLayer logic=new NewLayer();
		try (Scanner scan = new Scanner(System.in)) 
		{
			//int choice=scan.nextInt();
			scan.nextLine();
			logic.create();
			logic.writeFile();
		}
		catch(Exception e)
		{
			System.out.println("Error Occured :"+e.getMessage());
			e.printStackTrace();
		}
	}
	
}
