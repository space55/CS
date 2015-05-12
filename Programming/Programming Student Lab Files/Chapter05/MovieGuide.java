// MovieGuide.java - This program allows each theater patron to enter a value from 0 to 4 
// indicating the number of stars that the patron awards to the Guide's featured movie of the 
// week. The program executes continuously until the theater manager enters a negative number to 
// quit. At the end of the program, the average star rating for the movie is displayed.  

import javax.swing.JOptionPane;
import java.util.Scanner;

public class MovieGuide 
{
	public static void main(String args[])
	{
        Scanner in = new Scanner(System.in);
                
		// Declare and initialize variables.
		double numStars = 0;     // star rating.
		String numStarsString; 	 // string version of star rating
		double averageStars;  	 // average star rating.
		double totalStars = 0; 	 // total of star ratings.
		int numPatrons = 0;      // keep track of number of patrons
			
	
		// This is the work done in the housekeeping() method
		// Get input.
        int rating = 1;
        while (rating > 0)
        {
            System.out.println("What is your star rating of the featured movie?");
            rating = in.nextInt();
            if (rating > 0)
            {
                numStars += rating;
                totalStars++;
                numPatrons++;
            }
        }
		
				
        // This is the work done in the detailLoop() method
		// Convert to double.
		
		// Write while loop here
		
        // This is the work done in the endOfJob() method
		// Calculate average star rating
		averageStars = numStars/totalStars;
		System.out.println("Average Star Value for " + numPatrons + " patrons: " + averageStars); 
		
		System.exit(0);
	} // End of main() method.

} // End of MovieGuide class.

