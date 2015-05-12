// LeftOrRight.java - This program calculates the total number of left-handed and right-handed
//                    students in a class.   
// Input:  L for left-handed; R for right handed; X to quit.
// Output: Prints the number of left-handed students and the number of right-handed students. 

import javax.swing.JOptionPane;

public class LeftOrRight
{
	public static void main(String args[])
	{
		
		String leftOrRight = ""; // L or R for one student.
		int rightTotal = 0;	 // Number of right-handed students.
		int leftTotal = 0; 	 // Number of left-handed students.
		
		// This is the work done in the housekeeping() method

		// This is the work done in the detailLoop() method
		// Write your loop here.
		
        while (!leftOrRight.equalsIgnoreCase("X"))
        {   
            leftOrRight = JOptionPane.showInputDialog("Enter L if you are left-handed, R if you are right-handed or X to quit.");
            if (leftOrRight.equalsIgnoreCase("L"))
            {
                leftTotal++;
            }
            else if (leftOrRight.equalsIgnoreCase("R"))
            {
                rightTotal++;
            }
        }

		// This is the work done in the endOfJob() method	
		// Output number of left or right-handed students.	
		System.out.println("Number of left-handed students: " + leftTotal);
		System.out.println("Number of right-handed students: " + rightTotal);
		System.exit(0); 
	} // End of main() method.

} // End of LeftOrRight class. 

