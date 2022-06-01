package mm;
import java.util.*;

public class String17
{
    public void task17(String s2[],int m)
    {
        for(int j=0;j<m;j++)
        {
            if(j<m-1)
            {
            	s2[j]=String.join("",s2[j],"-");
            }
            if(j<m)
            {
            	s2[j]=s2[j]+"";
            }
            System.out.print(s2[j]);
        }
    }
    public static void main(String args[])
    {
        String17 s=new String17();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Strings");
        int n=sc.nextInt();
        String s1[]=new String[n];
        for(int i=0;i<n;i++)
        {
            s1[i]=sc.next();
        }
        s.task17(s1,n);
    }
}
