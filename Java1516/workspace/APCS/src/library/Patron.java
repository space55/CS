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

	public boolean borrow(Book book)
	{
		if (book1 == null)
		{
			book1 = book;
		}
		else if (book2 == null)
		{
			book2 = book;
		}
		else if (book3 == null)
		{
			book3 = book;
		}
		else
		{
			return false;
		}
		return true;
	}

	public boolean ret(Book book)
	{
		if (book1.equals(book))
		{
			book1 = null;
			return true;
		}
		else if (book2.equals(book))
		{
			book2 = null;
			return true;
		}
		else if (book3.equals(book))
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

	public String getBooksBorrowed()
	{
		String ret = "Book 1: " + book1.getTitle() + " by " + book1.getAuthor() + "\n";
		ret += "Book 2: " + book2.getTitle() + " by " + book2.getAuthor() + "\n";
		ret += "Book 3: " + book3.getTitle() + " by " + book3.getAuthor();
		return ret;
	}
}