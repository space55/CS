//Name: Eamonn Nugent
//enugentVote

import java.util.Scanner;

public class enugentVote
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String lastName = askLastName(in);
		String firstName = askFirstName(in);
		short age = askAge(in, lastName, firstName);
		boolean vote = checkVote(age);
		tellVote(age, vote, lastName, firstName);
	}
	
	public static String askLastName(Scanner in)
	{
		System.out.println("May I ask you your last name?");
		return in.nextLine();
	}
	
	public static String askFirstName(Scanner in)
	{
		System.out.println("And your first name, please?");
		return in.nextLine();
	}
	
	public static short askAge(Scanner in, String lN, String fN)
	{
		short input = 18;
		System.out.println("And your age please, " + fN + " " + lN + ".");
		try
		{
			input = in.nextShort();
		}
		catch (Exception e)
		{
			//e.printStackTrace();
		}
		return input;
	}
	
	public static boolean checkVote(short age)
	{
		if (age >= 18)
		{
			return true;
		}
		else if (age < 18)
		{
			return false;
		}
		else
		{
			System.out.println("Ok, look. Something went horrifically wrong, and you are neither less than 18 or greater than 18... You may have a problem/should be studied by the government...");
			return false;
		}
		//return false;
	}
	
	public static void tellVote(short age, boolean vote, String lN, String fN)
	{
		if (vote)
		{
			System.out.println("Congratz, " + fN + " " + lN + ", you are eligible to vote!");
		}
		else if (!vote)
		{
			System.out.println("Sorry, " + fN + " " + lN + ", but you are ineligible to vote.");
		}
		else
		{
			System.out.println("You have a bad problem. A boolean is not true or false");
		}
		if (age >= 21)
		{
			System.out.println("You are also able to drink alcohol legally! Not necessarily safely, but legally.");
		}
	}
}