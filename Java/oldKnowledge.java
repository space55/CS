//Eamonn Nugent
//Practice Files

import java.util.Scanner;

public class oldKnowledge
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Mode 1 or 2?");
		String mode = in.nextLine();
		if (mode.equalsIgnoreCase("1"))
		{
			one(in);
		}
		else
		{
			two(in);
		}
		String goAway = in.nextLine();
	} //Closing method with name "main"
	
	protected static void one(Scanner in)
	{
		System.out.println("What! is your name?");
		String name = in.nextLine();
		System.out.println("Eh, your name should be \"King Arthur\", " + name);
		System.out.println("What! is your quest?");
		String quest = in.nextLine();
		System.out.println("Why have your quest be \"" + quest + "\", " + name + "?");
		System.out.println("What! is the average speed of an unladen swallow?");
		String swallow = in.nextLine();
		if (swallow.equalsIgnoreCase("American or European?") || swallow.equalsIgnoreCase("American or European"))
		{
			System.out.println("I don't know that!");
			System.out.println("He has just been thrown off the cliff");
		}
		else
		{
			System.out.println("You have been thrown over the cliff");
		}
	}
	
	protected static void two(Scanner in)
	{
		System.out.println("Please enter your name");
		String name = in.nextLine();
		System.out.println("Hello, " + name);
		
		int x = 0;
		int y = 0;
		int z = 0;
		x = getNumber(x, in);
		y = getNumber(y, in);
		z = x + y * x;
		System.out.println(z);
	}
	protected static int getNumber(int num, Scanner in)
	{
		System.out.println("Please enter a random number");
		num = in.nextInt();
		return num;
	}
}