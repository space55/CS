//Eamonn Nugent
//Chapter 3 Test Programming Problem

import java.util.Scanner;

public class ch3test
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your first name?");
        String fname = in.nextLine();
        System.out.println("What is your last name?");
        String lname = in.nextLine();
        System.out.println("What is your cell number?");
        String cell = in.nextLine();
        System.out.println("What is your graduation year?");
        int year = in.nextInt();
        System.out.println("Hello, " + fname + ". I'm sure you knew this, but your cell phone number is " + cell + ". Magic, aren't I?");
        System.out.println("A certain " + fname + " " + lname + " graduates in " + (year - 2015) + " years. No matter how much you want that number to be zero, it won't be for a while.");
        in.close();
    }
}