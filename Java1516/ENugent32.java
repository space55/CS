//Eamonn Nugent
//Chapter 3 Project 2

import java.util.Scanner;

public class ENugent32
{
    public static void main(String[] args)
    {
        double pi = 3.141592653589793238462643383279;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the radius");
        String input = in.nextLine();
        double rad = 0;
        try
        {
            rad = Double.parseDouble(input);
        }
        catch (Exception e)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        double diam = rad * 2;
        double circ = rad * 2 * pi;
        double sa = 4 * pi * rad;
        double vol = 4 / 3 * pi * rad * rad * rad;
        System.out.println("Diameter:      " + diam);
        System.out.println("Circumference: " + circ);
        System.out.println("Surface Area:  " + sa);
        System.out.println("Volume:        " + vol);
    }
}