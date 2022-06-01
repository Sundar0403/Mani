package preparationLogic;
import java.util.*;
class Node
{
	int key;
	Node left,right;
	public Node(int value)
	{
		key=value;
		left=right=null;
	}
}
public class PreparationLogic
{
	int count=0;
	public int palindromeNumber(int num,int value)
	{
		if(num==0)
		{
			return count;
		}
		if(isPalindrome(value))
		{
			count++;
		}
		
		if(count==num)
		{
			return value;
		}
		return palindromeNumber(num,++value);
	}
	public boolean isPalindrome(int value)
	{
		String newString=String.valueOf(value);
		StringBuilder newBuilder=new StringBuilder();
		newBuilder.append(value);
		String reverse=newBuilder.reverse().toString();
		if(newString.equals(reverse))
		{
			return true;
		}
		return false;
	}
	public void trim(int inputArray[],int low,int high)
	{
		Node root=null;
		
		for(int i=0;i<inputArray.length;i++)
		{
			root=insertBST(root,inputArray[i]);
		}
		root=trimBST(root,low,high);
		
		preOrder(root);
	}
	public Node trimBST(Node root,int low,int high)
	{
		if(root==null)
		{
			return null;
		}
		
		if(root.key<low)
		{
			return trimBST(root.right,low,high);
		}
		if(root.key>high)
		{
			return trimBST(root.left,low,high);
		}
		
		if(root.left!=null)
		{
			root.left=trimBST(root.left,low,high);
		}
		
		if(root.right!=null)
		{
			root.right=trimBST(root.right,low,high);
		}
		
		return root;
	}
	
	public Node insertBST(Node root,int value)
	{
		if(root==null)
		{
			return new Node(value);
		}
		
		if(value<root.key)
		{
			root.left=insertBST(root.left,value);
		}
		
		if(value>root.key)
		{
			root.right=insertBST(root.right,value);
		}
		
		return root;
	}
	public void preOrder(Node root)
	{
		if(root==null)
			return;
		
		System.out.println(root.key);
			
		preOrder(root.left);
		
		preOrder(root.right);	
	}
	public void sumSubArray(int inputArray[],int value)
	{
		int sum=0;
		int count=1;
		int firstIndex=0;
		int secondIndex=0;
		List<Integer> inputList=new ArrayList<>();
		
		for(int i=0;i<inputArray.length;i++)
		{
			for(int j=i;j<inputArray.length;j++)
			{
				sum=sum+inputArray[j];
				inputList.add(j);
				if(sum==value)
				{
					if(count==1)
					{
						firstIndex=i+1;
						secondIndex=j+1;
						count++;
					}	
				}
			}
			sum=0;
		}
		System.out.println(firstIndex+" "+secondIndex);
	}
	public int[] mergeSort(int inputArray[],int num)
	{
		if(inputArray.length==1)
		{
			return inputArray;
		}
		
		int middle=num/2;
		int count=0;
		int leftArray[]=mergeSort(Arrays.copyOfRange(0,middle,inputArray));
		int rightArray[]=mergeSort(Arrays.copyOfRange(middle+1,inputArray.length,inputArray));
		return merge(leftArray,rightArray);
	}
	public int[] merge(int leftArr[],int rightArr[])
	{
		int result[]=new int[leftArr.length+rightArr.length];
		
		int i=0,j=0,k=0;
		while(i<leftArr.length && j<rightArr.length)
		{
			if(leftArr[i]<rightArr[j])
			{
				result[k++]=leftArr[i++];
			}
			else
			{
				result[k++]=rightArr[j++];
			}
		}
		while(i<leftArr.length)
		{
			result[k++]=leftArr[i++];
		}
		while(j<rightArr.length)
		{
			result[k++]=rightArr[i++];
		}
		return result;
	}
	
	
}







