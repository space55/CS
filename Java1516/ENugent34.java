//Eamonn Nugent
//Chapter 3 Project 4

import java.util.Scanner;

public class ENugent34
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the hourly wage (in $/hr)");
        String hourlyInput = in.nextLine();
        System.out.println("Please enter the total hours worked");
        String hoursInput = in.nextLine();
        System.out.println("Please enter the total overtime hours worked");
        String overtimeInput = in.nextLine();
        double wage = 0;
        double hrs = 0;
        double ovt = 0;
        try
        {
            wage = Double.parseDouble(hourlyInput);
            hrs = Double.parseDouble(hoursInput);
            ovt = Double.parseDouble(overtimeInput);
        }
        catch (Exception e)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        double pay = wage * hrs + wage * 1.5 * ovt;
        System.out.println("Weekly Pay: " + pay);
    }
}