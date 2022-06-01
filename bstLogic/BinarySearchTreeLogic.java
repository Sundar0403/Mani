package bstLogic;
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
public class BinarySearchTreeLogic
{
	int count=0;
	public void minimumElement(int arr[],int num,int k)
	{
		Node root=null;
		int sum=0;
		for(int i=0;i<num;i++)
		{
			root=insertBST(root,arr[i]);
		}
		List<Integer> newList=new ArrayList<Integer>();
		inOrderTraversal(root,newList);
		for(int i=0;i<k;i++)
		{
			sum=sum+newList.get(i);
		}
		System.out.println(sum);
	}
	
	public void inOrderTraversal(Node root,List<Integer> newList)
	{
		if(root==null)
		{
			return;
		}
		
		inOrderTraversal(root.left,newList);
		
		newList.add(root.key);
		
		inOrderTraversal(root.right,newList);
				
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
}
