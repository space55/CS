package library;

// Eamonn Nugent
// Library

import java.util.Scanner;

public class Library
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Book h2g2 = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams");
		Book princessBride = new Book("Princess Bride", "Some old guy");
		Book harryPotter = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling");
		Book theMartian = new Book("The Martian", "Some good writer");
		Book oldManSea = new Book("The Old man in the Sea", "Ernest Hemmingway");
		Book immortalSecrets = new Book("The Secrets of the Immortal Nicholas Flamel", "Nicholas Flamel");
		Book americanSniper = new Book("The American Sniper", "Chris Kyle");
		Book frankenstein = new Book("Frankenstein", "A really good writer");

		System.out.println("What is your name?");
		String name = in.nextLine();
		Patron patron = new Patron(name);

		boolean run = true;

		while (run)
		{
			System.out.println("Would you like to borrow, return, check, list, or examine a book?");
			String action = in.nextLine();
			action = action.toLowerCase();
			if (action.contains("borrow"))
			{
				System.out.println("Please enter a number of the book you would like to borrow");
				int book = in.nextInt();
				if (book == 0)
				{
					patron.borrow(h2g2);
				}
				else if (book == 1)
				{
					patron.borrow(princessBride);
				}
				else if (book == 2)
				{
					patron.borrow(harryPotter);
				}
				else if (book == 3)
				{
					patron.borrow(theMartian);
				}
				else if (book == 4)
				{
					patron.borrow(oldManSea);
				}
				else if (book == 5)
				{
					patron.borrow(immortalSecrets);
				}
				else if (book == 6)
				{
					patron.borrow(americanSniper);
				}
				else if (book == 7)
				{
					patron.borrow(frankenstein);
				}
				else
				{
					System.out.println("We do not have that book. Sorry!");
				}
			}
			else if (action.contains("check"))
			{
				System.out.println("What book would you like to check if you borrowed?");
				String bookName = in.nextLine();
			}
			else if (action.contains("list"))
			{
				System.out.println(patron.getBooksBorrowed());
			}
			/*
			 * else if (action.contains("create"))
			 * {
			 * System.out.println("Please enter the name of the book");
			 * String bookName = in.nextLine();
			 * System.out.println("Please enter the author");
			 * String bookAuthor = in.nextLine();
			 * 
			 * }
			 */
			else
			{
				run = false;
			}
		}

		in.close();
	}
}