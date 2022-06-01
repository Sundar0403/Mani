package logic;
import java.util.*;

class StringBuildFunc
{
    public void fun(String str)
    {
        StringBuilder str1=new StringBuilder("");
        System.out.println("Length of Str1:"+str1.length());
        str1.append(str);
        System.out.println("The Length of Str2:"+str1+" is "+str1.length());
    }
}