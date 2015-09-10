//Eamonn nugent
//Java Ch5 Programming Project

import java.util.Scanner;

public class Ch5ProgProj
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("What program would you like to run? Please enter the number of the program you would like to run.");
        String input = in.nextLine();
        int program = 0;
        try
        {
            program = Integer.parseInt(input);
        }
        catch (Exception e)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        if (program == 1)
        {
            prog1(in);
        }
        else if (program == 2)
        {
            prog2(in);
        }
        else if (program == 3)
        {
            prog3(in);
        }
        else if (program == 4)
        {
            prog4(in);
        }
    }
    
    protected static void prog1(Scanner in)
    {
        boolean first = true;
        boolean quit = false;
        while (!quit)
        {
            if (!first)
            {
                System.out.println("Would you like to calculate again?");
                String input = in.nextLine();
                if (input.equalsIgnoreCase("no"))
                {
                    quit = true;
                    break;
                }
                first = false;
            }
            if (quit)
            {
                break;
            }
            System.out.println("How many hours?");
            String S_hour = in.nextLine();
            int hour = 0;
            try
            {
                hour = Integer.parseInt(S_hour);
            }
            catch (Exception e)
            {
                System.out.println("Invalid input");
                System.exit(0);
            }
            
            System.out.println("How many minutes?");
            String S_minute = in.nextLine();
            int minute = 0;
            try
            {
                minute = Integer.parseInt(S_minute);
            }
            catch (Exception e)
            {
                System.out.println("Invalid input");
                System.exit(0);
            }
            
            System.out.println("How many seconds?");
            String S_second = in.nextLine();
            int second = 0;
            try
            {
                second = Integer.parseInt(S_second);
            }
            catch (Exception e)
            {
                System.out.println("Invalid input");
                System.exit(0);
            }
            
            int second_F = hour*(60*60) + minute*60 + second;
            System.out.println("Total Time: " + second_F + " seconds.");
        }
    }
    
    protected static void prog2(Scanner in)
    {
        boolean first = true;
        boolean quit = false;
        while (!quit)
        {
            if (!first)
            {
                System.out.println("Would you like to calculate again?");
                String input = in.nextLine();
                if (input.equalsIgnoreCase("no"))
                {
                    quit = true;
                    break;
                }
                first = false;
            }
            if (quit)
            {
                break;
            }
            System.out.println("How many seconds?");
            String S_second = in.nextLine();
            int seconds = 0;
            try
            {
                seconds = Integer.parseInt(S_second);
            }
            catch (Exception e)
            {
                System.out.println("Invalid input");
                System.exit(0);
            }
            int F_hours = 0;
            int F_minutes = 0;
            int F_seconds = 0;
            if (seconds >= 3600)
            {
                F_hours = seconds / 3600;
                seconds-= F_hours * 3600;
                F_minutes = seconds / 60;
                seconds-= F_minutes * 60;
                F_seconds = seconds;
            }
            else if (seconds > 60)
            {
                F_minutes = seconds / 60;
                seconds-= F_minutes * 60;
                F_seconds = seconds;
            }
            else
            {
                F_seconds = seconds;
            }
            System.out.println("You came out with:");
            System.out.println("Hours: " + F_hours);
            System.out.println("Minutes: " + F_minutes);
            System.out.println("Seconds: " + F_seconds);
        }
    }
       
    protected static void prog3(Scanner in)
    {
        boolean first = true;
        boolean quit = false;
        while (!quit)
        {
            if (!first)
            {
                System.out.println("Would you like to calculate again?");
                String input = in.nextLine();
                if (input.equalsIgnoreCase("no"))
                {
                    quit = true;
                    break;
                }
                first = false;
            }
            if (quit)
            {
                break;
            }
            System.out.println("How many quarters?");
            String S_quarters = in.nextLine();
            double quarter = 0;
            try
            {
                quarter = Integer.parseInt(S_quarters);
            }
            catch (Exception e)
            {
                System.out.println("Invalid input");
                System.exit(0);
            }
            
            System.out.println("How many dimes?");
            String S_dimes = in.nextLine();
            double dime = 0;
            try
            {
                dime = Integer.parseInt(S_dimes);
            }
            catch (Exception e)
            {
                System.out.println("Invalid input");
                System.exit(0);
            }
            
            System.out.println("How many nickels?");
            String S_nickels = in.nextLine();
            double nickel = 0;
            try
            {
                nickel = Integer.parseInt(S_nickels);
            }
            catch (Exception e)
            {
                System.out.println("Invalid input");
                System.exit(0);
            }
            
            System.out.println("How many pennies?");
            String S_pennies = in.nextLine();
            double penny = 0;
            try
            {
                penny = Integer.parseInt(S_pennies);
            }
            catch (Exception e)
            {
                System.out.println("Invalid input");
                System.exit(0);
            }
            System.out.println(quarter);
            System.out.println(dime);
            System.out.println(nickel);
            System.out.println(penny);
            double total = quarter/100*25 + dime/100*10 + nickel/100*5 + penny/100;
            System.out.println("Total: $" + total);
        }
    }
    
    protected static void prog4(Scanner in)
    {
        boolean first = true;
        boolean quit = false;
        while (!quit)
        {
            if (!first)
            {
                System.out.println("Would you like to calculate again?");
                String input = in.nextLine();
                if (input.equalsIgnoreCase("no"))
                {
                    quit = true;
                    break;
                }
                first = false;
            }
            if (quit)
            {
                break;
            }
            
            System.out.println("How many dollars? (DO NOT INCLUDE CENTS)");
            String S_dollars = in.nextLine();
            int dollar = 0;
            try
            {
                dollar = Integer.parseInt(S_dollars);
            }
            catch (Exception e)
            {
                System.out.println("Invalid input");
                System.exit(0);
            }
            
            System.out.println("How many cents? (DO NOT INCLUDE DOLLARS)");
            String S_cents = in.nextLine();
            int cent = 0;
            try
            {
                cent = Integer.parseInt(S_cents);
            }
            catch (Exception e)
            {
                System.out.println("Invalid input");
                System.exit(0);
            }
            
            int quarters = dollar*4 + cent/25;
            int quartersNCD = cent/25;
            cent -= quartersNCD*25;
            int dimes = cent/10;
            cent -= dimes*10;
            int nickels = cent/5;
            cent -= nickels*5;
            int pennies = cent;
            System.out.println("Quarters: " + quarters);
            System.out.println("Dimes: " + dimes);
            System.out.println("Nickels: " + nickels);
            System.out.println("Pennies: " + pennies);
        }
    }
}