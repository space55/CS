//Name: Eamonn Nugent
//Logical Bus Fare

import java.util.Scanner;

public class logicalBusFare
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		boolean cont = true;
		while (cont)
		{
			boolean validAge = false;
			double age = 18;
			int cost = 80;
			System.out.println("What is your age?");
			try
			{
				age = in.nextInt();
				validAge = true;
			}
			catch (Exception e)
			{
			}
			if (validAge)
			{
				if (age < 18 || age > 65)
				{
					cost = 40;
				}
				System.out.println("Your bus fare is: $0." + cost);
			}
			System.out.println("Would you like to calculate another bus fare?");
			String input = in.nextLine();
			if (input.equalsIgnoreCase("no"))
			{
				cont = false;
			}
		}
	}
}