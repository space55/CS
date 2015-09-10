//Eamonn Nugent
//Arithmetic

public class arithmetic
{
    public static double add(Object a, Object b)
    {
        return add(Double.parseDouble("" + a), Double.parseDouble("" + b));
    }
    
    public static double add(double a, double b)
    {
        return a + b;
    }
    
    public static double subtract(Object a, Object b)
    {
        return subtract(Double.parseDouble("" + a), Double.parseDouble("" + b));
    }
    
    public static double subtract(double a, double b)
    {
        return a - b;
    }
    
    public static double multiply(Object a, Object b)
    {
        return multiply(Double.parseDouble("" + a), Double.parseDouble("" + b));
    }
    
    public static double multiply(double a, double b)
    {
        return a * b;
    }
    
    public static double divide(Object a, Object b)
    {
        return divide(Double.parseDouble("" + a), Double.parseDouble("" + b));
    }
    
    public static double divide(double a, double b)
    {
        if (a > 0 && b > 0)
        {
            return a / b;
        }
        return 0;
    }
}