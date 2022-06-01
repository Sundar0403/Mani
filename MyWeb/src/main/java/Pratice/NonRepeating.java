package Pratice;


	import java.io.*;
	import java.util.*;


	class GFG {
		public static void main (String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int testcases = Integer.parseInt(br.readLine());
			
			while(testcases-- > 0){
			    
			    int n = Integer.parseInt(br.readLine());
			    int arr[] = new int[n];
			    
			    
			    String line = br.readLine();
			    String[] elements = line.trim().split(" ");
			    
			    for(int index = 0;index < n; index++){
			        arr[index] = Integer.parseInt(elements[index]);
			    }
			    
			    Check obj = new Check();
			    
			    System.out.println(obj.firstNonRepeating(arr,n));
			        
			}
			
		}
	}

	// } Driver Code Ends


	//User function Template for Java

	class Check{
	    
	    public int firstNonRepeating(int arr[], int n) 
	    { 
	        // Complete the function
	        int count=0;
	        int newValue=0;
	        int firstIndex=0;
	        int lastIndex=0;
	        int temp=0;
	        String t="";
	        List<Integer> newList=new ArrayList();
	        if(arr.length==1)
	        {
	            return arr[0];
	        }
	        for(int k=0;k<n;k++)
	        {
	            newList.add(arr[k]);
	        }
	        for(int i=0;i<n-1;i++)
	        {
	             if(newList.contains(arr[i]))
	                {
	                    firstIndex=newList.indexOf(arr[i]);
	                    lastIndex=newList.lastIndexOf(arr[i]);
	                    
	                }
	            if(firstIndex==lastIndex)
	            {
	                newValue=arr[i];
	                break;
	            }
	            
	        }
	        
	        return newValue;
	    }  
	    
	}

