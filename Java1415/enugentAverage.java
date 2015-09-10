//Name: Eamonn Nugent
//Number Averaging

import java.util.Scanner;

public class enugentAverage
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		short num1 = askNum(in);
		short num2 = askNum(in);
		double square1 = squareNums(num1);
		double square2 = squareNums(num2);
		double sum = addNums(num1, num2);
		double avg = averageNums(num1, num2);
		printSum(sum);
		printAvg(avg);
		printSquare(square1);
		printSquare(square2);
	}
	
	public static short askNum(Scanner in)
	{
		System.out.println("Please enter a number");
		short localNum = 1;
		try
		{
			localNum = in.nextShort();
		}
		catch (Exception e)
		{
			//e.printStackTrace();
		}
		return localNum;
	}
	public static double squareNums(short num)
	{
		return num*num;
	}
	
	public static double addNums(short num1, short num2)
	{
		return num1+num2;
	}
	
	public static double averageNums(short num1, short num2)
	{
		double average = (num1+num2)/2;
		return average;
	}
	
	public static void printSum(double sum)
	{
		System.out.println("Sum: " + sum);
	}
	
	public static void printAvg(double avg)
	{
		System.out.println("Average: " + avg);
	}
	
	public static void printSquare(double squ)
	{
		System.out.println("Square for number: " + squ);
	}
}