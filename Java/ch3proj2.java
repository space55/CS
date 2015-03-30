//Eamonn Nugent
//Name: Chapter 3 Project 2
import java.util.Scanner;

public class ch3proj2
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int angle[] = new int [3];
		angle[0] = askNum(in, true);
		angle[1] = askNum(in, false);
		angle[2] = askNum(in, false);
		boolean isRightTriangle = false;
		if (angle[0] + angle[1] + angle[2] == 180)
		{
			for (int counter = 0; counter < 3; counter++)
			{
				if (angle[counter] == 90)
				{
					isRightTriangle = true;
				}
			}
		}
		else
		{
			System.out.println("Your angles are not a right triangle. Sorry!");
		}
		if (isRightTriangle)
		{
			System.out.println("Your angles appear to be equivalent to a right triangle. Interesting!");
		}
	}
	
	public static int askNum(Scanner in, boolean first)
	{
		String askModifier = "an";
		if (!first)
		{
			askModifier = "another";
		}
		System.out.println("Please enter " + askModifier + " angle.");
		return in.nextInt();
	}
}