//Eamonn Nugent
//Project 3.1

import java.util.Scanner;

public class ENugent31
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the length of an edge of a cube?");
        String lengthString = in.nextLine();
        double length = 0;
        try
        {
            length = Double.parseDouble(lengthString);
        }
        catch (Exception e)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        double surfaceArea = length * length * 6;
        System.out.println("Final Length: " + surfaceArea);
    }
}