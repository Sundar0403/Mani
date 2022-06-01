package test;
import run.*;
import java.util.*;
import java.io.*;

public class StringMain
{
    public static void main(String args[]) throws IOException
    {
        StringFunc obj=new StringFunc();
        InputStreamReader is=new InputStreamReader(System.in);
        BufferedReader b=new BufferedReader(is);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Choice");
        int choice=0;
        try
        {
            choice=Integer.parseInt(b.readLine());
        }
        catch(Exception e)
        {
            System.out.println("Invalid Choice");
        }
        switch (choice)
        {
            case 1:

                for(String str : args)
                    System.out.println("The Length of the Given String is: "+str.length());
                break;

            case 2:

                System.out.println("Enter the Given String");
                String string1=b.readLine();
                if(string1.equals("null")||string1.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    try
                    {
                        obj.strToCharArray(string1);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Exception Occured : "+e.getMessage());
                    }
                }
                break;

            case 3:

                System.out.println("Enter the String");
                String string2=b.readLine();
                if(string2.equals("null")||string2.equals(""))
                {
                    System.out.println("Invalid Characterization");
                }
                else
                {
                    try
                    {
                        int num=string2.length();
                        obj.penultimateChar(string2,num);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Exception Occured : "+e.getMessage());
                    }
                }
                break;

            case 4:

                System.out.println("Enter the New String");
                String string3=b.readLine();
                if(string3.equals("null")||string3.equals(""))
                {
                    System.out.println("Invalid Characterization");
                }
                else
                {
                    try
                    {
                        System.out.println("Enter the Character");
                        char ch1=sc.next().charAt(0);
                        obj.charOccurence(string3,ch1);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Exception Occured : "+e.getMessage());
                    }
                }
                break;

            case 5:

                System.out.println("Enter the New String");
                String string4=b.readLine();
                if(string4.equals("null")||string4.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    try
                    {
                        System.out.println("Enter the Character");
                        char ch2=sc.next().charAt(0);
                        obj.charGreatestPos(string4,ch2);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Exception Occured : "+e.getMessage());
                    }
                }
                break;

            case 6:

                System.out.println("Enter the New String");
                String string5=b.readLine();
                if(string5.equals("null")||string5.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    try
                    {
                        obj.stringSubStr1(string5);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Exception Occured : "+e.getMessage());
                    }
                }
                break;

            case 7:

                System.out.println("Enter the New String");
                String str6=b.readLine();
                if(str6.equals("null")||str6.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    try
                    {
                        obj.stringSubStr2(str6);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Exception Occured : "+e.getMessage());
                    }
                }
                break;

            case 8:

                System.out.println("Enter the Strings");
                String str7=b.readLine();
                String str8=b.readLine();
                if(str7.equals("null")||str7.equals("")||str8.equals("null")||str8.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    try
                    {
                        obj.stringReplace(str7,str8);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Exception Occured : "+e.getMessage());
                    }
                }
                break;

            case 9:

                System.out.println("Enter the Strings");
                String str9=b.readLine();
                String str10=b.readLine();
                if(str9.equals("null")||str9.equals("")||str10.equals("null")||str10.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    try
                    {
                        obj.startString(str9,str10);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Exception Occured : "+e.getMessage());
                    }
                }
                break;

            case 10:

                System.out.println("Enter the Strings");
                String str11=b.readLine();
                String str12=b.readLine();
                if(str11.equals("null")||str11.equals("")||str12.equals("null")||str12.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    try
                    {
                        obj.endString(str11,str12);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Exception Occured :"+e.getMessage());
                    }
                }
                break;

            case 11:

                System.out.println("Enter the Lowercase String");
                String str13 = b.readLine();
                if(str13.equals("null")||str13.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    try
                    {
                        obj.stringUpperCase(str13);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Exception Occured : "+e.getMessage());
                    }
                }
                break;

            case 12:

                System.out.println("Enter the Uppercase String");
                String string7 = b.readLine();
                if(string7.equals("null")||string7.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    try
                    {
                        obj.stringLowerCase(string7);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Exception Occured : "+e.getMessage());
                    }
                }
                break;

            case 13:

                System.out.println("Enter the Name");
                String string8=b.readLine();
                if(string8.equals("null")||string8.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    try
                    {
                        obj.stringReverse(string8);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Exception Occured : "+e.getMessage());
                    }
                }
                break;

            case 14:

                System.out.println("Enter the Strings :");
                String string9=b.readLine();
                if(string9.equals("null")||string9.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    try
                    {
                        obj.multiString(string9);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Exception Occured : "+e.getMessage());
                    }
                }
                break;

            case 15:

                System.out.println("Enter the Number of strings");
                int num2=0;
                try
                {
                    num2=Integer.parseInt(b.readLine());
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Type Format");
                }
                String string10[]=new String[num2];
                for(int j=0;j<num2;j++)
                {
                    string10[j]=b.readLine();
                }

                try
                {
                    obj.stringConcat(string10,num2);
                }
                catch(Exception e)
                {
                    System.out.println("Exception Occured : "+e.getMessage());
                }
                break;

            case 16:

                System.out.println("Enter the String");
                String string11=b.readLine();
                if(string11.equals("null")||string11.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    try
                    {
                        obj.stringArr(string11);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Exception Occured : "+e.getMessage());
                    }
                }
                break;

            case 17:

                System.out.println("Enter the Number of Strings");
                int num3=0;
                try
                {
                    num3=Integer.parseInt(b.readLine());
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Type Format");
                }
                String string12[]=new String[num3];
                for(int k=0;k<num3;k++)
                {
                    string12[k]=b.readLine();
                }
                try
                {
                    obj.stringMerge(string12,num3);
                }
                catch(Exception e)
                {
                    System.out.println("Exception Occured :"+e.getMessage());
                }
                break;

            case 18:

                System.out.println("Enter the Strings");
                String str15=b.readLine();
                String str16=b.readLine();
                if(str15.equals("null")||str15.equals("")||str16.equals("null")||str16.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    try
                    {
                        obj.equalsSensitive(str15,str16);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Exception Occured :"+e.getMessage());
                    }
                }
                break;

            case 19:

                System.out.println("Enter the Strings");
                String str17=b.readLine();
                String str18=b.readLine();
                if(str17.equals("null")||str17.equals("")||str18.equals("null")||str18.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    try
                    {
                        obj.equalsInSensitive(str17,str18);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Exception Occured"+e.getMessage());
                    }
                }
                break;

            case 20:

                System.out.println("Enter the New String");
                String str19=b.readLine();
                if(str19.equals("null")||str19.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    try
                    {
                        obj.stringNoSpace(str19);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Exception Occured :"+e.getMessage());
                    }
                }
                break;

        }
    }
}
}