//Eamonn Nugent
//Chapter 4 Programming Assignment

import java.util.Scanner;

public class ch4pa
{
	public static void main(String[] args)
	{
		int small = 0;
		int large = 0;
		int avg = 0;
		int sum = 0;

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number");
		int ent1 = in.nextInt();
		System.out.println("Please enter another");
		int ent2 = in.nextInt();
		System.out.println("Please enter a third");
		int ent3 = in.nextInt();
		avg = (ent1 + ent2 + ent3)/3;
		sum = ent1 + ent2 + ent3;
		if (ent1 < ent2 && ent1 < ent3)
		{
			small = ent1;
		}
		else if (ent2 < ent1 && ent1 < ent3)
		{
			small = ent2;
		}
		else if (ent3 < ent2 && ent3 < ent1)
		{
			small = ent3;
		}
		if (ent1 > ent2 && ent1 > ent3)
		{
			large = ent1;
		}
		else if (ent2 > ent1 && ent2 > ent3)
		{
			large = ent2;
		}
		else if (ent3 > ent2 && ent3 > ent1)
		{
			large = ent3;
		}
		System.out.println("Smallest: " + small);
		System.out.println("Largest: " + large);
		System.out.println("Average: " + avg);
		System.out.println("Sum: " + sum);
	}
}