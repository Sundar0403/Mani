package build;
import java.lang.*;
import java.util.*;

public class StringBuildMain
{
    public static void main(String args[])
    {
        StringBuildFunc obj=new StringBuildFunc();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        obj.fun(str);
    }
}
