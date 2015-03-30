import java.util.Scanner;

public class ch3proj1
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		boolean quit = false;
		System.out.println("Would you like to calculate a cost? Please answer \"Yes\" or \"No\"");
		while (!quit)
		{
			String calcCost = in.nextLine();
			if (calcCost.equalsIgnoreCase("yes"))
			{
				System.out.println("How long was the call?");
				double time = in.nextDouble();
				double cost = 1.15;
				if (time < 2)
				{
					cost = 1.15;
				}
				else
				{
					cost = (time-2)*.5 + 1.15;
				}
				System.out.println("Cost: $" + cost);
				System.out.println("Would you like to calculate a cost? Please answer \"Yes\" or \"No\"");
			}
			else if (calcCost.equalsIgnoreCase("no"))
			{
				quit = true;
			}
		}
	}
}