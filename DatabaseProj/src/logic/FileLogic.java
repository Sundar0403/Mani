package logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileLogic {
	File cust=new File("Mani");
	public void create()
	{
		try
		{
			if(cust.createNewFile())
			{	
				System.out.println("New File is created :"+cust.getName());
				try (FileWriter newWriter = new FileWriter(cust,true)) 
				{
					try(BufferedWriter buffered=new BufferedWriter(newWriter))
					{
						buffered.append("CustomerId"+" "+"Name"+" "+"Address\n"+" ");	
						//newWriter.append(2+" "+"Mani Sundar"+" "+"Pallathur");
					}	
				}
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
	
	
	public void writeFile(int id,String name,String address)
	{
		try (FileWriter newWriter = new FileWriter(cust,true)) 
		{
			try(BufferedWriter buffered=new BufferedWriter(newWriter))
			{
				buffered.append(id+" "+name+" "+address+"\n"+" ");
			}	
		}
		
		catch(Exception e)
		{
			System.out.println("Exception Occured :"+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void readFile()
	{
		try(FileReader newReader=new FileReader(cust))
		{
			try(BufferedReader br=new BufferedReader(newReader))
			{
				String content;
				int count=0;
				while((content=br.readLine())!=null)
				{
					String arr[]=content.split(" ");
					for(int i=0;i<arr.length;i++)
					{
						System.out.print(arr[i]+" ");
					}	
					//content=br.readLine();
					System.out.println();
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured :"+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		FileLogic logic=new FileLogic();
		try (Scanner scan = new Scanner(System.in)) 
		{
			//int choice=scan.nextInt();
			System.out.println("Enter Customer Id :");
			int id=scan.nextInt();
			scan.nextLine();
			System.out.println("Enter Customer Name :");
			String name=scan.nextLine();
			System.out.println("Enter Customer Address :");
			String address=scan.nextLine();
			
			scan.nextLine();
			logic.create();
			logic.writeFile(id,name,address);
			logic.readFile();
		}
		catch(Exception e)
		{
			System.out.println("Error Occured :"+e.getMessage());
			e.printStackTrace();
		}
	}
}
