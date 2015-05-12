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
		//int row;	// Loop control for row number.
		//int column;	// Loop control for column number.

		// This is the work done in the detailLoop() method
  		// Write a loop to control the number of rows.
        for (int row = 0; row < 8; row++)
        {
            for (int column = 0; column < 10; column++)
            {
                if (row == 0 || row == 7)
                {     
			         System.out.print("*");
                }
                else if (column == 0 || column == 9)
                {
			         System.out.print("*");
                }
                else
                {
			         System.out.print(" ");
                }
            }
            System.out.println();
        }

        // This is the work done in the endOfJob() method
		System.exit(0); 
	} // End of main() method.

} // End of Rectangle class.

