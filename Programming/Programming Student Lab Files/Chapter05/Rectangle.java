// Rectangle.java - This program prints the outline of a rectangle with 4 asterisks
// across and 6 asterisks down. 
// Input:  None.
// Output: Prints the outline of the rectangle. 

public class Rectangle
{
	public static void main(String args[])
	{
		
					
		final int NUM_ACROSS = 4; 	// Number of asterisks to print across.
		final int NUM_DOWN = 6;		// Number of asterisks to print down.
		int row;	// Loop control for row number.
		int column;	// Loop control for column number.

		// This is the work done in the detailLoop() method
  		// Write a loop to control the number of rows.
                // Write a loop to control the number of columns
		        // Decide when to print an asterisk in every column.
			System.out.print("*");
			// Decide when to print asterisk in column 1 and column 4.
			System.out.print("*");
			// Decide when to print a space instead of an asterisk.
			System.out.print(" "); 
		// Figure out where to place this statement that prints a newline.
		System.out.println();

                // This is the work done in the endOfJob() method
		System.exit(0); 
	} // End of main() method.

} // End of Rectangle class.

