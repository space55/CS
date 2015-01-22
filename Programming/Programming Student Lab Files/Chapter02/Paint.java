// Calculates the number of gallons of paint needed. 
public class Paint
{
	public static void main(String args[])
	{
	   double height1 = 10;
	   double height2 = 10;
	   int width1 = 18.5;
	   double width2 = 20.5;
	   double squareFeet;	   
	   int numGallons;
	   numGallons = squareFeet / 150;
	   squareFeet = (width1 * height1 + width2 * height2) * 2;
	   System.out.println("Number of Gallons: " + numGallons);
	   System.exit(0);
	}
}
