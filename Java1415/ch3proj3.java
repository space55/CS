//Chapter 3 Project #3
//Name: Eamonn Nugent
import java.util.Scanner;

public class ch3proj3
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		boolean addPassenger = true;
		while (addPassenger)
		{
			System.out.println("Would you like to check a fare? Please answer \"Y\" or \"N\"");
			String addPass = in.nextLine();
			if (addPass.equalsIgnoreCase("N"))
			{
				addPassenger = false;
			}
			double age = 18;
			boolean isValid = false;
			int busFare = 80;
			while (!isValid)
			{
				System.out.println("What is your age?");
				try
				{
					age = in.nextDouble();
					isValid = true;
				}
				catch (Exception e)
				{
				}
				if (!isValid)
				{
					System.out.println("Sorry, but that was invalid");
				}
			}
			if (age < 18)
			{
				busFare = 40;
			}
			else if (age >= 65)
			{
				
			}
			System.out.println("Your bus fare is $0." + busFare);
		}
	}
}