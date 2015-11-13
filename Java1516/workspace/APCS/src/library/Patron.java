package library;

// Eamonn Nugent
// Patron Class

public class Patron
{
	private Book book1 = null;
	private Book book2 = null;
	private Book book3 = null;
	private String name;

	public Patron()
	{
		name = "";
	}

	public Patron(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public int borrow(Book book)
	{
		boolean work = false;
		if (book1 == book || book2 == book || book3 == book)
		{
			return 1;
		}
		if (book1 == null)
		{
			book1 = book;
			work = true;
		}
		else if (book2 == null)
		{
			book2 = book;
			work = true;
		}
		else if (book3 == null)
		{
			book3 = book;
			work = true;
		}
		if (work)
		{
			return 2;
		}
		else
		{
			return 0;
		}
	}

	public boolean ret(Book book)
	{
		if (book1 == book)
		{
			book1 = null;
			return true;
		}
		else if (book2 == book)
		{
			book2 = null;
			return true;
		}
		else if (book3 == book)
		{
			book3 = null;
			return true;
		}
		return false;
	}

	public boolean borrowed(Book book)
	{
		if (book1.equals(book))
		{
			return true;
		}
		else if (book2.equals(book))
		{
			return true;
		}
		else if (book3.equals(book))
		{
			return true;
		}
		return false;
	}

	public Book searchFor(String search)
	{
		if (book1.getTitle().toLowerCase().contains(search))
		{
			return book1;
		}
		else if (book2.getTitle().toLowerCase().contains(search))
		{
			return book2;
		}
		else if (book3.getTitle().toLowerCase().contains(search))
		{
			return book3;
		}
		return null;
	}

	public String getBooksBorrowed()
	{
		String ret = "";
		if (book1 != null)
		{
			ret += "Book 1: " + book1.getTitle() + " by " + book1.getAuthor() + "\n";
		}
		if (book2 != null)
		{
			ret += "Book 2: " + book2.getTitle() + " by " + book2.getAuthor() + "\n";
		}
		if (book3 != null)
		{
			ret += "Book 3: " + book3.getTitle() + " by " + book3.getAuthor();
		}
		return ret;
	}
}