// HouseSign.java - This program calculates prices for custom house signs.


public class HouseSign 
{
	public static void main(String args[])
	{
		// This is the work done in the housekeeping() method
		// Declare and initialize variables here.
		int charge = 0;
		int chars = 8;
		String color = "gold";
		String wood = "oak";
			 // Charge for this sign.
			 // Number of characters.
			 // Color of characters.
			 // Type of wood.
			 
		// This is the work done in the detailLoop() method
		// Write assignment and if statements here as appropriate.
		charge = 30;
		if (chars > 6)
		{
			charge = charge + (3 * (chars - 6))
		}
		if (wood.equalsIgnoreCase("oak"))
		{
			charge+= 15;
		}
		if (color.equalsIgnoreCase("gold"))
		{
			charge+= 12;
		}
		// This is the work done in the endOfJob() method	
		// Output Charge for this sign.
		System.out.println("The charge for this sign is $" + charge);

		System.exit(0); 
	}
} 	
