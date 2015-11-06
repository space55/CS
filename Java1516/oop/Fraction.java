//Eamonn Nugent
//Fraction Class

public class Fraction
{
    private int numerator;
    private int denominator;
    
    public Fraction()
    {
        numerator = 1;
        denominator = 1;
    }
    
    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public int getNumerator()
    {
        return numerator;
    }
    
    public int getDenominator()
    {
        return denominator;
    }
    
    public Fraction add(Fraction f)
    {
        return new Fraction(numerator * f.getNumerator() + f.getNumerator() * denominator, denominator * f.getDenominator());
    }
    
    public Fraction sub(Fraction f)
    {
        return new Fraction(numerator * f.getNumerator() - f.getNumerator() * denominator, denominator * f.getDenominator());
    }
    
    public Fraction mult(Fraction f)
    {
        return new Fraction(numerator * f.getNumerator(), denominator * f.getDenominator());
    }
    
    public Fraction div(Fraction f)
    {
        return new Fraction(numerator * f.getDenominator(), denominator * f.getNumerator());
    }
    
    public String toString()
    {
        return "Fraction: " + numerator + "/" + denominator;
    }
}