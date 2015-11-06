//Eamonn Nugent
//Ch3 Problem

import java.util.Scanner;

public class ch3prob
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter five things");
        String word1 = input(in);
        String word2 = input(in);
        String word3 = input(in);
        String word4 = input(in);
        String word5 = input(in);
        
        System.out.println("Jack and Jill went up the " + word1 + " to fetch a pail of " + word2 + ". Jack " + word3 + " down and broke his " + word4 + ", and Jill came " + word5 + " after.");
    }
    
    public static String input(Scanner in)
    {
        // I used to have the Scanner here with it being closed. However, it threw an IllegalStateException or something, so parameters it is!
        String out = in.nextLine();
        return out;
    }
}