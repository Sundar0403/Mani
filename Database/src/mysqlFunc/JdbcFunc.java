package mysqlFunc;
//import java.util.*;
import java.sql.*;

public class JdbcFunc
{
	
	String url="jdbc:mysql://localhost:3306/student";
	String username="root";
	String password="Root@123";
	
	public void createTable()
	{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String myQuery="create table studentTable(StudentName varchar(20),StudentId int(10),StudentCity varchar(20));";
			try(Connection con=DriverManager.getConnection(url,username,password);
					Statement st=con.createStatement();)
			{
				st.execute(myQuery);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("Exception Has been Occured :");
			}
	}
	public void insertTable(int values,String newArray[])
	{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			for(int i=0;i<values;i++)
			{
				System.out.println("Enter the SQL Query to Execute");
				String myQuery=newArray[i];
				try(Connection con=DriverManager.getConnection(url,username,password);
						Statement st=con.createStatement();)
				{
					st.execute(myQuery);
				}
				catch(Exception e)
				{
					e.printStackTrace();
					System.out.println("Exception Has been Occured :");
				}
			}	
	}
	public void updateTable()
	{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String myQuery="update studentTable SET StudentName='siva' where StudentId=202;";
			try(Connection con=DriverManager.getConnection(url,username,password);
					Statement st=con.createStatement();)
			{
				st.executeUpdate(myQuery);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("Exception Has been Occured :");
			}
	}
	public void selectTable()
	{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String myValue="select * from studentTable";
			try(Connection con=DriverManager.getConnection(url,username,password);
					Statement st=con.createStatement();)
			{
				ResultSet rs=st.executeQuery(myValue);
				while(rs.next())
				{
					System.out.println("StudentName :"+rs.getString("StudentName"));
					System.out.println("StudentID :"+rs.getInt("StudentId"));
					System.out.println("StudentCity :"+rs.getString("StudentCity"));
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("Exception Has been Occured :");
			}
	}
	public void DeleteTable(int Id)
	{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String myValue="Delete from studentTable where StudentId="+Id+";";
			try(Connection con=DriverManager.getConnection(url,username,password);
					Statement st=con.createStatement();)
			{
				st.execute(myValue);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("Exception Has been Occured :");
			}
	}
}