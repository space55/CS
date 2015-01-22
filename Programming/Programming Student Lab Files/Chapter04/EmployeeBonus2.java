// EmployeeBonus2.java - This program calculates an employee's yearly bonus. 

import javax.swing.*;

public class EmployeeBonus2 
{
	public static void main(String args[])
	{
		// Declare and initialize variables.
		String employeeName; 
		String salaryString; 
		double employeeSalary;	
		String ratingString;
		int employeeRating; 
		double employeeBonus;
		final double BONUS_1 = .20;
		final double BONUS_2 = .10;
		final double BONUS_3 = .05; 
		final double NO_BONUS = 0.00;
		final int RATING_1 = 1;
		final int RATING_2 = 2;
		final int RATING_3 = 3; 
		
		// This is the work done in the housekeeping() method
		// Get user input.		
		employeeName = JOptionPane.showInputDialog("Enter employee's name: ");
		salaryString = JOptionPane.showInputDialog("Enter employee's yearly salary: ");
		ratingString = JOptionPane.showInputDialog("Enter employee's performance rating: ");

		// Convert Strings to int or double.
		employeeSalary = Double.parseDouble(salaryString);
		employeeRating = Integer.parseInt(ratingString);
		
		// This is the work done in the detailLoop() method
		// Use switch statement here to calculate bonus based on rating.
		
		// This is the work done in the endOfJob() method			
		// Output.  
		System.out.println("Employee Name " + employeeName);
		System.out.println("Employee Salary $" + employeeSalary);
		System.out.println("Employee Rating " + employeeRating);
		System.out.println("Employee Bonus $" + employeeBonus);

		System.exit(0);
	}
} 	
