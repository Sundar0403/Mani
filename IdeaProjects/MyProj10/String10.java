package mv;
import java.util.*;

public class String10
{
   public void task10(String s1,String s2)
   {
   	System.out.println("The Given String is Starts With : " +s1.endsWith(s2));
   }
   public static void main(String args[])
   {
   	String10 s=new String10();
   	Scanner sc=new Scanner(System.in);
   	String s11=sc.nextLine();
   	String s12=sc.nextLine();
   	s.task10(s11,s12);
   }
}
