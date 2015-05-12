// Multiply.java - This program prints the numbers 0 through 10 along
// with these values multiplied by 10 and by 100.
// Input:  None.
// Output: Prints the numbers 0 through 10 along with their values multiplied by 10 and by 100. 


public class Multiply
{
	public static void main(String args[])
	{
		
		String head1 = "Number: ";
		String head2 = "Multiplied by 10: ";
		String head3 = "Multiplied by 100:  ";				
		int numberCounter; 	// Numbers 0 through 10.
		int byTen;		// Stores the number multiplied by 10.
		int byHundred; 	        // Stores the number multiplied by 100.
		final int NUM_LOOPS = 10; // Constant used to control loop.

		// This is the work done in the housekeeping() method
		System.out.println("0 through 10 multiplied by 10 and by 100" + "\n");

		// This is the work done in the detailLoop() method
		// Initialize loop control variable.
        int counter = 0;
		// Write your counter controlled while loop here
        while (counter < 10)
        {
            byTen = counter * 10;
            byHundred = counter * 100;
			System.out.println(head1 + counter);
			System.out.println(head2 + byTen);
			System.out.println(head3 + byHundred);
            System.out.println();
            counter++;
        }
		
		// This is the work done in the endOfJob() method
                System.exit(0);
	} // End of main() method.

} // End of Multiply class.

