package run;
import java.util.*;
import java.io.*;

public class String21
{
    public void task2(String s1)
    {	
        char ch[]=new char[s1.length()];
        for(int i=0;i<s1.length();i++)
        {
            ch[i]=s1.charAt(i);
            System.out.println(ch[i]);
        }
    }
    public void task3(String s1,int m)
    {
        char ch[]=new char[m];
        ch=s1.toCharArray();
        System.out.println("The Penultimate character is :"+ch[m-2]);
    }
    public void task4(String s1,char d)
    {
        char ch[]=s1.toCharArray();
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            if(d==ch[i])
            {
                count++;
            }
        }
        System.out.println("The Number of Occurences are :" + count);
    }
    public void task5(String s1,char d)
    {
        char ch[]=s1.toCharArray();
        int pos=0;
        for(int i=0;i<s1.length();i++)
        {
            if(d==ch[i])
            {
                pos=i;
            }
        }
        System.out.println("The Greatest Position of the Given Character is :" +pos);
    }
    public void task6(String s1)
    {
        String pm=s1.substring(s1.length()-5);
        System.out.println("The Required String is "+ pm);
    }
    public void task7(String s1)
    {
        String pm=s1.substring(0,3);
        System.out.println("The Required String is "+ pm);
    }
    public void task8(String s1,String s2)
    {
        if(s2.length()==3)
        {
            s2=s2+s1.substring(3);
            System.out.println("The Replaced String is : "+s2);
        }
        else
        {
            System.out.println("The Number of Characters are Less than or More Than 3");
        }
    }
    public void task9(String s1,String s2)
    {
        System.out.println("The Given String is Starts With : " +s1.startsWith(s2));
    }
    public void task10(String s1,String s2)
    {
        System.out.println("The Given String is Ends With : " +s1.endsWith(s2));
    }
    public void task11(String s1)
    {
        System.out.println("The Uppercase Converted String is :" + s1.toUpperCase());
    }
    public void task12(String s1)
    {
        System.out.println("The Lowercase Converted String is : "+s1.toLowerCase());
    }
    public void task13(String s1)
    {
        String ss2="";
        for(int i=s1.length()-1;i>=0;i--)
        {
            ss2=ss2+s1.charAt(i);
        }
        System.out.println("The Reverse String is : "+ss2);
    }
    public void task14(String s1)
    {
        System.out.println(s1);
    }
    public void task15(String s2[],int m)
    {
        for(int j=0;j<m;j++)
        {
            s2[j]=s2[j].trim()+"";
            System.out.print(s2[j]);
        }
    }
    public void task16(String s1)
    {
        System.out.println(Arrays.toString(s1.split(" ")));
    }
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
    public void task18(String s11,String s12)
    {
        if(s11.equals(s12))
        {
            System.out.println("The Given Two Strings are Equal");
        }
        else
        {
            System.out.println("The Given Two Strings are Not Equal");
        }
    }
    public void task19(String p,String d)
    {
        if(p.equalsIgnoreCase(d))
        {
            System.out.println("The Given Two Strings are Equal");
        }
        else
        {
            System.out.println("The Given Two Strings are Not Equal");
        }
    }
    public void task20(String s2)
    {
        System.out.println(""+s2.trim());
    }
    public static void main(String args[]) throws IOException
    {
        String21 s=new String21();
        InputStreamReader is=new InputStreamReader(System.in);
        BufferedReader b=new BufferedReader(is);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Choice");
        int c=0;
        try
        {
            c=sc.nextInt();
            sc.nextLine();
        }
        catch(Exception e)
        {
            System.out.println("Invalid Choice");
        }
        switch (c)
        {
            case 1:
            {
                for(String str : args)
                    System.out.println("The Length of the Given String is: "+str.length());
                break;
            }
            case 2:
            {
                System.out.println("Enter the Given String");
                String s11=sc.nextLine();
                if(s11.equals("null")||s11.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    s.task2(s11);
                }
                break;
            }
            case 3:
            {
                System.out.println("Enter the String");
                String st=sc.nextLine();
                if(st.equals("null")||st.equals(""))
                {
                    System.out.println("Invalid Characterization");
                }
                else
                {
                    int n=st.length();
                    s.task3(st,n);
                }
                break;
            }
            case 4:
            {
                System.out.println("Enter the New String");
                String pd=sc.nextLine();
                if(pd.equals("null")||pd.equals(""))
                {
                    System.out.println("Invalid Characterization");
                }
                else
                {
                    System.out.println("Enter the Character");
                    char c1=sc.next().charAt(0);
                    s.task4(pd,c1);
                }
                break;
            }
            case 5:
            {
                System.out.println("Enter the New String");
                String ds=sc.nextLine();
                if(ds.equals("null")||ds.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    System.out.println("Enter the Character");
                    char c2=sc.next().charAt(0);
                    s.task5(ds,c2);
                }
                break;
            }
            case 6:
            {
                System.out.println("Enter the New String");
                String sd=sc.nextLine();
                if(sd.equals("null")||sd.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    s.task6(sd);
                }
                break;
            }
            case 7:
            {
                System.out.println("Enter the New String");
                String sp=sc.nextLine();
                if(sp.equals("null")||sp.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    s.task7(sp);
                }
                break;
            }
            case 8:
            {
                System.out.println("Enter the Strings");
                String s21=sc.nextLine();
                String s22=sc.nextLine();
                if(s21.equals("null")||s21.equals("")||s22.equals("null")||s22.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    s.task8(s21,s22);
                }
                break;
            }
            case 9:
            {
                System.out.println("Enter the Strings");
                String s31=sc.nextLine();
                String s32=sc.nextLine();
                if(s31.equals("null")||s31.equals("")||s32.equals("null")||s32.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    s.task9(s31,s32);
                }
                break;
            }
            case 10:
            {
                System.out.println("Enter the Strings");
                String su=sc.nextLine();
                String sv=sc.nextLine();
                if(su.equals("null")||su.equals("")||sv.equals("null")||sv.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    s.task10(su,sv);
                }
                break;
            }
            case 11:
            {
                System.out.println("Enter the Lowercase String");
                String ss = sc.nextLine();
                if(ss.equals("null")||ss.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    s.task11(ss);
                }
                break;
            }
            case 12:
            {
                System.out.println("Enter the Uppercase String");
                String sa = sc.nextLine();
                if(sa.equals("null")||sa.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    s.task12(sa);
                }
                break;
            }
            case 13:
            {
                System.out.println("Enter the String");
                String ss1=sc.nextLine();
                if(ss1.equals("null")||ss1.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    s.task13(ss1);
                }
                break;
            }
            case 14:
            {
                System.out.println("Enter the Strings :");
                String sb=sc.nextLine();
                if(sb.equals("null")||sb.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    s.task14(sb);
                }
                break;
            }
            case 15:
            {
                System.out.println("Enter the Number of strings");
                int n2=0;
                try
                {
                    n2=sc.nextInt();
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Type Format");
                }
                String s2[]=new String[n2];
                sc.nextLine();
                for(int j=0;j<n2;j++)
                {

                    s2[j]=sc.nextLine();
                }
                s.task15(s2,n2);
                break;
            }
            case 16:
            {
                System.out.println("Enter the String");
                String s3=sc.nextLine();
                if(s3.equals("null")||s3.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    s.task16(s3);
                }
                break;
            }
            case 17:
            {
                System.out.println("Enter the Number of Strings");
                int n3=0;
                try
                {
                    n3=sc.nextInt();
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Type Format");
                }
                String s4[]=new String[n3];
                sc.nextLine();
                for(int k=0;k<n3;k++)
                {
                    s4[k]=sc.nextLine();
                }
                s.task17(s4,n3);
                break;
            }
            case 18:
            {
                System.out.println("Enter the Strings");
                String s5=sc.nextLine();
                String s6=sc.nextLine();
                if(s5.equals("null")||s5.equals("")||s6.equals("null")||s6.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    s.task18(s5,s6);
                }
                break;
            }
            case 19:
            {
                System.out.println("Enter the Strings");
                String s7=sc.nextLine();
                String s8=sc.nextLine();
                if(s7.equals("null")||s7.equals("")||s8.equals("null")||s8.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    s.task19(s7,s8);
                }
                break;
            }
            case 20:
            {
                System.out.println("Enter the New String");
                String s9=sc.nextLine();
                if(s9.equals("null")||s9.equals(""))
                {
                    System.out.println("Invalid Intialization");
                }
                else
                {
                    s.task20(s9);
                }
                break;
            }
        }
    }
}
