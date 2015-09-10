//Eamonn Nugent
//Guess my word

import java.util.Scanner;

public class check
{
    public static boolean check(char entered, String word)
    {
        boolean correctLetter = false;
        if (word.indexOf(entered) != -1)
        {
            correctLetter = true;
        }
        return correctLetter;
    }
}