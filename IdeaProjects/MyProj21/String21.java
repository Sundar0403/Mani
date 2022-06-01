package run;
import java.util.*;
import java.io.*;

public class String21
{
    public void stringCheck1(String string1) throws Exception
    {
    	if(string1==null||string1=="")
    	{
    		throw new Exception("Invalid");
    	}
    }
    public void stringCheck2(String string1,String string2) throws Exception
    {
    	if(string1==null||string1==""||string2==null||string2=="")
    	{
    		throw new Exception("Invalid");
    	}
    }
    public void stringCheck3(String string1[],int num) throws Exception
    {
    	for(int i=0;i<num;i++)
    	{
    		if(string1[i]==null||string1[i]=="")
    		{
    			throw new Exception("Invalid");
    		}
    	}	
    }	
    public void task2(String string1) throws Exception
    {	
    stringCheck1(string1);
        char ch[]=new char[string1.length()];
        for(int i=0;i<string1.length();i++)
        {
            ch[i]=string1.charAt(i);
            System.out.println(ch[i]);
        }
    }
    public void task3(String string1,int num) throws Exception
    {
    	stringCheck1(string1);
        char ch[]=new char[num];
        ch=string1.toCharArray();
        System.out.println("The Penultimate character is :"+ch[num-2]);
    }
    public void task4(String string1,char num) throws Exception
    {
    	stringCheck1(string1);
        char ch[]=string1.toCharArray();
        int count=0;
        for(int i=0;i<string1.length();i++)
        {
            if(num==ch[i])
            {
                count++;
            }
        }
        System.out.println("The Number of Occurences are :" + count);
    }
    public void task5(String string1,char num) throws Exception
    {
    	stringCheck1(string1);
        char ch[]=string1.toCharArray();
        int pos=0;
        for(int i=0;i<string1.length();i++)
        {
            if(num==ch[i])
            {
                pos=i;
            }
        }
        System.out.println("The Greatest Position of the Given Character is :" +pos);
    }
    public void task6(String string1) throws Exception
    {
    	stringCheck1(string1);
        String string2=string1.substring(string1.length()-5);
        System.out.println("The Required String is "+ string2);
    }
    public void task7(String string1) throws Exception
    {
    	stringCheck1(string1);
        String string2=string1.substring(0,3);
        System.out.println("The Required String is "+ string2);
    }
    public void task8(String string1,String string2) throws Exception
    {
    	stringCheck1(string1);
        if(string2.length()==3)
        {
            string2=string2+string1.substring(3);
            System.out.println("The Replaced String is : "+string2);
        }
        else
        {
            System.out.println("The Number of Characters are Less than or More Than 3");
        }
    }
    public void task9(String string1,String string2) throws Exception
    {
    	stringCheck1(string1);
        System.out.println("The Given String is Starts With : " +string1.startsWith(string2));
    }
    public void task10(String string1,String string2) throws Exception
    {
    	stringCheck1(string1);
        System.out.println("The Given String is Ends With : " +string1.endsWith(string2));
    }
    public void task11(String string1) throws Exception
    {
    	stringCheck1(string1);
        System.out.println("The Uppercase Converted String is :" + string1.toUpperCase());
    }
    public void task12(String string1) throws Exception
    {
    	stringCheck1(string1);
        System.out.println("The Lowercase Converted String is : "+string1.toLowerCase());
    }
    public void task13(String string1) throws Exception
    {
    	stringCheck1(string1);
        String string2="";
        for(int i=string1.length()-1;i>=0;i--)
        {
            string2=string2+string1.charAt(i);
        }
        System.out.println("The Reverse of the Name is : "+string2);
    }
    public void task14(String string1) throws Exception
    {
    	stringCheck1(string1);
        System.out.println(string1);
    }
    public void task15(String string2[],int num) throws Exception
    {
    	stringCheck3(string2,num);
        for(int j=0;j<num;j++)
        {
            string2[j]=string2[j].trim()+"";
            System.out.print(string2[j]);
        }
    }
    public void task16(String string1) throws Exception
    {
    	stringCheck1(string1);
        System.out.println(Arrays.toString(string1.split(" ")));
    }
    public void task17(String string2[],int num) throws Exception
    {
        stringCheck3(string2,num);
        for(int j=0;j<num;j++)
        {
            if(j<num-1)
            {
                string2[j]=String.join("",string2[j],"-");
            }
            if(j<num)
            {
                string2[j]=string2[j]+"";
            }
            System.out.print(string2[j]);
        }
    }
    public void task18(String string1,String string2) throws Exception
    {
        stringCheck2(string1,string2);
        if(string1.equals(string2))
        {
            System.out.println("The Given Two Strings are Equal");
        }
        else
        {
            System.out.println("The Given Two Strings are Not Equal");
        }
    }
    public void task19(String string1,String string2) throws Exception
    {
    	stringCheck2(string1,string2);
        if(string1.equalsIgnoreCase(string2))
        {
            System.out.println("The Given Two Strings are Equal");
        }
        else
        {
            System.out.println("The Given Two Strings are Not Equal");
        }
    }
    public void task20(String string1) throws Exception
    {
        stringCheck1(string1);
        System.out.println(""+string1.trim());
    }
    public static void main(String args[]) throws IOException
    {
        String21 obj=new String21();
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
                    	obj.task2(string1);
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
                    	obj.task3(string2,num);
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
                    	obj.task4(string3,ch1);
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
                    	obj.task5(string4,ch2);
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
                    	obj.task6(string5);
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
                    	obj.task7(str6);
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
                    	obj.task8(str7,str8);
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
                    	obj.task9(str9,str10);
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
                    	obj.task10(str11,str12);
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
                    	obj.task11(str13);
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
                    	obj.task12(string7);
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
                    	obj.task13(string8);
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
                    	obj.task14(string9);
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
                	obj.task15(string10,num2);
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
                    	obj.task16(string11);
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
                	obj.task17(string12,num3);
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
                    	obj.task18(str15,str16);
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
                    	obj.task19(str17,str18);
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
                    	obj.task20(str19);
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
