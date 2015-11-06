//Eamonn Nugent
//Book Class

public class Book
{
    private String title;
    private String author;
    
    public Book()
    {
        title = "";
        author = "";
    }
    
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
    
    public String examine()
    {
        return title + "\n" + author;
    }
    
    public String toString()
    {
        return title + "\n" + author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public boolean equals(Book book)
    {
        if (book.toString().equals(toString()))
        {
            return true;
        }
        return false;
    }
}