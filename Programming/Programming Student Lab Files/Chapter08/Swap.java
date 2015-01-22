// Swap.java - This program determines the minimum and maximum of three values input by 
// the user and performs necessary swaps.  
// Input:  Three int values. 
// Output:  The numbers in numerical order. 

import javax.swing.*;

public class Swap
{
	public static void main(String args[]) throws Exception
	{
		// Declare variables.
		String firstNumber;	      // String version of first number.
		String secondNumber;	      // String version of second number.
		String thirdNumber;	      // String version of third number.
		int value1 = 0;		      // First number.
		int value2 = 0;	 	      // Second number.
		int value3 = 0;		      // Third number.
		int temp; 		      // Used to swap numbers.
	        		
		// Get user input. 		
		if((firstNumber = JOptionPane.showInputDialog("Enter first number: ")) != null)
		{
			secondNumber = JOptionPane.showInputDialog("Enter second number: ");
			thirdNumber = JOptionPane.showInputDialog("Enter third number: ");
			// Convert Strings to int.
			value1 = Integer.parseInt(firstNumber);
			value2 = Integer.parseInt(secondNumber);
			value3 = Integer.parseInt(thirdNumber);
		}
		
		// Test to see if the first number is greater than the second number.
		
		// Test to see if the second number is greater than the third number.
		
		// Test to see if the first number is greater than the second number again.
		

		// Print values in numerical order. 
		System.out.println("Smallest: " + value1);
		System.out.println("Next smallest: " + value2);
		System.out.println("Largest: " + value3); 

		// Exit the program.
		System.exit(0);

	} // End of main() method.
} // End of Swap class.

