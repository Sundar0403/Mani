package run;
import java.util.*;

public class StringFunc
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
        public void strToCharArray(String string1) throws Exception
        {
            stringCheck1(string1);
            char ch[]=new char[string1.length()];
            for(int i=0;i<string1.length();i++)
            {
                ch[i]=string1.charAt(i);
                System.out.println(ch[i]);
            }
        }
        public void penultimateChar(String string1,int num) throws Exception
        {
            stringCheck1(string1);
            char ch[]=new char[num];
            ch=string1.toCharArray();
            System.out.println("The Penultimate character is :"+ch[num-2]);
        }
        public void charOccurence(String string1,char num) throws Exception
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
        public void charGreatestPos(String string1,char num) throws Exception
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
        public void stringSubStr1(String string1) throws Exception
        {
            stringCheck1(string1);
            String string2=string1.substring(string1.length()-5);
            System.out.println("The Required String is "+ string2);
        }
        public void stringSubStr2(String string1) throws Exception
        {
            stringCheck1(string1);
            String string2=string1.substring(0,3);
            System.out.println("The Required String is "+ string2);
        }
        public void stringReplace(String string1,String string2) throws Exception
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
        public void startString(String string1,String string2) throws Exception
        {
            stringCheck1(string1);
            System.out.println("The Given String is Starts With : " +string1.startsWith(string2));
        }
        public void endString(String string1,String string2) throws Exception
        {
            stringCheck1(string1);
            System.out.println("The Given String is Ends With : " +string1.endsWith(string2));
        }
        public void stringUpperCase(String string1) throws Exception
        {
            stringCheck1(string1);
            System.out.println("The Uppercase Converted String is :" + string1.toUpperCase());
        }
        public void stringLowerCase(String string1) throws Exception
        {
            stringCheck1(string1);
            System.out.println("The Lowercase Converted String is : "+string1.toLowerCase());
        }
        public void stringReverse(String string1) throws Exception
        {
            stringCheck1(string1);
            String string2="";
            for(int i=string1.length()-1;i>=0;i--)
            {
                string2=string2+string1.charAt(i);
            }
            System.out.println("The Reverse of the Name is : "+string2);
        }
        public void multiString(String string1) throws Exception
        {
            stringCheck1(string1);
            System.out.println(string1);
        }
        public void stringConcat(String string2[],int num) throws Exception
        {
            stringCheck3(string2,num);
            for(int j=0;j<num;j++)
            {
                string2[j]=string2[j].trim()+"";
                System.out.print(string2[j]);
            }
        }
        public void stringArr(String string1) throws Exception
        {
            stringCheck1(string1);
            System.out.println(Arrays.toString(string1.split(" ")));
        }
        public void stringMerge(String string2[],int num) throws Exception
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
        public void equalsSensitve(String string1,String string2) throws Exception
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
        public void equalsInSensitive(String string1,String string2) throws Exception
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
        public void stringNoSpace(String string1) throws Exception
        {
            stringCheck1(string1);
            System.out.println(""+string1.trim());
        }
}