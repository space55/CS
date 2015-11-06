//Eamonn Nugent
//Fraction Tester

public class FractionTest
{
    public static void main(String[] args)
    {
        Fraction a = new Fraction(3, 5);
        Fraction b = new Fraction(7, 3);
        System.out.println(a.add(b).toString());
        System.out.println(a.sub(b).toString());
        System.out.println(a.mult(b).toString());
        System.out.println(a.div(b).toString());
    }
}