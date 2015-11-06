//Eamonn Nugent
//Calculator Class

public class Calc
{
    private int number = 0; // Instance var
    
    // Constructor
    public Calc()
    {
        number = 0;
    }
    
    // Setter
    public void add(int x, int y)
    {
        number = x + y;
    }
    
    public void sub(int x, int y)
    {
        number = x - y;
    }
    
    public void mult(int x, int y)
    {
        number = x * y;
    }
    
    public void div(int x, int y)
    {
        number = x / y;
    }
    
    public void mod(int x, int y)
    {
        number = x % y;
    }
    
    // Getter
    public int get()
    {
        return number;
    }
}