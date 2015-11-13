package library;

// Eamonn Nugent
// Library

import java.util.Scanner;

public class Library
{
	static Book h2g2 = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams");
	static Book princessBride = new Book("Princess Bride", "Some old guy");
	static Book harryPotter = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling");
	static Book theMartian = new Book("The Martian", "Some good writer");
	static Book oldManSea = new Book("The Old man in the Sea", "Ernest Hemmingway");
	static Book immortalSecrets = new Book("The Secrets of the Immortal Nicholas Flamel", "Nicholas Flamel");
	static Book americanSniper = new Book("The American Sniper", "Chris Kyle");
	static Book frankenstein = new Book("Frankenstein", "A really good writer");

	@SuppressWarnings("unused")

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

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
				System.out.println("Please enter a book you would like to borrow");
				String book = in.nextLine();
				Book borrow = search(book);
				if (borrow != null)
				{
					int ret = patron.borrow(borrow);
					if (ret == 0)
					{
						System.out.println("You have borrowed the maximum number of books");
					}
					else if (ret == 1)
					{
						System.out.println("You have already borrowed that book");
					}
				}
				else
				{
					System.out.println("We do not have that book");
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
			else if (action.contains("return"))
			{
				System.out.println("What would you like to return?");
				String ret = in.nextLine();
				Book retu = patron.searchFor(ret);
				if (retu != null)
				{
					patron.ret(retu);
				}
				else
				{
					System.out.println("You have not borrowed that book.");
				}
			}
			else if (action.contains("create"))
			{
				System.out.println("Please enter the name of the book");
				String bookName = in.nextLine();
				System.out.println("Please enter the author");
				String bookAuthor = in.nextLine();

			}
			else if (action.contains("examine"))
			{
				System.out.println("Which book would you like to search for?");
				String search = in.nextLine();
				Book sea = search(search);
				System.out.println(sea.examine());
			}
			else
			{
				run = false;
			}
		}

		in.close();
	}

	public static Book search(String search)
	{
		if (h2g2.getTitle().toLowerCase().contains(search))
		{
			return h2g2;
		}
		else if (princessBride.getTitle().toLowerCase().contains(search))
		{
			return princessBride;
		}
		else if (harryPotter.getTitle().toLowerCase().contains(search))
		{
			return harryPotter;
		}
		else if (theMartian.getTitle().toLowerCase().contains(search))
		{
			return theMartian;
		}
		else if (oldManSea.getTitle().toLowerCase().contains(search))
		{
			return oldManSea;
		}
		else if (immortalSecrets.getTitle().toLowerCase().contains(search))
		{
			return immortalSecrets;
		}
		else if (americanSniper.getTitle().toLowerCase().contains(search))
		{
			return americanSniper;
		}
		else if (frankenstein.getTitle().toLowerCase().contains(search))
		{
			return frankenstein;
		}

		return null;
	}
}