package mysql;
import mysqlFunc.*;
//import java.sql.*;
import java.util.*;

public class JdbcMain
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		JdbcFunc jdbcObj=new JdbcFunc();
		int choice=0;
		System.out.println("Enter Your Choice :");
		try
		{
			choice=scan.nextInt();
			scan.nextLine();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception Occured :");
		}
		switch(choice)
		{
		case 1:
			try
			{
				jdbcObj.createTable();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("Exception Occured :");
			}
			break;
			
		case 2:
			try
			{
				int values=0;
				System.out.println("Enter the Number of Values :");
				values=scan.nextInt();
				scan.nextLine();
				String newArray[]=new String[values];
				for(int i=0;i<values;i++)
				{
					newArray[i]=scan.nextLine();
				}
				jdbcObj.insertTable(values,newArray);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("Exception Occured :");
			}
			break;
			
		case 3:
			try
			{
				jdbcObj.updateTable();
				System.out.println("Updation is Successful :");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("Exception Occured :");
			}
			break;
			
		case 4:
			try
			{
				jdbcObj.selectTable();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("Exception Occured :");
			}
			break;
			
		case 5:
			try
			{
				int studentId=0;
				System.out.println("Enter the Student ID to Delete :");
				studentId=scan.nextInt();
				scan.nextLine();
				jdbcObj.DeleteTable(studentId);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("Exception Occured :");
			}
			break;		
		}
		scan.close();
	}
}
