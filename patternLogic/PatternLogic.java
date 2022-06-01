package patternLogic;
import java.util.*;

public class PatternLogic
{
	public void rightTrianglePattern(int num)
	{
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void rightPascalTrianglePattern(int num)
	{
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int k=num-2;k>=0;k--)
		{
			for(int l=0;l<=k;l++)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public void numberPattern(int num)
	{
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(j+1);
				System.out.print(" ");
			}
			
			System.out.println();
			
		}
	}
	public void zPattern(int num)
	{
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				if(i==0||i==num-1)
				{
					System.out.print("*");
					//System.out.print(" ");
				}
				else if(i+j==num-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}
			
			System.out.println();
		}
	}
	public void sandGlassPattern(int num)
	{
		int count=num-1;
		for(int k=0;k<num;k++)
		{
			for(int l=num-1;l>=0;l--)
			{
				if(l<=count)
				{
					System.out.print("* ");
					
				}
				else
				{
					System.out.print(" ");
				}
					
			}
			count--;
			System.out.println();
		}
		int counts=num-1;
		for(int i=num-1;i>=0;i--)
		{
			for(int j=0;j<num;j++)
			{
				if(j>=counts)
				{
					System.out.print("* ");
					
				}
				else
				{
					System.out.print(" ");
				}
					
			}
			counts--;
			System.out.println();
		}
	}
	public void spiralPattern(int num)
	{
		int value=2*num-1;
		int constantValue=4;
		for(int i=1;i<=value;i++)
		{
			for(int j=1;j<=value;j++)
			{
				
					System.out.print(Math.max(Math.abs(num-i),Math.abs(num-j))+1);
					System.out.print(" ");
					
			}
			
			System.out.println();
		}
	}
	public void spiralPatternWithMatrix(int num)
	{
		int arr[][]=new int[num][num];
		int value=1;
		int l=0;
		int k=0;
		int row=num;
		int col=num;
		int newNum=num;
		while(k<num)
		{
			for(int i=l;i<num;i++)
			{
				arr[k][i]=value;
				value++;
			}
			k++;
			for(int j=k;j<num;j++)
			{
				arr[j][num-1]=value;
				value++;
			}
			num--;
			for(int i=num-1;i>=l;i--)
			{
				arr[newNum-1][i]=value;
				value++;
			}
			newNum--;
			for(int j=newNum-1;j>=k;j--)
			{
				arr[j][l]=value;
				value++;
			}
			l++;
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}	

	public void alternatingRectangle(int num)
	{
		String arr[][]=new String[num][num];
		String value="";
		int l=0;
		int k=0;
		int row=num;
		int col=num;
		int newNum=num;
		while(k<num)
		{
			if(k%2==0)
			{
				value="X";
			}
			if(k%2==1)
			{
				value="0";
			}
			for(int i=l;i<num;i++)
			{
				arr[k][i]=value;
			}
			k++;
			for(int j=k;j<num;j++)
			{
				arr[j][num-1]=value;
			}
			num--;
			for(int i=num-1;i>=l;i--)
			{
				arr[newNum-1][i]=value;
			}
			newNum--;
			for(int j=newNum-1;j>=k;j--)
			{
				arr[j][l]=value;
			}
			l++;
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		} 
	}

	public void trianglePattern(int num)
	{
		int value=num-1;
		for(int i=1;i<=num;i++)
		{
			for(int j=0;j<=value;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<2*i-1;k++)
			{
				if(k==0&&i!=num||k==2*i-3&&i!=num)
				{
					System.out.print("*");
				}
				if(i==num)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}
			value--;
			System.out.println();
		}
		/*int values=1;
		for(int i=1;i<num;i++)
		{
			for(int j=0;j <= values;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<2* (num -i)-1;k++)
			{
				System.out.print("*");
			}
			values++;

			System.out.println();
		}*/
	}
	public void diamondShapePattern(int num)
	{
		int value=num-1;
		for(int i=1;i<=num;i++)
		{
			for(int j=0;j<=value;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<2*i-1;k++)
			{
				if(k==0||k==2*i-2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}
			value--;
			System.out.println();
		}
		int values=1;
		for(int l=1;l<num;l++)
		{
			for(int m=0;m<=values;m++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<2*(num-l);k++)
			{
				if(k==0||k==2*(num-l)-2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			values++;
			System.out.println();
		}
	}
	public void leftTrianglePattern(int num)
	{
		int count=num-1;
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				if(j>=count)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			
			System.out.println();
			count--;
		}
	}
	public void diamondPattern(int num)
	{
		int value=num-1;
		for(int i=1;i<=num;i++)
		{
			for(int j=0;j<=value;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<2*i-1;k++)
			{
				System.out.print("*");
			}
			value--;
			System.out.println();
		}
		int values=1;
		for(int i=1;i<num;i++)
		{
			for(int j=0;j <= values;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<2* (num -i)-1;k++)
			{
				System.out.print("*");
			}
			values++;

			System.out.println();
		}
	}
	public static void lookAndSequence(int n) 
	{
		String resul="1";
        System.out.print(resul);
    
        for(int i=1;i<n;i++)
        {
            String next1="";
            int k=0;
            System.out.print(",");
            while(k<resul.length())
            {
            	int no=1;
            	while(k<resul.length()-1&&resul.charAt(k)==resul.charAt(k+1))
            	{
                	no++;
                	k++;
               }
                
                next1=next1+Integer.toString(no)+resul.charAt(k);
                k++;
                
            }
        System.out.print(next1);
            resul=next1;
        }
        
		
	}
	public void diamondNumberPattern(int num)
	{
		int value=num-1;
		int count=0;
		int newCount=0;
		for(int i=1;i<=num;i++)
		{
			count=i;
			for(int j=0;j<=value;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<2*i-1;k++)
			{
				if(k!=0&&k!=2*i)
				{
					if(count>1)
					{
						--count;
						System.out.print(count);
						newCount=count;
					}
					if(count==1)
					{
						++newCount;
						System.out.print(newCount);
						if(i==newCount)
						{
							break;
						}
					}
				}
				else
				{
					System.out.print(i);
				}	
				/*else
				{
					count=i-1;
					System.out.print(count);
				}*/	
			}
			value--;
			System.out.println();
		}
		int values=1;
		for(int i=1;i<num;i++)
		{
			int counts=num-i;
			int newCounts=0;
			for(int j=0;j <= values;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<2* (num -i)-1;k++)
			{
				if(k!=0&&k!=2*(num-i)-1)
				{
					if(counts>1)
					{
						--counts;
						System.out.print(counts);
						newCounts=counts;
					}
					if(counts==1)
					{
						++newCounts;
						System.out.print(newCounts);
						if(num-i==newCounts)
						{
							break;
						}
					}
				}
				else
				{
					System.out.print(num-i);
				}
			}
			values++;

			System.out.println();
		}
	}
	public void pyramidPattern(int num)
	{
		int count=num-1;
		for(int i=num-1;i>=0;i--)
		{
			for(int j=0;j<num;j++)
			{
				if(j>=count)
				{
					System.out.print("* ");
					
				}
				else
				{
					System.out.print(" ");
				}
					
			}
			count--;
			System.out.println();
		}
	}
	public int factorial(int num)
	{
		int fact=1;
		if(num==0||num==1)
		{
			return 1;
		}
		else
		{
			fact=num*factorial(num-1);
		}
		return fact;
	}
	public void arrayOfCharacters(String inputString)
	{
		int num1=inputString.length()-1;
		int middle=inputString.length()/2;
		for(int i=0;i<=middle;i++)
		{
			System.out.print(inputString.charAt(i));
			if(num1>middle)
			{
				System.out.print(inputString.charAt(num1));
			}
			num1--;
			System.out.println();	
		}
		num1=middle+1;
		for(int i=middle-1;i>=0;i--)
		{
			System.out.print(inputString.charAt(i));
			if(num1>middle)
			{
				System.out.print(inputString.charAt(num1));
			}
			num1++;
			System.out.println();	
		}
	}
	public void pascalPattern(int num)
	{
		int count=num-1;
		int value=1;
		for(int i=0;i<=num;i++)
		{
			for(int j=0;j<=num-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(factorial(i)/(factorial(i-j)*factorial(j)));
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}



