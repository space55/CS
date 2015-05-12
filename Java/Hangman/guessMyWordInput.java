//Eamonn Nugent
//Guess my word

import java.util.Scanner;

public class guessMyWord
{
    int length;
    
    public static void init(String word)
    {
        length = word.length();
    }
    
    public static char guess()
    {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Guess a letter");
        System.out.print(">> ");
        String input = in.next();
        input.toLowerCase();
        char entered = '-';
        
        try
        {
            entered = input.charAt(0);
        }
        catch (Exception e)
        {
            System.out.println("Invalid input");
        }
        return entered;
    }
}