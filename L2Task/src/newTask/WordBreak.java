package newTask;
import java.util.*;

public class WordBreak 
{
	 private static int wordBreak(String A, ArrayList<String> B )
	   {
	       if (rec(A, B))
	           return 1;
	       else
	           return 0;
	   }
	   
	 private  static String substring(String s,int n,int n2)
	   {
	       String temp="";
	       for(int i=n;i<n2;i++)
	       {
	           temp=temp+s.charAt(i);
	       }
	       return temp;
	   }
	  private  static boolean isContains(String s,ArrayList<String> B)
	   {
	       for(int i=0;i<B.size();i++)
	       {
	           if(B.get(i).equals(s))
	           {
	               return true;
	           }
	       }
	       return false;
	   }
	  private static boolean getLength(String s,ArrayList<String> B)
	  {
		  for(int i=0;i<B.size();i++)
	       {
	          String temp= B.get(i);
			  if(temp.length()==s.length()&&temp.equals(s))
	           {
	               return true;
	           }
	       }
		  return false;
	  }
	   private static boolean rec(String A, ArrayList<String> B) {
	      /* if (B.size() == A.length())
	           return false;*/
	       
		   if(getLength(A,B)==true)
			 {
			      return true;
			 }
		   
	       String first="";
	       String second="";
	       int count=0;
	       int innerCount=0;
	       
	       for(int i=0;i<A.length();i++)
	       {
	           first=substring(A,0,i+1);
	           second=substring(A,i+1,A.length());
	           System.out.println(first);
	           System.out.println(second);
	           if(isContains(first,B)==true && isContains(second,B)==true)
	           {
	               return true;
	           }
	           else if(isContains(first,B)==true || isContains(second,B)==true)
	           {
	        	   count++;
	           }
	           /*else if(isContains(first,B)==true)
	           {
	        	   count++;
	           }*/
	           
	           if(count>=2)
	           {
	        	   return true;
	           }
	       }
	       return false;
	   }
	   
	   public static void main(String args[])
	   {
		  // WordBreak wordObj=new WordBreak();
		   try(Scanner scan=new Scanner(System.in);)
		   {
			   
			   System.out.println("Enter the String :");
			   String s=scan.nextLine();
			   System.out.println("Enter the Number of Elements in the ArrayList");
			   int num=scan.nextInt();
			   scan.nextLine();
			   System.out.println("Enter the ArrayList");
			   ArrayList<String> newList=new ArrayList<>();
			   for(int i=0;i<num;i++)
			   {
				   newList.add(scan.nextLine());
			   }
			   int res=wordBreak(s,newList);
			   System.out.println(res);
		   }
		   catch(Exception e)
		   {
			   System.out.println("Error Occured : "+e.getMessage());
			   e.printStackTrace();
		   }
	   }
}





