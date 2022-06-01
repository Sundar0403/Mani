package test;
import run.String21;
import java.io.*;
import java.util.*;

public class String22
{
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
            c=Integer.parseInt(b.readLine());
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
                String s11=b.readLine();
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
                String st=b.readLine();
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
                String pd=b.readLine();
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
                String ds=b.readLine();
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
                String sd=b.readLine();
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
                String sp=b.readLine();
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
                String s21=b.readLine();
                String s22=b.readLine();
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
                String s31=b.readLine();
                String s32=b.readLine();
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
                String su=b.readLine();
                String sv=b.readLine();
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
                String ss = b.readLine();
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
                String sa = b.readLine();
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
                String ss1=b.readLine();
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
                String sb=b.readLine();
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
                    n2=Integer.parseInt(b.readLine());
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Type Format");
                }
                String s2[]=new String[n2];
                for(int j=0;j<n2;j++)
                {
                    s2[j]=b.readLine();
                }
                s.task15(s2,n2);
                break;
            }
            case 16:
            {
                System.out.println("Enter the String");
                String s3=b.readLine();
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
                    n3=Integer.parseInt(b.readLine());
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Type Format");
                }
                String s4[]=new String[n3];
                for(int k=0;k<n3;k++)
                {
                    s4[k]=b.readLine();
                }
                s.task17(s4,n3);
                break;
            }
            case 18:
            {
                System.out.println("Enter the Strings");
                String s5=b.readLine();
                String s6=b.readLine();
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
                String s7=b.readLine();
                String s8=b.readLine();
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
                String s9=b.readLine();
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