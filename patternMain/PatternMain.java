package patternMain;
import patternLogic.*;
import java.util.*;

public class PatternMain
{
	Scanner scan=new Scanner(System.in);
	PatternLogic logicObj=new PatternLogic();
	private void rightTrianglePattern()
	{
		int num=scan.nextInt();
		scan.nextLine();
		logicObj.rightTrianglePattern(num);
	}
	private void rightPascalTrianglePattern()
	{
		int num=scan.nextInt();
		scan.nextLine();
		logicObj.rightPascalTrianglePattern(num);
	}
	private void numberPattern()
	{
		int num=scan.nextInt();
		scan.nextLine();
		logicObj.numberPattern(num);
	}
	private void zPattern()
	{
		int num=scan.nextInt();
		scan.nextLine();
		logicObj.zPattern(num);
	}
	private void pyramidPattern()
	{
		int num=scan.nextInt();
		scan.nextLine();
		logicObj.pyramidPattern(num);
	}
	private void sandGlassPattern()
	{
		int num=scan.nextInt();
		scan.nextLine();
		logicObj.sandGlassPattern(num);
	}
	private void leftTrianglePattern()
	{
		int num=scan.nextInt();
		scan.nextLine();
		logicObj.leftTrianglePattern(num);
	}
	private void trianglePattern()
	{
		int num=scan.nextInt();
		scan.nextLine();
		logicObj.trianglePattern(num);
	}
	private void diamondPattern()
	{
		int num=scan.nextInt();
		scan.nextLine();
		logicObj.diamondPattern(num);
	}
	private void pascalTriangle()
	{
		int num=scan.nextInt();
		scan.nextLine();
		logicObj.pascalPattern(num);
	}
	private void diamondShapePattern()
	{
		int num=scan.nextInt();
		scan.nextLine();
		logicObj.diamondShapePattern(num);
	}
	private void spiralPattern()
	{
		int num=scan.nextInt();
		scan.nextLine();
		logicObj.spiralPattern(num);
	}
	private void diamondNumberPattern()
	{
		int num=scan.nextInt();
		scan.nextLine();
		logicObj.diamondNumberPattern(num);
	}
	private void spiralPatternWithMatrix()
	{
		int num=scan.nextInt();
		scan.nextLine();
		logicObj.spiralPatternWithMatrix(num);
	}
	private void alternatingRectangle()
	{
		int num=scan.nextInt();
		scan.nextLine();
		logicObj.alternatingRectangle(num);
	}
	private void lookAndSequence()
	{
		int num=scan.nextInt();
		scan.nextLine();
		logicObj.lookAndSequence(num);
	}
	private void arrayOfCharacters()
	{
		String inputString=scan.nextLine();
		logicObj.arrayOfCharacters(inputString);
	}
	public static void main(String args[])
	{
		PatternMain mainObj=new PatternMain();
		Scanner scan=new Scanner(System.in);
		int choice=scan.nextInt();
		scan.nextLine();
		
		switch(choice)
		{
			
			case 1:
				mainObj.pyramidPattern();
				break;
			
			case 2:
				mainObj.rightTrianglePattern();
				break;
				
			case 3:
				mainObj.leftTrianglePattern();
				break;
				
			case 4:
				mainObj.diamondPattern();
				break;		
				
			case 5:
				mainObj.rightPascalTrianglePattern();
				break;
				
			case 6:
				mainObj.sandGlassPattern();
				break;
				
			case 7:
				mainObj.trianglePattern();
				break;	
				
			case 8:
				mainObj.diamondShapePattern();
				break;			
				
			case 9:
				mainObj.numberPattern();
				break;
				
			case 10:
				mainObj.pascalTriangle();
				break;
				
			case 11:
				mainObj.diamondNumberPattern();
				break;
				
			case 12:
				mainObj.alternatingRectangle();
				break;
				
			case 13:
				mainObj.lookAndSequence();
				break;					
				
			case 14:	
				mainObj.zPattern();
				break;
				
			case 15:
				mainObj.spiralPattern();
				break;
				
			case 16:
				mainObj.spiralPatternWithMatrix();
				break;
				
			case 17:
				mainObj.arrayOfCharacters();
				break;			
				
		}
	}
}
