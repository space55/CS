// LargeSmall.java - This program calculates the largest and smallest of three integer values. 

 
public class LargeSmall 
{
	public static void main(String args[])
	{
		// This is the work done in the housekeeping() method
		// Declare and initialize variables here.
		int largest = 0;		// Largest of the three values.
		int smallest = 0;		// Smallest of the three values.
		int num1 = 36;
		int num2 = -100;
		int num3 = 100;
		// This is the work done in the detailLoop() method
		//Write assignment, if, or if else statements here as appropriate.		
		if (num1 < num2 && num1 < num3)
		{
			smallest = num1;
		}
		else if (num2 < num1 && num2 < num3)
		{
			smallest = num2;
		}
		else if (num3 < num1 && num3 < num2)
		{
			smallest = num3;
		}	
		
		if (num1 > num2 && num1 > num3)
		{
			largest = num1;
		}
		else if (num2 > num1 && num2 > num3)
		{
			largest = num2;
		}
		else if (num3 > num1 && num3 > num2)
		{
			largest = num3;
		}
		
		// This is the work done in the endOfJob() method	
		// Output largest and smallest number. 
		System.out.println("The largest value is " + largest);
		System.out.println("The smallest value is " + smallest);
	}
} 	
