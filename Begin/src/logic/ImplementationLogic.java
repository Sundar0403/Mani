package logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Node
{
	Node left;
	Node right;
	int key;
	public Node(int data)
	{
		 key =data;
		left=null;
		right=null;
	}
}
public class ImplementationLogic {

	List<Integer> newList=new ArrayList<>();
	public int getDifferent(int[] first, int[] second) throws Exception
	{
		int left=0;
		int right=first.length-1;
		
		int index=first.length;
		int mid=0;
		
		while(left<=right)
		{
			if(mid==second.length-1 && index==first.length)
			{
				return first.length-1;
			}
			
			mid=(left+right)/2;
			
			if(first[mid]==second[mid])
			{
				left=mid+1;
			}
			
			else
			{
				index=mid;
				right=mid-1;
			}
		}
		return index;
	}
	
	public boolean isContains(ArrayList<Integer> newList,int num) throws Exception
	{
		for(int i=0;i<newList.size();i++)
		{
			if(newList.get(i)==num)
			{
				return true;
			}
		}
		return false;
	}

	public String getShuffledString(int[] arr, String input) throws Exception
	{
		char ch[]=input.toCharArray();

		char res[]=new char[ch.length];
		for(int i=0;i<arr.length;i++)
		{
			res[arr[i]]=ch[i];
		}
		
		return Arrays.toString(res);
	}

	public int getAbsoluteValue(int num) throws Exception
	{
		if(num>=0)
		{
			return num;
		}
		num*=-1;
		return num;
	}
	
	public int[] getAbsolute(int[] arr, int value) throws Exception
	{
		int newArr[]=new int[arr.length];
		int count=0;
		Map<Integer,Integer> newMap=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			newMap.put(arr[i],getAbsoluteValue(arr[i]-value));
		}
		for(Map.Entry<Integer,Integer> newOne : newMap.entrySet())
		{
			newArr[count]=newOne.getKey();
			count++;
		}
		return newArr;
	}

	public int getMin(int[] arr) throws Exception
	{
		if(arr.length==0)
		{
			return -1;
		}
		Node root = null;
		for(int i=0;i<arr.length;i++)
		{
			root=insertBST(arr[i],root);
		}
		
		inOrderBST(root);
		
		return newList.get(0);
	}

	private void inOrderBST(Node root) {
		if(root==null)
		{
			return;
			
		}
		inOrderBST(root.left);
		
		newList.add(root.key);
		
		
		//inOrderBST(root.right);
		
	}

	private Node insertBST(int i,Node root) {

		if(root==null)
		{
			return new Node(i);
		}
		
		if(i<root.key)
		{
			root.left=insertBST(i,root.left);
		}
		
		else if(i>root.key)
		{
			root.right=insertBST(i,root.right);
		}
		return root;
	}

	public int getNoOfOpen(int num) 
	{
		int value=(int)Math.sqrt(num);
		return value;	
	}

	public int[][] setZeros(int[][] arr) 
	{
		int row=arr.length;
		int col=arr[0].length;
		
		int result[][]=new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row;j++)
			{
				result[i][j]=1;
			}
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(arr[i][j]==0)
				{
					for(int k=0;k<row;k++)
					{
						result[k][j]=0;
					}
					for(int k=0;k<col;k++)
					{
						result[j][k]=0;
					}
				}
			}
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=result[i][j];
			}
		}
		
		return result;
	}

	public int[][] diagonalSort(int[][] arr) throws Exception
	{
		int row=arr.length;
		int col=arr[0].length;
		
		int newArr[]=new int[row];
		int count=0;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==j)
				{
					newArr[count++]=arr[i][j];
				}
			}
		}
		Arrays.sort(newArr);
		
		count=0;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==j)
				{
					arr[i][j]=newArr[count++];
				}
			}
		}
		
		return arr;
	}

	public int getUglyNumber(int num) 
	{
		int i=1;
		int value=1;
		
		if(num==1)
		{
			return num;
		}
		
		while(i<=num)
		{
			if(value%2==0 || value%3==0 || value%5==0)
			{
				i++;
			}
			value++;
		}
		return value;
	}

}
