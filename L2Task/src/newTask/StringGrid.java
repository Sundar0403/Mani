package newTask;

import java.util.ArrayList;
import java.util.Scanner;

public class StringGrid 
{
	private int[][] grid(char[][] ch, String input) 
	{
	    int length=input.length();
		
			int rowLength=ch.length;
			ArrayList<ArrayList<Integer>> result=new ArrayList<>();
			for(int i=0;i<rowLength;i++)
			{
				int columnLength=ch[i].length;
				for(int j=0;j<columnLength;j++)
				{
					if(ch[i][j]==input.charAt(0))
					{
						for(int direc=1;direc<=8;direc++)
						{
							int count=0;
							String temp="";
							int row=i;
							int col=j;
							ArrayList<Integer> newList=new ArrayList<>();
							if(direc==1)									//right
							{
								while(count<length)
								{
									if(col==columnLength)
									{
										break;
									}
									temp=temp+ch[row][col];
									col++;
									count++;
								}
							}
							if(direc==2)									//left
							{
								while(count<length)
								{
									if(col<0)
									{
										break;
									}
									temp=temp+ch[row][col];
									col--;
									count++;
								}
							}
							if(direc==3)									//top
							{
								while(count<length)
								{
									if(row<0)
									{
										break;
									}
									temp=temp+ch[row][col];
									row--;
									count++;
								}
							}
							if(direc==4)									//down
							{
								while(count<length)
								{
									if(row==rowLength)
									{
										break;
									}
									temp=temp+ch[row][col];
									row++;
									count++;
								}
							}
							if(direc==5)									//top-right
							{
								while(count<length)
								{
									if(col==columnLength || row<0)
									{
										break;
									}
									temp=temp+ch[row][col];
									row--;
									col++;
									count++;
								}
							}
							if(direc==6)									//top-left
							{
								while(count<length)
								{
									if(col<0 || row<0)
									{
										break;
									}
									temp=temp+ch[row][col];
									row--;
									col--;
									count++;
								}
							}
							if(direc==7)									//down-right
							{
								while(count<length)
								{
									if(col==columnLength || row==rowLength)
									{
										break;
									}
									temp=temp+ch[row][col];
									row++;
									col++;
									count++;
								}
							}
							if(direc==8)									//down-left
							{
								while(count<length)
								{
									if(row>=rowLength || col<0)
									{
										break;
									}
									temp=temp+ch[row][col];
									row++;
									col--;
									count++;
								}
							}
							if(temp.equals(input))
							{
								newList.add(i);
								newList.add(j);
								if(!result.contains(newList))
								{
									result.add(newList);
								}
							}
						}
					}
				}
				
			}
			int row=result.size();
			int resArr[][]=new int[row][2];
			for(int k=0;k<row;k++)
			{
				for(int j=0;j<2;j++)
				{
					resArr[k][j]=result.get(k).get(j);
				}
			}
			return resArr;
	}
	public static void main(String args[])
	{
		StringGrid gridObj=new StringGrid();
		try (Scanner scan = new Scanner(System.in)) 
		{
			System.out.println("Enter the String :");
			String input=scan.nextLine();
			System.out.println("Enter the Size of the Row of Character Array :");
			int row=scan.nextInt();
			scan.nextLine();
			System.out.println("Enter the Size of the Column of Character Array :");
			int col=scan.nextInt();
			scan.nextLine();
			System.out.println("Enter the Character Matrix :");
			char ch[][]=new char[row][col];
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					ch[i][j]=scan.next().charAt(0);
				}
			}
			int result[][]=gridObj.grid(ch,input);
			for(int i=0;i<result.length;i++)
			{
				System.out.print("( ");
				for(int j=0;j<result[0].length;j++)
				{
					System.out.print(result[i][j]+" ");
				}
				System.out.print(" )");
			}
		}
		catch(Exception e)
		{
			System.out.println("Error Occured :"+e.getMessage());
		}
	}

	
}
