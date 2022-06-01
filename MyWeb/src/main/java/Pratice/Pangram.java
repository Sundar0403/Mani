package Pratice;
import java.io.*;
import java.util.*; 

public class Pangram {
	

	    public static void main(String args[]) throws IOException { 
	        Scanner sc = new Scanner(System.in);
	        int t = Integer.parseInt(sc.nextLine().trim());
	        while(t-- > 0){
	            String str = sc.nextLine();
	            int k = Integer.parseInt(sc.nextLine().trim());
	            Solution obj = new Solution();
	            if(obj.kPangram(str, k))
	                System.out.println(1);
	            else
	                System.out.println(0);
	        }
	    }
	}// } Driver Code Ends


	//User function Template for Java
	class Solution 
	{ 
	    boolean kPangram(String str, int k) 
	    {
	        // code here
	        String ch[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	        int temp=k;
	        String tem;
	        int count=0;
	        int lastIndex=0;
	        int firstIndex=0;
	        for(int i=0;i<ch.length;i++)
	        {
	            firstIndex=str.indexOf(ch[i]);
	            lastIndex=str.lastIndexOf(ch[i]);
	            tem=ch[i];
	            if(lastIndex>=firstIndex)
	            {
	                count++;
	            }
	            if(!str.contains(tem)&&count!=0)
	            {
	                temp--;
	            }
	        }
	        
	        if(temp==k)
	        {
	            return true;
	        }
	        else
	        {
	            return false;
	        } 
	    }
	}

