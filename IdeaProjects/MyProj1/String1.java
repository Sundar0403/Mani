package ds;
import java.io.*;


public class String1
{
    public static void main(String args[]) throws IOException
    {
        System.out.println("Enter the String");
        for(String str : args)
        System.out.println("The Length of the Given String is: "+str.length());
    }
}
