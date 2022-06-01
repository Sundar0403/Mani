package vi;
import java.util.*;

public class String9
{
   public void task9(String s1,String s2)
   {
   	System.out.println("The Given String is Starts With : " +s1.startsWith(s2));
   }
   public static void main(String args[])
   {
   	String9 s=new String9();
   	Scanner sc=new Scanner(System.in);
   	String s11=sc.nextLine();
   	String s12=sc.nextLine();
   	s.task9(s11,s12);
   }
}
